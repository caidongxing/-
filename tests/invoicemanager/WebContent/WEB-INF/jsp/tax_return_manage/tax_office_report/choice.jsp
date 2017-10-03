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
    <title>请选择要抄税的票种</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_cancel').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('#btn_confirm').click(function () {
        		location="${ctx}/taxofficereportController/medium.do";
    		});
　　		}); 
   	</script>
   	<style type="text/css">
   		input[type=button],input[type=submit]{
			border-radius: 4px!important;
		}
		input[type=text]{
			padding:5px;
			border-radius: 4px!important;
		}
		.checkbox{
			text-align: center;
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
							<i class="icon-reorder"></i> 请选择要抄税的票种
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<label style="text-align: center;color:#910C0C;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;抄税操作后，要及时到税务机关报税，否则会影响正常购票，<br>开票或征期报税。如果发票数量大，抄税操作可能要花费比较长的</label>
						<label style="text-align: center;color:#910C0C;margin-left: -134px;">时间，请您耐心等待...</label>
						<label style="text-align: center;margin-left: -140px;color:#910C0C;">请选择要抄税的票种</label>
						<label class="checkbox" style="margin-left: -140px;color:#AF4FAF;"><input type="checkbox" name="cms" value="US">增值税专普票</label>
    					<label class="checkbox" style="margin-left: -98px;color:#AF4FAF;"><input type="checkbox" name="cms" value="ES<">货物运输业增值税专用发票</label>
    					<label class="checkbox" style="margin-left: -119px;color:#AF4FAF;"><input type="checkbox" name="cms" value="Cannade">机动车销售统一发票</label>
						<div class="box" style="margin-top:10px;text-align: center;">
							<input id="btn_confirm" type="submit" class="btn btn-primary" value="确定">
							<input id="btn_cancel"  type="button" class="btn btn-primary" value="取消">
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
  </body>
</html>
