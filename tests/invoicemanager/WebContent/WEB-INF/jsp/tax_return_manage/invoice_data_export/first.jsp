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
    <title>发票数据导出</title>
	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
  	<style type="text/css">
  		.Groudbox{
			width: 500px;
    		border: 1px solid #ccc;
    		border-radius: 4px!important;
    		padding: 15px;
    		margin-bottom:10px;
		}
		input[type=text]{
			padding:5px;
			border-radius: 4px!important;
		}
		#main-content{
			min-height: 550px;
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
    <div data-spy="scroll" style="height:500px;overflow:auto; position: relative;">
		<div id="main-content">
			<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN EXAMPLE TABLE widget-->
					<div class="widget blue">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 发票数据导出
							</h4>
							<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;color:blue;">按票种查询</label>
								<label style="float:left;margin-top:5px;">票种</label>
								<select>
									<option>增值税专用、普通发票</option>
								</select>
							</div>
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;color:blue;">按月份查询</label>
								<label style="float:left;">月份</label>
								<div id="datetimepicker" class="input-append date">
									<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
									<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
								</div>
							</div>
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;color:blue;">按开票日期查询</label>
								<label style="float:left;">开始日期</label>
								<div id="datetimepicker1" class="input-append date" style="float: left;">
									<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
									<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
								</div>
								<label><input type="checkbox">包含本日</label>
								<label style="float:left">结束日期</label>
								<div id="datetimepicker2" class="input-append date" style="float: left;">
									<input type="text" readonly style="width: 110px;"> </input> 
									<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
								</div>
								<label><input type="checkbox">包含本日</label>
							</div>
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;color:blue;">按购方信息查询</label>
								<div class="control-group">
									<label class="control-label" style="float: left;">购方名称&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="text" class="span6 ">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="float: left;">购方税号&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="text" class="span6 ">
									</div>
								</div>
							</div>
							<div class="box" style="text-align: center;">
								<input id="btn_confirm" type="submit"  class="btn btn-primary" value="确定" style="border-radius: 4px!important;"> 
								<input id="btn_cancel"  type="button"  class="btn btn-primary" value="取消" style="border-radius: 4px!important;">
							</div>
						</div>
					</div>
					<!-- END EXAMPLE TABLE widget-->
				</div>
			</div>
		</div>
	</div>
	
	<script src="js/daterangepicker/jquery-1.8.2.min.js"></script>  
    <script src="js/daterangepicker/bootstrap.min.js"></script>  
    <script src="js/daterangepicker/bootstrap-datetimepicker.min.js"></script> 
    <script type="text/javascript">  
      $('#datetimepicker').datetimepicker({  
        format: 'yyyy年MM月',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
      $('#datetimepicker1').datetimepicker({  
        format: 'yyyy年MM月',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
      $('#datetimepicker2').datetimepicker({  
        format: 'yyyy年MM月',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
    </script>
  </body>
</html>
