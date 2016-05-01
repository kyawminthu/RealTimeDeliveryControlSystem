<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<table height="10px">
<tr valign="top"><td><div style="height:3px">
<s:form action="loginAccount" method="POST" theme="simple">
	<a href="welcomeLink.action"  onmouseover="moveEvent(this,'2px white solid')" onmouseout="moveEvent(this,'')">Home</a>
	<s:hidden name="lgnErrFlag" id="lgnErrFlag"/>			
   	<s:textfield name="model.userID" label="User Id" id="userID"/>
   	<s:password name="model.password" label="Password" id="password"/>
   	<s:submit value="Login"/>      	
</s:form>
</div>
</td></tr>
<tr><td>
<div style="height:7px;">
	<s:actionerror id="lgnActionErr" theme="simple"/>
</div>
</td></tr>
</table>    