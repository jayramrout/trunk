<%@ page import="java.util.*" contentType="text/html" errorPage="ErrorPage.jsp" isThreadSafe="true" session="true"%>
<%@ page import="java.lang.reflect.*"%>

<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
	List list = new ArrayList();
	int firstValue = Integer.parseInt(request.getParameter("firstValue"));
	int secValue = Integer.parseInt(request.getParameter("secondValue"));
	int i = firstValue/secValue;

%>
	<html>
	<body>
		HELLO WORLD from page directive...
		<%=i%>
		<% 
			out.println(i);
		%>
		
		<%@ include file="index.jsp" %>
		<jsp:directive.include file="index.jsp" />
	</body>
	</html>
	