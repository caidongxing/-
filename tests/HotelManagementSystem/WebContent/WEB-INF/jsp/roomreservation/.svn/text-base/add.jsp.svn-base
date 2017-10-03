<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8" />
<title><tiles:insertAttribute name="title" ignore="true" />
</title>
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
							<li><a href='${ctx}'><i class='icon-table'></i> </a>
							</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li>订单处理</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li>客房预订单</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li class='active'>新增</li>
						</ul>
					</div>
				</div>


				<div class='row-fluid'>
					<div class='box-content'>
						<form id="form" class="form-horizontal">

							<div class="row-fluid">
								<div style="text-align: center;">
									<div class='span3'>
										<label class='span4' style="line-height: 30px">订单号:</label> <input
											class='span8' name="reservationnumber" type="text"
											value="${reservationnumber}" placeholder="订单号"
											readonly="readonly" />
									</div>
									<div class='span3'>
										<label class='span2' style="line-height: 30px">部门:</label> <input
											class='span10' name="department" type="text" placeholder="部门" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">预订类型:</label> <select
											class='span8' name="reservationtype" id="reservationtype">
											<option value="1">一般预订</option>
											<option value="2">团会预订</option>
											<option value="3">贵宾预订</option>
											<option value="4">代理预订</option>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">销售员:</label> <select
											class='span8' name="salesmanid" id="salesmanid">
											<option value="">---销售员---</option>
											<c:forEach items="${salesman}" var="item">
												<option value="${item.salesmanid}">${item.salesmanname}</option>
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
												<option value="${item.agreementclientid}">${item.agreementclientname}</option>
											</c:forEach>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">联系人:</label> <input
											class='span8' name="contacts" type="text" placeholder="联系人" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">选房要求:</label> <select
											class='span8 select2' multiple="multiple"
											name="choosehouseclaim" id="choosehouseclaim"
											placeholder='可选可不选可多选'>
											<c:forEach items="${characteristic}" var="item">
												<option value="${item.characteristic}">${item.characteristic}</option>
											</c:forEach>
										</select>
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span6'>
										<label class='span2' style="line-height: 30px">团会名称:</label>
										 <select class='span10 select2' multiple="multiple" name="teamid"
											id="teamid" placeholder="团会名称">
											<c:forEach items="${team}" var="item">
												<option value="${item.teamid}">${item.teamname}</option>
											</c:forEach>
										</select>

									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">电话:</label>
										 <input class='span8' name="phone" type="text" placeholder="电话" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">市场:</label> <select
											class='span8' name="marketid" id="marketid">
											<option value="1">门市</option>
											<option value="2">忙市</option>
											<option value="3">闲市</option>
										</select>
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span6'>
										<label class='span2' style="line-height: 30px">客人姓名:</label>
										 <input class='span10' name="chinesename"  id="chinesename" type="text"
											placeholder="客人姓名" oninput="OnInput(event)"  onpropertychange="OnPropChanged(event)" />
									     <input name="clientinfoid"  id="clientinfoid" type="hidden" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">客源:</label> <select
											class='span8' name="clientsourceid" id="clientsourceid">
											<option value="1">散客</option>
											<option value="2">团会</option>
											<option value="3">会议</option>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">签单模板:</label> <select
											class='span8' name="signbilltemplateid"
											id="signbilltemplateid">
											<option value="">---签单模板---</option>
											<c:forEach items="${aignbilltemplate}" var="item">
												<option value="${item.signbilltemplateid}">${item.templatename}</option>
											</c:forEach>
										</select>
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span3'>
										<label class='span4' style="line-height: 30px">到店日期:</label>
										 <input class="span8 Wdate" type="text" name="arrivedate" value="${arrivedate}"
											id="arrivedate" required placeholder="到店日期" onchange="findSurplusRooms()"
											onFocus="WdatePicker({minDate:'new Date()',maxDate:'2020-10-01'})" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">离店日期:</label> <input
											class="span8 Wdate" type="text" name="leavedate"
											id="leavedate" required placeholder="离店日期"
											onFocus="WdatePicker({minDate:'#F{$dp.$D(\'arrivedate\')}',maxDate:'2020-10-01'})" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">房间等级:</label>
										 <select class='span8' name="roomtype" id="roomtype" onchange="findSurplusRooms()">
											<c:forEach items="${roomtype}" var="item">
												<option value="${item.roomtypeid}" ${item.roomtypeid eq roomtypeid ? "selected='selected'" :""}>${item.roomtypename}</option>
											</c:forEach>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">留房日期:</label> <input
											class="span8 Wdate" type="text" name="obligateroomdate"
											id="obligateroomdate" placeholder="留房日期"
											onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'2020-10-01'})" />
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span3'>
										<label class='span4' style="line-height: 30px">房价代码:</label> <select
											class='span8' name="roompricecodeid" id="roompricecodeid">
											<option value="1">门市价</option>
											<option value="2">散客价</option>
											<option value="3">团会价</option>
											<option value="4">代理价</option>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">实际/标准:</label>
										<input class='span4' name="realprice" type="number"
											placeholder="实际价格" required /> <input class='span4'
											name="standardprice" type="number" placeholder="标准价格" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">可租房数:</label>
										<input class='span8' name="tenantablenumber" id="tenantablenumber" value="${tenantablenumber}" type="text" placeholder="可租房数" readonly="readonly" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">币种代码:</label> <select
											class='span8' name="currencytype" id="currencytype">
											<option value="1">人民币</option>
											<option value="2">美元</option>
											<option value="3">欧元</option>
											<option value="4">日元</option>
											<option value="5">法郎</option>
										</select>
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span3'>
										<label class='span4' style="line-height: 30px">房数/免床:</label>
										<input class='span4' id="roomnumber" name="roomnumber" type="number"
											placeholder="房数" required /> <input class='span4'
											name="freebed" value="0" type="number" placeholder="免床" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">成人/儿童:</label>
										<input class='span4' name="adult" type="number"
											placeholder="成人" required /> <input class='span4'
											name="children" value="0" type="number" placeholder="儿童" />
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">VIP:</label> <select
											class='span8' name="viptypeid" id="viptypeid">
											<option value="">---VIP--</option>
											<option value="1">蓝钻</option>
											<option value="2">黄钻</option>
											<option value="3">蓝冠</option>
											<option value="4">皇冠</option>
										</select>
									</div>
									<div class='span3'>
										<label class='span4' style="line-height: 30px">餐标:</label> <input
											class='span8' name="standardmeal" type="text"
											placeholder="餐标" />
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="margin-top: 5px;">
									<div class='span12'>
										<label class='span1'
											style="line-height: 30px;text-align: right;">备注:</label> <input
											class='span11' name="comment" type="text" placeholder="备注" />
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div class="pull-right">
									<a class="btn btn-info" onclick="openOtherInfo()"><i
										class="icon-double-angle-down"></i><span>其他</span> </a>
									<button type="submit" class="btn btn-primary">
										<i class="icon-save"></i><span>保存</span>
									</button>
									<a class="btn btn-warning" onclick="GoBackList('${ctx}/roomReservationController/list.do')"><i class="icon-remove"></i><span>关闭</span>
									</a>
								</div>
							</div>

							<div class="row-fluid"
								style="border:1px solid;display: none;margin-top: 10px;"
								id="OtherInfo">
								<div class="row-fluid">
									<div class='title'>
										<span>1、会员信息</span>
									</div>
									<div class="row-fluid">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">会员卡号:</label>
											<input class='span8' name="membercardnumber" id="membershipcardnumber" type="text"
												oninput="OnMembershipcardInput(event)"  onpropertychange="OnMembershipcardChanged(event)" placeholder="会员卡号" />
											<input type="hidden" name="membercardid" id="membershipcardid">
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">类型:</label> <select
												class='span8' name="membercardtype" id="membershipcardtype">
												<option value="">--类型--</option>
												<option value="1">银卡</option>
												<option value="2">金卡</option>
												<option value="3">黑卡</option>
												<option value="4">钻卡</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">名称:</label> <input
												class='span8' name="membercardname" id="membershipcardname" type="text"
												placeholder="名称" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">余额:</label> <input
												class='span8' name="balance" id="balance" type="number" placeholder="余额" />
										</div>
									</div>
									<div class="row-fluid">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">信用卡号:</label>
											<input class='span8' name="creditcardnumber" id="creditcardnumber" type="text"
											oninput="OnCreditcardInput(event)"  onpropertychange="OnCreditcardChanged(event)" placeholder="信用卡号" />
											<input type="hidden" name="creditcardid" id="creditcardid">
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">类型:</label> <select
												class='span8' name="creditcardtype" id="creditcardtype">
												<option value="">--类型--</option>
												<option value="1">普通</option>
												<option value="2">贵宾</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">有效期:</label> <input
												class="span8 Wdate" type="text" name="validitydate" id="validitydate"
												id="validitydate" placeholder="有效期"
												onFocus="WdatePicker({maxDate:'2020-10-01'})" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">限额:</label> <input
												class='span8' name="quota" id="quota" type="number" placeholder="限额" />
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
												class='span10' name="reception" type="text"
												placeholder="接待备注" />
										</div>
										<div class='span6'>
											<label class='span2' style="line-height: 30px">结账:</label> <input
												class='span10' name="settleaccounts" type="text"
												placeholder="结账备注" />
										</div>
									</div>
									<div class="row-fluid">
										<div class='span6'>
											<label class='span2' style="line-height: 30px">客房:</label> <input
												class='span10' name="room" type="text" placeholder="客房备注" />
										</div>
										<div class='span6'>
											<label class='span2' style="line-height: 30px">消费:</label> <input
												class='span10' name="consumption" type="text"
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
												<option value="1">普通</option>
												<option value="2">贵宾</option>
												<option value="3">特殊</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">折扣代码:</label>
											<select class='span8' name="discountcode" id="discountcode">
												<option value="">--折扣代码--</option>
												<option value="1">活动折扣</option>
												<option value="2">店庆折扣</option>
												<option value="3">假日折扣</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">预订方式:</label>
											<select class='span8' name="reservationway"
												id="reservationway">
												<option value="">--预订方式--</option>
												<option value="1">电话</option>
												<option value="2">网络</option>
												<option value="3">代理</option>
											</select>
										</div>
									</div>

									<div class="row-fluid">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">确认方式:</label>
											<select class='span8' name="affirmway" id="affirmway">
												<option value="">--确认方式--</option>
												<option value="1">电话确认</option>
												<option value="2">网络确认</option>
												<option value="3">代理确认</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">到达航班:</label>
											<input class='span8' name="arrivegrogshopflight" type="text"
												placeholder="到达航班" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px;">离店航班:</label>
											<input class='span8' name="leavegrogshopflight" type="text"
												placeholder="离店航班" />
										</div>
									</div>
								</div>

								<div class="pull-right">
									<a class="btn btn-info" onclick="hidenOtherInfo()"><i
										class="icon-double-angle-up"></i><span>关闭其他</span> </a>
								</div>

							</div>
							
							<section id='detailcontent'>
							
							<tiles:insertDefinition name="detailTemplate"/>
							
							</section>

						</form>
					</div>

				</div>

			</div>
		</div>
	</div>

	<div id="clientinfo" class="span5 box" style="position: absolute;z-index: 9999;left: 24%;top: 37%;display: none;">
		<div class='row-fluid'>
			<div class='span12 box' style="border:1px solid;">
				<div class='box-header blue-background'>
					<div class='title'>
						<i class='icon-group'></i>客人信息
					</div>
					<div class='actions'>
						<a onclick="hidenClientInfo()" class="btn box-remove btn-mini btn-link"><i
							class='icon-remove'></i> </a>
					</div>
				</div>
				<div class='box-content'>
					<div class='row-fluid'>
						<div class='responsive-table'>
							<div class='scrollable-area'>
								<table id="clientinfotb" class='table table-bordered table-hover table-striped'
									style='margin-bottom:0;'>
									<thead>
										<tr>
											<th>选择</th>
											<th>中文名</th>
											<th>英文名</th>
											<th>性别</th>
											<th>证件号码</th>
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
        addRoomReservation();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
     }
   });
})

