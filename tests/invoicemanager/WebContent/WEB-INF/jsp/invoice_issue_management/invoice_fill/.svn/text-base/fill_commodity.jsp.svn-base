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
    <title>专用发票填开-商品选择</title>
    
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
		
		location="${ctx}/invoicefillController/fill_commodity_finish.do?id="+ids;
	}
    </script>
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
								<i class="icon-reorder"></i> 商品编码选择
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<table class="table table-striped table-bordered table-hover" id="sample_1">
								<thead>
									<tr>
										<th style="display:none;"></th>
										<th>编码</th>
										<th>名称</th>
										<th>简码</th>
										<th>商品税目</th>
										<th>税率</th>
										<th>规格型号</th>
										<th>计量单位</th>
										<th>含税价标志</th>
										<th>隐藏标志</th>
										<th>税收分类编码</th>
										<th>税收分类名称</th>
										<th>优惠政策类型</th>
										<th>享受优惠政策</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${commodities}" var="item" varStatus="status">
										<tr class="odd gradeX" ondblclick="check()">
											<td style="display:none;">${item.id}</td>
											<td>${item.code}</td>
											<td>${item.name}</td>
											<td>${item.simplecode}</td>
											<td>${item.commoditytax}</td>
											<td>${item.taxrate}</td>
											<td>${item.specificationmodel}</td>
											<td>${item.unitofmeasurement}</td>
											<td>${item.taxpricemark=="true"?"是":"否"}</td>
											<td>${item.hiddenflag=="true"?"是":"否"}</td>
											<td>${item.taxtypecode}</td>
											<td>${item.taxtypename}</td>
											<td>${item.policytype}</td>
											<td>${item.enjoypolicies=="true"?"是":"否"}</td>
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
  </body>
</html>
