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
    <title>发票号码确认</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    <script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>

   	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link rel="stylesheet" href="css/common.css" />
	<style type="text/css">
   		.box{width:80%;}
		.btn{width:100px;margin:0 auto;}
		body{
			font-family: Microsoft Yahei, sans-serif;
		}
   	</style>
   	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_confirm').click(function () {
        		location="${ctx}/invoicefillController/fill_window.do";
    		});
    		
    		$('#btn_cancel').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
　　		}); 
   	</script>

  </head>
  
  <body>
     <div data-spy="scroll" style="height:500px;overflow:auto; position: relative;">
     	<div id="main-content">
		<div class="row-fluid">
			<div class="span12">
				<!-- BEGIN EXAMPLE TABLE widget-->
				<div class="widget blue">
					<div class="widget-title">
						<h4>
							<i class="icon-reorder"></i> 发票号码确认
						</h4>
						<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
					</div>
					<div class="widget-body" style="height: 100%;">
						<p style="text-align: center;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;现在显示的为将要开具的发票种类、代码、号码，请认真核对装入打印机中的纸质发票的种类、</br>代码、号码是否一致，如一致，可执行打印操作；如不一致，请予以更换，请确认是否填开本张发票？</p>
						<p style="margin-left: 300px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发票种类:&nbsp;&nbsp;<span style="color: #FF00FF;">${invoiceinventoryVo.invoicetypename }</span></p>
						<p style="margin-left: 300px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发票代码:&nbsp;&nbsp;<span style="color: #FF00FF;">${invoiceinventoryVo.classcode }</span></p>
						<p style="margin-left: 300px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发票号码:&nbsp;&nbsp;<span style="color: #FF00FF;">${invoiceinventoryVo.startnumber }</span></p>
						<div class="box" style="margin-top:10px;">
							<button id="btn_confirm" type="button" class="btn btn-primary" style="margin-left: 450px;border-radius: 4px!important;">确定</button>
							<button id="btn_cancel" type="button" class="btn btn-primary" style="border-radius: 4px!important;">取消</button>
						</div>	
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
     </div>
  </body>
</html>
