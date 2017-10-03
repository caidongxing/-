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
    <title>读入发票的来源介质选择</title>
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
　　		}); 

		function confirm(){
			var val_medium = $('input[name="gender"]:checked ').val();
			location="${ctx}/invoicereadController/read_confirm.do?medinu="+val_medium;
		}
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
							<i class="icon-reorder"></i> 读入介质选择
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body" style="height: 70%;">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">请选择读入发票的来源介质</h3>
							</div>
							<div class="panel-body">
								<div class="box" style="margin-left: 50px;">
									<label class="radio"> <input type="radio" name="gender" value="15">金税盘</label> 
									<label class="radio"> <input type="radio" name="gender" value="16" checked="checked">报税盘</label>
								</div>
							</div>
						</div>

						<div class="box" style="margin-top:10px;">
							<button id="btn_cancel"  type="button" class="btn btn-primary" style="margin-left: 450px;border-radius: 4px!important;">取消</button>
							<button id="btn_confirm" type="button" class="btn btn-primary" style="border-radius: 4px!important;" onclick="confirm()">确定</button>
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
</body>
</html>
