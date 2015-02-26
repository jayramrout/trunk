package com.tutorial.spring.core_01.iocContainer._10ConstructorInjectionBeanTypes;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class DemoImple implements DemoInter{
	private float salary;
	private TestBean tb = null;
	private Date dt = null;
	private List fruits = null;
	private List veg = null;
	private Set phone_nos = null;
	private Set emails = null;
	private Map perDetails = null;
	private Map capitals = null;
	private Properties faculties = null;
	private String courses[];
	private int runs[];

	public String sayHello() {

		return "Hello Friends... Gmg. :) "+
				" \nsalary = "+salary+
				" \ntb = "+tb.toString()+
				" \ndt = "+dt.toString()+
				" \nfruits = "+fruits.toString()+
				" \nveg = "+veg.toString()+
				" \nphones = "+phone_nos.toString()+
				" \nemails = "+emails.toString()+
				" \nperDetails = "+perDetails.toString()+
				" \ncapitals = "+capitals.toString()+
				" \nfaculties = "+faculties.toString()+
				" \ncourses = {"+courses[0]+" "+courses[1]+"}"+
				" \nruns = {" + runs[0]+" "+runs[1]+"}";
	}

	public DemoImple(float salary, TestBean tb, Date dt, List fruits, List veg,
			Set phone_nos, Set emails, Map perDetails, Map capitals,
			Properties faculties, String[] courses, int[] runs) {
		super();
		this.salary = salary;
		this.tb = tb;
		this.dt = dt;
		this.fruits = fruits;
		this.veg = veg;
		this.phone_nos = phone_nos;
		this.emails = emails;
		this.perDetails = perDetails;
		this.capitals = capitals;
		this.faculties = faculties;
		this.courses = courses;
		this.runs = runs;
	}

	public DemoImple() {
		//super();
		// TODO Auto-generated constructor stub
	}

}


//Note: Set doesn't allows duplicates but List allows
