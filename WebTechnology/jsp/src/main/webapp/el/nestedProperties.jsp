<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.tutorial.jsp.el.*" %>


<%= ((Person) request.getAttribute("person")).getAddress().getStreetName() %>

<br>

<% 
	Person per = (Person)request.getAttribute("person");
	out.println("TEsting"+ per.getAddress().getStreetName());
%>

<br>

<c:out value="${person.address.streetName}" />