package jrout.tutorial.hibernate.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEES", uniqueConstraints = @UniqueConstraint(columnNames = "EMAIL"))
@NamedQueries(value = {
		@NamedQuery(name="query_get_all_employees",query = "select e from Employees e")
})
public class Employees implements java.io.Serializable {

	private int employeeId;
	private Employees employees;
	private Departments departments;
	private Jobs jobs;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private BigDecimal salary;
	private BigDecimal commissionPct;
	private Set<Departments> departmentses = new HashSet<Departments>(0);
	private Set<Employees> employeeses = new HashSet<Employees>(0);
	private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);

	public Employees() {
	}

	public Employees(int employeeId, Jobs jobs, String lastName, String email,
			Date hireDate) {
		this.employeeId = employeeId;
		this.jobs = jobs;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
	}

	public Employees(int employeeId, Employees employees,
			Departments departments, Jobs jobs, String firstName,
			String lastName, String email, String phoneNumber, Date hireDate,
			BigDecimal salary, BigDecimal commissionPct,
			Set<Departments> departmentses, Set<Employees> employeeses,
			Set<JobHistory> jobHistories) {
		this.employeeId = employeeId;
		this.employees = employees;
		this.departments = departments;
		this.jobs = jobs;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commissionPct = commissionPct;
		this.departmentses = departmentses;
		this.employeeses = employeeses;
		this.jobHistories = jobHistories;
	}

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false, precision = 6, scale = 0)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MANAGER_ID")
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPARTMENT_ID")
	public Departments getDepartments() {
		return this.departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JOB_ID", nullable = false)
	public Jobs getJobs() {
		return this.jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	@Column(name = "FIRST_NAME", length = 20)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", nullable = false, length = 25)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "EMAIL", unique = true, nullable = false, length = 25)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PHONE_NUMBER", length = 20)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "HIRE_DATE", nullable = false, length = 7)
	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@Column(name = "SALARY", precision = 8)
	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Column(name = "COMMISSION_PCT", precision = 2)
	public BigDecimal getCommissionPct() {
		return this.commissionPct;
	}

	public void setCommissionPct(BigDecimal commissionPct) {
		this.commissionPct = commissionPct;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set<Departments> getDepartmentses() {
		return this.departmentses;
	}

	public void setDepartmentses(Set<Departments> departmentses) {
		this.departmentses = departmentses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set<Employees> getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set<Employees> employeeses) {
		this.employeeses = employeeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set<JobHistory> getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(Set<JobHistory> jobHistories) {
		this.jobHistories = jobHistories;
	}

}
