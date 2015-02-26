<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
  <title>JSTL fmt:parseDate Tag</title>
</head>
<body>
<h3>Date Parsing:</h3>
<c:set var="now" value="20-10-2010" />

<fmt:parseDate value="${now}" var="parsedEmpDate"
                              pattern="dd-MM-yyyy" />
                              
<p>Parsed Date: <c:out value="${parsedEmpDate}" /></p>

</body>
</html>