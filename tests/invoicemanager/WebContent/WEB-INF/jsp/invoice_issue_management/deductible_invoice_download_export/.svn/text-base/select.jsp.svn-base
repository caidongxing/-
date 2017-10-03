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
	<style type="text/css">
		button[type=button],button[type=submit]{
			border-radius: 4px!important;
		}
		input[type=text]{
			padding:5px;
			border-radius: 4px!important;
		}
		.control-label{
			float:left;
/* 			margin-top: 5px; */
		}
		.Groudbox{
			width: 300px;
    		border: 1px solid #ccc;
    		border-radius: 4px!important;
    		padding: 15px;
    		display:inline-block;
		}
		
	</style>
	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		window.history.back(-1); 
    		});
    		
    		$('#btn_confirm').click(function () {
        		window.history.back(-1); 
    		});
    		
    		$('#btn_cancel').click(function () {
        		window.history.back(-1); 
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
							<i class="icon-reorder"></i> 查询条件
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<div class="Groudbox">
							<label style="position: absolute;margin-top: -25px;">查询条件</label>
							<div class="control-group">
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
							<div class="control-group">
								<label class="control-label">销方税号&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<div class="controls">
									<input type="text" class="span6 ">
								</div>
							</div>
						</div>
						<div class="Groudbox">
							<label style="position: absolute;margin-top: -25px;">开票日期</label>
							<div class="control-group">
								<label class="control-label">开始日期&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<div class="controls">
									<div id="datetimepicker" class="input-append date">
										<input type="checkbox" checked ='checked'>
										<input type="text" readonly style="width: 110px;padding: 0!important;border-radius: 0px!important;">
										</input> 
										<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
									</div>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">结束日期&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<div class="controls">
									<div id="datetimepicker1" class="input-append date">
										<input type="checkbox" checked ='checked'>
										<input type="text" readonly style="width: 110px;padding: 0!important;border-radius: 0px!important;">
										</input> 
										<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
									</div>
								</div>
							</div>
						</div>
						<div class="Groudbox">
							<label style="position: absolute;margin-top: -25px;">认证日期</label>
							<div class="control-group">
								<label class="control-label">开始日期&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<div class="controls">
									<div id="datetimepicker2" class="input-append date">
										<input type="checkbox" checked ='checked'>
										<input type="text" readonly style="width: 110px;padding: 0!important;border-radius: 0px!important;">
										</input> 
										<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
									</div>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">结束日期&nbsp;&nbsp;&nbsp;&nbsp;</label>
								<div class="controls">
									<div id="datetimepicker3" class="input-append date">
										<input type="checkbox" checked ='checked'>
										<input type="text" readonly style="width: 110px;padding: 0!important;border-radius: 0px!important;">
										</input> 
										<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
									</div>
								</div>
							</div>
						</div>
						<div class="box" style="margin-top:10px;text-align: center;">
							<button id="btn_confirm" type="submit" class="btn btn-primary" >查询</button>
							<button id="btn_cancel"  type="button" class="btn btn-primary" >取消</button>
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
	
	<script src="js/daterangepicker/jquery-1.8.2.min.js"></script>  
    <script src="js/daterangepicker/bootstrap.min.js"></script>  
    <script src="js/daterangepicker/bootstrap-datetimepicker.min.js"></script>  
	<script type="text/javascript">  
      $('#datetimepicker').datetimepicker({  
        format: 'yyyy-MM-dd',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
      });
      $('#datetimepicker1').datetimepicker({  
        format: 'yyyy-MM-dd',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
      });
      $('#datetimepicker2').datetimepicker({  
        format: 'yyyy-MM-dd',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
      });
      $('#datetimepicker3').datetimepicker({  
        format: 'yyyy-MM-dd',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
      });
    </script>
</body>
</html>
