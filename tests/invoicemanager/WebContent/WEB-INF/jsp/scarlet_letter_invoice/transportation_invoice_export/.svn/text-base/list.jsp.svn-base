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
    <title>红字货物运输业增值税专用发票信息表查询导出</title>
	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
  	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
  	<script type="text/javascript" src="js/page_table/bootstrap-table-zh-CN.js"></script>
  	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap.min.css" >
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
	<script type="text/javascript" src="js/export_execl/tableExport.js"></script>
	<script type="text/javascript">
	$(function () {
		var $table = $('#table');
		$('#btn_confirm').click(function () {
  		$table.tableExport({
      	type: 'excel',
      	escape: false
    	});
  	  });
	});
	</script>
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
		function Download(){
// 			location="${ctx}/specialexportController/download.do";
		}
		function Export(){
			$('#myModal').modal('show');
		}
		function Upload(){
			$('#myModalone').modal('show');
		}
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
    				<div class="widget blue">
    					<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 红字发票信息表查询导出
							</h4>
							<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="btn-group" style="float: right;margin-bottom:10px;">
								<button class="btn" onclick="Download()">
									<i class="icon-download-alt"></i>下载
								</button>
								<button class="btn" onclick="Upload()">
									<i class="icon-upload"></i>上传
								</button>
								<button class="btn" onclick="Export()">
									<i class="icon-cloud-upload"></i>导出
								</button>
								<button class="btn">
									<i class="icon-trash"></i>删除
								</button>
								<button class="btn">
									<i class="icon-edit"></i>修改
								</button>
								<button class="btn">
									<i class="icon-list"></i>查看明细
								</button>
								<button class="btn">
									<i class="icon-building"></i>格式
								</button>
								<button class="btn">
									<i class="icon-bar-chart"></i>统计
								</button>
								<button class="btn">
									<i class="icon-search"></i>查找
								</button>
								<button class="btn">
									<i class="icon-print"></i>打印
								</button>
								<button class="btn" onclick="Close()">
									<i class="icon-off"></i>退出
								</button>
							</div>
							<table class="table table-hover" data-toggle="table" data-height="500" data-pagination="true" data-toolbar="#toolbar">
								<thead>
									<th>货运信息表流水号</th>
									<th>货运信息表编号</th>
									<th>货运信息表状态</th>
									<th>货运信息表描述</th>
									<th>发票代码</th>
									<th>发票号码</th>
									<th>开票机号</th>
									<th>实际受票方名称</th>
									<th>实际受票方税号</th>
								</thead>
								<tbody>
									<tr>
										<td>661400154453141201153218</td>
										<td></td>
										<td>TZD0500</td>
										<td>未上传</td>
										<td>1100053530</td>
										<td>99506</td>
										<td>0</td>
										<td>北京畅联电子有限公司</td>
										<td>1101012513245</td>
									</tr>
									<tr>
										<td>661400154453141201153218</td>
										<td></td>
										<td>TZD0500</td>
										<td>未上传</td>
										<td>1100053530</td>
										<td>99506</td>
										<td>0</td>
										<td>北京畅联电子有限公司</td>
										<td>1101012513245</td>
									</tr>
									<tr>
										<td>661400154453141201153218</td>
										<td></td>
										<td>TZD0500</td>
										<td>未上传</td>
										<td>1100053530</td>
										<td>99506</td>
										<td>0</td>
										<td>北京畅联电子有限公司</td>
										<td>1101012513245</td>
									</tr>
									<tr>
										<td>661400154453141201153218</td>
										<td></td>
										<td>TZD0500</td>
										<td>未上传</td>
										<td>1100053530</td>
										<td>99506</td>
										<td>0</td>
										<td>北京畅联电子有限公司</td>
										<td>1101012513245</td>
									</tr>
									<tr>
										<td>661400154453141201153218</td>
										<td></td>
										<td>TZD0500</td>
										<td>未上传</td>
										<td>1100053530</td>
										<td>99506</td>
										<td>0</td>
										<td>北京畅联电子有限公司</td>
										<td>1101012513245</td>
									</tr>
									<tr>
										<td>661400154453141201153218</td>
										<td></td>
										<td>TZD0500</td>
										<td>未上传</td>
										<td>1100053530</td>
										<td>99506</td>
										<td>0</td>
										<td>北京畅联电子有限公司</td>
										<td>1101012513245</td>
									</tr>
								</tbody>
							</table>
						</div>
    				</div>
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
						<li><label>&nbsp;&nbsp;&nbsp;请求导出红字货物运输业增值税专用发票信息表：1张。</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;您要继续吗？</label></li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" id="btn_confirm">确认</button>
					<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" data-dismiss="modal">取消</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
	
	<!--BEGIN 模态框（Modal） -->
	<div class="modal fade" id="myModalone" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content" style="border-radius: 4px!important;">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">提示</h4>
				</div>
				<div class="modal-body">
					<img alt="" src="${ctx }/img/alert-blue.png" style="width: 30px;float: left;">
					<ul>
						<li><label>&nbsp;&nbsp;&nbsp;本次待上传红字发票信息表张数：1张。</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;您要继续吗？</label></li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" id="btn_confirm">确认</button>
					<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" data-dismiss="modal">取消</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
  </body>
</html>
