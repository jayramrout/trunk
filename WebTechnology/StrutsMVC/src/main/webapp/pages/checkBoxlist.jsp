<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 multiple check boxes example</h1>

<s:form action="resultAction" namespace="/">

<h4>
	<s:checkboxlist label="What's your favor color" list="colors" name="yourColor" value="defaultColor" />
</h4> 

<s:submit value="submit" name="submit" />
	
</s:form>

</body>
</html>