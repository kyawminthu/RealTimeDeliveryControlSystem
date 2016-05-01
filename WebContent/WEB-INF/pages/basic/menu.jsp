<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<table>
	<tr bgcolor="#245DDB">
		<td>
			<a href="<s:url action="latestItemSearch"/>" ><font color="white">Latest Products</font></a>
		</td>
	</tr>
	<tr bgcolor="#245DDB">
		<td>
			<a href="<s:url action="popularItemSearch"/>" ><font color="white">Most Popular Products</font></a>
		</td>
	</tr>
	<tr bgcolor="#245DDB">
		<td>
			<a href="<s:url action="getCategories"/>" ><font color="white">Categories</font></a>
		</td>
	</tr>
	<tr bgcolor="#245DDB">
		<td>
			<a href="<s:url action="itemSearch"/>" ><font color="white">Search Product</font></a>
		</td>
	</tr>
	<tr bgcolor="#245DDB">
		<td>
			<a href="<s:url action="aboutUs"/>" ><font color="white">About Us</font></a>
		</td>
	</tr>
</table>