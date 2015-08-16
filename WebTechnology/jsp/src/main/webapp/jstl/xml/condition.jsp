<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
<head>
  <title>JSTL x:choose Tags</title>
</head>
<body>
<h3>Books Info:</h3>

<c:set var="xmltext">
  <books>
    <book>
      <name>Padam History</name>
      <author>RANU</author>
      <price>100</price>
    </book>
    <book>
      <name>Great Mistry</name>
      <author>BHANU</author>
      <price>2000</price>
    </book>
  </books>
</c:set>

<x:parse xml="${xmltext}" var="output"/>

<x:choose>
   <x:when select="$output//book/author = 'RANU'">
      Book is written by RANU
   </x:when>
   <x:when select="$output//book/author = 'BHANU'">
      Book is written by BHANU
   </x:when>
   <x:otherwise>
      Unknown author.
   </x:otherwise>
</x:choose>

</body>
</html>