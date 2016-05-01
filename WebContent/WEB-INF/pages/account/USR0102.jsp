<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html"%>
<div>
	<h2 class="H2">Account Registration Result</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
	<table>
		<tr>
			<td width="100">User ID</td>
			<td width="10">:</td>
			<td width="300"><s:label name="model.userID" theme="simple"/></td>
		</tr>
    	<tr>
	    	<td width="100">User Name</td>
    		<td width="10">:</td>
    		<td width="300">
    			<s:label name="model.firstName" theme="simple"/>&nbsp;
	    		<s:label name="model.lastName" theme="simple"/>
	    	</td>
	    </tr>
    	<tr>
    		<td width="100">Position</td>
    		<td width="10">:</td>
	    	<td width="300"><s:label name="model.position" theme="simple"/></td>
    	</tr>
    </table>           
</div>