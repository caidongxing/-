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
    <title>金税设备2014年11月资料统计</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
  	<style type="text/css">
  		.panel{
			margin-left: -26px;
			background: #F5F5F5;
			margin-bottom:0!important;
		}
		.table th{
			text-align: center;
		}
		.table td{
			text-align: center;
		}
  	</style>
  	<script type="text/javascript">
		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
　　		});

		function Close(){
			$('.widget .tools .icon-remove').parents(".widget").parent().remove();
		}
	</script>

  </head>
  
  <body>
    <div data-spy="scroll" style="height:700px;overflow:auto; position: relative;">
		<div id="main-content">
			<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN EXAMPLE TABLE widget-->
					<div class="widget blue">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 金税设备2016年3月资料统计
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="btn-toolbar" style="float:right;">
								<div class="btn-group">
									<button class="btn">
										<i class="icon-building"></i>格式
									</button>
									<button class="btn">
										<i class="icon-print"></i>打印
									</button>
									<button class="btn" onclick="Close()">
										<i class="icon-off"></i>退出
									</button>
								</div>
							</div>
						</div>
						
						<div class="tabbable">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#tab1" data-toggle="tab">专用发票</a></li>
								<li><a href="#tab2" data-toggle="tab">普通发票</a></li>
							</ul>
							
							<div class="tab-content">
								<div class="tab-pane active" id="tab1">
									<div class="panel panel-default">
										<div class="panel-body">
											<ul style="float: left;color:blue;">
												<li>期初库存份数</li>
												<li>购进发票份数</li>
												<li>退回发票份数</li>
											</ul>
											<ul style="float: left;color:red;">
												<li>0</li>
												<li>93</li>
												<li>0</li>
											</ul>
											<ul style="float: left;color:blue;">
												<li>正数发票份数</li>
												<li>正数废票份数</li>
												<li>期末库存份数</li>
											</ul>
											<ul style="float: left;color:red;">
												<li>15</li>
												<li>0</li>
												<li>79</li>
											</ul>
											<ul style="float: left;color:blue;">
												<li>负数发票份数</li>
												<li>负数废票份数</li>
											</ul>
											<ul style="float: left;color:red;">
												<li>0</li>
												<li>0</li>
											</ul>
										</div>
									</div>
									<div class="panel panel-default" style="background:#4A8BC2;">
										<div class="panel-body" style="text-align:center;color:white;">税挡资料所属期为&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11月份</div>
									</div>
									<!-- begin 增值税发票汇总表table -->
									<div class="table-responsive" style="margin-left: -25px;" id="tb_one">
										<table class="table table-striped table-bordered table-hover">
											<thead>
												<tr>
													<th>项目名称</th>
													<th>合计</th>
													<th>17%</th>
													<th>13%</th>
													<th>6%</th>
													<th>4%</th>
													<th>其他</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>销项正废金额</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>0.00</td>
												</tr>
												<tr>
													<td>销项正数金额</td>
													<td>91413.82</td>
													<td>0.00</td>
													<td>51743.36</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>39670.46</td>
												</tr>
											</tbody>
										</table>
									</div>
									<!-- end 增值税发票汇总表table -->
								</div>
								<div class="tab-pane" id="tab2">
									<div class="panel panel-default">
										<div class="panel-body">
											<ul style="float: left;color:blue;">
												<li>期初库存份数</li>
												<li>购进发票份数</li>
												<li>退回发票份数</li>
											</ul>
											<ul style="float: left;color:red;">
												<li>0</li>
												<li>93</li>
												<li>0</li>
											</ul>
											<ul style="float: left;color:blue;">
												<li>正数发票份数</li>
												<li>正数废票份数</li>
												<li>期末库存份数</li>
											</ul>
											<ul style="float: left;color:red;">
												<li>15</li>
												<li>0</li>
												<li>79</li>
											</ul>
											<ul style="float: left;color:blue;">
												<li>负数发票份数</li>
												<li>负数废票份数</li>
											</ul>
											<ul style="float: left;color:red;">
												<li>0</li>
												<li>0</li>
											</ul>
										</div>
									</div>
									
									<div class="panel panel-default" style="background:#4A8BC2;">
										<div class="panel-body" style="text-align:center;color:white;">税挡资料所属期为&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11月份</div>
									</div>
									<!-- begin 增值税发票汇总表table -->
									<div class="table-responsive" style="margin-left: -25px;" id="tb_one">
										<table class="table table-striped table-bordered table-hover">
											<thead>
												<tr>
													<th>项目名称</th>
													<th>合计</th>
													<th>17%</th>
													<th>13%</th>
													<th>6%</th>
													<th>4%</th>
													<th>其他</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>销项正废金额</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>0.00</td>
												</tr>
												<tr>
													<td>销项正数金额</td>
													<td>91413.82</td>
													<td>0.00</td>
													<td>51743.36</td>
													<td>0.00</td>
													<td>0.00</td>
													<td>39670.46</td>
												</tr>
											</tbody>
										</table>
									</div>
									<!-- end 增值税发票汇总表table -->
								</div>
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
