<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

"http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>

<meta http-equiv="refresh"
	content="5; url=<s:url includeParams="all" />"></meta>

<title>Execute And Wait Interceptor</title>

</head>

<body>
	<table>
		<tr>
			<td align="center">Process executing please wait.............</td>
		</tr>
		<tr>
			<td><img src="./images/ajax-loader.gif" /></td>
		</tr>

	</table>
</body>

</html>