<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户添加</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
    <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddUserInfoAjax.js'></script>
    
	<script type="text/javascript">
	       //打开查找 角色名称
	 		function  OpenRole(roleId){
	 		  window.open('roleInfoFindAll.action?currentPage=1&roleId='+roleId,"win","top=200px,left=300px,height=400px,toolbar=false,menubar=false,resizable=true,location=false");
	 		}
	 		 //打开查找 上级名称
	 		function  OpenUser(userId){
	 		  window.open('userInfoFindAll.action?currentPage=1&userId='+userId,"win","top=200px,left=300px,height=400px,toolbar=false,menubar=false,resizable=true,location=false");
	 		}
	 		//
	 		function addUserInfo(){
	 		     var userInfoFormValue = DWRUtil.getValues("addUserInfoForm");
	 		     AddUserInfoAjax.saveUserInfo(userInfoFormValue,result);
	 		}
	 		
	 	function result(data){
              alert(data);
              window.opener.document.location.reload();
         }
	 		
	</script>
  </head>
  
  <body> 
  <center>
		 <h1 align="center" style="font-family:华义彩云;"> 用户信息添加</h1>
			<form name="addUserInfoForm"   action=" " method="post" target="main">
			      <table width="80%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
				    <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 姓名：</td>
				      <td><input type="text" name="userName"  value=""> </td>
				     
				      <td bgcolor="#eeeeee"> 登陆名：</td>
				      <td><input type="text" name="userLoginName"  value=""> </td>
				    </tr>
				      <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 密码：</td>
					      <td><input type="password" name="userPassWord"  value=""> </td>
					      
					       <td bgcolor="#eeeeee">确认密码：</td>
					        <td><input type="password" name="reUserPassWord"  value=""> </td>
					    </tr>
					  
					  <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 手机：</td>
					      <td>
					      <input type="text" name="userTelphone"  value="">
					      </td>
					      <td bgcolor="#eeeeee"> 邮箱：</td>
					      <td>
					      <input type="text" name="userEmail"  value="">
					      </td>
					  </tr>     
				
				        <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 上级：</td>
					      <td> 
					      <input type="text"   name="userLeadName" id="userLeadName" value="">
					      <input type="hidden" name="userLeadId"   id="userLeadId" value="userLeadId"/> <!-- 隐藏上级id -->
					      <img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenUser();'/>
					      </td>
					      <td bgcolor="#eeeeee"> 角色：</td>
					      <td>
					      <input type="text"   name="userRoleName" id="userRoleName"  value="" readonly="readonly">
					      <input type="hidden" name="roleInfoId"   id="roleInfoId" value=""/>
					      <img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenRole();'/> 
					      </td>
					     </tr>  
			      </table>
			      <p align="center">
			      <input type="button" value="添加"  onclick="addUserInfo()">
			      <input type="reset" value="重置">
			      </p>
			</form>
			</center>
  </body>
</html>

