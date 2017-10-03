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
    <title>红字发票信息表审核结果下载条件设置</title>
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
		.control-label{
			float:left;
		}
		.control-group {
   			 margin-bottom: 0px!important;
		}
   		.Groudbox{
			width: 500px;
    		border: 1px solid #ccc;
    		border-radius: 4px!important;
    		padding: 15px;
    		margin-bottom:10px;
    		/* display:inline-block; */
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
    		
    		$('#btn_confirm').click(function () {
        		location="${ctx}/specialfillController/fill.do";
    		});
　　		}); 
   	</script>
  </head>
  
  <body>
    <div data-spy="scroll" style="height:700px;overflow:auto; position: relative;">
    	<div id="main-content">
    		<div class="row-fluid">
    			<div class="span12">
    				<div class="widget blue">
    					<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 红字发票信息表审核结果下载条件设置
							</h4>
							<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;">填开日期</label>
								<div class="control-group">
									<label class="control-label">填开日期起&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls" style="float: left;margin-right: 5px;">
										<div id="datetimepicker" class="input-append date">
											<input type="text" readonly style="width: 110px;padding: 0!important;border-radius: 0px!important;"></input> 
											<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
										</div>
									</div>
									<label><input type="checkbox" checked="checked">包含本日</label>
								</div>
								<div class="control-group">
									<label class="control-label">填开日期止&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls" style="float: left;margin-right: 5px;">
										<div id="datetimepicker1" class="input-append date">
											<input type="text" readonly style="width: 110px;padding: 0!important;border-radius: 0px!important;"></input> 
											<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i> </span>
										</div>
									</div>
									<label><input type="checkbox" checked="checked">包含本日</label>
								</div>
							</div>
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;">信息表信息</label>
								<div class="control-group">
									<label class="control-label" style="margin-top: 5px;">购货方税号&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="text" class="span6 ">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="margin-top: 5px;">销货方税号&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="text" class="span6 ">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" style="margin-top: 5px;">信息表编号&nbsp;&nbsp;&nbsp;&nbsp;</label>
									<div class="controls">
										<input type="text" class="span6 ">
									</div>
								</div>
							</div>
							<div class="Groudbox">
								<label style="position: absolute;margin-top: -25px;">下载范围</label>
								<label class="checkbox" style="margin-left: 20px;"><input type="checkbox" name="cms" value="US" checked="checked">本企业填写的红字信息表</label>
   							    <label class="checkbox" style="margin-left: 20px;"><input type="checkbox" name="cms" value="ES" checked="checked">其他企业作为购买方填写的红字信息表</label>
							</div>
							<div class="box" style="margin-top:10px;text-align: center;">
								<input id="btn_cancel"  type="button" class="btn btn-primary" value="取消">
								<input id="btn_confirm" type="submit" class="btn btn-primary" value="确定"> 
							</div>
						</div>
    				</div>
    			</div>
    		</div>
    	</div>
    </div>
    
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
