<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8" />
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="Mosaddek" name="author" />

<style type="text/css">
.select2-container {
	margin-left: -1px !important;
}

.unstyled li {
	cursor: pointer;
}
</style>

</head>

<body>
	<div class='container-fluid'>
		<div class='row-fluid' id='content-wrapper'>
			<div class='span12'>
				<div class='page-header'>
					<h1 class='pull-left'>
						<i class='icon-table'></i> <span>订单处理</span>
					</h1>
					<div class="pull-right">
						<ul class='breadcrumb'>
							<li><a href='${ctx}'><i class='icon-table'></i> </a></li>
							<li class='separator'><i class='icon-angle-right'></i></li>
							<li>订单处理</li>
							<li class='separator'><i class='icon-angle-right'></i></li>
							<li>客人信息列表</li>
							<li class='separator'><i class='icon-angle-right'></i></li>
							<li class='active'>客人信息</li>
						</ul>
					</div>
				</div>


				<div class='row-fluid'>
					<div class='box-content'>
						<form id="form" class="form-horizontal">

							<input type="hidden" name="roomreservationid" value="${roomreservation.roomreservationid}">
							<input type="hidden" name="detailid" value="${detail.detailid}">
							<input type="hidden" name="otherinfoid" value="${otherinfo.otherinfoid}">
							
							<div class="row-fluid">
								<div style="text-align: center;">
									<div class='span3'>
										<label class='span4' style="line-height: 30px">订单号:</label> <input
											class='span8' name="reservationnumber" type="text"
											value="${roomreservation.reservationnumber}" placeholder="订单号"
											readonly="readonly" />
									</div>
									<div class='span3'>
										<label class='span2' style="line-height: 30px">部门:</label>
										<input class='span10' name="department" value="${roomreservation.department}" readonly="readonly" type="text" placeholder="部门" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">预订类型:</label> <select
											class='span8' name="reservationtype" id="reservationtype">
											<option value="1" ${roomreservation.reservationtype eq 1 ?"selected='selected'" :""}>一般预订</option>
											<option value="2" ${roomreservation.reservationtype eq 2 ?"selected='selected'" :""}>团会预订</option>
											<option value="3" ${roomreservation.reservationtype eq 3 ?"selected='selected'" :""}>贵宾预订</option>
											<option value="4" ${roomreservation.reservationtype eq 4 ?"selected='selected'" :""}>代理预订</option>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">销售员:</label> <select
											class='span8' name="salesmanid" id="salesmanid">
											<option value="">---销售员---</option>
											<c:forEach items="${salesman}" var="item">
												<option value="${item.salesmanid}" ${item.salesmanid eq roomreservation.salesmanid ?"selected='selected'" :""}>${item.salesmanname}</option>
											</c:forEach>
										</select>
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span6'>
										<label class='span2' style="line-height: 30px">协议客户:</label> <select
											class='span10 select2' multiple="multiple"
											name="agreementclientid" id="agreementclientid"
											placeholder="协议客户">
											<c:forEach items="${agreementclient}" var="item">
												<option value="${item.agreementclientid}" ${item.agreementclientid eq roomreservation.agreementclientid ?"selected='selected'" :""}>${item.agreementclientname}</option>
											</c:forEach>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">联系人:</label> <input
											class='span8' name="contacts" value="${roomreservation.contacts}" readonly="readonly" type="text" placeholder="联系人" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">房间等级:</label> <select
											class='span8' name="roomtype" id="roomtype">
											<c:forEach items="${roomtype}" var="item">
												<option value="${item.roomtypeid}" ${item.roomtypeid eq
													detail.roomtype ? "selected='selected'" :""}>${item.roomtypename}</option>
											</c:forEach>
										</select>
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span6'>
										<label class='span2' style="line-height: 30px">团会名称:</label> <select
											class='span10 select2' multiple="multiple" name="teamid"
											id="teamid" placeholder="团会名称">
											<c:forEach items="${team}" var="item">
												<option value="${item.teamid}" ${item.teamid eq
													roomreservation.salesmanid ? "selected='selected'" :""}>${item.teamname}</option>
											</c:forEach>
										</select>

									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">电话:</label> <input
											class='span8' name="phone" value="${item.phone}" type="text" placeholder="电话" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">市场:</label> <select
											class='span8' name="marketid" id="marketid">
											<option value="1" ${roomreservation.marketid eq 1 ? "selected='selected'" :""}>门市</option>
											<option value="2" ${roomreservation.marketid eq 2 ? "selected='selected'" :""}>忙市</option>
											<option value="3" ${roomreservation.marketid eq 3 ? "selected='selected'" :""}>闲市</option>
										</select>
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span3'>
										<label class='span4' style="line-height: 30px">到店日期:</label> <input
											class="span8 Wdate" type="text" name="arrivedate" readonly="readonly"
											value="<fmt:formatDate value='${detail.arrivedate}' pattern='yyyy-MM-dd'/>" id="arrivedate"  placeholder="到店日期"
											onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'2020-10-01'})" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">离店日期:</label> <input
											class="span8 Wdate" type="text" name="leavedate" value="<fmt:formatDate value='${detail.leavedate}' pattern='yyyy-MM-dd'/>" 
											id="leavedate" required placeholder="离店日期" required
											onFocus="WdatePicker({minDate:'new Date()',maxDate:'2020-10-01'})" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">客源:</label> <select
											class='span8' name="clientsourceid" id="clientsourceid">
											<option value="1" ${roomreservation.clientsourceid eq 1 ? "selected='selected'" :""}>散客</option>
											<option value="2" ${roomreservation.clientsourceid eq 2 ? "selected='selected'" :""}>团会</option>
											<option value="3" ${roomreservation.clientsourceid eq 3 ? "selected='selected'" :""}>会议</option>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">签单模板:</label> <select
											class='span8' name="signbilltemplateid"
											id="signbilltemplateid">
											<option value="">---签单模板---</option>
											<c:forEach items="${aignbilltemplate}" var="item">
												<option value="${item.signbilltemplateid}" ${item.signbilltemplateid eq roomreservation.signbilltemplateid ? "selected='selected'" :""}>${item.templatename}</option>
											</c:forEach>
										</select>
									</div>
								</div>
							</div>


							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span3'>
										<label class='span4' style="line-height: 30px">房价代码:</label> <select
											class='span8' name="roompricecodeid" id="roompricecodeid">
											<option value="1" ${detail.roompricecodeid eq 1 ? "selected='selected'" :""}>门市价</option>
											<option value="2" ${detail.roompricecodeid eq 2 ? "selected='selected'" :""}>散客价</option>
											<option value="3" ${detail.roompricecodeid eq 3 ? "selected='selected'" :""}>团会价</option>
											<option value="4" ${detail.roompricecodeid eq 4 ? "selected='selected'" :""}>代理价</option>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">实际/标准:</label>
										<input class='span4' name="realprice" type="number" value="${detail.realprice}"
											placeholder="实际价格" readonly="readonly" /> <input class='span4'
											name="standardprice" value="${detail.standardprice}" type="number" readonly="readonly" placeholder="标准价格" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">币种代码:</label> <select
											class='span8' name="currencytype" id="currencytype">
											<option value="1" ${detail.currencytype eq 1 ? "selected='selected'" :""}>人民币</option>
											<option value="2" ${detail.currencytype eq 2 ? "selected='selected'" :""}>美元</option>
											<option value="3" ${detail.currencytype eq 3 ? "selected='selected'" :""}>欧元</option>
											<option value="4" ${detail.currencytype eq 4 ? "selected='selected'" :""}>日元</option>
											<option value="5" ${detail.currencytype eq 5 ? "selected='selected'" :""}>法郎</option>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">VIP:</label> <select
											class='span8' name="viptypeid" id="viptypeid">
											<option value="">---VIP--</option>
											<option value="1" ${roomreservation.viptypeid eq 1 ? "selected='selected'" :""}>蓝钻</option>
											<option value="2" ${roomreservation.viptypeid eq 2 ? "selected='selected'" :""}>黄钻</option>
											<option value="3" ${roomreservation.viptypeid eq 3 ? "selected='selected'" :""}>蓝冠</option>
											<option value="4" ${roomreservation.viptypeid eq 4 ? "selected='selected'" :""}>皇冠</option>
										</select>
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span3'>
										<label class='span4' style="line-height: 30px">房数/免床:</label>
										<input class='span4' name="roomnumber" value="${detail.roomnumber}" type="number"
										readonly="readonly"	placeholder="房数" required /> <input class='span4'
											name="freebed" value="${detail.freebed}" readonly="readonly" type="number" placeholder="免床" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">成人/儿童:</label>
										<input class='span4' name="adult" value="${detail.adult}" readonly="readonly" type="number"
											placeholder="成人" required /> <input class='span4'
											name="children" value="${detail.children}" readonly="readonly" type="number" placeholder="儿童" />
									</div>
									
									<div class='span3'>
										<label class='span4' style="line-height: 30px">餐标:</label> <input
											class='span8' name="standardmeal" value="${roomreservation.standardmeal}" type="text"
											placeholder="餐标" />
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="margin-top: 5px;">
									<div class='span12'>
										<label class='span1'
											style="line-height: 30px;text-align: right;">备注:</label> <input
											class='span11' name="comment" value="${detail.comment}" type="text" placeholder="备注" />
									</div>
								</div>
							</div>


							<div class='row-fluid'>
								<div class='tabbable'>
									<ul class='nav nav-tabs'>
										<li class='active'><a data-toggle='tab' href='#tab1'>
												<i class='icon-user'></i> 基本信息 </a></li>
										<li><a data-toggle='tab' href='#tab2'> <i
												class='icon-edit text-red'></i> 其他信息 </a></li>

									</ul>
									<div class='tab-content'>
										<div class='tab-pane active' id='tab1'>
											<div class="row-fluid" style="background-color: lightcyan"
												id="OtherInfo">
												<div class="row-fluid">
													<div class='span3'>
														<label class='span4' style="line-height: 30px">中文名:</label>
														<input class='span8' name="chinesename" id="chinesename" value="${clientinfo.chinesename}"
															type="text" placeholder="中文名" required/>
														<input type="hidden" value="${clientinfo.clientinfoid}" name="clientinfoid" id="clientinfoid">
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">证件类型:</label>
														<select class='span8' name="idtypeid" id="idtypeid">
															<option value="1" ${clientinfo.idtypeid eq 1 ? "selected='selected'" :""}>身份证</option>
															<option value="2" ${clientinfo.idtypeid eq 2 ? "selected='selected'" :""}>外交护照</option>
															<option value="3" ${clientinfo.idtypeid eq 3 ? "selected='selected'" :""}>工作证</option>
															<option value="4" ${clientinfo.idtypeid eq 4 ? "selected='selected'" :""}>学生证</option>
														</select>
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">国籍:</label>
														<select class='span8' name="nationalityid"
															id="nationalityid">
															<option value="1" ${clientinfo.nationalityid eq 1 ? "selected='selected'" :""}>中国</option>
															<option value="2" ${clientinfo.nationalityid eq 2 ? "selected='selected'" :""}>美国</option>
															<option value="3" ${clientinfo.nationalityid eq 3 ? "selected='selected'" :""}>日本</option>
															<option value="4" ${clientinfo.nationalityid eq 4 ? "selected='selected'" :""}>英国</option>
														</select>
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">地区:</label>
														<input class='span8' name="area" id="area" value="${clientinfo.area}"
															type="text" placeholder="地区" />
													</div>
												</div>

												<div class="row-fluid" style="margin-top: 15px;">
													<div class='span3'>
														<label class='span4' style="line-height: 30px">英文名:</label>
														<input class='span8' name="englishname" id="englishname" value="${clientinfo.englishname}"
															type="text" placeholder="英文名" />
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">证件号码:</label>
														<input class='span8' name="idnumber" id="idnumber" value="${clientinfo.idnumber}"
															type="text" placeholder="证件号码" required/>
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">生日:</label>
														<input class="span8 Wdate" type="text" name="birthday" id="birthday" 
														value="<fmt:formatDate value='${clientinfo.birthday}' pattern='yyyy-MM-dd'/>"
														onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'2020-10-01'})" />
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">工作单位:</label>
														<input class='span8' name="workunit" id="workunit" value="${clientinfo.workunit}"
															type="text" placeholder="工作单位" />
													</div>
												</div>

												<div class="row-fluid" style="margin-top: 15px;">
													<div class='span3'>
														<label class='span4' style="line-height: 30px">英文姓:</label>
														<input class='span8' name="familyname" id="familyname" value="${clientinfo.familyname}"
															type="text" placeholder="英文姓" />
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">签证类型:</label>
														<select class='span8' name="visatypeid" id="visatypeid">
															<option value="1" ${clientinfo.visatypeid eq 1 ? "selected='selected'" :""}>职业签证</option>
															<option value="2" ${clientinfo.visatypeid eq 2 ? "selected='selected'" :""}>外交签证</option>
															<option value="3" ${clientinfo.visatypeid eq 3 ? "selected='selected'" :""}>公务签证</option>
															<option value="4" ${clientinfo.visatypeid eq 4 ? "selected='selected'" :""}>普通签证</option>
														</select>
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">民族:</label>
														<select class='span8' name="nationid" id="nationid">
															<option value="1" ${clientinfo.nationid eq 1 ? "selected='selected'" :""}>汉族</option>
															<option value="2" ${clientinfo.nationid eq 2 ? "selected='selected'" :""}>壮族</option>
															<option value="3" ${clientinfo.nationid eq 3 ? "selected='selected'" :""}>满族</option>
															<option value="4" ${clientinfo.nationid eq 4 ? "selected='selected'" :""}>苗族</option>
															<option value="5" ${clientinfo.nationid eq 5 ? "selected='selected'" :""}>藏族</option>
															<option value="6" ${clientinfo.nationid eq 6 ? "selected='selected'" :""}>蒙古族</option>
														</select>
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">籍贯:</label>
														<select class='span8' name="nativeplaceid" id="nativeplaceid">
															<option value="1" ${clientinfo.nativeplaceid eq 1 ? "selected='selected'" :""}>广东</option>
															<option value="2" ${clientinfo.nativeplaceid eq 2 ? "selected='selected'" :""}>广西</option>
															<option value="3" ${clientinfo.nativeplaceid eq 3 ? "selected='selected'" :""}>北京</option>
															<option value="4" ${clientinfo.nativeplaceid eq 4 ? "selected='selected'" :""}>河南</option>
															<option value="5" ${clientinfo.nativeplaceid eq 5 ? "selected='selected'" :""}>河北</option>
															<option value="6" ${clientinfo.nativeplaceid eq 6 ? "selected='selected'" :""}>澳门</option>
														</select>
													</div>
												</div>

												<div class="row-fluid" style="margin-top: 15px;">
													<div class='span3'>
														<label class='span4' style="line-height: 30px">性别:</label>
														<select class='span8' name="sex" id="sex">
															<option value="1" ${clientinfo.sex eq 1 ? "selected='selected'" :""}>男</option>
															<option value="2" ${clientinfo.sex eq 2 ? "selected='selected'" :""}>女</option>
														</select>
													</div>
													<div class='span3'>
														<label class='span4' style="line-height: 30px">签证期限:</label>
														<input class="span8 Wdate" type="text" name="visadate" id="visadate" value="${clientinfo.visadate}"
															onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'2020-10-01'})" />
													</div>
													<div class='span6'>
														<label class='span2' style="line-height: 30px">地址:</label>
														<input class="span10" type="text" name="address" id="address" value="${clientinfo.address}" />
													</div>

												</div>

											</div>
										</div>
										<div class='tab-pane' id='tab2'>
											<div class="row-fluid" style="background-color: lightcyan"
												id="OtherInfo">
												<div class="row-fluid">
													<div class='title'>
														<span>1、会员信息</span>
													</div>
													<div class="row-fluid">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">会员卡号:</label>
											<input class='span8' name="membercardnumber" value="${otherinfo.membercardnumber}" id="membershipcardnumber" type="text"
											${!empty otherinfo.membercardnumber ? "readonly='readonly'" :""}
												oninput="OnMembershipcardInput(event)"  onpropertychange="OnMembershipcardChanged(event)" placeholder="会员卡号" />
											<input type="hidden" name="membercardid" value="${otherinfo.membercardid}" id="membershipcardid">
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">类型:</label> <select
												class='span8' name="membercardtype" id="membershipcardtype">
												<option value="">--类型--</option>
												<option value="1" ${otherinfo.membercardtype eq 1 ? "selected='selected'" : ""}>银卡</option>
												<option value="2" ${otherinfo.membercardtype eq 2 ? "selected='selected'" : ""}>金卡</option>
												<option value="3" ${otherinfo.membercardtype eq 3 ? "selected='selected'" : ""}>黑卡</option>
												<option value="4" ${otherinfo.membercardtype eq 4 ? "selected='selected'" : ""}>钻卡</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">名称:</label>
											<input class='span8' name="membercardname" value="${otherinfo.membercardname}" id="membershipcardname" type="text"
												${!empty otherinfo.membercardname ? "readonly='readonly'" :""} placeholder="名称" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">余额:</label>
											 <input class='span8' name="balance" value="${otherinfo.balance}"
												${!empty otherinfo.balance ? "readonly='readonly'" :""} id="balance" type="number" placeholder="余额" />
										</div>
									</div>
													<div class="row-fluid">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">信用卡号:</label>
											<input class='span8' name="creditcardnumber" value="${otherinfo.creditcardnumber}" id="creditcardnumber" type="text"
											${!empty otherinfo.creditcardnumber ? "readonly='readonly'" :""}
											oninput="OnCreditcardInput(event)"  onpropertychange="OnCreditcardChanged(event)" placeholder="信用卡号" />
											<input type="hidden" name="creditcardid" value="${otherinfo.creditcardid}" id="creditcardid">
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">类型:</label>
											 <select class='span8' name="creditcardtype" id="creditcardtype">
												<option value="">--类型--</option>
												<option value="1" ${otherinfo.creditcardtype eq 1 ? "selected='selected'" : ""}>普通</option>
												<option value="2" ${otherinfo.creditcardtype eq 2 ? "selected='selected'" : ""}>贵宾</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">有效期:</label> <input
												class="span8 Wdate" type="text" name="validitydate"value="<fmt:formatDate value='${otherinfo.validitydate}' pattern='yyyy-MM-dd'/>" id="validitydate"
												id="validitydate" placeholder="有效期"  ${!empty otherinfo.validitydate ? "readonly='readonly'" :""}
												onFocus="WdatePicker({maxDate:'2020-10-01'})" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">限额:</label>
											 <input class='span8' name="quota" value="${otherinfo.quota}"
											 ${!empty otherinfo.quota ? "readonly='readonly'" :""} id="quota" type="number" placeholder="限额" />
										</div>
									</div>
												</div>

												<div class="row-fluid">
									<div class='title'>
										<span>2、备注信息</span>
									</div>
									<div class="row-fluid">
										<div class='span6'>
											<label class='span2' style="line-height: 30px">接待:</label> <input
												class='span10' name="reception" value="${otherinfo.reception}" type="text"
												placeholder="接待备注" />
										</div>
										<div class='span6'>
											<label class='span2' style="line-height: 30px">结账:</label> <input
												class='span10' name="settleaccounts" value="${otherinfo.settleaccounts}" type="text"
												placeholder="结账备注" />
										</div>
									</div>
									<div class="row-fluid">
										<div class='span6'>
											<label class='span2' style="line-height: 30px">客房:</label> <input
												class='span10' name="room" value="${otherinfo.room}" type="text" placeholder="客房备注" />
										</div>
										<div class='span6'>
											<label class='span2' style="line-height: 30px">消费:</label> <input
												class='span10' name="consumption" value="${otherinfo.consumption}" type="text"
												placeholder="消费备注" />
										</div>
									</div>
								</div>

												<div class="row-fluid">
									<div class='title'>
										<span>3、其他信息</span>
									</div>
									<div class="row-fluid">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">收费标志:</label>
											<select class='span8' name="chargelogo" id="chargelogo">
												<option value="">--收费标志--</option>
												<option value="1" ${otherinfo.chargelogo eq 1 ? "selected='selected'" :""}>普通</option>
												<option value="2" ${otherinfo.chargelogo eq 2 ? "selected='selected'" :""}>贵宾</option>
												<option value="3" ${otherinfo.chargelogo eq 3 ? "selected='selected'" :""}>特殊</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">折扣代码:</label>
											<select class='span8' name="discountcode" id="discountcode">
												<option value="">--折扣代码--</option>
												<option value="1" ${otherinfo.discountcode eq 1 ? "selected='selected'" :""}>活动折扣</option>
												<option value="2" ${otherinfo.discountcode eq 2 ? "selected='selected'" :""}>店庆折扣</option>
												<option value="3" ${otherinfo.discountcode eq 3 ? "selected='selected'" :""}>假日折扣</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">预订方式:</label>
											<select class='span8' name="reservationway"
												id="reservationway">
												<option value="">--预订方式--</option>
												<option value="1" ${otherinfo.reservationway eq 1 ? "selected='selected'" :""}>电话</option>
												<option value="2" ${otherinfo.reservationway eq 2 ? "selected='selected'" :""}>网络</option>
												<option value="3" ${otherinfo.reservationway eq 3 ? "selected='selected'" :""}>代理</option>
											</select>
										</div>
									</div>

									<div class="row-fluid">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">确认方式:</label>
											<select class='span8' name="affirmway" id="affirmway">
												<option value="">--确认方式--</option>
												<option value="1" ${otherinfo.affirmway eq 1 ? "selected='selected'" :""}>电话确认</option>
												<option value="2" ${otherinfo.affirmway eq 2 ? "selected='selected'" :""}>网络确认</option>
												<option value="3" ${otherinfo.affirmway eq 3 ? "selected='selected'" :""}>代理确认</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">到达航班:</label>
											<input class='span8' name="arrivegrogshopflight" value="${otherinfo.arrivegrogshopflight}" type="text"
												placeholder="到达航班" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px;">离店航班:</label>
											<input class='span8' name="leavegrogshopflight" value="${otherinfo.leavegrogshopflight}" type="text"
												placeholder="离店航班" />
										</div>
									</div>
								</div>

											</div>
										</div>
									</div>
								</div>
							</div>

						<div class="row-fluid">
								<div class="pull-right">
									<a class="btn btn-info"><i class="icon-search icon-white"></i><span>身份证扫描</span> </a>
									<button type="submit" class="btn btn-primary">
										<i class="icon-save"></i><span>保存</span>
									</button>
									<a class="btn btn-warning" onclick="GoBackList('${ctx}/indentClientController/list.do')"><i class="icon-remove"></i><span>关闭</span>
									</a>
								</div>
							</div>
						</form>
					</div>

				</div>

			</div>
		</div>
	</div>

