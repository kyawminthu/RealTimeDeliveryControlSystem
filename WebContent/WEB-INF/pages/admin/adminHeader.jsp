<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
<div>
	<font align="center" color="aqua" size="4">
		<s:property value="%{#session.userID}" /> is logging in.
	</font>
	<a href="logoutAccount"><img src="<s:url value="/images/logout.jpg"/>" width="20" height="20"  onmouseover="moveEvent(this,'2px white solid')" onmouseout="moveEvent(this,'')"/>Logout</a>
</div>
</body>
</html>
