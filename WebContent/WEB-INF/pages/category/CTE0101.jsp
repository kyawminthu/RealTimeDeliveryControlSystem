<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Category Registration</h2>
	<s:actionerror/>
    <s:form action="createCategory" method="POST">
    <s:hidden name="editFlag" />
    <s:if test="!editFlag">
      	<s:textfield name="model.categoryName" label="Category Name (*)" maxlength="20" />
    </s:if>
    <s:else>
    	<s:textfield name="model.categoryName" label="Category Name " value="%{model.categoryName}" readonly="true"/>
    </s:else>
    <s:textarea name="model.description" label="Description " cols="20" rows="2" wrap="true"/>
    <table>
    	<s:if test="!editFlag">
      	<tr>
      		<td width="120px">&nbsp;</td>
      		<td><s:submit value="Create" theme="simple"/></td>
      		<td><s:reset value="Clear" theme="simple"/></td>
      	</tr>
    	</s:if>
    	<s:else>
    	<tr>
    		<td width="110px">&nbsp;</td>
      		<td><s:submit value="Change" theme="simple"/></td>
      		<td><s:reset value="Reset" theme="simple"/></td>
      	</tr>
    	</s:else>    	
    </table>
    </s:form>
</div>