<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户详细信息</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
  </head>
  
  <body> 
  <center>
		 <h5 align="center" style="font-family:华义彩云;"> 用户详细信息</h5>
			      <table width="80%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
				     <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 姓名：</td>
					      <td> ${requestScope.UserInfos.userName }</td>
					      <td bgcolor="#eeeeee"> 登陆名：</td>
					      <td> ${requestScope.UserInfos.userLoginName }</td>
				     </tr>
				      <tr style="padding:5px;">
					       <td bgcolor="#eeeeee"> 密码：</td>
					       <td> ${requestScope.UserInfos.userPassWord }</td>
					       <td bgcolor="#eeeeee">确认密码：</td>
					       <td> ${requestScope.UserInfos.userPassWord }</td>
					   </tr>
					  <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 手机：</td>
					      <td> ${requestScope.UserInfos.userTelphone }</td>
					      <td bgcolor="#eeeeee"> 邮箱：</td>
					      <td> ${requestScope.UserInfos.userEmail }</td>
					  </tr>     
			          <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 上级：</td>
					      <td> ${requestScope.UserInfos.userInfo.userName }</td>
					      <td bgcolor="#eeeeee"> 角色：</td>
					      <td> ${requestScope.UserInfos.roleInfo.roleName }</td>
				      </tr>  
			      </table>
			</center>
  </body>
</html>

