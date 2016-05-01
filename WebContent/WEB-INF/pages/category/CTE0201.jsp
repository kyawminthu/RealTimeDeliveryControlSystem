<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Category List</h2>
	<s:actionerror/>
	<s:if test="categoryList.size() > 0">
	<table>
		<tr>			
			<th width="300" class="table_header"><s:label value="Category Name" theme="simple"/></th>
			<th width="300" class="table_header"><s:label value="Description" theme="simple"/></th>
			<th width="300" class="table_header">Edit Link</th>
			<th width="300" class="table_header">Remove Link</th>
		</tr>
		<s:iterator value="categoryList" var="catList" status="record">
			<tr>
				<td width="300" class="h_table"><s:property value="%{#catList.categoryName}" /></td>
				<td width="300" class="h_table"><s:property value="%{#catList.description}" /></td>
				<td width="300" class="h_table">
					<a href="editCategory?selectedCategory=<s:property value="%{#catList.categoryName}"/>" />Edit</a>
				</td>
				<td width="300" class="h_table">
					<a href="deleteCategory?selectedCategory=<s:property value="%{#catList.categoryName}"/>" />Remove</a>
				</td>
			</tr>
		</s:iterator>    
    </table>   
    </s:if>        
</div>