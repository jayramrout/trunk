<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Tag Example</title>
</head>
<body>
<% 
	int i = 10;
	// i == salary
			//session.setAttribute("salary",(2000*2));
%>

<c:set var="salary" scope="session" value="${2000*2}"/>

<%=i%>

<c:out value="${salary}"/>

<c:out value=" My Classes"/>

</body>
</html>