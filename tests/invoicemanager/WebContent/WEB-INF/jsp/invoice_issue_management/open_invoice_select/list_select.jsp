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
   	<style type="text/css">
   		select{
   			border-radius: 4px!important;
   		}
   		input[type=text]{
   			border-radius: 4px!important;
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
								<i class="icon-reorder"></i> 查询条件
							</h4>
							<span class="tools"> 
								<a href="javascript:;" class="icon-remove"></a> 
							</span>
						</div>
						<div class="widget-body" style="height: 80%;">
						
							<label>按购方信息查询</label>
							<div class="box" style="margin-left: 50px;">
								<label>购方名称：<input type="text" class="span6 "
									style="padding:5px;width: 193px;" /> </label> <label>购方税号：<input
									type="text" class="span6 " style="padding:5px;width: 193px;" />
								</label>
							</div>
							<label>按开票日期查询</label>
							<div class="btn-group" style="margin-left: 50px;">
								<label style="float:left">购票日期起</label>
								<div id="datetimepicker" class="input-append date">
									<input type="text" id="startime" readonly style="width: 110px;"></input> 
									<span class="add-on"><i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
								</div>
								<label></label>
								<label style="float:left">购票日期止</label>
								<div id="datetimepicker1" class="input-append date">
									<input type="text" id="endtime" readonly style="width: 110px;"> </input> 
									<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
								</div>
							</div>
							<label>按发票种类查询</label>
							<div class="box" style="margin-left: 50px;">
								<label>发票种类： 
									<select class="span6 chzn-select" style="padding: 5px;width: 193px;border-radius: 4px;">
										<option value="0">全部发票</option>
											<c:forEach items="${invoicetypes}" var="item">
												<option value="${item.id}">${item.classname}</option>
											</c:forEach>
									</select> 
								</label>
							</div>
							<label>查询方式设置</label>
							<div class="box" style="margin-left: 50px;">
								<label>支持模糊查找&nbsp;&nbsp;&nbsp;<input type="checkbox" checked="checked"></label>
							</div>

							<div class="box" style="margin-top:10px;">
								<button id="btn_select"  type="button" class="btn btn-primary"  style="margin-left: 350px;border-radius: 4px!important;">组合查询条件</button>
								<button id="btn_confirm" type="button" class="btn btn-primary"  style="border-radius: 4px!important;">确定</button>
								<button id="btn_cancel"  type="button" class="btn btn-primary"  style="border-radius: 4px!important;" onclick="window.history.go(-1);">取消</button>
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
