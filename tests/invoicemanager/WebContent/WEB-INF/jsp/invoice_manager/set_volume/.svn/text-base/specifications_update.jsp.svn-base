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
    <title>规格修改</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">  
	<script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>
	
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
   	<style type="text/css">
   		.box{width:80%;}
		.btn{width:100px;margin:0 auto;}
   	</style>
   	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
　　		}); 
   	</script>
  </head>
  
  <body>
  <div id="main-content">
   <div class="row-fluid">
			<div class="span12">
				<!-- BEGIN EXAMPLE TABLE widget-->
				<div class="widget blue">
					<div class="widget-title">
						<h4>
							<i class="icon-reorder"></i> 读入介质选择
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body" style="height: 70%;">
						<div class="table-responsive">
							<table class="table table-striped table-bordered">
								<caption>增值税普通发票（卷票）规格修改</caption>
								<thead>
									<tr>
										<th>类别代码</th>
										<th>卷终止号</th>
										<th>领购日期</th>
										<th>卷票规格</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${customers}" var="item" varStatus="status">
										<tr>
											<td>${item.code}</td>
											<td>${item.name}</td>
											<td>${item.simplecode}</td>
											<td><select>
													<c:forEach items="${Roles}" var="item">
														<option value="${item.roleid}">${item.rolename}</option>
													</c:forEach>
											</select></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<div class="box" style="margin-top:10px;">
							<button id="btn_update"  type="button" class="btn btn-primary" style="margin-left: 450px;">修改</button>
							<button id="btn_confirm" type="button" class="btn btn-primary">同步</button>
							<button id="btn_cancel"  type="button" class="btn btn-primary">取消</button>
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
</body>
</html>
