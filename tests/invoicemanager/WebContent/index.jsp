<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>税控开票发票 | 登陆</title>
    <script type="text/javascript" src="js/analytics.js"></script>
	<script type="text/javascript" src="js/hm.js"></script>
	<script type="text/javascript" src="js/ReportServer.js"></script>
    <script type="text/javascript" src="js/ReportServer(1).js"></script>
    <link rel="stylesheet" href="css/ReportServer.css" type="text/css"></link>
    <script type="text/javascript">
// 	        $.ajax({  
//              type:"post",  
//              url:"${ctx }/loginController/login.do",  
//              data:{tname:$("#username").val()},  
//              dataType:"text",  
//              beforeSend:function(){  
//                  $("#fs-login-btn").val("正在提交，请稍等...");  
//                  },   
//              success:function(data){  
//                  /*判断输入是否成功，成功则跳转 */     
//                  if("用户名可用!"==data){  
//                      $("#fs-login-btn").val("登录");  
                      
//                  }else{  
//                      $("#fs-login-btn").val("登录");   
//                      return false;  
//                  }                           
//             }     
//          }); 

    	
    	function login(){
    		
    		 if($("#username").val()==null || $("#username").val()==""){
             	$("#txt_username").css("display","block");
             	document.getElementById('txt_username').innerHTML="用户名不能为空";
             }else if($("#password").val()==null|| $("#password").val()==""){
             	$("#txt_password").css("display","block");
             	document.getElementById('txt_password').innerHTML="密码不能为空";
             }else if($("#certificatepassword").val()==null|| $("#certificatepassword").val()==""){
            	$("#txt_certificatepassword").css("display","block");
              	document.getElementById('txt_certificatepassword').innerHTML="证书口令不能为空";
             }else{
     			var form = document.getElementById("form"); 
     	        form.submit();//提交
             }
    	}
    	
    	$(document).ready(function(){
    		$('#icon-eye-close').click(function(){
    			$(this).css("display","none");
    			$("#icon-eye-open").css("display","block");
    			$("#password").css("display","block");
    			$("#text_password").css("display","none");
    		});
    		
    		$('#icon-eye-open').click(function () {
        		$(this).css("display","none");
        		$("#icon-eye-close").css("display","block");
        		$("#password").css("display","none");
        		$("#text_password").css("display","block");
    		});
    		
    		$('#icon-eye-open-one').click(function(){
    			$(this).css("display","none");
    			$("#icon-eye-close-one").css("display","block");
    			$("#text_certificatepassword").css("display","block");
    			$("#certificatepassword").css("display","none");
    		});
    		
    		$('#icon-eye-close-one').click(function () {
        		$(this).css("display","none");
        		$("#icon-eye-open-one").css("display","block");
        		$("#text_certificatepassword").css("display","none");
        		$("#certificatepassword").css("display","block");
    		});
    		
    		$("#username").blur(function(){
    			if($("#username").val()==null || $("#username").val()==""){
                 	
                 }else{
                	 $("#txt_username").css("display","none");
                 }
    		});
    		$("#password").blur(function(){
    			if($("#password").val()==null|| $("#password").val()==""){
                 	
                 }else{
                	 $("#txt_password").css("display","none");
                 }
    		});
    		$("#certificatepassword").blur(function(){
    			if($("#certificatepassword").val()==null|| $("#certificatepassword").val()==""){
                	
                }else{
                	 $("#txt_certificatepassword").css("display","none");
                }
    		});
    	
    	});
    	
    	
    </script>
  </head>
  
  <body style="position: static;">
    <div id="fs-login-background">
        <img class="fs-login-img" src="${ctx }/img/ReportServer(3)" alt=""
        galleryimg="no" border="0" style="margin-left: 0px; margin-top: -84.6875px; width: 1366px; height: 768.375px;">
    </div>
    <div id="fs-login">
        <div id="fs-login-scalebg">
            <img class="fs-login-scalebg-img" src="${ctx }/img/ReportServer(3)"
            alt="" galleryimg="no" border="0" style="margin-left: -483px; margin-top: -244.188px; width: 1366px; height: 768.375px;">
        </div>
        <div id="fs-login-glass"></div>
        <div id="fs-login-content">
       		<form id="form" action="${ctx }/loginController/login.do" method="post">
            <div id="fs-login-title">
              	  税控发票开票软件（金税盘版）
            </div>
            <div class="fs-login-input fs-login-input-username">
                <input id="username"   type="text" placeholder="用户名" title="用户名" name="username">
            </div>
            <div id="txt_username" style="color:red;display: none;">
                                                   用户不存在
            </div>
            <div class="fs-login-input fs-login-input-password">
                <input id="password"      type="password" placeholder="密码" title="密码" name="password" onpaste="return false" onselectstart="return false" onblur="document.getElementById('text_password').value=this.value;">
                <input id="text_password" type="text"     placeholder="密码" title="密码" name="passwords" onpaste="return false" onselectstart="return false" style="display:none;" onblur="document.getElementById('password').value=this.value;">
            </div>
            <i id="icon-eye-open"  style="float:right;margin-top: -38px;margin-left: 269px;width: 20px;position: fixed;color: red;">show</i>
            <i id="icon-eye-close" style="float:right;margin-top: -38px;margin-left: 269px;width: 20px;position: fixed;color: red;display:none;">hide</i>
            
            <div id="txt_password" style="color:red;display: none;">
               	        密码错误
            </div>
            <div class="fs-login-input fs-login-input-certificatepassword">
                <input id="certificatepassword"        type="password"  placeholder="证书口令" title="证书口令" name="certificatepassword" onpaste="return false" onselectstart="return false" onblur="document.getElementById('text_certificatepassword').value=this.value;">
                <input id="text_certificatepassword"   type="text"      placeholder="证书口令" title="证书口令" name="certificatepasswords" onpaste="return false" onselectstart="return false" style="display:none;" onblur="document.getElementById('certificatepassword').value=this.value;">
            </div>
            <i id="icon-eye-open-one"  style="float:right;margin-top: -38px;margin-left: 269px;width: 20px;position: fixed;color: red;">show</i>
            <i id="icon-eye-close-one" style="float:right;margin-top: -38px;margin-left: 269px;width: 20px;position: fixed;color: red;display:none;">hide</i>
            
            <div id="txt_certificatepassword" style="color:red;display: none;">
                                                 证书口令错误
            </div>
           	<a tabindex="3" onclick="login()" id="fs-login-btn">登录</a>
            </form>
        </div>
    </div>
    
    <script language="javascript">
		//禁止右键和复制
    	$(document).ready(function(){  
    		$(document).bind("contextmenu",function(e){   
          	return false;   
    		});
		});
	 </script>
</body>
</html>
