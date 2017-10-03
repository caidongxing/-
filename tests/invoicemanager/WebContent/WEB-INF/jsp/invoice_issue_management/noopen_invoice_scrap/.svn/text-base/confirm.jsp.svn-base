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
    <title>确认</title>
	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	
  	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
  	<script type="text/javascript">
		$(document).ready(function(){
			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
		});
	</script>
  </head>
  
  <body>
    <div id="main-content">
		<div class="row-fluid">
			<div class="span12">
				<!-- BEGIN EXAMPLE TABLE widget-->
				<div class="widget blue">
					<div class="widget-title">
						<h4>
							<i class="icon-reorder"></i> 确认
						</h4>
						<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<img alt="" src="${ctx }/img/sign-warning.png" style="width: 30px;float: left;margin-top: 30px;">
						<ul>
							<li><label>&nbsp;&nbsp;&nbsp;您将作废：</label></li>
							<li><label>&nbsp;&nbsp;&nbsp;发票代码：</label></li>
							<li><label>&nbsp;&nbsp;&nbsp;发票号码：</label></li>
							<li><label>&nbsp;&nbsp;&nbsp;开始连续${ist.items }张发票。</label></li>
						</ul>
						<p><label>&nbsp;&nbsp;&nbsp;&nbsp;您确认要作废发票吗？。</label></p>
						
						<div class="box" style="margin-top:10px;">
							<button id="btn_confirm" type="button" class="btn btn-primary" style="border-radius: 4px!important;" data-toggle="modal" data-target="#myModal">确定</button>
							<button id="btn_cancel" type="button" class="btn btn-primary" style="border-radius: 4px!important;">取消</button>
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
	
	<!--BEGIN 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content" style="border-radius: 4px!important;">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					确认提示
				</h4>
			</div>
			<div class="modal-body">
				<img alt="" src="${ctx }/img/prompt.jpg" style="width: 30px;float: left;-webkit-transform: translateY(50%);">
					<ul>
						<li><label>本次未开作废共<strong>${cuts.items }</strong>张，</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;作废成功：${cuts.items }张，</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;作废失败：${cuts.items }张。</label></li>
					</ul>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" data-dismiss="modal">确定</button>
			</div>
		</div>
	</div>
</div>
<!--END 模态框（Modal） -->
  </body>
</html>
