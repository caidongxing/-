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
    <title>金税设备时钟设置</title>
	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
  	<script type="text/javascript" src="js/timepicker/timer.js"></script>
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
    		
    		var dayNames = new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
        	var date = new Date();
        	document.getElementById('txt').innerHTML=dayNames[date.getDay()];
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
							<i class="icon-reorder"></i> 金税设备时钟设置
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<div id="left">
							<label style="text-align: center;margin-top: 50px;float: left;margin-left: 50px;color:blue;">金<br>税<br>设<br>备<br>时<br>钟<br>设<br>置</label>
							<img alt="" src="${ctx }/img/Clock.jpg" style="width: 60px;float: right;margin-top: 80px;">
						</div>
						<div id="right">
							<label style="color:#910C0C;margin-left:20px;">【注意事项】</label>
							<label style="color:#910C0C;margin-left:20px;">1、取得修改时钟的授权只可使用一次，若需要再次修改时钟须再次申请授权。</label>
							<label style="color:#910C0C;margin-left:20px;">2、以前开过票的最大日期：<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016年04月07日<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当前业务处理月份：4月</label>
							<div class="Groupbox" style="border: 1px solid #ccc;border-radius: 4px!important;padding: 15px;width: 50%;">
								<div class="control-group">
									<label class="control-label" style="float: left;">日期&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<div id="datetimepicker" class="input-append date">
											<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
											<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
										</div>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="float: left;">星期&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<label id="txt"></label>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="float: left;">时间&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										
									</div>
								</div>
							</div>
						</div>
						<div class="box" style="text-align: center;">
							<input id="btn_confirm" type="submit"  class="btn btn-primary" value="确认" style="margin-top: 20px;">
							<input id="btn_cancel"  type="button"  class="btn btn-primary" value="取消" style="margin-top: 20px;">
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
      $('#example_3').datetimepicker({
	    showSecond: true,
	    showMillisec: true,
	    timeFormat: 'hh:mm:ss'
    	});
    </script>
  </body>
</html>
