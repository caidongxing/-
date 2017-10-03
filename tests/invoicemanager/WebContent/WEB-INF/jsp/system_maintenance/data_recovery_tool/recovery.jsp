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
    <title>数据恢复</title>
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
  	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
  	<script type="text/javascript" src="js/page_table/bootstrap-table-zh-CN.js"></script>
  	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap.min.css" >
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
	<script type="text/javascript" src="js/export_execl/tableExport.js"></script>
	<style type="text/css">
		.bootstrap-table{
			margin-top: -21px;
		}
		#myModal{
			margin-left: 10px;
    		margin-top: -80px;
    		width: 100%;
    		background: transparent;
		}
	</style>
	<script type="text/javascript">
		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('table tr').click(function(){
       			$('table tr').removeClass('selected');
       			$(this).addClass('selected');
    		});
    		
    		
　　		});

		function Close(){
			$('.widget .tools .icon-remove').parents(".widget").parent().remove();
		}
		function Lookup_catalog(){
			
		}
		function Lookup_file(){
			$('#myModal').modal('show');
		}
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
								<i class="icon-reorder"></i> 数据恢复
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="btn-group" style="float: right;margin-bottom:10px;">
								<button class="btn" onclick="Lookup_catalog()">
									<i class="icon-hdd"></i>查找目录
								</button>
								<button class="btn" onclick="Lookup_file()">
									<i class="icon-search"></i>查找文件
								</button>
								<button class="btn" onclick="Close()">
									<i class="icon-off"></i>退出
								</button>
							</div>
							<div class="panel panel-default" style="background:#F5F5F5;margin-top: 35px;margin-bottom:1px;">
								<div class="panel-body">备份数据库目录：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
								<div style="margin-left: 15px;">与此版本匹配的备份文件列表（双击某一版本进行数据库恢复操作）</div>
							</div>
							<table class="table table-hover" data-toggle="table" data-height="500" data-pagination="true" data-toolbar="#toolbar">
								<thead>
									<th>备份时间</th>
									<th>备份类型</th>
									<th>操作员</th>
									<th>备份名称</th>
									<th>版本号</th>
									<th>税号</th>
									<th>开票机号</th>
								</thead>
								<tbody>
									<tr>
										<td>2016/12/04 16/54/54</td>
										<td>强制数据备份</td>
										<td>管理员1</td>
										<td>20161204165454FWSK</td>
										<td>V2.0.10.141214</td>
										<td>110101456789103</td>
										<td>0</td>
									</tr>
									<tr>
										<td>2016/12/04 16/54/48</td>
										<td>强制数据备份</td>
										<td>管理员1</td>
										<td>20161204165448FWSK</td>
										<td>V2.0.10.141214</td>
										<td>110101456789103</td>
										<td>0</td>
									</tr>
									<tr>
										<td>2016/12/04 16/54/12</td>
										<td>强制数据备份</td>
										<td>管理员1</td>
										<td>20161204165412FWSK</td>
										<td>V2.0.10.141214</td>
										<td>110101456789103</td>
										<td>0</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- END EXAMPLE TABLE widget-->
				</div>
			</div>
		</div>
	</div>
	
	<!--BEGIN 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content" style="border-radius: 4px!important;">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">提示</h4>
				</div>
				<div class="modal-body">
					<img alt="" src="${ctx }/img/Question.png" style="width: 30px;float: left;">
					<ul>
						<li><label>&nbsp;&nbsp;&nbsp;恢复到选定版本数据库？（此操作不可恢复）</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;确定后重启。</label></li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" id="btn_confirm">是</button>
					<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" data-dismiss="modal">否</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
  </body>
</html>
