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
    <title>红字发票信息表填开</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
	<style type="text/css">
		input[type=text]{
			width: 350pximportant;
			border-radius: 4px!important;
		}
		#tablelast .radio{
			color:#ccc;
		}
	</style>
	
	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
	<script type="text/javascript">
function startTime()
{
var today=new Date()
var h=today.getHours()
var m=today.getMinutes()
var s=today.getSeconds()
// add a zero in front of numbers<10
m=checkTime(m)
s=checkTime(s)
document.getElementById('txt').innerHTML=today.getFullYear()+"-"+(today.getMonth()+1)+"-"+today.getDate()+"&nbsp;&nbsp;"+h+":"+m+":"+s
t=setTimeout('startTime()',500)
}

function checkTime(i)
{
if (i<10) 
  {i="0" + i}
  return i
}

		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		$('table tr').click(function(){
       			$('table tr').removeClass('selected');
       			$(this).addClass('selected');
    		});
　　		});
</script>
<script type="text/javascript">
	function Close(){
		$('.widget .tools .icon-remove').parents(".widget").parent().remove();
	}
</script>
  </head>
  
  <body onload="startTime()">
	<div data-spy="scroll" style="height:1500px;overflow:auto; position: relative;">
		<div id="main-content">
			<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN EXAMPLE TABLE widget-->
					<div class="widget blue">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 红字发票信息表填开
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="btn-group" style="float: right;">
								<button class="btn">
									<i class="icon-minus-sign"></i>减行
								</button>
								<button class="btn">
									<i class="icon-plus-sign"></i>增行
								</button>
								<button class="btn">
									<i class="icon-jpy"></i>价格
								</button>
								<button class="btn">
									<i class="icon-edit"></i>编辑
								</button>
								<button class="btn">
									<i class="icon-print"></i>打印
								</button>
								<button class="btn" onclick="Close()">
									<i class="icon-off"></i>退出
								</button>
							</div>
							<p style="color:blue;text-align: center;margin-top: 50px;font-size: 18px;">开具红字增值税专用发票信息表</p>
							<div style="text-align: center;">
								<label style="float:left;">填开日期：</label><div id="txt" style="color:red;float: left;"></div>
								<label style="float:left;margin-left: 150px;">申请方经办人：</label><div style="color:red;float: left;">管理员</div>
								<label style="float:left;margin-left: 150px;">No：</label><div style="color:red;float: left;">661400154453141201153218</div>
							</div>
							
							<table class="table table-bordered">
								<colgroup>
									<col width="20px">
									<col>
									<col width="20px">
									<col>
								</colgroup>
								<tbody>
									<tr>
										<td class="text" style="width: 20px;line-height: 40px;">销<br>售<br>方</td>
										<td>
											<ul>
												<li>
													<label>名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：<input type="text" class="span6"></label>
												</li>
												<li><label>纳税人识别号：<input type="text" class="span6"></label></li>
												<li>
													<label class="radio inline" style="margin-top: -5px;">汉字防伪标志：</label> 
													<label class="radio inline" style="margin-right: 10px;"><input type="radio" name="gender" value="male" checked="checked">是汉字防伪企业</label> 
													<label class="radio inline"><input type="radio" name="gender" value="male" >非汉字防伪企业</label></li>
											</ul></td>
										<td class="text" style="width: 20px;line-height: 40px;">购<br>买<br>方</td>
										<td>
											<ul>
												<li>
													<label>名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：<input type="text" class="span6">
													</label>
												</li>
												<li><label>纳税人识别号：<input type="text" class="span6"></label></li>
											</ul>
										</td>
									</tr>
								</tbody>
							</table>
							<table 
       						class="table table-hover"
       						data-toggle="table"
       						data-height="250">
       						<thead>
       								<th style="width:10px;"></th>
									<th>货物(劳务 服务)名称</th>
									<th>规格型号</th>
									<th>单位</th>
									<th>数量</th>
									<th>单价(不含税)</th>
									<th>金额(不含税)</th>
									<th>税率</th>
									<th>税额</th>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>水产品</td>
									<td>立方</td>
									<td>箱</td>
									<td>1</td>
									<td>115</td>
									<td>128</td>
									<td>17%</td>
									<td>12</td>
								</tr>
								<tr>
									<td>1</td>
									<td>水产品</td>
									<td>立方</td>
									<td>箱</td>
									<td>1</td>
									<td>115</td>
									<td>128</td>
									<td>17%</td>
									<td>12</td>
								</tr>
								<tr>
									<td>1</td>
									<td>水产品</td>
									<td>立方</td>
									<td>箱</td>
									<td>1</td>
									<td>115</td>
									<td>128</td>
									<td>17%</td>
									<td>12</td>
								</tr>
								<tr>
									<td>1</td>
									<td>水产品</td>
									<td>立方</td>
									<td>箱</td>
									<td>1</td>
									<td>115</td>
									<td>128</td>
									<td>17%</td>
									<td>12</td>
								</tr>
								<tr>
									<td>1</td>
									<td>水产品</td>
									<td>立方</td>
									<td>箱</td>
									<td>1</td>
									<td>115</td>
									<td>128</td>
									<td>17%</td>
									<td>12</td>
								</tr>
							</tbody>
       						</table>
							<table class="table table-bordered" style="margin-top:10px;">
								<tbody>
									<tr>
										<td>合&nbsp;&nbsp;&nbsp;&nbsp;计：</td>
										<td>
											<p style="float: left;margin-right: 250px;">金额：&nbsp;&nbsp;&nbsp;&nbsp;￥${ites.items ==0?0.00:ites.items}</p>
											<p>税额：&nbsp;&nbsp;&nbsp;&nbsp;￥${ites.items ==0?0.00:ites.items}</p>
										</td>
									</tr>
								</tbody>
							</table>
							<table class="table table-bordered" id="tablelast">
								<tbody>
									<tr>
										<td class="text" style="width: 20px;line-height: 40px;">说<br>明</td>
										<td>
											<ul>
												<li>
													<label class="radio"><input type="radio" name="gender" value="1" disabled>一、购买方申请</label>
													<ul>
														<li>
															<label>对应蓝字专用发票抵扣增值税销项税额情况：</label>
														</li>
														<li>
															<label class="radio"><input type="radio" name="gender1" value="male" disabled>1、已抵扣</label>
														</li>
														<li>
															<label class="radio"><input type="radio" name="gender1" value="male" disabled>2、未抵扣</label>
															<ul>
																<li>
																	<label class="radio"><input type="radio" name="gender2" value="male" disabled>(1)、无法认证</label>
																</li>
																<li>
																	<label class="radio"><input type="radio" name="gender2" value="male" disabled>(2)、纳税人识别号认证不符</label>
																</li>
																<li>
																	<label class="radio"><input type="radio" name="gender2" value="male" disabled>(3)、增值税专用发票代码、号码认证不符</label>
																</li>
																<li>
																	<label class="radio"><input type="radio" name="gender2" value="male" disabled>(4)、所购货物或劳务、服务不属于增值税扣税项目范围</label>
																</li>
															</ul>
														</li>
													</ul>
												</li>
												<li>
													<label class="radio"><input type="radio" name="gender" value="2" disabled>一、销售方申请</label>
													<ul>
														<li>
															<label class="radio"><input type="radio" name="gender1" value="male" disabled>1、因开票有误购买方拒收的</label>
														</li>
														<li>
															<label class="radio"><input type="radio" name="gender1" value="male" disabled>2、因开票有误等原因尚未交付的</label>
														</li>
													</ul>
												</li>
											</ul>
										</td>
										<td style="text-align: center;">
											<label style="margin-top: 60px;">对应蓝字专用发票密码区内打印的发票信息：</label>
											<label style="margin-left: -50px;">&nbsp;发票代码：&nbsp;&nbsp;&nbsp;&nbsp;${ites.items }</label>
											<label style="margin-left: -50px;">&nbsp;发票号码：&nbsp;&nbsp;&nbsp;&nbsp;${ites.items }</label>
											<label style="margin-left: -50px;">&nbsp;发票种类：&nbsp;&nbsp;&nbsp;&nbsp;${ites.items }</label>
										</td>
									</tr>
								</tbody>
							</table>
							
						</div>
					</div>
					<!-- END EXAMPLE TABLE widget-->
				</div>
			</div>
		</div>
	</div>
  </body>
</html>
