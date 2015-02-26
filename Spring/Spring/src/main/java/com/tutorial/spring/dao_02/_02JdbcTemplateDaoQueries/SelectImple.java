package com.tutorial.spring.dao_02._02JdbcTemplateDaoQueries;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;


//Note: Add DAO libraries to build path

public class SelectImple implements SelectInter{
		JdbcTemplate jt;
		String qry;
		public void setJt(JdbcTemplate jt) {
			this.jt = jt;
		}
		public boolean fireEmp(int eno) {
			qry = "delete from employees where employee_id = ?";
			int res = jt.update(qry, new Object[]{new Integer(eno)});
			if(res == 0)
				return false;
			else
				return true;
		}

		public int getEmpCount(String desg) {
			qry = "select count(*) from employees where job_id = ?"; 
			int count = jt.queryForInt(qry, new String[]{desg});
			return count;
		}
		/**
		 * 
		 */
		public Map getEmpDetails(int eno) {
			qry = "select * from employees where employee_id = ? ";
			Map m = jt.queryForMap(qry, new Object[]{new Integer(eno)});
			return m;
		}

		public List getEmpDetails(String desg) {
			qry = "select * from employees where job_id = ?";
			List l = jt.queryForList(qry, new Object[]{desg});
			
			return l;
		}
		/**
		 * 
		 */
		public boolean modifyDesignation(int no, String desig) {
			// TODO Auto-generated method stub
			qry = "update employees set job_id = ? where employee_id = ?";
			int res = jt.update(qry, new Object[]{desig, new Integer(no)});
			
			if(res == 0)
				return false;
			else
				return true;
		}
		/**
		 * 
		 */
		public boolean registerEmp(int no, String name, String desg, int sal) {
			// TODO Auto-generated method stub
			qry = "insert into employees(employee_id, first_name, job_id, salary) values(?, ?, ?, ?)";
			int res = jt.update(qry, new Object []{new Integer(no), name, desg, new Integer(sal)});
			if(res == 0)
				return false;
			else	
				return true;
		}
}