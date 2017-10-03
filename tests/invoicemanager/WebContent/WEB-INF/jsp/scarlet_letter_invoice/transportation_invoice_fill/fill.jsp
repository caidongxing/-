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
    <title>开具红字货物运输业增值税专用发票信息表</title>
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
		#cost th {
			width:10px;
		}
	</style>
	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
	<script type="text/javascript">
	function Update(){
		location="${ctx}/transportationfillController/choice.do";
	}
	function Close(){
		$('.widget .tools .icon-remove').parents(".widget").parent().remove();
	}
	$(document).ready(function(){
		$('.widget .tools .icon-remove').click(function () {
        	$(this).parents(".widget").parent().remove();
    	});
    	
    	$('table tr').click(function(){
       			$('table tr').removeClass('selected');
       			$(this).addClass('selected');
    	});
    	
		var today=new Date();
		document.getElementById('txt').innerHTML=today.getFullYear()+"-"+(today.getMonth()+1)+"-"+today.getDate();
	});
	</script>

  </head>
  
  <body>
    <div data-spy="scroll" style="height:1500px;overflow:auto; position: relative;">
    	<div id="main-content">
    		<div class="row-fluid">
    			<div class="span12">
    				<div class="widget blue">
    					<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 开具红字货物运输业增值税专用发票信息表
							</h4>
							<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
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
									<i class="icon-print"></i>打印
								</button>
								<button class="btn" onclick="Update()">
									<i class="icon-edit"></i>编辑
								</button>
								<button class="btn" onclick="Close()">
									<i class="icon-off"></i>退出
								</button>
							</div>
							<p style="color:blue;text-align: center;margin-top: 50px;font-size: 18px;">开具红字货物运输业增值税专用发票信息表</p>
							<div style="text-align: center;">
								<label style="float:left;">填开日期：</label><div id="txt" style="color:red;float: left;"></div>
								<label style="float:left;margin-left: 200px;">申请方经办人：</label><div style="color:red;float: left;">管理员</div>
								<label style="float:left;margin-left: 200px;">No：</label><div style="color:red;float: left;">661400154453141201153218</div>
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
										<td class="text" style="width: 20px;line-height: 30px;">承<br>运<br>人</td>
										<td>
											<ul>
												<li>
													<label>名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：<input type="text" class="span6"></label>
												</li>
												<li><label>纳税人识别号：<input type="text" class="span6"></label></li>
											</ul>
										</td>
										<td class="text" style="width: 20px;">实<br>际<br>受<br>票<br>方</td>
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
									<tr>
										<td class="text" style="width: 20px;line-height: 30px;">收<br>货<br>人</td>
										<td>
											<ul>
												<li>
													<label>名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：<input type="text" class="span6"></label>
												</li>
												<li><label>纳税人识别号：<input type="text" class="span6"></label></li>
											</ul>
										</td>
										<td class="text" style="width: 20px;line-height: 30px;">发<br>货<br>人</td>
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
							<table class="table table-bordered">
								<colgroup>
									<col width="20px">
									<col>
									<col width="20px">
									<col>
								</colgroup>
								<tbody>
									<tr>
										<td class="text" style="width: 20px;line-height: 30px;">费<br>用<br>项<br>目<br>及<br>金<br>额</td>
										<td style="width:537px;">
											<table class="table table-hover" data-toggle="table" data-height="250" id="cost">
												<thead>
													<th></th>
													<th>费用项目</th>
													<th>金额(不含税)</th>
												</thead>
												<tbody>
													<tr>
														<td></td>
														<td>交通运输费</td>
														<td>12</td>
													</tr>
													<tr>
														<td></td>
														<td>停车费用</td>
														<td>12</td>
													</tr>
													<tr>
														<td></td>
														<td>服务费</td>
														<td>12</td>
													</tr>
												</tbody>
											</table>
										</td>
										<td class="text" style="width: 20px;line-height: 30px;">运<br>输<br>货<br>物<br>信<br>息</td>
										<td>
											<textarea rows="5" cols="1" style="width: 100%;height: 100%;"></textarea>
										</td>
									</tr>
								</tbody>
							</table>
							<table class="table table-bordered">
								<colgroup>
									<col width="50px">
									<col width="150px">
									<col width="50px">
									<col>
									<col width="50px">
									<col width="150px">
									<col width="50px">
									<col>
									<col width="50px">
									<col>
									<col width="50px">
									<col width="80px">
								</colgroup>
								<tbody>
									<tr>
										<td>合计金额</td>
										<td><label style="color:red;">￥0.00</label></td>
										<td>税率</td>
										<td>
											<select style="width:80px;">
                                            	<option value="3%">3%</option>
                                            	<option value="4%">4%</option>
                                            	<option value="5%">5%</option>
                                            	<option value="6%">6%</option>
                                            	<option value="11%">11%</option>
                                            	<option value="13%">13%</option>
                                            	<option value="17%">17%</option>
                                        	</select>
										</td>
										<td>合计税额</td>
										<td><label style="color:red;">￥0.00</label></td>
										<td>机器编号</td>
										<td><label style="color:red;">661400154453</label></td>
										<td>车种车号</td>
										<td><input type="text" class="span6" style="width: 100%;height: 100%;"></td>
										<td>车船吨位</td>
										<td><input type="text" class="span6" style="width: 100%;height: 100%;"></td>
									</tr>
								</tbody>
							</table>
							<table class="table table-bordered" id="tablelast">
								<tbody>
									<tr>
										<td class="text" style="width: 20px;line-height: 40px;"><label style="margin-top: 150px;">说<br>明</label></td>
										<td>
											<ul>
												<li>
													<label class="radio"><input type="radio" name="gender" value="1" disabled>一、实际受票方申请</label>
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
																	<label class="radio"><input type="radio" name="gender2" value="male" disabled>(4)、所购服务不属于增值税扣税项目范围</label>
																</li>
															</ul>
														</li>
													</ul>
												</li>
												<li>
													<label class="radio"><input type="radio" name="gender" value="2" disabled>一、承运人申请</label>
													<ul>
														<li>
															<label class="radio"><input type="radio" name="gender1" value="male" disabled>1、因开票有误受票方拒收的</label>
														</li>
														<li>
															<label class="radio"><input type="radio" name="gender1" value="male" disabled>2、因开票有误等原因尚未交付的</label>
														</li>
													</ul>
												</li>
											</ul>
										</td>
										<td>
											<label style="margin-top: 30px;">对应蓝字货物运输业增值税专用发票密码区内打印的发票信息：</label>
											<label style="margin-left: 30px;">&nbsp;发票代码：&nbsp;&nbsp;&nbsp;&nbsp;${ites.items }</label>
											<label style="margin-left: 30px;">&nbsp;发票号码：&nbsp;&nbsp;&nbsp;&nbsp;${ites.items }</label>
											<label style="margin-left: 30px;">&nbsp;发票种类：&nbsp;&nbsp;&nbsp;&nbsp;${ites.items }</label>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
    				</div>
    			</div>
    		</div>
    	</div>
    </div>
  </body>
</html>
