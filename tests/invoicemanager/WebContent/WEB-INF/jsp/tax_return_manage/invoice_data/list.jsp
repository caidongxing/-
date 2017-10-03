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
    <title></title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
	<style type="text/css">
		.panel{
			margin-left: -26px;
			background: #F5F5F5;
			margin-bottom:0!important;
		}
		.num_ul li{
			float:left;
			margin-right:40px;
		}
		.text{
			color:blue;
			width: 30px;
		}
		.table th{
			text-align: center;
		}
		.table td{
			text-align: center;
		}
		 
	</style>
  </head>
  
  <body>
    <div data-spy="scroll" style="height:700px;overflow:auto; position: relative;">
		<div id="main-content">
			<div style="height: 10%;">
			<div class="btn-toolbar" style="float:left;margin-left: 10px;">
				<label style="float:left;"><p style="float:left;">选择月份</p>
				<div id="datetimepicker" class="input-append date">
					<input type="text" readonly="" style="width: 110px;padding: 0!important;border-radius: 0px!important;">
					<span class="add-on"> <i data-time-icon="icon-time" data-date-icon="icon-calendar" class="icon-calendar"></i> </span>
				</div></label>

				<label style="float:left;margin-left: 70px;"><p style="float:left;">所属税期</p>
				<select id="month" style="padding: 5px;width: 80px;"></select></label>
				
				<label style="float:left;"><p style="float:left;">查询选项</p>
				<select style="width: 150px;" onchange="showMsg(this)">
					<option value="1">增值税发票汇总表</option>
					<option value="2">正数发票清单</option>
					<option value="3">负数发票清单</option>
					<option value="4">正数发票废票清单</option>
					<option value="5">负数发票废票清单</option>
				</select></label>
				
			</div>
			<div class="btn-toolbar" style="float:right;">
				<div class="btn-group">
					<button class="btn">
						<i class="icon-search"></i>查询
					</button>
					<button class="btn">
						<i class="icon-refresh"></i>刷新
					</button>
					<button class="btn">
						<i class="icon-eye-open"></i>预览打印
					</button>
					<button class="btn" onclick="Continuity_print()">
						<i class="icon-print"></i>连续打印
					</button>
					<button class="btn">
						<i class="icon-building"></i>格式
					</button>
					<button class="btn">
						<i class="icon-print"></i>打印
					</button>
					<button class="btn" onclick="Close()">
						<i class="icon-off"></i>退出
					</button>
				</div>
			</div>
			</div>
			<!--开始 tab -->
			<div class="tabbable">
				<ul class="nav nav-tabs">
					<li class="active"><a href="#tab1" data-toggle="tab">增值税专用发票</a></li>
					<li><a href="#tab2" data-toggle="tab">增值税普通发票</a></li>
					<li><a href="#tab3" data-toggle="tab">货物运输业增值税专用发票</a></li>
					<li><a href="#tab4" data-toggle="tab">机动车销售统一发票</a></li>
					<li><a href="#tab5" data-toggle="tab">电子增值税普通发票</a></li>
					<li><a href="#tab6" data-toggle="tab">增值税普通发票(卷票)</a></li>
				</ul>

				<div class="tab-content">
					<div class="tab-pane active" id="tab1">
						<div class="panel panel-default" >
							<div class="panel-body">
								<ul class="num_ul">
									<li>期初库存份数</li>
									<li class="text">0</li>
									<li>正数发票份数</li>
									<li class="text">11</li>
									<li>负数发票份数</li>
									<li class="text">1</li>
									<li>购进发票份数</li>
									<li class="text">200</li>
									<li>收回发票份数</li>
									<li class="text">59</li>
								</ul>
								<ul class="num_ul" style="margin-top: 20px;">
									<li>期末库存份数</li>
									<li class="text">130</li>
									<li>正数废票份数</li>
									<li class="text" >0</li>
									<li>负数废票份数</li>
									<li class="text">0</li>
									<li>退回发票份数</li>
									<li class="text">0</li>
									<li>分配发票份数</li>
									<li class="text">117</li>
								</ul>
							</div>
						</div>
						<div class="panel panel-default" style="background:#4A8BC2;">
							<div class="panel-body" style="text-align:center;color:white;">税挡资料所属期为&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3月第1期</div>
						</div>
						<!-- begin 增值税发票汇总表table -->
						<div class="table-responsive" style="margin-left: -25px;" id="tb_one">
							<table class="table table-striped table-bordered table-hover">
								<thead>
									<tr>
										<th>项目名称</th>
										<th>合计</th>
										<th>17%</th>
										<th>13%</th>
										<th>6%</th>
										<th>4%</th>
										<th>其他</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>销项正废金额</td>
										<td>0.00</td>
										<td>0.00</td>
										<td>0.00</td>
										<td>0.00</td>
										<td>0.00</td>
										<td>0.00</td>
									</tr>
									<tr>
										<td>销项正数金额</td>
										<td>91413.82</td>
										<td>0.00</td>
										<td>51743.36</td>
										<td>0.00</td>
										<td>0.00</td>
										<td>39670.46</td>
									</tr>
								</tbody>
							</table>
						</div>
						<!-- end 增值税发票汇总表table -->
						<!-- begin 正数发票清单table -->
						<div class="table-responsive" style="margin-left: -25px;display:none;" id="tb_two">
							<table class="table table-striped table-bordered table-hover">
								<thead>
									<tr>
										<th>发票种类</th>
										<th>类别代码</th>
										<th>发票号码</th>
										<th>开票日期</th>
										<th>购方税号</th>
										<th>合计金额</th>
										<th>合计税额</th>
										<th>税率</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>专用发票</td>
										<td>1100044140</td>
										<td>03358176</td>
										<td>2016-03-22</td>
										<td>110102251328333</td>
										<td>50000.00</td>
										<td>6500.00</td>
										<td>13%</td>
									</tr>
									<tr>
										<td>专用发票</td>
										<td>1100044140</td>
										<td>03358177</td>
										<td>2016-03-22</td>
										<td>110102251328546</td>
										<td>1200.00</td>
										<td>156.00</td>
										<td>13%</td>
									</tr>
								</tbody>
							</table>
						</div>
						<!-- end 正数发票清单table -->
					</div>
					<div class="tab-pane" id="tab2">
						<div class="panel panel-default" >
							<div class="panel-body">
								<ul class="num_ul">
									<li>期初库存份数</li>
									<li class="text">0</li>
									<li>正数发票份数</li>
									<li class="text">11</li>
									<li>负数发票份数</li>
									<li class="text">1</li>
									<li>购进发票份数</li>
									<li class="text">200</li>
									<li>收回发票份数</li>
									<li class="text">59</li>
								</ul>
								<ul class="num_ul" style="margin-top: 20px;">
									<li>期末库存份数</li>
									<li class="text">130</li>
									<li>正数废票份数</li>
									<li class="text" >0</li>
									<li>负数废票份数</li>
									<li class="text">0</li>
									<li>退回发票份数</li>
									<li class="text">0</li>
									<li>分配发票份数</li>
									<li class="text">117</li>
								</ul>
							</div>
						</div>
						<div class="panel panel-default" style="background:#4A8BC2;">
							<div class="panel-body" style="text-align:center;color:white;">税挡资料所属期为&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3月第1期</div>
						</div>
						<!-- begin table -->
						
						<!-- end table -->
					</div>
					<div class="tab-pane" id="tab3">
						<div class="panel panel-default" >
							<div class="panel-body">
								<ul class="num_ul">
									<li>期初库存份数</li>
									<li class="text">0</li>
									<li>正数发票份数</li>
									<li class="text">11</li>
									<li>负数发票份数</li>
									<li class="text">1</li>
									<li>购进发票份数</li>
									<li class="text">200</li>
									<li>收回发票份数</li>
									<li class="text">59</li>
								</ul>
								<ul class="num_ul" style="margin-top: 20px;">
									<li>期末库存份数</li>
									<li class="text">130</li>
									<li>正数废票份数</li>
									<li class="text" >0</li>
									<li>负数废票份数</li>
									<li class="text">0</li>
									<li>退回发票份数</li>
									<li class="text">0</li>
									<li>分配发票份数</li>
									<li class="text">117</li>
								</ul>
							</div>
						</div>
						<div class="panel panel-default" style="background:#4A8BC2;">
							<div class="panel-body" style="text-align:center;color:white;">税挡资料所属期为&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3月第1期</div>
						</div>
						<!-- begin table -->
						
						<!-- end table -->
					</div>
					<div class="tab-pane" id="tab4">
						<div class="panel panel-default" >
							<div class="panel-body">
								<ul class="num_ul">
									<li>期初库存份数</li>
									<li class="text">0</li>
									<li>正数发票份数</li>
									<li class="text">11</li>
									<li>负数发票份数</li>
									<li class="text">1</li>
									<li>购进发票份数</li>
									<li class="text">200</li>
									<li>收回发票份数</li>
									<li class="text">59</li>
								</ul>
								<ul class="num_ul" style="margin-top: 20px;">
									<li>期末库存份数</li>
									<li class="text">130</li>
									<li>正数废票份数</li>
									<li class="text" >0</li>
									<li>负数废票份数</li>
									<li class="text">0</li>
									<li>退回发票份数</li>
									<li class="text">0</li>
									<li>分配发票份数</li>
									<li class="text">117</li>
								</ul>
							</div>
						</div>
						<div class="panel panel-default" style="background:#4A8BC2;">
							<div class="panel-body" style="text-align:center;color:white;">税挡资料所属期为&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3月第1期</div>
						</div>
						<!-- begin table -->
						
						<!-- end table -->
					</div>
					<div class="tab-pane" id="tab5">
						<div class="panel panel-default" >
							<div class="panel-body">
								<ul class="num_ul">
									<li>期初库存份数</li>
									<li class="text">0</li>
									<li>正数发票份数</li>
									<li class="text">11</li>
									<li>负数发票份数</li>
									<li class="text">1</li>
									<li>购进发票份数</li>
									<li class="text">200</li>
									<li>收回发票份数</li>
									<li class="text">59</li>
								</ul>
								<ul class="num_ul" style="margin-top: 20px;">
									<li>期末库存份数</li>
									<li class="text">130</li>
									<li>正数废票份数</li>
									<li class="text" >0</li>
									<li>负数废票份数</li>
									<li class="text">0</li>
									<li>退回发票份数</li>
									<li class="text">0</li>
									<li>分配发票份数</li>
									<li class="text">117</li>
								</ul>
							</div>
						</div>
						<div class="panel panel-default" style="background:#4A8BC2;">
							<div class="panel-body" style="text-align:center;color:white;">税挡资料所属期为&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3月第1期</div>
						</div>
						<!-- begin table -->
						
						<!-- end table -->
					</div>
					<div class="tab-pane" id="tab6">
						<div class="panel panel-default" >
							<div class="panel-body">
								<ul class="num_ul">
									<li>期初库存份数</li>
									<li class="text">0</li>
									<li>正数发票份数</li>
									<li class="text">11</li>
									<li>负数发票份数</li>
									<li class="text">1</li>
									<li>购进发票份数</li>
									<li class="text">200</li>
									<li>收回发票份数</li>
									<li class="text">59</li>
								</ul>
								<ul class="num_ul" style="margin-top: 20px;">
									<li>期末库存份数</li>
									<li class="text">130</li>
									<li>正数废票份数</li>
									<li class="text" >0</li>
									<li>负数废票份数</li>
									<li class="text">0</li>
									<li>退回发票份数</li>
									<li class="text">0</li>
									<li>分配发票份数</li>
									<li class="text">117</li>
								</ul>
							</div>
						</div>
						<div class="panel panel-default" style="background:#4A8BC2;">
							<div class="panel-body" style="text-align:center;color:white;">税挡资料所属期为&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3月第1期</div>
						</div>
						<!-- begin table -->
						
						<!-- end table -->
					</div>
				</div>
			</div>
			<!--结束 tab -->
			
		</div>
	</div>
	
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
      
      function showMsg(obj) {
    	 var opt = obj.options[obj.selectedIndex]
    	 if(opt.value==1){
    	 	$(".table-responsive").css("display","none");
    	 	$(".panel").css("display","block");
    	 	$("#tb_one").css("display","block");
    	 }else if(opt.value==2){
    	 	$(".table-responsive").css("display","none");
    	 	$(".panel").css("display","none");
    	 	$("#tb_two").css("display","block");
    	 }else{
    	 	
    	 }
 	  }
 	  
 	  function Continuity_print(){
 	  	location="${ctx}/invoicedataController/print.do";
 	  }
    </script>
  </body>
</html>
