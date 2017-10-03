<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>角色权限</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
 
  </head>
  
  <body> 
  <center>
	  <table width="50%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
	                
	                 <tr style="padding:5px;">
				       <td align="center"> 角色编号</td>
				       <td align="center"> ${roleInfo.roleId }</td>
				     </tr>
				     
				      <tr style="padding:5px;">
				         <td align="center"> 角色名称</td>
				         <td align="center"> ${roleInfo.roleName }</td>
				      </tr>
				      
				       <tr style="padding:5px;">
				         <td align="center"> 角色权限</td>
				         <td align="center"> 
				         <s:iterator value="#request.roleInfoLimits" id="roleInfoLimit">
				         <s:if test="#request.roleInfoLimit.access==1">
				             ${roleInfoLimit.menuInfo.menuInfoName}<br/>
				         </s:if>
				         </s:iterator>
				         </td>
				       </tr>
	  </table>
	    </center>
  </body>
</html>

