<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="menu" style="background: '/images/gradientfromtop.gif'">
<h2>Account</h2>
<ul>
	<li class="headerli"><a href="<s:url action="accountCreate"/>">Account
	Registration</a></li>
	<li class="headerli"><a href="<s:url action="editInit"/>">Edit Account</a></li>
	<li class="headerli"><a href="<s:url action="passwordChange"/>">Change
	Password</a></li>
</ul>

<h2>Category</h2>
<ul>
	<li class="headerli"><a href="<s:url action="categoryCreate"/>">Category
	Registration</a></li>
	<li class="headerli"><a href="<s:url action="categoryList"/>">Category List</a></li>
</ul>

<h2>Product Items</h2>
<ul>
	<li class="headerli"><a href="<s:url action="itemCreate"/>">Item Registration</a><br>
	</li>
	<li class="headerli"><a href="<s:url action="itemSearch"/>">Item Search</a></li>
</ul>

<h2>Order</h2>
<ul>
	<li class="headerli"><a href="<s:url action="orderSearch"/>">Order Search</a></li>
</ul>
</div>