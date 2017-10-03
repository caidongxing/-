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
    <title>证书口令修改</title>
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   	<link href="assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   	<link href="assets/bootstrap/css/bootstrap-fileupload.css" rel="stylesheet" />
   	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link href="css/style-responsive.css" rel="stylesheet" />
   	<link href="css/style-default.css" rel="stylesheet" id="style_color" />
    <link href="assets/fancybox/source/jquery.fancybox.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/uniform/css/uniform.default.css" />
    <link rel="stylesheet" href="css/common.css" />
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
    	
    </script>

  </head>
  
  <body style="background:#fff">
	<div id="main">
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN SAMPLE FORMPORTLET-->
					<div class="widget green">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 证书口令修改
							</h4>
							<span class="tools"> 
								<a href="javascript:;" class="icon-chevron-down"></a> 
								<a href="javascript:;" class="icon-remove"></a>
							</span>
						</div>
						<div class="widget-body">
							<!-- BEGIN FORM-->
							<form action="#" class="form-horizontal">
								<div class="control-group">
									<label class="control-label">原口令：</label>
									<div class="controls">
										<input type="password" class="span6 " name="certificatepassword">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">新口令：</label>
									<div class="controls">
										<input type="password" class="span6 " name="certificatepassword">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">确认口令：</label>
									<div class="controls">
										<input type="password" class="span6 " name="certificatepassword">
									</div>
								</div>

								<div class="form-actions">
									<button type="submit" class="btn btn-success">确定</button>
									<button type="button" class="btn">取消</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
