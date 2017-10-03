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
    <title>向分开票机分配发票</title>
    <script type="text/javascript" src="js/page_table/jquery.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap-table-zh-CN.js"></script>
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap.min.css" >
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
	<style type="text/css">
	.col-md-offset-3{
		margin-left: 0!important; 
		}
	.col-md-6{
		width: 100%!important;
		}
		.box{width:80%;}
		.btn{width:100px;margin:0 auto;display:block;}
	</style>

  </head>
  
  <body>
    <div data-spy="scroll" style="height:500px;overflow:auto; position: relative;">
		<div class="col-md-offset-3 col-md-6">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title text-center">向分开票机分配发票</h3>
				</div>
				<div class="panel-body">
					<p style="text-align: center;">向分开票机分配发票完毕，发票卷信息如下：</p>
					<div id="toolbar" class="btn-group"></div>
					<table class="table table-hover" 
						data-toggle="table"
						data-height="500" 
						data-pagination="true" 
						data-toolbar="#toolbar">
						<thead>
							<tr>
								<th></th>
								<th>发票种类</th>
								<th>开票限额</th>
								<th>类别代码</th>
								<th>类别名称</th>
								<th>起始号码</th>
								<th>发票张数</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${customers}" var="item" varStatus="status">
								<tr class="odd gradeX">
									<td>${item.id}</td>
									<td>${item.code}</td>
									<td>${item.name}</td>
									<td>${item.id}</td>
									<td>${item.code}</td>
									<td>${item.simplecode}</td>
									<td>${item.dutyparagraph}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="box">
						<button id="btn_confirm" type="button" class="btn btn-primary" >确定 </button>
					</div>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>
