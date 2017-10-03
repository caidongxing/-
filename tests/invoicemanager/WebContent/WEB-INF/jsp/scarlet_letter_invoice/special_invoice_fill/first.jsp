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
    <title>查询条件</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_cancel').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_confirm').click(function () {
        		location="${ctx}/specialfillController/fill.do";
    		});
　　		}); 
   	</script>
   	<style type="text/css">
   		input[type=button],input[type=submit]{
			border-radius: 4px!important;
		}
		input[type=text]{
			padding:5px;
			border-radius: 4px!important;
		}
		.control-label{
			float:left;
		}
		.control-group {
   			 margin-bottom: 0px!important;
		}
   		.Groudbox{
			width: 500px;
    		border: 1px solid #ccc;
    		border-radius: 4px!important;
    		padding: 15px;
    		display:inline-block;
		}
   	</style>
  </head>
  
  <body>
    <div id="main-content">
		<div class="row-fluid">
			<div class="span12">
				<!-- BEGIN EXAMPLE TABLE widget-->
				<div class="widget blue">
					<div class="widget-title">
						<h4>
							<i class="icon-reorder"></i> 查询条件
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<div class="Groudbox">
							<label style="position: absolute;margin-top: -25px;">红字发票信息表信息选择</label>
							<ul>
								<li>
									<label class="radio"><input type="radio" name="gender" value="1">一、购买方申请</label>
									<ul>
										<li><label class="radio"><input type="radio" name="gender1" value="male">1、已抵扣</label></li>
										<li>
											<label class="radio"><input type="radio" name="gender1" value="male">2、未抵扣</label>
											<ul>
												<li><label class="radio"><input type="radio" name="gender2" value="male">(1)、无法认证</label></li>
												<li><label class="radio"><input type="radio" name="gender2" value="male">(2)、纳税人识别号认证不符</label></li>
												<li><label class="radio"><input type="radio" name="gender2" value="male">(3)、增值税专用发票代码、号码认证不符</label></li>
												<li><label class="radio"><input type="radio" name="gender2" value="male">(4)、所购货物或劳务、服务不属于增值税扣税项目范围</label></li>
											</ul>
										</li>
									</ul>
								</li>
								<li>
									<label class="radio"><input type="radio" name="gender" value="2">一、销售方申请</label>
									<ul>
										<li><label class="radio"><input type="radio" name="gender1" value="male">1、因开票有误购买方拒收的</label></li>
										<li><label class="radio"><input type="radio" name="gender1" value="male">2、因开票有误等原因尚未交付的</label></li>
									</ul>
								</li>
							</ul>
						</div>
						<div class="Groudbox">
							<label style="position: absolute;margin-top: -25px;">对应蓝字增值税专用发票信息</label>
							<div class="control-group" style="margin-top: 20px;">
								<label class="control-label">发票种类&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<div class="controls">
									<select class="span6" style="padding: 5px;">
											<c:forEach items="${invoicetypes}" var="item">
												<option value="${item.id}">${item.classname}</option>
											</c:forEach>
									</select>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">发票代码&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<div class="controls">
									<input type="text" class="span6 ">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">发票号码&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<div class="controls">
									<input type="text" class="span6 ">
								</div>
							</div>
						</div>
						<div class="box" style="margin-top:10px;text-align: center;">
							<input id="btn_next"    type="button" class="btn btn-primary" value="下一步" disabled="disabled">
							<input id="btn_confirm" type="submit" class="btn btn-primary" value="确定">
							<input id="btn_cancel"  type="button" class="btn btn-primary" value="取消">
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
  </body>
</html>
