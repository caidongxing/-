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
    <title>数据备份选项设置</title>
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<style type="text/css">
		.Groudbox{
			width: 800px;
    		border: 1px solid #ccc;
    		border-radius: 4px!important;
    		padding: 15px;
    		margin-top: 20px;
		}
		.checkbox{
  			margin-left: 20px;
  			margin-top: 10px;
  		}
  		#number{
  			border-radius: 4px!important;
			padding: 15px;
			width: 100px;
			margin-top: 10px;
  		}
  		input[type=button],input[type=submit]{
  			border-radius: 4px!important;
  		}
  		button{
  			border-radius: 4px!important;
  		}
  		input[type=text]{
  			border-radius: 4px!important;
			padding: 15px;
    		width: 500px;
  		}
	</style>
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
								<i class="icon-reorder"></i> 数据备份选项设置
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;">数据库备份信息选择</label>
								<label class="checkbox"><input type="checkbox" name="cms" value="US">每月月初备份数据</label>
								<label class="checkbox"><input type="checkbox" name="cms" value="US">程序每次运行结束备份数据</label>
								<label style="float: left;">间隔一定时间备份：<input type="text" id="number"></label>
								<select class="selectpicker" style="margin-top: 10px;margin-left: 10px;width: 100px;">
									<option>天</option>
									<option>周</option>
									<option>月</option>
								</select>
							</div>
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;">数据库备份信息选择</label>
								<label style="float:left;">数据库备份路径：<input type="text" style="margin-top: 5px;"></label>
								<button class="btn btn-primary" style="margin-top: 8px;margin-left: 10px;">浏览</button>
							</div>
							<div class="box" style="text-align: center;height: 50px;line-height: 3.7;margin-top: 10px;">
								<input id="btn_confirm" type="submit" class="btn btn-primary" value="迁移"> 
								<input id="btn_cancel"  type="button" class="btn btn-primary" value="取消">
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