<div id="membershipcard" class="span5 box" style="position: absolute;z-index: 9999;left: 24%;top: 37%;display: none;">
		<div class='row-fluid'>
			<div class='span12 box' style="border:1px solid;">
				<div class='box-header blue-background'>
					<div class='title'>
						<i class='icon-group'></i>会员卡信息
					</div>
					<div class='actions'>
						<a onclick="hidenMembershipcard()" class="btn box-remove btn-mini btn-link"><i
							class='icon-remove'></i> </a>
					</div>
				</div>
				<div class='box-content'>
					<div class='row-fluid'>
						<div class='responsive-table'>
							<div class='scrollable-area'>
								<table id="membershipcardtb" class='table table-bordered table-hover table-striped'
									style='margin-bottom:0;'>
									<thead>
										<tr>
											<th>选择</th>
											<th>会员卡号</th>
											<th>卡类型</th>
											<th hidden>类型</th>
											<th>卡名称</th>
											<th>余额</th>
										</tr>
									</thead>
									<tbody>

									</tbody>
								</table>
							</div>
						</div>

					</div>

				</div>
			</div>

		</div>
	</div>
	
	<div id="creditcard" class="span5 box" style="position: absolute;z-index: 9999;left: 24%;top: 37%;display: none;">
		<div class='row-fluid'>
			<div class='span12 box' style="border:1px solid;">
				<div class='box-header blue-background'>
					<div class='title'>
						<i class='icon-group'></i>信用卡信息
					</div>
					<div class='actions'>
						<a onclick="hidenCreditcard()" class="btn box-remove btn-mini btn-link"><i
							class='icon-remove'></i> </a>
					</div>
				</div>
				<div class='box-content'>
					<div class='row-fluid'>
						<div class='responsive-table'>
							<div class='scrollable-area'>
								<table id="creditcardtb" class='table table-bordered table-hover table-striped'
									style='margin-bottom:0;'>
									<thead>
										<tr>
											<th>选择</th>
											<th>信用卡号</th>
											<th>信用卡类型</th>
											<th hidden>类型</th>
											<th>有效期</th>
											<th>限额</th>
										</tr>
									</thead>
									<tbody>

									</tbody>
								</table>
							</div>
						</div>

					</div>

				</div>
			</div>

		</div>
	</div>

