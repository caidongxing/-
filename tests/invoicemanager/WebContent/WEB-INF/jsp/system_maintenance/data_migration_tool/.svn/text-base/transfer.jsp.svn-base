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
    <title>旧版升级数据迁移工具</title>
	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
  	<style type="text/css">
  		input[type=button],input[type=submit]{
  			border-radius: 4px!important;
  		}
  		button{
  			border-radius: 4px!important;
  		}
  		#left{
			width:50%;
			height:50px;
			float:left;
		}
		#right{
			width:12%;
			height:50px;
			float:left;
		}
		input[type=text]{
			border-radius: 4px!important;
			padding: 5px;
    		width: 300px;
		}
		ul li{
			padding:5px;
		}
		.Groudbox{
			width: 100px;
    		border: 1px solid #ccc;
    		border-radius: 4px!important;
    		padding: 15px;
    		margin-top: 50px;
		}
		label{
			font-weight: 100;
		}
  	</style>
  	<script type="text/javascript">
		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_cancel').click(function () {
        		$('.widget .tools .icon-remove').parents(".widget").parent().remove();
    		});
    		
    		$('#btn_confirm').click(function () {
        		$('#myModal').modal('show');
    		});
　　		});
		
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
								<i class="icon-reorder"></i> 旧版升级数据迁移工具
							</h4>
							<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div style="height: calc( 25% - 40px );background:#F0F0F0;">
								<div id="left">
									<ul>
										<li><label style="width: 168px;">旧版开票软件版本：</label><input type="text" class="span6 "></li>
										<li><label style="width: 168px;">旧版开票软件数据库位置：</label><input type="text" class="span6 "></li>
									</ul>
								</div>
								<div id="right">
									<button class="btn btn-primary" style="margin-top: 43px;">数据库选择</button>
								</div>
							</div>
							<div style="height: calc( 65% - 40px );">
								<div id="left" style="margin-left: 44px;">
									<label>旧版数据表：</label>
									<div style="border:1px solid #ccc;height:540%;">
										<p>123</p>
										<p>123</p>
										<p>123</p>
										<p>123</p>
										<p>123</p>
										<p>123</p>
									</div>
								</div>
								<div id="right">
									<div class="Groudbox">
										<label style="position: absolute;margin-top: -25px;">有相同数据时</label>
										<label class="radio" style="text-align: center;"><input type="radio" name="gender" value="male">覆盖</label>
										<label class="radio" style="text-align: center;"><input type="radio" name="gender" value="male">跳过</label>
									</div>
								</div>
							</div>
							<div class="box" style="text-align: center;height: 50px;line-height: 3.7;background:#F0F0F0;margin-top: 10px;">
								<label style="margin-left: -400px;">迁移：发票信息类表：销项发票销货清单 正在写入数据库...</label>
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
					<img alt="" src="${ctx }/img/Question.png" style="width: 40px;float: left;">
					<ul>
						<li><label>此操作可能需要持续几分钟。</label></li>
						<li><label>是否继续？</label></li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" style="width: 58px;" id="btn_yes">是</button>
					<button type="button" class="btn btn-primary" style="width: 58px;" id="btn_no" data-dismiss="modal">否</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
</body>
</html>
