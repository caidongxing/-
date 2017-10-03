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
    <title>销项发票导出</title>
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
    
    <link rel="stylesheet" href="css/daterangepicker/bootstrap.min.css">
  	<script src="js/daterangepicker/jquery.min.js"></script>
	<script src="js/daterangepicker/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		window.history.go(-1);
    		});
    		
    		$('#btn_confirm').click(function () {
        		location="${ctx}/invoiceselectController/output_date.do";
    		});
    		
    		//============默认选择当月第一天和最后一天=============
    		var date = new Date();
    		var  day = new Date(date.getFullYear(),date.getMonth()+1,0);
        	var daycount = day.getDate();
    		var start=date.getFullYear()+"-"+(date.getMonth()<10?"0"+(date.getMonth()+1):date.getMonth()+1)+"-01";
    		var end	 =date.getFullYear()+"-"+(date.getMonth()<10?"0"+(date.getMonth()+1):date.getMonth()+1)+"-"+daycount;
    		document.getElementById("startime").value = start;
    		document.getElementById("endtime").value  = end;
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
							<span class="tools"> 
								<a href="javascript:;" class="icon-remove"></a> 
							</span>
						</div>
						<div class="widget-body">
							<label>选择查询时间</label>
							<div class="btn-group" style="margin-left: 50px;">
								<label style="float:left">开始日期</label>
								<div id="datetimepicker" class="input-append date" style="float: left;">
									<input type="text" id="startime" readonly style="width: 110px;"></input> 
									<span class="add-on"><i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
								</div>
								<label><input type="checkbox" checked="checked">包含本日</label>
								<label style="float:left">结束日期</label>
								<div id="datetimepicker1" class="input-append date" style="float: left;">
									<input type="text" id="endtime" readonly style="width: 110px;"> </input> 
									<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
								</div>
								<label><input type="checkbox" checked="checked">包含本日</label>
							</div>
							<div class="box" style="margin-top:10px;">
								<button id="btn_confirm" type="button" class="btn btn-primary"  style="margin-left: 450px;border-radius: 4px!important;">确定</button>
								<button id="btn_cancel"  type="button" class="btn btn-primary"  style="border-radius: 4px!important;" onclick="window.history.go(-1);">取消</button>
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
    </script>
  </body>
</html>
