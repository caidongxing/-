<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>收回分机剩余发票</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    <script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>

   	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link rel="stylesheet" href="css/common.css" />
   	<style type="text/css">
   		.box{width:80%;}
		.btn{width:100px;margin:0 auto;}
   	</style>
   	<script type="text/javascript">
   		var action="${ctx}/extensioninvoiceController/";
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		 window.history.back(-1); 
    		});
    		
    		//table选中行高亮
    		$('table tr').click(function(){
       			$('table tr').removeClass('success');
       			$(this).addClass('success');
    		});
    		
    		$('#btn_confirm').click(function () {
        		location=action+"extension_first.do";
    		});
　　		}); 
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
								<i class="icon-reorder"></i> 收回分机剩余发票
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body" style="height: 100%;">
							<p style="text-align: center;">成功从分机收回下列剩余发票:</p>
							<div>
								<div class="space15"></div>
								<table class="table table-striped table-hover table-bordered"
									id="editable-sample">
									<thead>
										<tr>
											<th></th>
											<th>发票种类</th>
											<th>开票限额</th>
											<th>类别代码</th>
											<th>类别名称</th>
											<th>起始号码</th>
											<th>发票张数</th>
											<th>领购日期</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${extensiokuVos}" var="item" varStatus="status">
											<tr class="odd gradeX">
												<td></td>
												<td>${item.invoicetypename}</td>
												<td>${item.billinglimit}</td>
												<td>${item.classcode}</td>
												<td>${item.classname}</td>
												<td>${item.startnumber}</td>
												<td>${item.invoicenumber}</td>
												<td>2017-03-04</td>
												<%-- <fmt:formatDate value="2017-03-04" type="both" pattern="yyyy-MM-dd" /> --%>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
							<div class="box" style="margin-top:10px;">
								<button id="btn_confirm" type="button" class="btn btn-primary" style="margin-left: 450px;border-radius: 4px!important;">确定</button>
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
