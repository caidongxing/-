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
    <title>向分开票机分配发票</title>
    <script type="text/javascript" src="js/page_table/jquery.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap-table-zh-CN.js"></script>
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap.min.css" >
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
	
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<style type="text/css">
	.col-md-offset-3{
		margin-left: 0!important; 
		}
	.col-md-6{
		width: 100%!important;
		}
		.box{width:80%;}
		.btn{width:100px;margin:0 auto;}
		li{list-style:none;}
	</style>
	<script type="text/javascript">
		$(document).ready(function(){
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
     <div data-spy="scroll" style="height:500px;overflow:auto; position: relative;">
     	<div class="col-md-offset-3 col-md-6">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title text-center">向分开票机分配发票</h3>
				</div>
				<div class="panel-body">
					<div id="toolbar" class="btn-group"></div>
					<ul>
						<li><label>分开票机：<input type="text" class="span6 " style="padding:15px;width: 193px;"/></label></li>
						<li><label>发票种类：<select class="span6 chzn-select" style="padding: 5px;width: 193px;border-radius: 4px;">
											<c:forEach items="${invoicetypes}" var="item">
												<option value="${item.id}">${item.classname}</option>
											</c:forEach>
											</select></label></li>
						<li><label>分配状态：<select class="span6 chzn-select" style="padding: 5px;width: 193px;border-radius: 4px;">
													<option value="1">已下载</option>
													<option value="0">未下载</option>
											</select></label></li>
					</ul>
					
					<ul style="border: 1px solid #ccc;border-radius: 5px;padding:15px;">
						<li style="float: left;"><label>分配日期起：</label></li>
						<li>
							<div id="datetimepicker" class="input-append date">
								<input type="text" id="startime" readonly style="width: 110px;"></input> 
								<span class="add-on"><i data-time-icon="icon-time" data-date-icon="icon-calendar"></i></span>
							</div>
						</li>
						<li style="float: left;"><label>分配日期止：</label></li>
						<li>
							<div id="datetimepicker1" class="input-append date">
								<input type="text" id="endtime" readonly style="width: 110px;"></input> 
								<span class="add-on"><i data-time-icon="icon-time" data-date-icon="icon-calendar"></i></span>
							</div>
						</li>
					</ul>
					<div class="box">
						<button id="btn_confirm" type="button" class="btn btn-primary" style="margin-left: 450px;">确定 </button>
						<button id="btn_cancel" type="button" class="btn btn-primary" >取消 </button>
					</div>
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
       
       $(document).ready(function(){
       		$('#btn_confirm').click(function () {
        		location="${ctx}/onlineshareController/status_list.do";
    		});
       }); 
    </script>
  </body>
</html>
