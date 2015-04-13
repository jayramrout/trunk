<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	Hello World,
	<s:property value="name"/><br>
	
	<s:if test="name=='Jayram'">
		Hello Jayram Rout
	</s:if>
	<s:elseif test="name=='Dishu'">
		Hello Diyansha
	</s:elseif>
	<s:else>
		Hello Guys 
	</s:else>
	
</body>
</html>
