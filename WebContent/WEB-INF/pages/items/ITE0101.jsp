<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Item Registration</h2>
	<s:actionerror/>	
    <s:form action="createItem" method="POST" enctype="multipart/form-data">
      <s:hidden name="editFlag" />
      <s:if test="!editFlag">
      	<s:textfield name="model.itemName" label="Item Name (*)"  maxlength="30"/>
      </s:if>
      <s:else>
      	<s:label name="model.id" label="Item Id" />
      	<s:textfield name="model.itemName" label="Item Name" readonly="true"/>
      </s:else>
      <s:textarea name="model.description" label="Description "  cols="20" rows="2" wrap="true"/>
      <s:select list="categories" name="model.category" label="Category Name (*)"></s:select>	  
      <s:textfield name="model.brand" label="Brand " maxlength="20"/>
      <s:textfield name="model.model" label="Model " maxlength="50"/>
      <s:textfield name="model.price" label="Price " />
      <s:textfield name="model.measurement" label="Measurement "  maxlength="20"/>
      <s:file name="uploadPhoto" label="Item Photo " />
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
    		<td colspan="1"><s:label value="Old Photo:" theme="simple"/></td>
    		<td><img src="<s:property value="model.photoPath"/>" width="100" height="100" 
    			alt="Old photo in system.If you don't want to change photo, don't choose the photo path."/>
    		</td>
    	</tr>
    	<tr>
    		<td width="120px">&nbsp;</td>
      		<td><s:submit value="Change" theme="simple"/></td>
      		<td><s:reset value="Reset" theme="simple"/></td>
      	</tr>
    	</s:else>    	
      </table>
   </s:form>
</div>