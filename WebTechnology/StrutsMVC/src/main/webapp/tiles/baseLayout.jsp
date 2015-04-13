<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
</head>
<body>
	<table border="1" cellspacing="2" align="center">
		<tr>
			<td height="100" colspan="2" width="1000"><tiles:insertAttribute
					name="header" /></td>
		</tr>
		<tr>
			<td height="400" width="250" bgcolor="red"><tiles:insertAttribute
					name="menu" /></td>
			<td height="400" width="750"><tiles:insertAttribute name="body" />
			</td>
		</tr>
		<tr>
			<td height="100" colspan="2" width="1000"><tiles:insertAttribute
					name="footer" /></td>
		</tr>
	</table>
</body>
</html>
