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
    <title>金税设备状态查询</title>
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
　　		}); 
   	</script>
   	<style type="text/css">
   		.num_ul li{
   			width: 150px;
			float:left;
			margin-right:50px;
			margin-top:15px;
		}
		.text{
			color:blue;
			width: 200px;
		}
		.Groudbox{
			width: 400px;
    		border: 1px solid #ccc;
    		border-radius: 4px!important;
    		padding: 15px;
    		display:inline-block;
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
							<i class="icon-reorder"></i> 金税设备状态查询
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body" style="height: 50%;">
						<div class="tabbable tabs-left">
							<ul class="nav nav-tabs tabs-left" style="width:150px;background: #F8F8F8;height: 100%;">
								<li class="active"><a href="#tab1" data-toggle="tab">金税设备信息</a></li>
								<li><a href="#tab2" data-toggle="tab">增值税专用发票及增值税普通发票</a></li>
								<li><a href="#tab3" data-toggle="tab">货物运输业增值税专用发票</a></li>
								<li><a href="#tab4" data-toggle="tab">机动车销售统一发票</a></li>
							</ul>

							<div class="tab-content">
								<div class="tab-pane active" id="tab1">
									<ul class="num_ul">
										<li>纳税登记号</li>
										<li class="text">110101456789103</li>
										<li>驱动程序版本号</li>
										<li class="text">16.04</li>
									</ul>
									<ul class="num_ul">
										<li>本开票机类型</li>
										<li class="text">主开票机</li>
										<li>底层程序版本号</li>
										<li class="text">SKN6K08K</li>
									</ul>
									<ul class="num_ul">
										<li>分开票机数目</li>
										<li class="text">-</li>
										<li>金税盘编号</li>
										<li class="text">661400154453</li>
									</ul>
									<ul class="num_ul">
										<li>对应开票机号</li>
										<li class="text">0</li>
										<li>报税盘编号</li>
										<li class="text">661400736159</li>
									</ul>
									<ul class="num_ul">
										<li>金税设备当前日期</li>
										<li class="text">2014年11月28日</li>
										<li>报税盘底层版本号</li>
										<li class="text">BSN6K05B</li>
									</ul>
									<ul class="num_ul">
										<li>发票是否用完</li>
										<li class="text">有可用发票</li>
										<li>汉字防伪授权</li>
										<li class="text">有</li>
									</ul>
									<ul class="num_ul">
										<li>上传截止日期</li>
										<li class="text">每月30号</li>
										<li>发行授权信息</li>
										<li class="text">无</li>
									</ul>
									<ul class="num_ul">
										<li>离线时限</li>
										<li class="text">999小时</li>
										<li>报税盘容量</li>
										<li class="text">128M</li>
									</ul>
									<ul class="num_ul">
										<li>授权类型</li>
										<li class="text">石脑油、燃料油企业</li>
										<li></li>
										<li></li>
									</ul>
								</div>
								<div class="tab-pane" id="tab2">
									<div class="Groudbox">
										<label style="position: absolute;margin-top: -25px;">金税盘资料</label>
										<ul style="float: left;">
											<li>是否到抄税期</li>
											<li>是否到锁死期</li>
											<li>专用发票离线限额</li>
											<li>普通发票离线限额</li>
											<li>专用发票离线剩余金额</li>
											<li>普通发票离线剩余金额</li>
											<li>专用发票开票限额</li>
											<li>普通发票开票限额</li>
											<li>锁死日期</li>
											<li>上次报税日期</li>
											<li>抄税起始日期</li>
											<li>报税资料</li>
											<li>报税成功标志</li>
											<li>购入发票信息</li>
											<li>退回发票信息</li>
										</ul>
										<ul class="text" style="float: left;">
											<li>未到抄税期</li>
											<li>未到锁死期</li>
											<li>￥99,999,999,999.00&nbsp;元</li>
											<li>￥99,999,999,999.00&nbsp;元</li>
											<li>￥99,999,999,999.00&nbsp;元</li>
											<li>￥99,999,999,999.00&nbsp;元</li>
											<li>￥99,999,999.99&nbsp;元</li>
											<li>￥99,999,999.99&nbsp;元</li>
											<li>2014年12月14日</li>
											<li>2014年12月01日00时00分</li>
											<li>2015年01月01日</li>
											<li>有</li>
											<li>无</li>
											<li>无</li>
											<li>无</li>
										</ul>
									</div>
									<div class="Groudbox">
										<label style="position: absolute;margin-top: -25px;">报税盘资料</label>
										<ul style="float: left;">
											<li>报税资料</li>
											<li>报税成功标志</li>
											<li>购入发票信息</li>
											<li>退回发票信息</li>
										</ul>
										<ul class="text" style="float: left;">
											<li>无</li>
											<li>无</li>
											<li>无</li>
											<li>无</li>
										</ul>
									</div>
								</div>
								<div class="tab-pane" id="tab3">
									<div class="Groudbox">
										<label style="position: absolute;margin-top: -25px;">金税盘资料</label>
										<ul style="float: left;">
											<li>是否到抄税期</li>
											<li>是否到锁死期</li>
											<li>离线限额</li>
											<li>离线剩余金额</li>
											<li>单张开票限额</li>
											<li>锁死日期</li>
											<li>上次报税日期</li>
											<li>抄税起始日期</li>
											<li>报税资料</li>
											<li>报税成功标志</li>
											<li>购入发票信息</li>
											<li>退回发票信息</li>
										</ul>
										<ul class="text" style="float: left;">
											<li>未到抄税期</li>
											<li>未到锁死期</li>
											<li>￥1,111,111.11&nbsp;元</li>
											<li>￥1,106,111.11&nbsp;元</li>
											<li>￥7,777.11&nbsp;元</li>
											<li>2014年12月15日</li>
											<li>2014年11月14日00时00分</li>
											<li>2014年12月01日</li>
											<li>无</li>
											<li>无</li>
											<li>无</li>
											<li>无</li>
										</ul>
									</div>
									<div class="Groudbox">
										<label style="position: absolute;margin-top: -25px;">报税盘资料</label>
										<ul style="float: left;">
											<li>报税资料</li>
											<li>报税成功标志</li>
											<li>购入发票信息</li>
											<li>退回发票信息</li>
										</ul>
										<ul class="text" style="float: left;">
											<li>无</li>
											<li>无</li>
											<li>无</li>
											<li>无</li>
										</ul>
									</div>
								</div>
								<div class="tab-pane" id="tab4">
									<div class="Groudbox">
										<label style="position: absolute;margin-top: -25px;">金税盘资料</label>
										<ul style="float: left;">
											<li>是否到抄税期</li>
											<li>是否到锁死期</li>
											<li>离线限额</li>
											<li>离线剩余金额</li>
											<li>单张开票限额</li>
											<li>月累计开票限额</li>
											<li>月累计退票限额</li>
											<li>本月已开发票金额</li>
											<li>本月已开退票金额</li>
											<li>锁死日期</li>
											<li>上次报税日期</li>
											<li>抄税起始日期</li>
											<li>报税资料</li>
											<li>报税成功标志</li>
											<li>购入发票信息</li>
											<li>退回发票信息</li>
										</ul>
										<ul class="text" style="float: left;">
											<li>未到抄税期</li>
											<li>未到锁死期</li>
											<li>￥1,111,111.11&nbsp;元</li>
											<li>￥111,111.11&nbsp;元</li>
											<li>￥99,999,999.10&nbsp;元</li>
											<li>￥999,999,999.02&nbsp;元</li>
											<li>￥999,999,999.30&nbsp;元</li>
											<li>￥1,000,000.00&nbsp;元</li>
											<li>￥0.00&nbsp;元</li>
											<li>2014年12月15日</li>
											<li>2014年11月14日13时05分</li>
											<li>2014年12月01日</li>
											<li>无</li>
											<li>无</li>
											<li>无</li>
											<li>无</li>
										</ul>
									</div>
									<div class="Groudbox">
										<label style="position: absolute;margin-top: -25px;">报税盘资料</label>
										<ul style="float: left;">
											<li>报税资料</li>
											<li>报税成功标志</li>
											<li>购入发票信息</li>
											<li>退回发票信息</li>
										</ul>
										<ul class="text" style="float: left;">
											<li>无</li>
											<li>无</li>
											<li>无</li>
											<li>无</li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE widget-->
			</div>
		</div>
	</div>
  </body>
</html>
