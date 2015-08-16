<%@page import="com.tutorial.jsp.dataobject.EmployeeDO,java.util.List"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>

<%-- <% 
	java.util.List<EmployeeDO> empDOList = (List<EmployeeDO>)request.getAttribute("empdetail");
	
	for(EmployeeDO empdo : empDOList){
		out.println(empdo.getEmpid());
		out.println(empdo.getFname());
		out.println(empdo.getLname());
		out.println(empdo.getEmail() +" <br>");
	}
%>
 --%>
<%-- <% 
	java.util.List<EmployeeDO> empDOList = (List<EmployeeDO>)request.getAttribute("empdetail");
	
	for(EmployeeDO empdo : empDOList){
%>
	<%=empdo.getEmpid()%>
	<%=empdo.getFname()%>
	<%=empdo.getLname()%>
	<%=empdo.getEmail()%>
<%		
	}
%> --%>

<c:forEach var="emp" items="${empdetail}">
   EMPID <c:out value="${emp.empid}"/>
   Fname <c:out value="${emp.fname}"/>
   Lname <c:out value="${emp.lname}"/>
   Email <c:out value="${emp.email}"/><br>
</c:forEach>

	</body>
</html>