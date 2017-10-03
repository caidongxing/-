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
    <title>专用发票填开-客户选择</title>
  	
  	<link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   	<link href="assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   	<link href="assets/bootstrap/css/bootstrap-fileupload.css" rel="stylesheet" />
   	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link href="css/style-responsive.css" rel="stylesheet" />
   	<link href="css/style-default.css" rel="stylesheet" id="style_color" />
    <link href="assets/fancybox/source/jquery.fancybox.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/uniform/css/uniform.default.css" />
    <link rel="stylesheet" href="css/common.css" />
    <script src="js/jquery-1.8.3.min.js"></script>
	<style type="text/css">
		body{
			font-family: Microsoft Yahei, sans-serif;
		}
	</style>
  </head>
  
  <body>
    <div data-spy="scroll" style="height:600px;overflow:auto; position: relative;">
		<div id="main-content">
			<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN EXAMPLE TABLE widget-->
					<div class="widget blue">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 客户选择
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<table class="table table-striped table-bordered table-hover" id="sample_1">
								<thead>
									<tr>
										<th style="display:none;"></th>
										<th style="width:8px;"></th>
										<th>编码</th>
										<th class="hidden-phone">名称</th>
										<th class="hidden-phone">简码</th>
										<th class="hidden-phone">税号</th>
										<th class="hidden-phone">地址电话</th>
										<th class="hidden-phone">银行账号</th>
										<th class="hidden-phone">邮件地址</th>
										<th class="hidden-phone">备注</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${customers}" var="item" varStatus="status">
										<tr class="odd gradeX" ondblclick="check()">
											<td style="display:none;">${item.id}</td>
											<td></td>
											<td>${item.code}</td>
											<td>${item.name}</td>
											<td>${item.simplecode}</td>
											<td>${item.dutyparagraph}</td>
											<td>${item.telephone}</td>
											<td>${item.bankaccount}</td>
											<td>${item.mailingaddress}</td>
											<td>${item.remarks}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<!-- END EXAMPLE TABLE widget-->
				</div>
			</div>
		</div>
	</div>
	
	<!-- BEGIN JAVASCRIPTS -->
   <!-- Load javascripts at bottom, this will reduce page load time -->
   
   <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
   <script src="assets/bootstrap/js/bootstrap.min.js"></script>
   <script src="js/jquery.blockui.js"></script>
   <!-- ie8 fixes -->
   <!--[if lt IE 9]>
   <script src="js/excanvas.js"></script>
   <script src="js/respond.js"></script>
   <![endif]-->
   <script type="text/javascript" src="assets/uniform/jquery.uniform.min.js"></script>
   <script type="text/javascript" src="assets/data-tables/jquery.dataTables.js"></script>
   <script type="text/javascript" src="assets/data-tables/DT_bootstrap.js"></script>
   <script src="js/jquery.scrollTo.min.js"></script>


   <!--common script for all pages-->
   <script src="js/common-scripts.js"></script>

   <!--script for this page only-->
   <script src="js/dynamic-table.js"></script>

   <!-- END JAVASCRIPTS -->
   
   <script type="text/javascript">
   var ids=0;
    	$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		window.history.go(-1);
    		});
    		
    		$('#sample_1 tbody tr').click(function(){
       			$('#sample_1 tbody tr').removeClass('success');
       			$(this).addClass('success');
       			ids=$(this).find("td :eq(0)").html();
    		});
　　		});

	function check(){
		location="${ctx}/invoicefillController/fill_customer_finish.do?id="+ids;
	}
    </script>
  </body>
</html>
