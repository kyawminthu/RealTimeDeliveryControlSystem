<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Item Deletion Result</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
	<s:form>
      <s:label name="model.itemName" label="Item Name" />
      <s:label name="model.description" label="Description" />
      <s:label name="model.category" label="Category Name" />
      <s:label name="model.brand" label="Brand" />
      <s:label name="model.model" label="Model" />
    </s:form>   
</div>