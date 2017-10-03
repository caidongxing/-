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
    <title>商品和服务税收分类编码</title>
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
	th{
/* 		font-size: 13px!important; */
/* 		color: #888888!important; */
	}
	</style>
	

  </head>
  
  <body>
	<div data-spy="scroll"
		style="height:500px;
		overflow:auto; 
		position: relative;">
		<div class="col-md-offset-3 col-md-6">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title text-center">编码族管理</h3>
				</div>
				<div class="panel-body">
					<div id="toolbar" class="btn-group">
						<button id="btn_edit" type="button" class="btn btn-default">
							<span class="icon-pencil"></span>更新
						</button>
						<button id="btn_edit" type="button" class="btn btn-default" disabled="disabled">
							<span class="icon-pencil"></span>新增
						</button>
						<button id="btn_edit" type="button" class="btn btn-default" disabled="disabled">
							<span class="icon-pencil"></span>修改
						</button>
						<button id="btn_delete" type="button" class="btn btn-default" disabled="disabled">
							<span class="icon-remove"></span>删除
						</button>
						<button id="btn_edit" type="button" class="btn btn-default" >
							<span class="icon-pencil"></span>打印
						</button>
						<button id="btn_edit" type="button" class="btn btn-default" disabled="disabled">
							<span class="icon-pencil"></span>查找
						</button>
						<button id="btn_delete" type="button" class="btn btn-default" disabled="disabled">
							<span class="icon-remove"></span>统计
						</button>
						<button id="btn_edit" type="button" class="btn btn-default" disabled="disabled">
							<span class="icon-pencil"></span>格式
						</button>
						<button id="btn_edit" type="button" class="btn btn-default">
							<span class="icon-pencil"></span>导入
						</button>
						<button id="btn_edit" type="button" class="btn btn-default" disabled="disabled">
							<span class="icon-pencil"></span>导出
						</button>
						<button id="btn_delete" type="button" class="btn btn-default">
							<span class="icon-remove"></span>退出
						</button>
					</div>
					<table class="table table-hover" 
						data-toggle="table"
						data-height="500" 
						data-pagination="true" 
						data-search="true"
						data-show-columns="true" 
						data-toolbar="#toolbar">
						<thead>
							<tr>
								<th>
									<input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes" />
								</th>
								<th>编码</th>
								<th>合并编码</th>
								<th>名称</th>
								<th>说明</th>
								<th>税率</th>
								<th>增值税管理</th>
								<th>增值税政策</th>
								<th>增值税特殊</th>
								<th>消费税管理</th>
								<th>消费税政策</th>
								<th>消费税特殊</th>
								<th>关键字</th>
								<th>统计局编码</th>
								<th>汇总项</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${customers}" var="item" varStatus="status">
								<tr class="odd gradeX">
									<td>
										<input type="checkbox" class="checkboxes" value="${item.id}" id="radio" name="radio" />
									</td>
									<td>${item.code}</td>
									<td>${item.mergecoding}</td>
									<td>${item.name}</td>
									<td>${item.explains}</td>
									<td>${item.taxrate}</td>
									<td>${item.addedtaxmanagement}</td>
									<td>${item.addedtaxpolicy}</td>
									<td>${item.addedtaxspecial}</td>
									<td>${item.consumptiontaxadministration}</td>
									<td>${item.consumptiontaxpolicy}</td>
									<td>${item.specialconsumptiontax}</td>
									<td>${item.keyword}</td>
									<td>${item.statisticalofficecode}</td>
									<td>${item.summaryitem}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
