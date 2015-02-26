package com.tutorial.spring.dao_02._02JdbcTemplateDaoQueries;

import java.util.List;
import java.util.Map;


public interface SelectInter {
	
	int getEmpCount(String desg);
	
	List getEmpDetails(String desg);
	
	Map getEmpDetails(int eno);
	
	boolean registerEmp(int no, String name, String desg, int sal);
	
	boolean modifyDesignation(int no, String newDesig);

	boolean fireEmp(int eno);

}
