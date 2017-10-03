<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Web CRM系统首页</title>
    <LINK href="<%=basePath%>/css/login.css" type=text/css rel=stylesheet>
    <script type="text/javascript" src="<%=basePath%>/js/jquery-1.4.3.js"></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddUserInfoAjax.js'></script>
    
	<script type="text/javascript">
	$(function(){
	        //点击涮新图片
            $("#nosee").click(function(){
			      $("#imgVcode").attr("src","<%=basePath%>image.action?dt="+new Date().getTime());
			});
			
	});     
   //登录
   function login(){
	 		     var userLoginFormValue = DWRUtil.getValues("userLoginForm");
	 		        var str="";
	 		        var userLoginName=userLoginFormValue["userLoginName"];
	 		        var userPassWord=userLoginFormValue["userPassWord"];
	 		        var codeNumber=userLoginFormValue["codeNumber"];
					
					if(userLoginName==""){
						str+= "登录名不能为空!<br>";
					}
					if(userPassWord=="" ){
						str+= "密码不能为空!<br>";
					}
					if(codeNumber=="" ){
						str+= "验证码不能为空或不正确!<br>";
					}
					
					if(str==""){
					   AddUserInfoAjax.userLogin(userLoginFormValue,result);
					}else{
					   //alert(str);
					   DivTesy.innerHTML=str;
					}
	 		};
	 		
	 	function result(data){
	 	    var DivTesy="";
		 	if(data==""){
		 	  //alert("登录成功！");
		 	  window.location="index.jsp";
		 	}else{
		 	  //alert(data);
		 	  DivTesy.innerHTML=data;
		 	}
         };
    </script>
  </head>
<body class=PageBody leftMargin=0 topMargin=0 MARGINHEIGHT="0" MARGINWIDTH="0">
<center>
<form name="userLoginForm"  action="login.action" method="post" id="f">
<table  height="100%" cellSpacing=0 cellPadding=0 border=0>
  <tr>
    <td></td>
  </tr>
  <tr>
    <td>
      <table cellSpacing=0 cellPadding=0 border=0>
        <tr class=UpTr height=20>
          <td></td>
          <td><div id="DivTesy" style="color:red; font-size:12px;"></div></td> 
          <td class=VersionTitle align=right>版本:1.0
          </td>
        </tr>
        <tr class=UpTr height=65>
          <td width=20></td>
          <td colSpan=2><IMG src="images/login/logo.gif" border=0></td>
        </tr>
        <tr height=3>
          <td colSpan=3></td>
        </tr>
        <tr class=DownTr>
          <td></td>
          <td>
            <table height=204 cellSpacing=0 cellPadding=0 border=0>
              <tr height=50>
                <td colSpan=3></td>
              </tr>
              <tr height=18>
                <td width=290  background=images/login/userLogin.gif  colSpan=3></td>
              </tr>
              <tr>
                <td class=LoginLine width=2></td>
                <td width=286>
                  <table height="100%" cellSpacing=0 cellPadding=0 width="100%"  border=0>
                    <tr height=10>
                      <td colSpan=6></td>
                    </tr>
                    <tr>
                      <td class=ItemTitleFont align=right width=80 height=25>用户名：</td>
                      <td width=100><input class="inputFrm" id="textUserLoginName" name="userLoginName" value="${param.userLoginName }"><div class="text_leftMsg" id="UserLoginNameValidateMsg"></div></td>
                      <td align="center" rowSpan=2><input type="button"  src="images/login/userLogin_button.gif"  border=0 value="登录" onclick="login()"></td>
                    </tr>
                    <tr>
                      <td class=ItemTitleFont align=right height=25>密　码：</td>
                      <td><input class="inputFrm" id="textUserPassWord" type="password"  name="userPassWord"/><div class="text_leftMsg" id="userPassWordValidateMsg"></div></td>
                    </tr>
                    <tr>
                      <td class=ItemTitleFont align=right height=25>验证码：</td>
                      <td><input class="loginyzm" id="textCodeNumber" name="codeNumber" maxlength="4"/>
                      <a href="javascript:;" id="nosee"><img id="imgVcode" src="<%=basePath%>image.action"  class="yzm_img" />
                      <div class="text_leftMsg" id="codeNumberValidateMsg"></div>
                      </td>          
                       <td><s:actionerror/></td> 
                    </tr>
                  </table>
                  </td>
                <td class=LoginLine width=2></td>
              </tr>
              <tr height=11>
                <td width=290 background=images/login/userLogin_down.gif  colSpan=3></td>
              </tr>
                </table>
              </td>
          <td width=228><IMG src="images/login/logo_bg.gif" border=0></td>
          </tr>
          <tr class=DownTr height=24>
              <td></td>
              <td class=VersionTitle vAlign=bottom align=right  background=images/login/logo_copyright_bg.gif colSpan=2>
              <a class=close href="http://www.hao123.com/"  target=_blank>版权所有 盗版必究</a></td>
          </tr>
          </table>
          </td>
          </tr>
          <tr height="3%">
              <td></td>
          </tr>
      </table>
    </form>
    </center>
      </body>
</html>
