<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Category Registration Result</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
	<table>
		<tr>
	    	<td width="100">Category Name</td>
    		<td width="10">:</td>
    		<td width="300">
    			<s:label name="model.categoryName" theme="simple"/>
	    	</td>
	    </tr>
	    <tr>
    		<td width="100">Description</td>
    		<td width="10">:</td>
	    	<td width="300"><s:label name="model.description" theme="simple"/></td>
    	</tr>    	
    </table>           
</div>