</body>
</html>

<script type="text/javascript">
	$(function(){
  
  $("#form").validate({
     submitHandler: function(form) {  //通过之后回调 
        saveClientinfo();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
     }
   });
})

//保存客人信息
function saveClientinfo(){
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/indentClientController/saveClientinfo.do',
        data:$('#form').serialize(),// 你的formid
        async: false,
		success : function(data) {
		  layer.msg("保存成功！", {icon: 1});
		  $('#content').empty();
		  $('#content').append(data);
		},
		error: function(request) {
          $('#content').empty();
		  $('#content').append(data);
        }
	});
 }
 //返回list界面
 function GoBackList(path){
    $.ajax({
		cache: true,
		type: "POST",
		url : path,
		success : function(data) {
		  $('#content').empty();
		  $('#content').append(data);
		},
		error: function(request) {
          $('#content').empty();
		  $('#content').append(data);
        }
	});
 }
 
$("#choosehouseclaim").select2();//多选下拉框
$("#teamid").select2();
$("#agreementclientid").select2(); 
 
 
  function hidenClientInfo(){
    $("#clientinfo").css("display","none");
 }
 
function OnInput (event) {
if(event.target.value.length >= 2){
  selectClientinfo(event.target.value);
}
    
}


function hidenMembershipcard(){
$("#membershipcard").css("display","none");
}

