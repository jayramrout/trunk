<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
<head>
  <title>JSTL x:out Tags</title>
</head>
<body>
<h3>Books Info:</h3>

<c:set var="xmltext">
  <books>
    <book>
      <name>SCJP</name>
      <author>Kathy</author>
      <price>100</price>
    </book>
    <book>
      <name>Treasury</name>
      <author>Ahsaan</author>
      <price>2000</price>
    </book>
  </books>
</c:set>

<x:parse xml="${xmltext}" var="output"/>
<b>The title of the first book is</b>: 
<x:out select="$output/books/book[1]/name" />
<br>
<b>The price of the second book</b>: 
<x:out select="$output/books/book[2]/price" />
</body>
</html>