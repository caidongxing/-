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
    <title>金税设备口令设置</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
  	<style type="text/css">
   		input[type=button],input[type=submit]{
			border-radius: 4px!important;
		}
		input[type=text]{
			padding:5px;
			border-radius: 4px!important;
		}
		#left{
			width:12%;
			height:300px;
			float:left;
		}
		#right{
			width:88%;
			height:300px;
			float:right;
		}
   	</style>
	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_cancel').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_confirm').click(function () {
    			
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
							<i class="icon-reorder"></i> 金税设备口令设置
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<div id="left">
							<label style="text-align: center;margin-top: 50px;float: left;margin-left: 50px;color:blue;">金<br>税<br>设<br>备<br>口<br>令<br>设<br>置</label>
							<img alt="" src="${ctx }/img/Keyword.jpg" style="width: 60px;float: right;margin-top: 80px;">
						</div>
						<div id="right">
							<label style="color:#910C0C;margin-left:20px;">【注意事项】</label>
							<label style="color:#910C0C;margin-left:20px;">1、本功能用于修改金税设备一级口令，口令字最大长度为8个字符。</label>
							<label style="color:#910C0C;margin-left:20px;">2、新口令两次输入必须完全一致，否则系统拒接修改口令。</label>
							<label style="color:#910C0C;margin-left:20px;">3、修改后的口令应牢记，万一忘记口令，在错误输入七次一级口令后，系统死锁，此时必须输入二级口令解锁。</label>
							<div class="Groupbox" style="border: 1px solid #ccc;border-radius: 4px!important;padding: 15px;width: 50%;">
								<div class="control-group">
									<label class="control-label" style="float: left;">核对原口令&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="text" class="span6 ">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="float: left;">输入新口令&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="text" class="span6 ">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="float: left;">重新输一遍&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="text" class="span6 ">
									</div>
								</div>
							</div>
						</div>
						<div class="box" style="text-align: center;">
							<input id="btn_cancel"  type="button"  class="btn btn-primary" value="取消" style="margin-top: 20px;">
							<input id="btn_confirm" type="submit"  class="btn " value="确认" style="margin-top: 20px;"> 
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
  </body>
</html>
