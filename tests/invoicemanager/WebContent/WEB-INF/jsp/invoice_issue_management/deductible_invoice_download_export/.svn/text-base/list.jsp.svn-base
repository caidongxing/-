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
    <title>抵扣发票查询</title>
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
	
	function Download(){
		location="${ctx}/deducibleController/download.do";
	}
	function Select(){
		location="${ctx}/deducibleController/select.do";
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
								<i class="icon-reorder"></i> 抵扣发票查询
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body" style="height: 100%;">
							<div>
								<div>
									<div class="btn-toolbar" style="float:right;">
										<div class="btn-group">
											<button class="btn" onclick="Download()"><i class="icon-arrow-down"></i>下载</button>
											<button class="btn"><i class="icon-ok-circle"></i>选择导出</button>
											<button class="btn"><i class="icon-cloud-upload"></i>按日期导出</button>
											<button class="btn"><i class="icon-trash"></i>删除</button>
											<button class="btn" onclick="Select()"><i class="icon-search"></i>查找</button>
											<button class="btn"><i class="icon-building"></i>格式</button>
											<button class="btn" onclick="Close()"><i class="icon-off"></i>退出</button>
										</div>
									</div>
								</div>
								<div class="space15"></div>
								<table class="table table-striped table-hover table-bordered"
									id="editable-sample">
									<thead>
										<tr>
											<th style="width: 5px;"></th>
											<th>发票种类</th>
											<th>发票代码</th>
											<th>发票号码</th>
											<th>发票日期</th>
											<th>销方识别号</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${customers}" var="item" varStatus="status">
											<tr class="odd gradeX">
												<td>${item.id}</td>
												<td>${item.code}</td>
												<td>${item.name}</td>
												<td>${item.code}</td>
												<td>${item.code}</td>
												<td>${item.code}</td>
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
  </body>
</html>
