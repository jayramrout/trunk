<html>
<head>
<title>JSP Custom Taglib example: Substr function</title>
</head>

<jsp:useBean id="empDetail"
	class="com.tutorial.jsp.usebeans.GetEmployeeDetails">
</jsp:useBean>

<jsp:setProperty property="name" name="empDetail" value='<%=request.getParameter("firstName")%>'/>
<jsp:setProperty property="id" name="empDetail" param="id"/>
<%-- <jsp:setProperty property="id" name="empDetail" value='<%=Integer.parseInt(request.getParameter("id"))%>'/> --%>


<jsp:getProperty name="empDetail" property="name"/><br>
<jsp:getProperty name="empDetail" property="id"/>

<jsp:getProperty name="empDetail" property="salary"/>

<%-- <jsp:forward page="enterdetail.jsp"></jsp:forward> --%>

<body>
</body>
</html>