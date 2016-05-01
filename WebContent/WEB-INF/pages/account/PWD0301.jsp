<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html"%>
<div>
	<h2 class="H2">Password Change</h2>
	<s:actionerror/>
	<div class="infoMessage"><s:actionmessage/></div>
    <s:form action="changePassword" method="POST">
      <s:password name="model.oldPassword" label="Old Password (*)" />
      <s:password name="model.password" label="New Password (*)" />
      <s:password name="model.confirmPassword" label="Confirm Password (*)" />
      <s:if test="!changeFinishedFlag">
      	<table>
      		<tr>
      			<td width="140px">&nbsp;</td>
      			<td><s:submit value="Change" theme="simple"/></td>
      			<td><s:reset value="Clear" theme="simple"/></td>
      		</tr>
      	</table>
      </s:if>
    </s:form>
</div>