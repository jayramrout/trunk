package com.tutorial.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.tutorial.struts.dto.Employee;

public class EmployeeAction {
   
   private List<Employee> employees;
   private List<Employee> contractors;
   //Decider recruitmentDecider;
	
   public String execute() {
      employees = new ArrayList<Employee>();
      employees.add(new Employee("George","Recruitment"));
      employees.add(new Employee("Danielle","Accounts"));
      employees.add(new Employee("Melissa","Recruitment"));
      employees.add(new Employee("Rose","Accounts"));

      contractors = new ArrayList<Employee>();
      contractors.add(new Employee("Mindy","Database"));
      contractors.add(new Employee("Vanessa","Network"));
      return "success";
   }

  /* public Decider getRecruitmentDecider() {
	   recruitmentDecider =new MyDecider() ;
      return recruitmentDecider;
   }*/
   public List getEmployees() {
      return employees;
   }
   public void setEmployees(List employees) {
      this.employees = employees;
   }
   public List getContractors() {
      return contractors;
   }
   public void setContractors(List contractors) {
      this.contractors = contractors;
   }
	
}