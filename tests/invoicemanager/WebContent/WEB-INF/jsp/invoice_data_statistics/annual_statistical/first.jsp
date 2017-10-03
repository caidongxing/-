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
    <title>指定汇总范围</title>
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
			height:330px;
			float:left;
		}
		#right{
			width:88%;
			height:330px;
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
    			location="${ctx}/yearcountController/list.do";
    		});
    		
			//开始月份	
			var mon = document.getElementById('month');
			mon.options.add(new Option('', -1));
			for ( var i = 1; i < 13; i++) {
				var option = document.createElement('option');
				option.value = i;
				var txt = document.createTextNode(i);
				option.appendChild(txt);
				mon.appendChild(option);
			}
			//结束月份	
			var mon = document.getElementById('month1');
			mon.options.add(new Option('', -1));
			for ( var i = 1; i < 13; i++) {
				var option = document.createElement('option');
				option.value = i;
				var txt = document.createTextNode(i);
				option.appendChild(txt);
				mon.appendChild(option);
			}
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
							<i class="icon-reorder"></i> 指定汇总范围
						</h4>
						<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<div id="left">
							<label style="text-align: center;margin-top: 50px;float: left;margin-left: 50px;color:blue;">金<br>税<br>设<br>备<br>资<br>料<br>统<br>计</label>
							<img alt="" src="${ctx }/img/Statistics.jpg" style="width: 60px;float: right;margin-top: 80px;">
						</div>
						<div id="right">
							<label style="color:#910C0C;margin-left:20px;">【注意事项】</label>
							<label style="color:#910C0C;margin-left:20px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、本功能用于查询金税设备黑匣子中纳<br>税统计资料，包括：防伪发票领用存统计及发票<br>销售金额与税额的统计。</label>
							<label style="color:#910C0C;margin-left:20px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、汇总范围只能选择在本年内当前报税期<br>之前。</label>
							<div class="Groupbox" style="border: 1px solid #ccc;border-radius: 4px!important;padding: 15px;width: 50%;">
								<div class="control-group">
									<label class="control-label" style="float: left;">发票种类&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<select  style="padding: 5px;">
											<c:forEach items="${invoicetypes}" var="item">
												<option value="${item.id}">${item.classname}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="float: left;">起始月份&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<select id="month"   style="padding: 5px;"></select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="float: left;">结束月份&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<select id="month1" style="padding: 5px;"></select>
									</div>
								</div>
							</div>
						</div>
						<div class="box" style="text-align: center;">
							<input id="btn_confirm" type="submit"  class="btn btn-primary" value="确定">
							<input id="btn_cancel"  type="button"  class="btn btn-primary" value="取消">
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
  </body>
</html>
