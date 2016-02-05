package com.tutorial.spring.dao_02._05procedure;
/*

steps:
1. create datasource
2. pass datasource to subclass of StoredProcedure which is a static innerclass
3. Register all in & out parameters
4. read data from Map object, set to bean class object & display
 */

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

public class SimpleJdbcCallTest {
    public static void main(String args[]) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        dataSource.setUsername("HR");
        dataSource.setPassword("HR");

        MyStoredProcedure sp = new MyStoredProcedure(dataSource);

        Map results = sp.callProcedure("Neena");
        System.out.println("EmpID "+results.get("NO"));
        System.out.println("Desg "+results.get("DESG"));
        System.out.println("Sal "+results.get("SALARY"));
    }
   private static class MyStoredProcedure extends StoredProcedure {
        public MyStoredProcedure(DataSource ds) {
            super(ds, "GET_EMP_DATA");
            this.setFunction(false); //false -> indicates its a stored procedure

            SqlParameter[] params = {
                    new SqlParameter("NAME", Types.VARCHAR),
                    new SqlOutParameter("NO", Types.INTEGER),
                    new SqlOutParameter("DESG", Types.VARCHAR),
                    new SqlOutParameter("SALARY", Types.DOUBLE)
            };
            this.setParameters(params);
            compile();
        }

        public Map callProcedure(String name) {
            HashMap map = new HashMap();
            map.put("NAME", name);
            return super.execute(map);
        }

    }
}