function addRoomReservation(){
 if($("#tenantablenumber").val() > 0){
   if($("#tenantablenumber").val() > $("#roomnumber").val()){
     $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/roomReservationController/save.do',
        data:$('#form').serialize(),// 你的formid
        async: false,
		success : function(data) {
		  if(confirm("温馨提示，是否继续添加订单明细？")){
		     
		     document.getElementById("clientinfoid").value = "";
		     document.getElementById("chinesename").value = "";
		     document.getElementById("tenantablenumber").value = $("#tenantablenumber").val() - 1;
		     
		     $('#detailcontent').empty();
		     $('#detailcontent').append(data);
		  }else{
		    GoBackList("${ctx}/roomReservationController/list.do");//返回list界面
		  }
		  
		},
		error: function(request) {
          $('#content').empty();
		  $('#content').append(data);
        }
	});
   }else{
     layer.msg("该类型房间不足，请重新选择！", {icon: 5});
   }
   }else {
     layer.msg("该类型房间已预订完，请重新选择！", {icon: 5});
   }
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
 
 function hidenOtherInfo(){
    $("#OtherInfo").css("display","none");
 }
 function openOtherInfo(){
    $("#OtherInfo").css("display","block");
 }
 
  function hidenClientInfo(){
    $("#clientinfo").css("display","none");
 }
 
