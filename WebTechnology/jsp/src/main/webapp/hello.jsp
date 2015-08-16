<%-- Hello JSP AGAIN <%=new java.util.Date() %> --%>



<% 
	out.println("This is my Scriplet");
%>

<% 
	out.println("This is my second Scriplet");
%>

<%!
	int i = 0;
	String name = "";
%>
<%!
	String yourname = "";

public void callMe(){
	System.out.println("This is call ME MEthod");
}

%>
