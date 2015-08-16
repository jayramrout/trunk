<%@page language="java" contentType="text/html"%>
<html xmlns="http://www.w3c.org/1999/xhtml"
	xmlns:jsp="http://java.sun.com/JSP/Page">

<head>
<title>Generate XML Element</title>
</head>
<body>

<jsp:element name="img">
	<jsp:attribute name="src">
        ../images/jsp.png
 	</jsp:attribute>
    <jsp:attribute name="alt">Zoom Image</jsp:attribute>

<jsp:body>
	<jsp:text>Template data</jsp:text>
</jsp:body>

</jsp:element>

<br>
<jsp:text>Template data two</jsp:text>

</body>
</html>