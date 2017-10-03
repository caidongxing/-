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
    <title>税号变更</title>
	<link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
  	<style type="text/css">
  		
		input[type=button],input[type=submit]{
  			border-radius: 4px!important;
  		}
  		input[type=radio]{
  			margin-top: 13px;
  		}
  		.radio{
  			margin-left: 20px;
  		}
  		input[type=text]{
  			border-radius: 4px!important;
			padding: 5px;
    		width: 300px;
  		}
  		button{
  			border-radius: 4px!important;
  		}
  		.Groudbox{
			width: 500px;
    		border: 1px solid #ccc;
    		border-radius: 4px!important;
    		padding: 15px;
    		margin-top: 20px;
		}
		.checkbox{
			margin:30px;
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
								<i class="icon-reorder"></i> 税号变更
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div>
								<label>旧税号数据源选择：</label>
								<label class="radio"><input type="radio" name="gender" value="male">已存在税号：<input type="text" class="span6"><button class="btn btn-primary" style="margin-left: 20px;margin-top: -12px;">路径选择</button></label>
								<label class="radio"><input type="radio" name="gender" value="male">数据库路径：<input type="text" class="span6"><button class="btn btn-primary" style="margin-left: 20px;margin-top: -12px;">数据库选择</button></label>
							</div>
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;color:blue;">需要迁移的表</label>
								<label class="checkbox inline"><input type="checkbox" name="cms" value="US">编码表</label>
    							<label class="checkbox inline"><input type="checkbox" name="cms" value="ES">销项发票表</label>
    							<label class="checkbox inline"><input type="checkbox" name="cms" value="HU">销售单据表</label>
    							<label class="checkbox inline"><input type="checkbox" name="cms" value="HU">用户信息表</label>
								<label class="checkbox"><input type="checkbox" name="cms" value="US">红字发票信息表</label>
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
	
	<!--BEGIN 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true" style="border-radius: 4px!important;">
		<div class="modal-dialog">
			<div class="modal-content" >
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">税号变更</h4>
				</div>
				<div class="modal-body">
					<label>此操作将使用所选数据替换客户、商品等编码表，合并发票、文本单据、用户表，请注意保存数据。</label>
					<label>是否继续？</label>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" style="width: 58px;" id="btn_yes">确定</button>
					<button type="button" class="btn btn-primary" style="width: 58px;" id="btn_no" data-dismiss="modal">取消</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
  </body>
</html>
