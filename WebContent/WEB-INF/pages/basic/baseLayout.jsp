<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title><tiles:insertAttribute name="title" ignore="true" /></title>
    </head>
    <LINK class=user rel=stylesheet type=text/css href="css/header.css">
  	<LINK class=user rel=stylesheet type=text/css href="css/main.css">
  	<script type="text/javascript" src="javascript/common.js" ></script>    
    <body>
        <table align="center" width="100%" height="100%">
            <tr background="images/OnlineShopping_header_back.JPG">            	
                <td height="50" colspan="2" align="right">
                    <tiles:insertAttribute name="header" />                    
                </td>
            </tr>
            <tr>
                <td width="20%" height="100%" valign="top" bgcolor="#85F9A4">
                	<tiles:insertAttribute name="menu" />
                </td>
                <td width="100%" bgcolor="#DFF2FD" height="400" valign="top">
                	<tiles:insertAttribute name="body" />
                </td>
            </tr>
            <tr>
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
        </table>
    </body>
</html>
