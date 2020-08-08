package jrout.tutorial.springmvc.employee.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import jrout.tutorial.springmvc.employee.model.Employee;
import jrout.tutorial.springmvc.employee.service.EmployeeService;
import jrout.tutorial.springmvc.employee.validator.EmployeeValidator;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/employee.htm")
public class EmployeeController {

	@Resource
	EmployeeValidator employeeValidator;

	@Resource
	EmployeeService employeeService;
	
	public EmployeeController() {
		System.out.println("Default Constructor");
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute("employee") Employee employee,
			BindingResult result, SessionStatus status, HttpServletRequest request) {
		System.out.println("EmployeeController.processSubmit()" + request.getSession().getId());
		employeeValidator.validate(employee, result);

		if (result.hasErrors()) {
			return "EmployeeForm";
		} else {
			/*
			 * status.setComplete(); Mark the current handler's session
			 * processing as complete, allowing for cleanup of session
			 * attributes.
			 */
			status.setComplete();
			return "EmployeeSuccess";
		}
	}

	/**
	 * initForm with HttpServletRequest can be used to explicitly get
	 * the request reference.
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
//	public String initForm(ModelMap model, HttpServletRequest request) {
//		System.out.println("EmployeeController.initForm()" + request.getSession().getId());
	public String initForm(ModelMap model) {
		Employee cust = new Employee();
		cust.setUserName("Peter");
		cust.setFavFramework(new String[] { "Spring MVC" });
		cust.setSex("F");
		cust.setJavaSkills("Hibernate");
		cust.setFavNumber("Number 3");
		cust.setSecretValue("I'm hidden value");


		model.addAttribute("employee", cust);
		return "EmployeeForm";
	}

	@ModelAttribute("webFrameworkList")
	public List<String> populateWebFrameworkList() {
		List<String> webFrameworkList = new ArrayList<String>();
		webFrameworkList.add("Spring MVC");
		webFrameworkList.add("Struts 1");
		webFrameworkList.add("Struts 2");
		webFrameworkList.add("JSF");
		webFrameworkList.add("Apache Wicket");

		return webFrameworkList;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}

	@ModelAttribute("numberList")
	public List<String> populateNumberList() {
		List<String> numberList = new ArrayList<String>();
		numberList.add("Number 1");
		numberList.add("Number 2");
		numberList.add("Number 3");
		numberList.add("Number 4");
		numberList.add("Number 5");

		return numberList;
	}

	@ModelAttribute("javaSkillsList")
	public Map<String, String> populateJavaSkillList() {

		// Data referencing for java skills list box
		Map<String, String> javaSkill = new LinkedHashMap<String, String>();
		javaSkill.put("Hibernate", "Hibernate");
		javaSkill.put("Spring", "Spring");
		javaSkill.put("Apache Wicket", "Apache Wicket");
		javaSkill.put("Struts", "Struts");

		return javaSkill;
	}

	@ModelAttribute("countryList")
	public Map<String, String> populateCountryList() {
		Map<String, String> country = new LinkedHashMap<String, String>();
		country.put("US", "United Stated");
		country.put("CHINA", "China");
		country.put("SG", "Singapore");
		country.put("MY", "Malaysia");

		return country;
	}

}