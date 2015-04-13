<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Employees</title>
</head>
<body>
	<b>Example of Iterator Tag</b>
	<br />
	<s:iterator value="employees">
		<s:property value="name" /> , <s:property value="department" />
		<br />
	</s:iterator>
	<br />
	<br />
	<b>Employees sorted by Department</b>
	<br />

	<s:bean name="com.tutorial.struts.util.DepartmentComparator"
		var="deptComparator" />

	<s:sort comparator="deptComparator" source="employees">
		<s:iterator>
			<s:property value="name" /> , <s:property value="department" />
			<br />
		</s:iterator>
	</s:sort>
	<br />
	<br />
	<b>SubSet Tag - Employees working in Recruitment department </b>
	<br />

	<s:bean name="com.tutorial.struts.action.MyDecider"
		var="recruitmentDecider" />
	<s:subset decider="recruitmentDecider" source="employees">
		<s:iterator>
			<s:property value="name" /> , <s:property value="department" />
			<br />
		</s:iterator>
	</s:subset>
	<br />
	<br />
	<b>SubSet Tag - Employees 2 and 3 </b>
	<br />
	<s:subset start="1" count="2" source="employees">
		<s:iterator>
			<s:property value="name" /> , <s:property value="department" />
			<br />
		</s:iterator>
	</s:subset>

	<br />
	<br />
	<b>Merge Employees and Contractors</b>
	<br />
	<s:merge id="allemployees">
		<s:param value="employees" />
		<s:param value="contractors" />
	</s:merge>
	<s:iterator value="allemployees">
		<s:property value="name" />,
      <s:property value="department" />
		<br />
	</s:iterator>

</body>
</html>