<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h2>Spring's form tags example</h2>

	<table>
		<tr>
			<td>UserName :</td>
			<td>${employee.userName}</td>
		</tr>
		<tr>
			<td>Address :</td>
			<td>${employee.address}</td>
		</tr>
		<tr>
			<td>Password :</td>
			<td>${employee.password}</td>
		</tr>
		<tr>
			<td>Confirm Password :</td>
			<td>${employee.confirmPassword}</td>
		</tr>
		<tr>
			<td>Receive Newsletter :</td>
			<td>${employee.receiveNewsletter}</td>
		</tr>

		<tr>
			<td>Favourite Web Frameworks :</td>
			<td><c:forEach items="${employee.favFramework}" var="current">
   [<c:out value="${current}" />]
</c:forEach></td>
		</tr>
		<tr>
			<td>Sex :</td>
			<td>${employee.sex}</td>
		</tr>
		<tr>
			<td>Favourite Number :</td>
			<td>${employee.favNumber}</td>
		</tr>
		<tr>
			<td>Country :</td>
			<td>${employee.country}</td>
		</tr>
		<tr>
			<td>Java Skills :</td>
			<td>${employee.javaSkills}</td>
		</tr>
		<tr>
			<td>Hidden Value :</td>
			<td>${employee.secretValue}</td>
		</tr>
	</table>
</body>
</html>