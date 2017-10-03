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
    <title>抄税介质</title>
	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    <script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>
	
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
   	<style type="text/css">
   		.box{width:80%;}
		.btn{width:100px;margin:0 auto;}
   	</style>
   	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_cancel').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_confirm').click(function () {
        		$('#myModal').modal('show');
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
							<i class="icon-reorder"></i> 抄税介质
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">请选择要抄税的介质</h3>
							</div>
							<div class="panel-body">
								<div class="box" style="margin-left: 50px;">
									<label class="radio"> <input type="radio" name="gender" value="1" checked="checked">金税盘</label> 
									<label class="radio"> <input type="radio" name="gender" value="2" >报税盘</label>
								</div>
							</div>
						</div>

						<div class="box" style="margin-top:10px;">
							<button id="btn_cancel"  type="button" class="btn btn-primary" style="margin-left: 450px;border-radius: 4px!important;">取消</button>
							<button id="btn_confirm" type="button" class="btn btn-primary" style="border-radius: 4px!important;">抄税</button>
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
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">信息</h4>
				</div>
				<div class="modal-body">
					<img alt="" src="${ctx }/img/prompt.jpg" style="width: 30px;float: left;">
					<ul>
						<li><label>日期时间：2016-04-07 14:52:45</label></li>
						<li><label>操&nbsp;作&nbsp;&nbsp;项：金税设备</label></li>
						<li><label>事件代码：9116</label></li>
					</ul>
					<p>
					<h5 style="border-bottom: 1px solid blue;text-decoration: underline;font-weight: bold;color: #004176;">事件描述</h5>
					</p>
					<p style="color:blue;">发票抄税处理成功!</p>
					<p>
					<h5 style="border-bottom: 1px solid blue;text-decoration: underline;font-weight: bold;color: #004176;">可能原因及解决办法</h5>
					</p>
					<p style="color:blue;">您已经成功执行了抄税，请及时携带金税设备到税务机关报税！</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal"
						style="border-radius: 4px!important;">确认</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
</body>
</html>
