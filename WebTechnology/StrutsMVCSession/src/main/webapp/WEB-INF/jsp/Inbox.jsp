<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inbox</title>
</head>
<body>
	<center>
		<h3>Date is ${sessionScope.date}</h3>
		<h3>Hello <i>${sessionScope.userName}</i>, You have a message </h3>
		<h3>Hello <i>${sessionScope.inboxData}</h3>
		<h3>All Data  <i>${sessionScope}</h3>
		<h3><a href="logout">Logout</a></h3>
	</center>
</body>
</html>