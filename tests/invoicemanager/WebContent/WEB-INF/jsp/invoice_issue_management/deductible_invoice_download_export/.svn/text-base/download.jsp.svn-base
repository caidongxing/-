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
    <title>抵扣发票下载</title>
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
    
    <link rel="stylesheet" href="css/daterangepicker/bootstrap.min.css">
  	<script src="js/daterangepicker/jquery.min.js"></script>
	<script src="js/daterangepicker/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	
	<style type="text/css">
		input[type=text]{
			border-radius: 4px!important;
			padding: 15px;
		}
		button[type=button]{
			border-radius: 4px!important;
		}
	</style>
	<script type="text/javascript">
		$(document).ready(function(){
			$('.widget .tools .icon-remove').click(function () {
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
							<i class="icon-reorder"></i> 抵扣发票下载
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<label>抵扣发票下载条件</label>
						<p>
							发票种类&nbsp;&nbsp;&nbsp;&nbsp;<select class="span6" style="width: 200px;padding: 5px;">
											<c:forEach items="${invoicetypes}" var="item">
												<option value="${item.id}">${item.classname}</option>
											</c:forEach>
									</select>
						</p>

						<p>
							发票代码&nbsp;&nbsp;&nbsp;&nbsp;<input type="text">
						</p>

						<p>
							发票号码&nbsp;&nbsp;&nbsp;&nbsp;<input type="text">
						</p>

						<p><label style="float:left;">开票日期&nbsp;&nbsp;&nbsp;&nbsp;</label><div id="datetimepicker" class="input-append date" >
								<input type="text" readonly style="width: 110px;padding: 0!important;border-radius: 0px!important;"> </input> 
								<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
							</div>
						</p>
						
						<div class="box" style="margin-top:20px;">
							<button id="btn_confirm" type="button" class="btn btn-primary" >下载</button>
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
    </script>
</body>
</html>
