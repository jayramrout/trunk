<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql"%>
<%@page isELIgnored="true"%>

<sql:setDataSource driver="oracle.jdbc.driver.OracleDriver"
	password="hr" user="hr" url="jdbc:oracle:thin:@localhost:1521/XE"
	var="dataSource" scope="session" />

<sql:query var="qry" dataSource="${dataSource}">
	select employee_id,first_name from employees
</sql:query>

<table>
	<c:forEach var="row" items="${qry.rows}">
		<tr>
			<td><c:out value="${row.employee_id}" /></td>
			<td><c:out value="${row.first_name}" /></td>
		</tr>
	</c:forEach>
</table>