function OnMembershipcardInput (event) {
if(event.target.value.length >= 6){
  selectMembershipcard(event.target.value);
}
    
}
function OnMembershipcardChanged (event) {
  if(event.propertyName.toLowerCase () == "value") {
    if(event.srcElement.value.length >= 6){
       selectMembershipcard(event.srcElement.value);
     }
   }
}
function selectMembershipcard(value){
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/roomReservationController/findBymembershipcardNumber.do?Number='+ value,
        async: false,
        contentType : "application/json;charset=utf-8;",
		success : function(data) {
		  var dt = eval(data);
		  
		  if(dt.length > 0){
		    var tb = document.getElementById("membershipcardtb");
			var length= tb.rows.length;             //获得Table下的行数
			var colums = tb.rows[0].cells.length;
		    if(length > 0){
				for(var i=length-1;i > 0;i--){
				    tb.deleteRow(i);  //如果有行，则清空
				}
			}
		    for (var k = 0; k < dt.length; k++) {
				var r = tb.insertRow();//添加行
				for ( var j = 0; j < colums; j++) {
				  r.insertCell();//添加单元格
				}
				var membercardtype = null;
				if(dt[k].membercardtype ==1){
				  membercardtype = "银卡";
				}else if (dt[k].membercardtype ==2) {
				   membercardtype = "金卡";
				}else if (dt[k].membercardtype ==3) {
				   membercardtype = "黑卡";
				}else if (dt[k].membercardtype ==4) {
				   membercardtype = "钻卡";
				}
				
				r.cells[0].innerHTML = "<button class='btn btn-warning btn-small' value="+dt[k].membercardid+" onclick='chooseMembershipcard(this)'><i class='icon-ok icon-white'></i></button>"
				r.cells[1].innerHTML = dt[k].membercardnumber;
				r.cells[2].innerHTML = membercardtype;
				r.cells[3].hidden=true;//隐藏id列
				r.cells[3].innerHTML = dt[k].membercardtype;
				r.cells[4].innerHTML = dt[k].membercardname;
				r.cells[5].innerHTML = dt[k].balance;
			}
			
		    $('#membershipcard').css("display","block");
		  }
		},
		error: function(request) {
          alert ("出现异常！");
        }
	});
}
function chooseMembershipcard(e){
   var tr = e.parentNode.parentNode;
   document.getElementById("membershipcardid").value = e.value;
   document.getElementById("membershipcardnumber").value = tr.cells[1].innerHTML;
   document.getElementById("membershipcardtype").value = tr.cells[3].innerHTML;
   document.getElementById("membershipcardname").value = tr.cells[4].innerHTML;
   document.getElementById("balance").value = tr.cells[5].innerHTML;
   $("#membershipcard").css("display","none");
}

