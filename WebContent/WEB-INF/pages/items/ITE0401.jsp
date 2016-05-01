<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Item Deletion</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
    <s:form action="doDeleteItem" method="POST">
      <s:hidden name="model.id" />
      <s:hidden name="model.itemName" />
      <s:hidden name="model.description" />
      <s:hidden name="model.category" />
      <s:hidden name="model.brand" />
      <s:hidden name="model.model" />
      <s:label name="model.itemName" label="Item Name" />
      <s:label name="model.description" label="Description" />
      <s:label name="model.category" label="Category Name" />
      <s:label name="model.brand" label="Brand" />
      <s:label name="model.model" label="Model" />
      <table>
      	<tr>
      		<td width="100px">&nbsp;</td>
      		<td><s:submit value="Delete" theme="simple"/></td>
      	</tr>
      </table>      
    </s:form>
</div>