<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Category Deletion</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>	
	<s:form action="doDeleteCategory" method="POST">
		<s:hidden name="model.categoryName" />
		<s:hidden name="model.description" />
		<s:label name="model.categoryName" label="Category Name "/>
	    <s:label name="model.description" value="%{model.description}" label="Description "/>
	    <table>
      		<tr>
      			<td width="110px">&nbsp;</td>
      			<td><s:submit value="Delete" theme="simple"/></td>
      		</tr>
      	</table>    
    </s:form>
</div>