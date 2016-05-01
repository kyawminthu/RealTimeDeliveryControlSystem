<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Order Search Form</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
    <s:form action="searchOrder" method="POST">
      <s:select list="statusList" name="model.status" label="Status "/>	
      <s:textfield name="model.cusFirstName" label="Customer Fist Name " maxlength="25" />
      <s:textfield name="model.cusLastName" label="Customer Last Name " maxlength="25" />
      <s:textfield name="model.serviceProviderID" label="Service Provider ID " maxlength="25" />      
      <s:textfield name="model.Address" label="Address "  maxlength="255" />
      <s:textfield name="model.itemName" label="Item Name " maxlength="30" />
      <s:select list="stateList" name="model.state" label="State "/>
      <s:select list="countryList" name="model.country" label="Country "/>
      <table>
      		<tr>
      			<td width="140px">&nbsp;</td>
      			<td><s:submit value="Search" theme="simple"/></td>
      			<td><s:reset value="Reset" theme="simple"/></td>
      		</tr>
      </table>
    </s:form>
</div>