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
						<i class='icon-table'></i> <span>房态管理</span>
					</h1>
					<div class="pull-right">
						<ul class='breadcrumb'>
							<li><a href='${ctx}'><i class='icon-table'></i> </a>
							</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li>房态管理</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li>房态图</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li class='active'>开房</li>
						</ul>
					</div>
				</div>


				<div class='row-fluid'>
					<div class='box-content'>
						<form id="form" class="form-horizontal">
						
						 <input name="roomsid" value="${rooms.roomsid}" type="hidden" />
							<div class="row-fluid">
								<div style="text-align: center;">
									<div class='span4'>
										<label class='span4' style="line-height: 30px">订单号:</label> <input
											class='span8' name="reservationnumber" type="text"
											value="${reservationnumber}" placeholder="订单号"
											readonly="readonly" />
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">房号:</label> <input
											class='span8' value="${rooms.roomnumber}" type="text" placeholder="房号" />
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">部门:</label> <input
											class='span8' name="department" type="text" placeholder="部门" />
									</div>
									
								</div>
							</div>
							
							<div class="row-fluid">
							  <div style="text-align: center;margin-top: 5px;">
							    <div class='span4'>
										<label class='span4' style="line-height: 30px">预订类型:</label> <select
											class='span8' name="reservationtype" id="reservationtype">
											<option value="1">一般预订</option>
											<option value="2">团会预订</option>
											<option value="3">贵宾预订</option>
											<option value="4">代理预订</option>
										</select>
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">签单模板:</label> <select
											class='span8' name="signbilltemplateid"
											id="signbilltemplateid">
											<option value="">---签单模板---</option>
											<c:forEach items="${aignbilltemplate}" var="item">
												<option value="${item.signbilltemplateid}">${item.templatename}</option>
											</c:forEach>
										</select>
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">客源:</label> <select
											class='span8' name="clientsourceid" id="clientsourceid">
											<option value="1">散客</option>
											<option value="2">团会</option>
											<option value="3">会议</option>
										</select>
									</div>
							  </div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span4'>
										<label class='span4' style="line-height: 30px">联系人:</label> <input
											class='span8' name="contacts" type="text" placeholder="联系人" />
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">电话:</label>
										 <input class='span8' name="phone" type="text" placeholder="电话" />
									</div>
									<div class='span4'>
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
									<div class='span4'>
										<label class='span4' style="line-height: 30px">客人姓名:</label>
										 <input class='span8' name="chinesename"  id="chinesename" type="text" required
											placeholder="客人姓名" oninput="OnInput(event)"  onpropertychange="OnPropChanged(event)" />
									     <input name="clientinfoid"  id="clientinfoid" type="hidden" />
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">性别:</label>
										 <select class='span8' name="sex" id="sex">
											<option value="1">男</option>
											<option value="2">女</option>
										</select>
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">证件类型:</label>
										<select class='span8' name="idtypeid" id="idtypeid">
										   <option value="1" ${clientinfo.idtypeid eq 1 ? "selected='selected'" :""}>身份证</option>
										   <option value="2" ${clientinfo.idtypeid eq 2 ? "selected='selected'" :""}>外交护照</option>
										   <option value="3" ${clientinfo.idtypeid eq 3 ? "selected='selected'" :""}>工作证</option>
										   <option value="4" ${clientinfo.idtypeid eq 4 ? "selected='selected'" :""}>学生证</option>
										</select>
									</div>
									
									
								</div>
							</div>
							
							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
								  <div class='span4'>
										<label class='span4' style="line-height: 30px">房间等级:</label>
										 <select class='span8' name="roomtype" id="roomtype" onchange="findSurplusRooms()">
											<c:forEach items="${roomtype}" var="item">
												<option value="${item.roomtypeid}" ${item.roomtypeid eq rooms.roomtypeid ? "selected='selected'" :""}>${item.roomtypename}</option>
											</c:forEach>
										</select>
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">VIP:</label> <select
											class='span8' name="viptypeid" id="viptypeid">
											<option value="">---VIP--</option>
											<option value="1">蓝钻</option>
											<option value="2">黄钻</option>
											<option value="3">蓝冠</option>
											<option value="4">皇冠</option>
										</select>
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">证件号码:</label>
										 <input class='span8' name="idnumber" type="text" placeholder="证件号码" />
									</div>
								</div>
							</div>
							
							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span4'>
										<label class='span4' style="line-height: 30px">到店日期:</label>
										 <input class="span8 Wdate" type="text" name="arrivedate"
											id="arrivedate" required placeholder="到店日期"
											onFocus="WdatePicker({minDate:'new Date()',maxDate:'2020-10-01'})" />
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">离店日期:</label> <input
											class="span8 Wdate" type="text" name="leavedate"
											id="leavedate" required placeholder="离店日期"
											onFocus="WdatePicker({minDate:'#F{$dp.$D(\'arrivedate\')}',maxDate:'2020-10-01'})" />
									</div>
									
									<div class='span4'>
										<label class='span4' style="line-height: 30px">留房日期:</label> <input
											class="span8 Wdate" type="text" name="obligateroomdate"
											id="obligateroomdate" placeholder="留房日期"
											onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'2020-10-01'})" />
									</div>
								</div>
							</div>

							<div class="row-fluid">
								<div style="text-align: center;margin-top: 5px;">
									<div class='span4'>
										<label class='span4' style="line-height: 30px">房价代码:</label> <select
											class='span8' name="roompricecodeid" id="roompricecodeid">
											<option value="1">门市价</option>
											<option value="2">散客价</option>
											<option value="3">团会价</option>
											<option value="4">代理价</option>
										</select>
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">实际/标准:</label>
										<input class='span4' name="realprice" type="number"
											placeholder="实际价格" required /> <input class='span4'
											name="standardprice" type="number" placeholder="标准价格" />
									</div>
									<div class='span4'>
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
									<div class='span4'>
										<label class='span4' style="line-height: 30px">房数/免床:</label>
										<input class='span4' name="roomnumber" value="1" type="number"
											placeholder="房数" required /> <input class='span4'
											name="freebed" value="0" type="number" placeholder="免床" />
									</div>
									<div class='span4'>
										<label class='span4' style="line-height: 30px">成人/儿童:</label>
										<input class='span4' name="adult" type="number" placeholder="成人" required />
										<input class='span4' name="children" value="0" type="number" placeholder="儿童" />
									</div>
									
									<div class='span4'>
										<label class='span4' style="line-height: 30px">餐标:</label>
										<input class='span8' name="standardmeal" type="text" placeholder="餐标" />
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
									<a class="btn btn-info"><i class="icon-search icon-white"></i><span>身份证扫描</span> </a>
									<button type="submit" class="btn btn-primary">
										<i class="icon-save"></i><span>保存</span>
									</button>
									<a class="btn btn-warning" onclick="GoBackList('${ctx}/roomReservationController/list.do')"><i class="icon-remove"></i><span>关闭</span>
									</a>
								</div>
							</div>

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
	
</body>
</html>
<script type="text/javascript">

$(function(){
  
  $("#form").validate({
     submitHandler: function(form) {  //通过之后回调 
        openHouse();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
     }
   });
})
//开房
function openHouse(){
   $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/roomStatusController/openHouse.do',
        data:$('#form').serialize(),// 你的formid
        async: false,
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
		}
	});
}

function chooseClientinfo(e){
   var tr = e.parentNode.parentNode;
   document.getElementById("clientinfoid").value = e.value;
   document.getElementById("chinesename").value = tr.cells[1].innerHTML;
   $("#clientinfo").css("display","none");
}
</script>

