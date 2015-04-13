package com.tutorial.struts.util;

import java.util.Comparator;

import com.tutorial.struts.dto.Employee;

public class DepartmentComparator implements Comparator<Employee> {
   public int compare(Employee e1, Employee e2) {
      return e1.getDepartment().compareTo(e2.getDepartment());
   }
}