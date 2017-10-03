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
    <title>报税资料传出</title>
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
			height:200px;
			float:left;
		}
		#right{
			width:88%;
			height:200px;
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
        		$('#myModal').modal('show');
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
								<i class="icon-reorder"></i> 报税资料传出
							</h4>
							<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div id="left" >
								<label style="text-align: center;margin-top: 50px;float: left;margin-left: 50px;color:blue;">报<br>税<br>资<br>料<br>传<br>出</label>
								<img alt="" src="${ctx }/img/print.png" style="width: 60px;float: right;margin-top: 80px;">
							</div>
							<div id="right">
								<label style="color:#910C0C;margin-left:20px;">1.本功能用于将本机报税明细资料传到指定磁盘上，生成本期报税资料磁盘文件。</label>
								<label style="color:#910C0C;margin-left:20px;">2.资料传出产生一个报税文件：本报税月的销项防伪发票文件。</label>
								<div class="Groupbox" style="border: 1px solid #ccc;border-radius: 4px!important;padding: 15px;width: 50%;">
									<div class="control-group">
										<label class="control-label" style="float: left;">传出月份&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls" >
											<div id="datetimepicker" class="input-append date">
												<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
												<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
											</div>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" style="float: left;">票种选择&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls" >
											<select>
												<option>增值税专普票</option>
												<option>货物运输业增值税专用发票</option>
												<option>机动车销售统一发票</option>
											</select>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" style="float: left;">传出路径&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls" >
											<input type="text" class="span6 ">
										</div>
									</div>
								</div>
							</div>
							<div class="box" style="text-align: center;">
								<input id="btn_confirm" type="submit"  class="btn btn-primary" value="确定" style="margin-top: 20px;"> 
								<input id="btn_cancel"  type="button"  class="btn btn-primary" value="取消" style="margin-top: 20px;">
							</div>
						</div>
					</div>
					<!-- END EXAMPLE TABLE widget-->
				</div>
			</div>
		</div>
	</div>
	
	<!--BEGIN 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="height: 170px;">
		<div class="modal-dialog" style="width:100%;margin-top: 0;">
			<div class="modal-content" style="border-radius: 4px!important;">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">信息</h4>
				</div>
				<div class="modal-body">
					<img alt="" src="${ctx }/img/prompt.jpg" style="width: 30px;float: left;">
					<label>报税资料传出成功！</label>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal" style="border-radius: 4px!important;">确认</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
	
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
    </script>
  </body>
</html>
