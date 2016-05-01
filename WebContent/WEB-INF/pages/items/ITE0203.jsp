<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div>
	<h2 class="H2">Items Search Result</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
	<table>
		<s:iterator value="itemList" var="iteList" status="record">
		<s:if test="#record.count%5 == 1">
			<tr>
				<td>
		</s:if>
		<s:else>
			<td>
		</s:else>
				<table>
					<s:if test="#iteList.photoPath != null">
					<tr><td><img src="<s:property value="%{#iteList.photoPath}"/>" width="100" height="100"/></td></tr>
					</s:if>
					<s:else>
					<tr><td class="noImg" ><font style="align:center;">No Image</font></td></tr>
					</s:else>
					<tr><td><s:property value="%{#iteList.itemName}" /></td></tr>
					<tr><td><s:property value="%{#iteList.brand}" /></td></tr>
					<tr><td><s:property value="%{#iteList.model}" /></td></tr>
					<tr><td><s:property value="%{#iteList.price}" /></td></tr>
					<tr><td><s:property value="%{#iteList.measurement}" /></td></tr>
					<tr><td>
						<a href="orderCreate?model.itemName=<s:property value="%{#iteList.itemName}"/>" />Order This Item</a>
					</td></tr>
					
				</table>
		<s:if test="#record.count%5 == 0">
			 </td>
			</tr>				
		</s:if>
		<s:else>
			</td>
		</s:else>
		</s:iterator>    
    </table>           
</div>