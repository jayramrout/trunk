<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
<head>
  <title>JSTL x:if Tags</title>
</head>
<body>
<h3>Books Info:</h3>

<c:set var="xmltext">
  <books>
    <book>
      <name>Padam History</name>
      <author>ZARA</author>
      <price>100</price>
    </book>
    <book>
      <name>Great Mistry</name>
      <author>NUHA</author>
      <price>2000</price>
    </book>
  </books>
</c:set>

<x:parse xml="${xmltext}" var="output"/>
<ul>
<x:forEach select="$output/books/book/name" var="item">
   <li>Book Name: <x:out select="$item" /></li>
</x:forEach>
</ul>

</body>
</html>