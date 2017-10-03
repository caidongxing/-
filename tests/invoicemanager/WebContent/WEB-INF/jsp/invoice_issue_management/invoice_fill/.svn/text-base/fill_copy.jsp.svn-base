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
    <title></title>
    <script type="text/javascript" src="js/page_table/jquery.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap-table-zh-CN.js"></script>
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap.min.css" >
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
	<style type="text/css">
		body{
			font-family: Microsoft Yahei, sans-serif;
		}
		.col-md-offset-3{
			margin-left: 0!important; 
		}
		.col-md-6{
			width: 100%!important;
		}
	</style>
	<script type="text/javascript">
    	$(document).ready(function(){
　　			/* $('.widget .tools .icon-remove').click(function () {
        		window.history.go(-1);
    		});
    		
    		$('#sample_1 tbody tr').click(function(){
       			$('#sample_1 tbody tr').removeClass('success');
       			$(this).addClass('success');
    		}); */
　　		});

	function check(){
		var ids=2;
		location="${ctx}/invoicefillController/fill_customer_finish.do?id="+ids;
	}
    </script>
  </head>
  
  <body>
    <div data-spy="scroll" style="height:500px; overflow:auto;  position: relative;">
		<div class="col-md-offset-3 col-md-6">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title" style="float: left;width: 97%;">发票复制</h3>
					<img alt="" src="${ctx }/img/x_alt.png" style="width:25px;height:25px;cursor: pointer;" onclick="window.history.go(-1);">
				</div>
				<div class="panel-body">
					<div id="toolbar" class="btn-group">
						<button id="btn_format" type="button" class="btn btn-default">
							<span class="icon-pencil"></span>格式
						</button>
						<button id="btn_choice" type="button" class="btn btn-default" >
							<span class="icon-pencil"></span>选择
						</button>
						<button id="btn_select" type="button" class="btn btn-default">
							<span class="icon-pencil"></span>查找
						</button>
						<button id="btn_quit"   type="button" class="btn btn-default" onclick="window.history.go(-1);">
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
								<th style="display:none;"></th>
								<th>发票种类</th>
								<th>发票代码</th>
								<th>发票号码</th>
								<th>开票机号</th>
								<th>购方名称</th>
								<th>购方税号</th>
								<th>购方地址电话</th>
								<th>购方银行账号</th>

								<th>报送状态</th>
								<th>报送日志</th>
								<th>所属月份</th>
								<th>合计金额</th>
								<th>税率</th>
								<th>合计税额</th>
								<th>主要商品名称</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${customers}" var="item" varStatus="status">
								<tr class="odd gradeX" ondblclick="check()">
									<td style="display:none;">${item.id}</td>
									<td>${item.code}</td>
									<td>${item.name}</td>
									<td>${item.simplecode}</td>
									<td>${item.dutyparagraph}</td>
									<td>${item.telephone}</td>
									<td>${item.bankaccount}</td>
									<td>${item.mailingaddress}</td>
									<td>${item.remarks}</td>

									<td>${item.remarks}</td>
									<td>${item.remarks}</td>
									<td>${item.bankaccount}</td>
									<td>${item.mailingaddress}</td>
									<td>${item.remarks}</td>
									<td>${item.bankaccount}</td>
									<td>${item.mailingaddress}</td>
									<td>${item.remarks}</td>
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
