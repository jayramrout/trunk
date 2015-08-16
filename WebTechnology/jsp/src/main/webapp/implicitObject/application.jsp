<%@ page import="java.io.*,java.util.*" %>

<html>
<head>
<title>Applcation object in JSP</title>
</head>
<body>
<%
Integer hitsCount = 
(Integer)application.getAttribute("hitCounter");

Integer hitsCountSession = 
(Integer)session.getAttribute("hitCounter");

Integer hitsCountRequest = 
(Integer)request.getAttribute("hitCounter");

    if( hitsCount ==null || hitsCount == 0 ){
       /* First visit */
       out.println("Welcome to my website Application!");
       hitsCount = 1;
    }else{
       /* return visit */
       out.println("Welcome back to my website Application!");
       hitsCount += 1;
    }

    if( hitsCountSession ==null || hitsCountSession == 0 ){
        /* First visit */
        out.println("Welcome to my website Session!");
        hitsCountSession = 1;
     }else{
        /* return visit */
        out.println("Welcome back to my website Session !");
        hitsCountSession += 1;
     }
    
    if( hitsCountRequest ==null || hitsCountRequest == 0 ){
        /* First visit */
        out.println("Welcome to my website Session!");
        hitsCountRequest = 1;
     }else{
        /* return visit */
        out.println("Welcome back to my website Session !");
        hitsCountRequest += 1;
     }
    
    application.setAttribute("hitCounter", hitsCount);
    
    session.setAttribute("hitCounter", hitsCountSession);
    
    request.setAttribute("hitCounter", hitsCountSession);
    
    //application.removeAttribute("hitCounter");
    
%>
<center>
<p>Total number of visits From Application : <%= hitsCount%></p>
<p>Total number of visits From session : <%= hitsCountSession%></p>
<p>Total number of visits From Request : <%= hitsCountRequest%></p>

</center>
</body>
</html>