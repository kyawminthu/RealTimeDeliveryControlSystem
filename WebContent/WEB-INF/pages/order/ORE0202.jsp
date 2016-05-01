<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Order Search Result</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
	<s:if test="orderList.size() > 0">
	<table>
		<tr>
			<th width="300" class="table_header">ID</th>
			<th width="300" class="table_header">Service Provider ID</th>
			<th width="300" class="table_header">State</th>
			<th width="300" class="table_header">Customer Name</th>
			<th width="300" class="table_header">Phone</th>
			<th width="300" class="table_header">Item Name</th>
			<th width="300" class="table_header">Quantity</th>
			<th width="300" class="table_header">Price</th>
			<th width="300" class="table_header">Total</th>
			<th width="300" class="table_header">
				Edit Link
			</th>
			<th width="300" class="table_header">
				Delete Link
			</th>
		</tr>
		<s:iterator value="orderList" var="oreList" status="record">
			<tr>
				<td width="300" class="h_table"><s:property value="id" /></td>
				<td width="300" class="h_table"><s:property value="serviceProviderID" /></td>
				<td width="300" class="h_table"><s:property value="state" /></td>
				<td width="300" class="h_table"><s:property value="cusFirstName" /> &nbsp;
								<s:property value="cusLastName" /></td>
				<td width="300" class="h_table"><s:property value="phone" /></td>
				<td width="300" class="h_table"><s:property value="itemName" /></td>
				<td width="300" class="h_table"><s:property value="quantity" /></td>
				<td width="300" class="h_table"><s:property value="price" /></td>
				<td width="300" class="h_table"><s:property value="total" /></td>
				<td width="300" class="h_table">
					<a href="editOrder?selectedID=<s:property value="%{#oreList.id}"/>" />Edit</a>
				</td>
				<td width="300" class="h_table">
					<a href="deleteOrder?selectedID=<s:property value="%{#oreList.id}"/>" />Remove</a>
				</td>
			</tr>
		</s:iterator>    
    </table>  
    </s:if>         
</div>