function hidenCreditcard(){
$("#creditcard").css("display","none");
}
function OnCreditcardInput (event) {
if(event.target.value.length >= 6){
  selectCreditcard(event.target.value);
}
    
}
function OnCreditcardChanged (event) {
  if(event.propertyName.toLowerCase () == "value") {
    if(event.srcElement.value.length >= 6){
       selectCreditcard(event.srcElement.value);
     }
   }
}
function selectCreditcard(value){
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/roomReservationController/findBycreditcardnumber.do?Number='+ value,
        async: false,
        contentType : "application/json;charset=utf-8;",
		success : function(data) {
		  var dt = eval(data);
		  
		  if(dt.length > 0){
		    var tb = document.getElementById("creditcardtb");
			var length= tb.rows.length;             //获得Table下的行数
			var colums = tb.rows[0].cells.length;
		    if(length > 0){
				for(var i=length-1;i > 0;i--){
				    tb.deleteRow(i);  //如果有行，则清空
				}
			}
		    for (var k = 0; k < dt.length; k++) {
				var r = tb.insertRow();//添加行
				for ( var j = 0; j < colums; j++) {
				  r.insertCell();//添加单元格
				}
				
				r.cells[0].innerHTML = "<button class='btn btn-warning btn-small' value="+dt[k].creditcardid+" onclick='chooseCreditcard(this)'><i class='icon-ok icon-white'></i></button>"
				r.cells[1].innerHTML = dt[k].creditcardnumber;
				r.cells[2].innerHTML = (dt[k].creditcardtype == 1 ? "普通" : "贵宾");
				r.cells[3].hidden=true;//隐藏id列
				r.cells[3].innerHTML = dt[k].creditcardtype;
				r.cells[4].innerHTML = dt[k].validitydate;
				r.cells[5].innerHTML = dt[k].quota;
			}
			
		    $('#creditcard').css("display","block");
		  }
		},
		error: function(request) {
         alert ("出现异常！");
        }
	});
}
function chooseCreditcard(e){
   var tr = e.parentNode.parentNode;
   document.getElementById("creditcardid").value = e.value;
   document.getElementById("creditcardnumber").value = tr.cells[1].innerHTML;
   document.getElementById("creditcardtype").value = tr.cells[3].innerHTML;
   document.getElementById("validitydate").value = tr.cells[4].innerHTML;
   document.getElementById("quota").value = tr.cells[5].innerHTML;
   $("#creditcard").css("display","none");
}


function findSurplusRooms(){
  var roomtypeid = $("#roomtype").val();
  var arrivedate = $("#arrivedate").val();
  if(arrivedate != null && arrivedate != ""){
     $.ajax({
		cache: true,
		type: "POST",
		url : '${ctx}/roomReservationController/findSurplusRooms.do?arrivedate='+ arrivedate + "&roomtypeid=" + roomtypeid,
		success : function(data) {
		  var dt = eval(data);
		  document.getElementById("tenantablenumber").value = dt[0].surplus;
		},
		error: function(request) {
          alert("出现异常！");
        }
	});
  }else {
    alert("请选择到店日期！");
  }
  
  
}
</script>
