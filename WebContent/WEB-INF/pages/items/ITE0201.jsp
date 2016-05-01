<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Items Search Form</h2>
	<s:actionerror/>
    <s:form action="searchItem" method="POST">
      <s:textfield name="model.itemName" label="Item Name" />
      <s:select list="categories" name="model.category" label="Category Name"></s:select>
      <s:textfield name="model.brand" label="Brand" />
      <s:textfield name="model.model" label="Model" />
      <table>
      	<tr>
      		<td width="105px">&nbsp;</td>
      		<td><s:submit value="Search" theme="simple"/></td>
      		<td><s:reset value="Clear" theme="simple"/></td>
      	</tr>
      </table>
    </s:form>
</div>