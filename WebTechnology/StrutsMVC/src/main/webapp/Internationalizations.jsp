<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<h1>
		<s:text name="global.heading" />
	</h1>

	<s:a href="locale?request_locale=en"> English</s:a>
	<s:a href="locale?request_locale=es"> Spanish</s:a>
	<s:a href="locale?request_locale=fr"> France</s:a>
	<s:a href="locale?request_locale=te"> Telugu</s:a>

	<s:form action="empinfo" method="post" namespace="/">
		<s:textfield name="name" key="global.name" size="20" />
		<s:textfield name="age" key="global.age" size="20" />
		<s:submit name="submit" key="global.submit" />
	</s:form>

</body>
</html>