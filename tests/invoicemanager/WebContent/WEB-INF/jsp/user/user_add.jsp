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
    <link href="css/add_update/bootstrap.min.css" rel="stylesheet" />
    <link href="css/add_update/bootstrap.covering.css" rel="stylesheet" />
    <link href="css/add_update/jquery-ui-1.10.4.custom.min.css" rel="stylesheet" />
	<link href="css/add_update/framework.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/common.css" />
	<style type="text/css">
		.control-group{
			margin-left: 20px;
		}
	</style>

  </head>
  
  <body>
    <div data-spy="scroll" style="height:500px;overflow:auto; position: relative;">
		<div id="main-content" style="height: 1000px;">
			<form action="${ctx }/costitemsController/add.do" method="post">
				<div id="content1" style="padding: 5px;">
					<div class="row-fluid main-content">
						<div class="pannel">
							<div class="pannel-header">
								<h4>新增用户</h4>
								<a onClick="history.go(-1);"><img alt="" src="${ctx }/img/x_alt.png" style="float: right;width: 20px;"></a>
							</div>
							<div class="pannel-body">
								<div class="control-group" style="margin-top: 20px;">
									<label class="control-label" style="float: left;width:72px;">用户名称&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="text" class="span6 ">
									</div>
								</div>
								<div class="control-group" style="margin-top: 20px;">
									<label class="control-label" style="float: left;width:72px;">密码&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="password" class="span6 ">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="float: left;width:72px;">备注&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<textarea rows="" cols="" class="span6"></textarea>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="float: left;width:72px;">创建人&nbsp;&nbsp;&nbsp;&nbsp;</label>
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
								<label style="margin-left: 20px;float:left;">角色权限</label>
								<div style="height:60%;width: 50%;background: #ccc;margin-left: 90px;">
									<div data-spy="scroll" style="height:600px;overflow:auto; position: relative;">
										
									</div>
								</div>
							</div>
							<div class="pannel-footer text-center">
								<button type="submit" class="btn btn-success">确定</button>
								<a href="" class="btn" onClick="history.go(-1);">取消</a>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
  </body>
</html>
