<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Order Deletion Result</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
	<s:form> 
	  <s:label name="model.id" label="ID " />
      <s:label name="model.serviceProviderID" label="Price " />
      <s:label name="model.state" label="State " />
      <s:label name="model.cusFirstName" label="Customer Fist Name " />
      <s:label name="model.cusLastName" label="Customer Last Name " />
      <s:label name="model.Address" label="Address " />
      <s:label name="model.phone" label="Phone " />
      <s:label name="model.itemName" label="Item Name " />
      <s:label name="model.quantity" label="Quantity " />
      <s:label name="model.total" label="Total " />
    </s:form>
</div>