function OnInput (event) {
if(event.target.value.length >= 2){
  selectClientinfo(event.target.value);
}
    
}
function OnPropChanged (event) {
  if(event.propertyName.toLowerCase () == "value") {
    if(event.srcElement.value.length >= 2){
       selectClientinfo(event.srcElement.value);
     }
   }
}
function selectClientinfo(value){
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/roomReservationController/findByParam.do?name='+ value,
        async: false,
        contentType : "application/json;charset=utf-8;",
		success : function(data) {
		  var dt = eval(data);
		  
		  if(dt.length > 0){
		    var tb = document.getElementById("clientinfotb");
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
				//r.cells[0].hidden=true;//隐藏id列
				
				r.cells[0].innerHTML = "<button class='btn btn-warning btn-small' value="+dt[k].clientinfoid+" onclick='chooseClientinfo(this)'><i class='icon-ok icon-white'></i></button>"
				//"<input type='checkbox' name='zhutiIds' value="+provinces[i][0]+">"
				//dt[k].clientinfoid;
				r.cells[1].innerHTML = dt[k].chinesename;
				r.cells[2].innerHTML = dt[k].englishname;
				r.cells[3].innerHTML = (dt[k].sex == 1 ? "男" : "女");
				r.cells[4].innerHTML = dt[k].idnumber;
			}
			
		    $('#clientinfo').css("display","block");
		  }
		},
		error: function(request) {
          alert ("The new content: " + event.target.value);
        }
	});
}

function chooseClientinfo(e){
   var tr = e.parentNode.parentNode;
   document.getElementById("clientinfoid").value = e.value;
   document.getElementById("chinesename").value = tr.cells[1].innerHTML;
   $("#clientinfo").css("display","none");
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
