<%@page isELIgnored="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<% 
String [] bigFive = {"U.S.A", "Russia", "France", "China","U.K"};

request.setAttribute("bigFive", bigFive);
%>

<%-- The Big Five are : ${bigFive}<br>

The first one is ${bigFive[0]}<br>

The second one is ${bigFive["1"]}<br>

${ 5 lt 0}
 --%>

<c:out value="${bigFive}"></c:out><br>
<c:out value="${bigFive[0]}"></c:out><br>
<c:out value="${bigFive['1']}"></c:out>