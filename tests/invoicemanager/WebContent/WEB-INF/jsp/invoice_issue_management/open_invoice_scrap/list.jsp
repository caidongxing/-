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
    <title>选择发票号码作废</title>
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link rel="stylesheet" href="css/common.css" />
   	
   	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    <script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		//table选中行高亮
    		$('table tr').click(function(){
       			$('table tr').removeClass('success');
       			$(this).addClass('success');
    		});
		});
		
		function Scrap(){
			
		}
		
		function Close(){
			$(this).parents(".widget").parent().remove();
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
								<i class="icon-reorder"></i> 选择发票号码作废
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body" style="height: 100%;">
							<div>
								<div>
									<div class="btn-toolbar" style="float:right;">
										<div class="btn-group">
											<button class="btn" onclick="Scrap()" data-toggle="modal" data-target="#myModal"><i class="icon-ban-circle"></i>作废</button>
											<button class="btn"><i class="icon-list"></i>查看明细</button>
											<button class="btn"><i class="icon-th"></i>格式</button>
											<button class="btn" onclick="Select()"><i class="icon-search"></i>查找</button>
											<button class="btn"><i class="icon-print"></i>打印</button>
											<button class="btn" onclick="Close()"><i class="icon-off"></i>退出</button>
										</div>
									</div>
								</div>
								<div class="space15"></div>
								<table class="table table-striped table-hover table-bordered"
									id="editable-sample">
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
											<th>开票日期</th>
											<th>报送状态</th>
											<th>报送日志</th>
											<th>所属月份</th>
											<th>合计金额</th>
											<th>税率</th>
											<th>合计税额</th>
											<th>主要商品名称</th>
											<!-- <th>商品名称</th> -->
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${customers}" var="item" varStatus="status">
											<tr class="odd gradeX">
												<td style="display:none;">${item.id}</td>
												<td>${item.code}</td>
												<td>${item.name}</td>
												<td>${item.code}</td>
												<td>${item.id}</td>
												<td>${item.code}</td>
												<td>${item.simplecode}</td>
												<td>${item.dutyparagraph}</td>
												<td>${item.dutyparagraph}</td>
												<td>${item.id}</td>
												<td>${item.code}</td>
												<td>${item.name}</td>
												<td>${item.code}</td>
												<td>${item.id}</td>
												<td>${item.code}</td>
												<td>${item.simplecode}</td>
												<td>${item.dutyparagraph}</td>
												<%-- <td>${item.dutyparagraph}</td> --%>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!-- END EXAMPLE TABLE widget-->
				</div>
			</div>
    	</div>
    </div>

	<!--BEGIN 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content" style="border-radius: 4px!important;">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">提示</h4>
				</div>
				<div class="modal-body">
					<img alt="" src="${ctx }/img/prompt.jpg" style="width: 30px;float: left;">
					<ul>
						<li><label>本期共要作废发票<strong>${cuts.items }</strong>张，</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;成功：${cuts.items }张，</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;失败：${cuts.items }张。</label></li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" data-dismiss="modal">确定</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
</body>
</html>
