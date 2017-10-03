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
    <title>连续打印</title>
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
        		window.history.back(-1);
    		});
    		
    		$('#btn_cancel').click(function () {
        		window.history.back(-1);
    		});
　　		});
	</script>
	<style type="text/css">
   		input[type=button],input[type=submit]{
			border-radius: 4px!important;
		}
		.Groudbox{
			width: 800px;
    		border: 1px solid #ccc;
    		border-radius: 4px!important;
    		padding: 15px;
    		margin-bottom:20px;
		}
		.num_ul li{
			float:left;
			margin-right:180px;
		}
		.num_ul1 li{
			float:left;
			margin-right:100px;
		}
		.num_ul2 li{
			float:left;
			margin-right:100px;
		}
		.num_ul3 li{
			float:left;
			margin-right:30px;
		}
		.num_ul4 li{
			float:left;
			margin-right:70px;
		}
		.num_ul5 li{
			float:left;
			margin-right:70px;
		}
		.num_ul6 li{
			float:left;
			margin-right:60px;
		}
		#Groudboxtwo label{
			margin-left: 25px;
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
								<i class="icon-reorder"></i> 连续打印
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="Groudbox" style="height: 65%;">
								<label style="position: absolute;margin-top: -25px;">条件选择</label>
								<ul class="num_ul">
									<li>选择种类</li>
									<li>选择年份 </li>
									<li>选择税期</li>
								</ul>
								<ul class="num_ul1" style="margin-top:20px;">
									<li><label class="checkbox"><input type="checkbox" name="cms" value="US">增值税专用发票</label></li>
									<li>
										<div id="datetimepicker" class="input-append date" style="margin-top: 10px;">
												<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
												<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
										</div>
									</li>
									<li>
										<select id="month" style="width: 150px;margin-top: 5px;">
										
										</select>
									</li>
								</ul>
								<ul class="num_ul2" style="margin-top:20px;">
									<li><label class="checkbox"><input type="checkbox" name="cms" value="US">增值税普通发票</label></li>
									<li>
										<div id="datetimepicker1" class="input-append date" style="margin-top: 10px;">
												<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
												<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
										</div>
									</li>
									<li>
										<select id="month" style="width: 150px;margin-top: 5px;">
										
										</select>
									</li>
								</ul>
								<ul class="num_ul3" style="margin-top:20px;">
									<li><label class="checkbox"><input type="checkbox" name="cms" value="US">货物运输业增值税专用发票</label></li>
									<li>
										<div id="datetimepicker2" class="input-append date" style="margin-top: 10px;">
												<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
												<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
										</div>
									</li>
									<li>
										<select id="month" style="width: 150px;margin-top: 5px;margin-left: 70px;">
										
										</select>
									</li>
								</ul>
								<ul class="num_ul4" style="margin-top:20px;">
									<li><label class="checkbox"><input type="checkbox" name="cms" value="US">机动车销售统一发票</label></li>
									<li>
										<div id="datetimepicker3" class="input-append date" style="margin-top: 10px;">
												<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
												<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
										</div>
									</li>
									<li>
										<select id="month" style="width: 150px;margin-top: 5px;margin-left: 30px;">
										
										</select>
									</li>
								</ul>
								<ul class="num_ul5" style="margin-top:20px;">
									<li><label class="checkbox"><input type="checkbox" name="cms" value="US">电子增值税普通发票</label></li>
									<li>
										<div id="datetimepicker4" class="input-append date" style="margin-top: 10px;">
												<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
												<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
										</div>
									</li>
									<li>
										<select id="month" style="width: 150px;margin-top: 5px;margin-left: 30px;">
										
										</select>
									</li>
								</ul>
								<ul class="num_ul6" style="margin-top:20px;">
									<li><label class="checkbox"><input type="checkbox" name="cms" value="US">增值税普通发票(卷票)</label></li>
									<li>
										<div id="datetimepicker5" class="input-append date" style="margin-top: 10px;">
												<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
												<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
										</div>
									</li>
									<li>
										<select id="month" style="width: 150px;margin-top: 5px;margin-left: 40px;">
										
										</select>
									</li>
								</ul>
							</div>
							
							<div class="Groudbox" id="Groudboxtwo">
								<label style="position: absolute;margin-top: -25px;">打印选项</label>
								<label class="checkbox"><input type="checkbox" name="cms" value="US">增值税发票汇总表</label>
    							<label class="checkbox"><input type="checkbox" name="cms" value="ES<">正数发票清单</label>
   							    <label class="checkbox"><input type="checkbox" name="cms" value="Cannade">负数发票清单</label>
   							    <label class="checkbox"><input type="checkbox" name="cms" value="US">正数发票废票清单</label>
    							<label class="checkbox"><input type="checkbox" name="cms" value="ES<">负数发票废票清单</label>
							</div>
							
							<div class="box" style="margin-top:10px;text-align: center;">
								<input id="btn_confirm" type="submit" class="btn btn-primary" value="确定"> 
								<input id="btn_cancel" type="button"  class="btn btn-primary" value="取消">
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
    	$(document).ready(function(){
      	//税期	
	   var mon = document.getElementById ('month');
	   mon.options.add(new Option('所有', -1));
	   for ( var i = 1; i < 13; i++)
	   {
		   var option = document.createElement ('option');
		   option.value = i;
		   var txt = document.createTextNode ("第"+i+"期");
		   option.appendChild (txt);
		   mon.appendChild (option);
	   }
      });
    	  
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
      $('#datetimepicker3').datetimepicker({  
        format: 'yyyy年MM月',  
        language: 'zh-CN',  
        pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
      $('#datetimepicker4').datetimepicker({  
        format: 'yyyy年MM月',  
        language: 'zh-CN',  
        pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
      
      $('#datetimepicker5').datetimepicker({  
        format: 'yyyy年MM月',  
        language: 'zh-CN',  
        pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
    </script>
  </body>
</html>
