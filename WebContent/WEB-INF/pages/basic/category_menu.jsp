<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
	ele = document.getElementById("lgnErrFlag");
	actionErr = document.getElementById("lgnActionErr");
	if(actionErr!= null && actionErr != 'undefined' 
		&& ele != null && ele != 'undefined') {
		if( ele.value == 'true') {
			qdocument.getElementById("lgnActionErr").style.display = "";
		} else {
			document.getElementById("lgnActionErr").style.display = "none";
		}
	}
</script>
<div align="justify">
 <div>
 	<a href="latestItemSearch"><img src="<s:url value="/images/latest_items.jpg"/>" width="100%" height="30" border="1" onmouseover="moveEvent(this,'2px gold solid')" onmouseout="moveEvent(this,'1px blue solid')"/></a>
 </div>
 <div>
 	<a href="popularItemSearch"><img src="<s:url value="/images/most_popular_items.jpg"/>" width="100%" height="30px" border="1" onmouseover="moveEvent(this,'2px gold solid')" onmouseout="moveEvent(this,'1px blue solid')"/></a>
 </div>
 <div>
 	<img src="<s:url value="/images/category_list.jpg"/>" width="100%" height="30px" border="1" onclick="toggleCategories('catList')" onmouseover="moveEvent(this,'2px gold solid')" onmouseout="moveEvent(this,'1px blue solid')"/>
 </div>
 <div id="catList" style="display:none;">
 <s:iterator value="%{#session.categoryNameList}" var="category"> 
 <div style="background:#DFF2FD; height:30px; border-top: 0px solid #2b77d5;border-left: 1px solid #2b77d5;border-right: 1px solid #2b77d5;border-bottom: 1px solid #2b77d5;" onmouseover="moveEvent(this,'2px gold solid')" onmouseout="moveEvent(this,'1px blue solid')">
 	<a href="searchItem?model.category=<s:property value='%{#category}'/>" ><font color="green"><s:property value="%{#category}" /></font></a>
 </div> 	
 </s:iterator>
 </div>
 <div>
 	<a href="itemSearch"><img src="<s:url value="/images/search_sale_items.jpg"/>" width="100%" height="30px" border="1" onmouseover="moveEvent(this,'2px gold solid')" onmouseout="moveEvent(this,'1px blue solid')"/></a>
 </div>
 <div>
	<a href="<s:url action="aboutUs"/>" ><img src="<s:url value="/images/about_us.jpg"/>" width="100%" height="30px" border="1" onmouseover="moveEvent(this,'2px gold solid')" onmouseout="moveEvent(this,'1px blue solid')"/></a>
 </div>
</div>