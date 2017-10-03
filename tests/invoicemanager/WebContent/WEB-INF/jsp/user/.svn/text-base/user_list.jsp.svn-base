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
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet"/>
	<link href="css/style.css" rel="stylesheet" />
	<link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<style type="text/css">
  		#left{
  			float:left;
  			width:25%;
  			height:100%;
  		}
  		#right{
  			float:left;
  			width:75%;
  			height:100%;
  		}
  		input[type=text]{
			padding:5px;
			border-radius: 4px!important;
		}
		.control-group{
			margin-left: 30px;
			margin-bottom: 0px;
		}
  	</style>
  	<script type="text/javascript">
  		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
　　		});
  		function Add(){
  			location="${ctx}/userController/toadd.do";
  		}
  		function Update(){
  			location="${ctx}/userController/toedit.do";
  		}
  		function Delete(){
  			if(confirm("是否删除??")){
// 				window.location.href="${ctx}/userController/delete.do?ids="+id;
			}
  		}
  	</script>
  </head>
  
  <body>
    <div data-spy="scroll" style="height:600px;overflow:auto; position: relative;">
		<div id="main-content">
			<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN EXAMPLE TABLE widget-->
					<div class="widget blue">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 用户管理
							</h4>
							<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="btn-group" style="margin-bottom:10px;">
								<button class="btn" onclick="Add()" style="color: #17AA6B;">
									<i class="icon-user"></i>新增
								</button>
								<button class="btn" onclick="Update()" style="color: #F5A16A;">
									<i class="icon-user"></i>修改
								</button>
								<button class="btn" onclick="Delete()" style="color: #D63E3E;">
									<i class="icon-user"></i>删除
								</button>
								<button class="btn" onclick="Delete()" style="color: #F5A16A;">
									<i class="icon-lock"></i>修改密码
								</button>
							</div>
							<div class="btn-group" style="margin-bottom:10px;float:right;">
								<a><img alt="" src="${ctx }/img/success_icon.png" style="width:20px;"></a>
								<a><img alt="" src="${ctx }/img/x_alt.png" style="width:20px;margin-left: 15px;"></a>
							</div>
							<div style="height: 100%;">
								<div id="left">
									<div style="background:#E0E0E0;">
										<label>用户列表</label>
									</div>
									<div style="height:97%;background: #ccc;">
										
									</div>
								</div>
								<div id="right">
									<div class="control-group">
										<label class="control-label" style="float: left;width:72px;">用户名&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls">
											<input type="text" class="span6 ">
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" style="float: left;width:72px;">备注&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls">
											<input type="text" class="span6 ">
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" style="float: left;width:72px;">创建时间&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls">
											<input type="text" class="span6 ">
										</div>
									</div>
									<div style="background:#E0E0E0;margin-left: 30px;">
										<label>角色列表(选中则拥有隶属该角色的权限)</label>
									</div>
									<div style="height:76%;background: #ccc;margin-left: 30px;">
										<div data-spy="scroll" style="height:350px;overflow:auto; position: relative;">
											
										</div>
									</div>
									
								</div>
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
