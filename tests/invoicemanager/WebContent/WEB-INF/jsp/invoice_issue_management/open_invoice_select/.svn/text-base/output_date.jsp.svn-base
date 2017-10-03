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
    <title>选择所属期</title>
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
    		
    		$('#btn_select').click(function () {
        		location="${ctx}/invoiceselectController/combination_select.do";
    		});
　　		}); 
   	</script>
   	<style type="text/css">
   		select{
   			border-radius: 4px!important;
   		}
   	</style>

  </head>
  
  <body>
    <div id="main-content">
			<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN EXAMPLE TABLE widget-->
					<div class="widget blue">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 选择所属期
							</h4>
							<span class="tools"> 
								<a href="javascript:;" class="icon-remove"></a> 
							</span>
						</div>
						<div class="widget-body" style="height: 80%;">
						
							
							<label>填报日期</label>
							<div class="btn-group" style="margin-left: 50px;">
								<label style="color:red">说明：填报日期应该15日前</label>
								<label style="float:left">填报日期</label>
								<div id="datetimepicker1" class="input-append date">
									<input type="text" readonly style="width: 110px;"> </input> 
									<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
								</div>
							</div>
							
							<label>申报所属期</label>
							<div class="btn-group" style="margin-left: 50px;">
								<label style="color:red">说明：选择年月，起止日自动生成（分别为当月最小日和最大日）</label>
								<label style="float:left">开始日期</label>
								<div id="datetimepicker2" class="input-append date">
									<input type="text" readonly style="width: 110px;"></input> 
									<span class="add-on"><i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
								</div>
								<label></label>
								<label style="float:left">结束日期</label>
								<div id="datetimepicker3" class="input-append date">
									<input type="text" readonly style="width: 110px;"> </input> 
									<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
								</div>
							</div>
							

							<div class="box" style="margin-top:10px;">
								<button id="btn_confirm" type="button" class="btn btn-primary"  style="margin-left: 450px;border-radius: 4px!important;">导出</button>
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
      $('#datetimepicker1').datetimepicker({  
        format: 'yyyy-MM',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
           
       $('#datetimepicker2').datetimepicker({  
        format: 'yyyy-MM',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
       $('#datetimepicker3').datetimepicker({  
        format: 'yyyy-MM',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
    </script>
  </body>
</html>
