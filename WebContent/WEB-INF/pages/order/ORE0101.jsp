<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Order Registration</h2>
	<s:actionerror/>	
	<s:if test="!editFlag">
      	<s:form action="createOrder" method="POST">
     		<s:hidden name="editFlag" />      
      		<s:textfield name="model.cusFirstName" label="Customer Fist Name (*)" maxlength="25" />
      		<s:textfield name="model.cusLastName" label="Customer Last Name (*)" maxlength="25" />
      		<s:textfield name="model.address" label="Address (*)"  maxlength="255" />
      		<s:select list="countryList" name="model.country" label="Country (*)"/>
      		<s:select list="stateList" name="model.state" label="State (*)" />           
      		<s:textfield name="model.phone" label="Phone "  maxlength="11" />
      		<s:textfield name="model.itemName" label="Item Name " readonly="true" />
      		<s:textfield name="model.brand" label="Brand " readonly="true" />
      		<s:textarea name="model.description" label="Description" readonly="true" cssStyle="width:150px;"/>
      		<s:textfield name="model.price" label="Price " readonly="true" />
      		<s:textfield name="model.quantity" label="Quantity (*)" />
      		<table>
      			<tr>
      				<td width="150px">&nbsp;</td>
      				<td><s:submit value="Create" theme="simple"/></td>
      				<td><s:reset value="Clear" theme="simple"/></td>
      			</tr>
      		</table>
      	</s:form>
    </s:if>
    <s:else>
    	<s:form action="updateOrder" method="POST">
    		<s:hidden name="editFlag" />
	  		<s:textfield name="model.id" label="ID : " readonly="true" />
      		<s:textfield name="model.createdDate" label="Created Date " readonly="true" />
      		<s:textfield name="model.serviceProviderID" label="Service Provider ID " readonly="true" />
      		<s:select list="statusList" name="model.status" label="Status (*)"/>
      		<s:textfield name="model.cusFirstName" label="Customer Fist Name (*)" maxlength="25" />
	   		<s:textfield name="model.cusLastName" label="Customer Last Name (*)" maxlength="25" />
    	  	<s:textfield name="model.address" label="Address (*)"  maxlength="255" />
      		<s:select list="countryList" name="model.country" label="Country (*)"/>
      		<s:select list="stateList" name="model.state" label="State (*)" />           
      		<s:textfield name="model.phone" label="Phone "  maxlength="11" />
      		<s:textfield name="model.itemName" label="Item Name " maxlength="30" readonly="true"/>
      		<s:textfield name="model.brand" label="Brand " readonly="true" />
      		<s:textfield name="model.price" label="Price " maxlength="30" readonly="true"/>
      		<s:textfield name="model.quantity" label="Quantity (*)" maxlength="50" />
      		<table>
      			<tr>
      				<td width="150px">&nbsp;</td>
      				<td><s:submit value="Change" theme="simple"/></td>
      				<td><s:reset value="Reset" theme="simple"/></td>
      			</tr>
      		</table>
    	</s:form>
    </s:else>    
</div>