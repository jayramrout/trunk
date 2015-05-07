<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<center>
		<h3>
			Welcome <i>${sessionScope.userName}</i>, you have logged in
			successfully!
		</h3>
		<h3>
			<a href="logout">Logout</a> <a href="inbox">Inbox</a>
		</h3>
		<h3>
			User name<span style="color:red">(Find why username is not getting displayed)</span>
			<s:property value="userName" />
		</h3>
	</center>
</body>
</html>