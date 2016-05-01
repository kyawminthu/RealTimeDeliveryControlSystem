<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html"%>
<div>
	<h2 class="H2">Account Registration</h2>
	<s:actionerror/>
    <s:form action="createAccount" method="POST">
      <s:hidden name="editFlag" />
      <s:if test="!editFlag">    
      	<s:textfield name="model.userID" label="User Id (*)" maxlength="10"/>
      	<s:password name="model.password" label="Password (*)"  maxLength="15"/>
      	<s:password name="model.confirmPassword" label="Confirm Password (*)"  maxLength="15"/>
      </s:if>
      <s:else>
      	<s:textfield name="model.userID" label="User Id (*)" readonly="true" />
      </s:else>      
      <s:textfield name="model.firstName" label="First Name (*)"  maxLength="25"/>
      <s:textfield name="model.lastName" label="Last Name (*)"  maxLength="25"/>
      <s:textfield name="model.position" label="Position (*)"  maxLength="20"/>
      <table>
      	<s:if test="!editFlag">
      	<tr>
      		<td width="140px">&nbsp;</td>
      		<td><s:submit value="Create" theme="simple"/></td>
      		<td><s:reset value="Clear" theme="simple"/></td>
      	</tr>
    	</s:if>
    	<s:else>
    	<tr>
    		<td width="90px">&nbsp;</td>
      		<td><s:submit value="Change" theme="simple"/></td>
      		<td><s:reset value="Reset" theme="simple"/></td>
      	</tr>
    	</s:else>    	
      </table>
    </s:form>
</div>