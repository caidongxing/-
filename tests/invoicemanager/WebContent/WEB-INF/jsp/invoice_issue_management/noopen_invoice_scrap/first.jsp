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
    <title>未开发票作废发票号确认</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<script src="js/response_table/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_confirm').click(function () {
        		location="${ctx}/newinvoicescrapController/confirm.do";
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
							<i class="icon-reorder"></i> 未开发票作废发票号确认
						</h4>
						<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<p><strong>&nbsp;&nbsp;&nbsp;&nbsp;批量作废发票，请录入要作废的发票份数，点击【确定】按钮，</br>系统将自动作废指定份数的发票；点击【取消】按钮，将退出批量作废功能。</strong></p>
						<p>&nbsp;&nbsp;&nbsp;&nbsp;发票种类：</p>
						<p>&nbsp;&nbsp;&nbsp;&nbsp;发票代码：</p>
						<p>&nbsp;&nbsp;&nbsp;&nbsp;发票份数：</p>
						<p>&nbsp;&nbsp;&nbsp;&nbsp;发票起始号码：</p>
						<p>&nbsp;&nbsp;&nbsp;&nbsp;要作废发票份数：<input type="text" style="padding: 5px;border-radius: 4px!important;"></p>
						
						<div class="box" style="margin-top:10px;">
							<button id="btn_confirm" type="button" class="btn btn-primary" style="border-radius: 4px!important;">确定</button>
							<button id="btn_cancel" type="button" class="btn btn-primary" style="border-radius: 4px!important;">取消</button>
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
</body>
</html>
