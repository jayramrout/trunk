package jrout.tutorial.corejava.jdbc;

import java.sql.*;

public class JDBCProgram {

    static Connection con = null;
    static Statement stmt = null;
    static PreparedStatement pstmt = null;
    CallableStatement cs = null;
    ResultSet rs = null;

    private static String jdbcOdbcBridgeDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
    private static String jdbcOdbcConnectionURL = "jdbc:odbc:<DSN Name given in JDBC ODBC Bridge Driver>";

    private static String oracleDriver = "oracle.jdbc.driver.OracleDriver";
    static String connectionURL = "jdbc:oracle:thin:@localhost:1521/XE";

    /*
     * MAIN METHOD
     */
    public static void main(String... arg) throws Exception {
        //		 new JDBCProgram().selectQuery(100);
        //		 new JDBCProgram().preparedStatement(100,"Steven");
        //		 new JDBCProgram().createTable();
        //		 new JDBCProgram().createProcedureShowEmployees();
        //		 new JDBCProgram().callProcedure();
        //		 new JDBCProgram().insertRowInDBAndRollBack(28, "Twenty 8");
        //		 new JDBCProgram().savePoint();
        new JDBCProgram().addBatch();
    }

    static {
        try {
            Class.forName(oracleDriver);// Loading a oracleDriver... Step 1
            // Driver myDriver = new oracle.jdbc.driver.OracleDriver();
            // DriverManager.registerDriver( myDriver );

            con = DriverManager.getConnection(connectionURL, "HR", "HR"); // Step
        } catch (ClassNotFoundException exp) {
            exp.printStackTrace();
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
    }

    /**
     * @param empid Statement
     */
    public void selectQuery(int empid) {
        try {
            stmt = con.createStatement(); // Step 3
            rs = stmt.executeQuery("select * from employees where employee_id = "
                    + empid); // Step 4
            while (rs.next()) {
                System.out.println(rs.getString("EMAIL") + " "
                        + rs.getString("EMPLOYEE_ID") + " "
                        + rs.getString("first_name") + " "
                        + rs.getString("last_name"));
            }

        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /*
     *
     */
    public void preparedStatement(int empid, String name) {
        try {
            pstmt = con
                    .prepareStatement("select * from employees where employee_id = ? and first_name = ?");
            pstmt.setInt(1, empid);
            pstmt.setString(2, name);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " "
                        + rs.getString("last_name") + " " + rs.getString(1));
            }
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /**
     *
     */
    public void addBatch() {
        try {
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();

            String SQL = "INSERT INTO H2KTable " + "VALUES (107, 'Rita')";
            stmt.addBatch(SQL);

            String SQL2 = "INSERT INTO H2KTable " + "VALUES (105, 'Rita')";
            stmt.addBatch(SQL2);

            String SQL3 = "update H2KTable set name ='RAJA' where id = 102";
            stmt.addBatch(SQL3);

            int[] intArray = stmt.executeBatch();
            con.commit();
        } catch (SQLException se) {
            try {
                con.rollback();

            } catch (Exception exp) {
                exp.printStackTrace();
            }
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /**
     *
     */
    public void savePoint() {
        Savepoint savepoint1 = null;
        Savepoint savepoint2 = null;

        try {
            con.setAutoCommit(false);
            Statement stmt = con.createStatement(); // set a Savepoint

            savepoint1 = con.setSavepoint("Savepoint1");
            String SQL = "INSERT INTO H2KTable VALUES (102, 'Rita2')";

            stmt.executeUpdate(SQL); // Submit a malformed SQL statement that
            // breaks String SQL =
            // "INSERTED IN Employees " +
            // "VALUES (107, 22, 'Sita', 'Tez')";
            // stmt.executeUpdate(SQL); // If there
            // is no error, commit the changes.
            // conn.commit();

            savepoint2 = con.setSavepoint("Savepoint2");
            String SQL2 = "INSERT INTO H2KTable " + "VALUES (103, 'Rita3')";

            stmt.executeUpdate(SQL2);

            int i = 4 / 0;
        } catch (Exception se) { // If there is any error.
            try {
                con.rollback(savepoint2);
                // con.rollback();
            } catch (Exception exp) {
                exp.printStackTrace();
            }
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    public void insertRowInDBAndRollBack(int id, String name) {
        try {
            con.setAutoCommit(false);

            pstmt = con.prepareStatement("insert into H2KTable values(?,?)");

            pstmt.setInt(1, id);
            pstmt.setString(2, name);

            // pstmt.setInt(1, Integer.parseInt(id+"a"));
            // pstmt.setString(2, name+"1");

            int intValue = pstmt.executeUpdate();
            System.out.println("JDBCProgram.insertRowInDBAndRollBack()"
                    + intValue);

            int i = 4 / 0;

            con.commit();
        } catch (Exception exp) {
            exp.printStackTrace();
            try {
                con.rollback();
            } catch (Exception exp1) {
                exp1.printStackTrace();
            }
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    public void insertRowInDB(int id, String name) {
        try {
            pstmt = con.prepareStatement("insert into myExcel values(?,?)");
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            int intValue = 0;
            intValue = pstmt.executeUpdate();
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /**
     * execute() true if the first result is a ResultSet object; 
     * false if it is an update count or there are no results
     */
    public void createTable() {
        try {
            stmt = con.createStatement();
            boolean hasResults = stmt.execute("CREATE TABLE H2KTable(id number(4) , name VARCHAR2(20))");
            System.out.println("Has ResultsSet ..." + hasResults);
            
            System.out.println("Table got created...");
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /**
     * API to close all open connections.
     */
    private void closeConnections(ResultSet rs, Statement stmt, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

    /**
     * API for invoking procedure
     */
    public void callProcedure() {
        try {
            cs = con.prepareCall("{call SHOW_EMPLOYEES(?,?)}");

            cs.setInt(1, 200);
            cs.registerOutParameter(2, Types.VARCHAR);

            cs.executeQuery();

            String empName = cs.getString(2);

            System.out.println("JDBCProgram.callProcedure()" + empName);
        } catch (Exception exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /**
     *
     * @throws SQLException
     */
    public void createProcedureShowEmployees() throws SQLException {
        String queryDrop = "DROP PROCEDURE  SHOW_EMPLOYEES";
        String createProcedure = "CREATE OR REPLACE PROCEDURE SHOW_EMPLOYEES ( EID_IN IN NUMBER , EMP_NAME OUT VARCHAR2) "
                + "AS "
                + "BEGIN "
                + "SELECT EMP.FIRST_NAME INTO EMP_NAME FROM EMPLOYEES EMP WHERE EMP.EMPLOYEE_ID = EID_IN; "
                + "END;";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createProcedure);
            //			stmt.execute(queryDrop);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

}
