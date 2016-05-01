<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Order Registration Result</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
	<table>
		<s:if test="editFlag">
			<tr>
				<td width="100">ID</td>
				<td width="10">:</td>
				<td width="300"><s:label name="model.id" theme="simple"/></td>
			</tr>
			<tr>
				<td width="100">Created Date</td>
				<td width="10">:</td>
				<td width="300"><s:label name="model.createdDate" theme="simple"/></td>
			</tr>
			<tr>
    			<td width="100">Service Provider ID</td>
    			<td width="10">:</td>
		    	<td width="300"><s:label name="model.serviceProviderID" theme="simple"/></td>
    		</tr>
    		<tr>
    			<td width="100">State</td>
	    		<td width="10">:</td>
		    	<td width="300"><s:label name="model.state" theme="simple"/></td>
    		</tr>
		</s:if>
    	<tr>
	    	<td width="100">Customer First Name</td>
    		<td width="10">:</td>
    		<td width="300">
    			<s:label name="model.cusFirstName" theme="simple"/>
	    	</td>
	    </tr>
	    <tr>
    		<td width="100">Customer Last Name</td>
    		<td width="10">:</td>
	    	<td width="300"><s:label name="model.cusLastName" theme="simple"/></td>
    	</tr>
    	<tr>
    		<td width="100">Address</td>
    		<td width="10">:</td>
	    	<td width="300">
	    					<s:label name="model.address" theme="simple"/>
	    	</td>
    	</tr>
    	<tr>
			<td width="100">Phone</td>
			<td width="10">:</td>
			<td width="300"><s:label name="model.phone" theme="simple"/></td>
		</tr>
    	<tr>
	    	<td width="100">Item Name</td>
    		<td width="10">:</td>
    		<td width="300">
    			<s:label name="model.itemName" theme="simple"/>
	    	</td>
	    </tr>
	    <tr>
	    	<td width="100">Item Brand</td>
    		<td width="10">:</td>
    		<td width="300">
    			<s:label name="model.brand" theme="simple"/>
	    	</td>
	    </tr>
	    <tr>
	    	<td width="100">Item Price</td>
    		<td width="10">:</td>
    		<td width="300">
    			<s:label name="model.price" theme="simple"/>
	    	</td>
	    </tr>
	    <tr>
    		<td width="100">Quantity</td>
    		<td width="10">:</td>
	    	<td width="300"><s:label name="model.quantity" label="Model" theme="simple"/></td>
    	</tr>
    </table>           
</div>