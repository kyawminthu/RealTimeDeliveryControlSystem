<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Items Search Result</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
	<s:if test="itemList.size() > 0">
	<table>
		<tr>
			<th width="300" class="table_header">ID</th>
			<th width="300" class="table_header">Item Name</th>
			<th width="300" class="table_header">Description</th>
			<th width="300" class="table_header">Category</th>
			<th width="300" class="table_header">Brand</th>
			<th width="300" class="table_header">Model</th>
			<th width="300" class="table_header">Price
							<s:property value="%{#iteList.measurement}" /></th>
			<th width="300" class="table_header">
				Edit Link
			</th>
			<th width="300" class="table_header">
				Delete Link
			</th>
		</tr>
		<s:iterator value="itemList" var="iteList" status="record">
			<tr>
				<td width="300" class="h_table"><s:property value="%{#iteList.id}" /></td>
				<td width="300" class="h_table"><s:property value="%{#iteList.itemName}" /></td>
				<td width="300" class="h_table"><s:property value="%{#iteList.description}" /></td>
				<td width="300" class="h_table"><s:property value="%{#iteList.category}" /></td>
				<td width="300" class="h_table"><s:property value="%{#iteList.brand}" /></td>
				<td width="300" class="h_table"><s:property value="%{#iteList.model}" /></td>
				<td width="300" class="h_table"><s:property value="%{#iteList.price}" />
								<s:property value="%{#iteList.measurement}" /></td>
				<td width="300" class="h_table">
					<a href="editItem?selectedItemName=<s:property value="%{#iteList.itemName}"/>" />Edit</a>
				</td>
				<td width="300" class="h_table">
					<a href="deleteItem?selectedItemName=<s:property value="%{#iteList.itemName}"/>" />Remove</a>
				</td>
			</tr>
		</s:iterator>    
    </table>           
    </s:if>
</div>