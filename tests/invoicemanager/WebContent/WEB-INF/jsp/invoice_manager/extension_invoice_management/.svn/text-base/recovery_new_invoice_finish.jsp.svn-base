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
    <title></title>
	<link href="https://www.dezhong365.com/favicon.ico" rel="shortcut icon" type="image/x-icon">
	<link rel="stylesheet" type="text/css" href="css/success/404.css">
<script type="text/javascript">
function countDown(secs,surl){     
	var jumpTo = document.getElementById('jumpTo');
	jumpTo.innerHTML=secs;  
	if(--secs>0){     
     	setTimeout("countDown("+secs+",'"+surl+"')",1000);     
     }     
	else{       
     	location.href=surl;     
     }     
}     
</script>
<style type="text/css">
body{
		font-family: Microsoft Yahei, sans-serif;
	}
</style>
  </head>
  
  <body>
    <div class="w1100 cont">
		<div style="margin:110px;"><img src="${ctx }/img/success.png" width="100" height="100"></div>
		<h2>成功收回分机新购发票</h2>
        <p>页面将在<span class="second" id="jumpTo">3</span>秒后跳转</p>
   </div>
   <script type="text/javascript">countDown(3,'${ctx}/extensioninvoiceController/list.do');</script>
  </body>
</html>
