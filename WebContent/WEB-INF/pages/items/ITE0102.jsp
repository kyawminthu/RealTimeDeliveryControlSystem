<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Item Registration Result</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
	<table>
		<s:if test="editFlag">
		<tr>
			<td width="100">ID</td>
			<td width="10">:</td>
			<td width="300"><s:label name="model.id" label="Item Id" theme="simple"/></td>
		</tr>
		</s:if>
    	<tr>
	    	<td width="100">Item Name</td>
    		<td width="10">:</td>
    		<td width="300">
    			<s:label name="model.itemName" label="Item Name" theme="simple"/>
	    	</td>
	    </tr>
	    <tr>
    		<td width="100">Description</td>
    		<td width="10">:</td>
	    	<td width="300"><s:label name="model.description" label="Description" theme="simple"/></td>
    	</tr>
    	<tr>
    		<td width="100">Price</td>
    		<td width="10">:</td>
	    	<td width="300">
	    					<s:label name="model.price" label="Price" theme="simple"/>
	    					<s:label name="model.measurement" label="Measurement" theme="simple"/>
	    	</td>
    	</tr>
    	<tr>
			<td width="100">Category</td>
			<td width="10">:</td>
			<td width="300"><s:label name="model.category" label="Category Name" theme="simple"/></td>
		</tr>
    	<tr>
	    	<td width="100">Brand</td>
    		<td width="10">:</td>
    		<td width="300">
    			<s:label name="model.brand" label="Brand" theme="simple"/>
	    	</td>
	    </tr>
	    <tr>
    		<td width="100">Model</td>
    		<td width="10">:</td>
	    	<td width="300"><s:label name="model.model" label="Model" theme="simple"/></td>
    	</tr>
    	<tr>
    		<td width="100">Photo</td>
    		<td width="10">:</td>
	    	<td width="300"><img src="<s:property value="model.photoPath"/>" width="100" height="100"/></td>
    	</tr>
    </table>           
</div>