<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 - Login Application</title>
</head>
<body bgcolor="#E3FF91">
	<s:form action="login.action" method="post" validate="true">
		<s:textfield name="userName" label="USER NAME" />
		<s:password name="pass" label="PASSWORD" />
		<s:textfield name="age" label="AGE" />
		<s:submit value="SUB" />
	</s:form>
</body>
</html>