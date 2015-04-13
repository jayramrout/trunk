package com.tutorial.struts.action;

import org.apache.struts2.util.SubsetIteratorFilter.Decider;

import com.tutorial.struts.dto.Employee;
public class MyDecider implements Decider{

	 public boolean decide(Object element) throws Exception {
           Employee employee = (Employee)element;
           return employee.getDepartment().equals("Recruitment");
        }
}
