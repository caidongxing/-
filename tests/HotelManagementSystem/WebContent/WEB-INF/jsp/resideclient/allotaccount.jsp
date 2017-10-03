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
						<i class='icon-table'></i> <span>住店客人</span>
					</h1>
					<div class="pull-right">
						<ul class='breadcrumb'>
							<li><a href='${ctx}'><i class='icon-table'></i> </a></li>
							<li class='separator'><i class='icon-angle-right'></i></li>
							<li>住店客人</li>
							<li class='separator'><i class='icon-angle-right'></i></li>
							<li class='active'>分账户</li>
						</ul>
					</div>
				</div>


				
					<div class="row-fluid">
						<div class='span12 box' style='margin-top: -20px'>
							<div class='box-header orange-background'>
								<div class='title'>订单信息</div>
							</div>
							<div class='box-content'>

								<div class="row-fluid">
									<div style="text-align: center;margin-top: 5px;">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">客人姓名:</label>
											<input class="span8" type="text" name="chinesename"
												value="${clientinfo.chinesename}" readonly="readonly"
												placeholder="客人姓名">

										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">团会名称:</label>
											<select class='span8' name="signbilltemplateid"
												id="signbilltemplateid">
												<option value="">团会名称</option>
												<c:forEach items="${team}" var="item">
													<option value="${item.teamid}" ${item.teamid eq
														roomreservation.teamid ? "selected='selected'" :""}>${item.teamname}</option>
												</c:forEach>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">到店日期:</label>
											<input class="span8 Wdate" type="text" name="arrivedate"
												id="arrivedate" readonly="readonly" placeholder="到店日期"
												value="<fmt:formatDate value='${detail.arrivedate}' pattern='yyyy-MM-dd'/>" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">离店日期:</label>
											<input class="span8 Wdate" type="text" name="leavedate"
												id="leavedate" readonly="readonly" placeholder="离店日期"
												value="<fmt:formatDate value='${detail.leavedate}' pattern='yyyy-MM-dd'/>" />
										</div>

									</div>
								</div>

								<div class="row-fluid">
									<div style="text-align: center;margin-top: 5px;">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">签单模板:</label>
											<select class='span8' name="signbilltemplateid"
												id="signbilltemplateid"
												onchange="templateChange(this.value)">
												<option value="">--签单模板--</option>
												<c:forEach items="${aignbilltemplate}" var="item">
													<option value="${item.signbilltemplateid}"
														${item.signbilltemplateid eq
														roomreservation.signbilltemplateid ? "selected='selected'" :""}>${item.templatename}</option>
												</c:forEach>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">房间等级:</label>
											<select class='span8' name="signbilltemplateid"
												id="signbilltemplateid">
												<c:forEach items="${roomtype}" var="item">
													<option value="${item.roomtypeid}" ${item.roomtypeid eq
														detail.roomtype ? "selected='selected'" :""}>${item.roomtypename}</option>
												</c:forEach>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">房数/免床:</label>
											<input class='span4' name="roomnumber"
												value="${detail.roomnumber}" type="number"
												readonly="readonly" placeholder="房数" /> <input
												class='span4' name="freebed" value="${detail.freebed}"
												readonly="readonly" type="number" placeholder="免床" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">成人/儿童:</label>
											<input class='span4' name="adult" value="${detail.adult}"
												readonly="readonly" type="number" placeholder="成人" /> <input
												class='span4' name="children" value="${detail.children}"
												readonly="readonly" type="number" placeholder="儿童" />
										</div>
									</div>
								</div>

							</div>
						</div>
					</div>
                  <form id="form" class="form-horizontal">
					
					<input type="hidden" name="detailid" value="${detail.detailid}" />
					
					<div class="row-fluid">
						<div class='span12 box' style='margin-top: -20px'>
							<div class='box-header blue-background'>
								<div class='title'>账户信息</div>
							</div>
							<div class='box-content'>
								<div class="row-fluid">
									<div style="text-align: center;margin-top: 5px;">
										<div class='span3'>
											<label class='span4' style="line-height: 30px">账户编码:</label>
											<input class='span8' type="text" name="accountcode" required
												placeholder="账户编码" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">账户名称:</label>
											<input class='span8' type="text" name="accountname" required
												placeholder="账户名称" />
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">账户类型:</label>
											<select class='span8' name="accounttype" id="accounttype">
												<option value="1">客人</option>
												<option value="2">团队</option>
												<option value="3">特殊</option>
												<option value="4">应收</option>
											</select>
										</div>
										<div class='span3'>
											<label class='span4' style="line-height: 30px">账户余额:</label>
											<input class='span8' type="number" name="accountbalance"
												required placeholder="账户余额" />
										</div>

									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="row-fluid">
						<div class='span12 box' style='margin-top: -20px'>
							<div class='box-header green-background'>
								<div class='title'>签单信息</div>
							</div>
							<div class='box-content'>
								<div class="row-fluid">
									<div class='title'>
										<span>账本列表</span>
										<div class="pull-right">
								 </div>
									</div>
									<div class='row-fluid'>
										<div class='responsive-table'>
											<table class='table' style='margin-bottom:0;'
												id="accountbooktb">
												<thead>
													<tr>
														<th hidden>accountbookid</th>
														<th>代码</th>
														<th>账本名称</th>
														<th style="text-align: center;">转账信息</th>
														<th style="text-align: center;">限额</th>
														<!-- <th>操作</th>		 -->
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${templateandaccountbook}" var="item">
														<tr>
															<td hidden jsonName="accountbookid">${item.accountbookid}</td>
															<td hidden jsonName="transferaccountsid"></td>
															<td>${item.accountbookcode}</td>
															<td>${item.accountbookname}</td>
															<td>
															
																<div class="row-fluid">
																	<input class='span6' type="text" name="transferaccounts"
																		placeholder="转账账户" onclick="TransferAccounts(event)"/>
																	<select class='span6' name="transferaccountswayid"
																		id="transferaccountswayid" disabled="disabled">
																		<option value="1" ${item.transferaccountswayid
																			eq 1 ? "selected='selected'" : ""}>结账即转</option>
																		<option value="2" ${item.transferaccountswayid
																			eq 2 ? "selected='selected'" : ""}>发生即转</option>
																		<option value="3" ${item.transferaccountswayid
																			eq 3 ? "selected='selected'" : ""}>夜审即转</option>
																	</select>
																</div></td>
															<td><input class='span12' type="number" name="quota"
																value="${item.quota}" placeholder="限额" readonly="readonly"/>
															</td>
													</c:forEach>
												</tbody>
											</table>
										</div>
									</div>


								</div>


							</div>
						</div>
					</div>
					<div class="row-fluid">
						<div class="pull-right">
						  <button type="submit" class="btn btn-primary"> <i class="icon-save"></i><span>保存</span></button>
						  <a class="btn btn-warning" onclick="GoBackList('${ctx}/indentClientController/list.do')"><i class="icon-remove"></i><span>关闭</span></a>
						</div>
					</div>
					
				</form>
			</div>
		</div>
	</div>



</body>
</html>

<script type="text/javascript">
	$(function(){
  $("#form").validate({
     submitHandler: function(form) {  //通过之后回调 
        saveAllotAccount();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
     }
   });
   
  
    
})

//保存账户信息
function saveAllotAccount(){
    var jsonData = gettableJsondate();//获取表格数据转json
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/resideClientController/saveAllotAccount.do?jsonData='+ jsonData,
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
 
 //table数据转json
 function gettableJsondate() {
   var args = {};
   $("#accountbooktb tr:gt(0)").each(function(i) {
     var data = new Object();
     $(this).find("td[jsonName]").each(function() {
       var name = $(this).attr("jsonName");
       data[name] = $(this).val();
       if ("" == $(this).val()) {
          data[name] = $(this).text();
       }
     });
     args[i] = data;
   });
   return JSON.stringify(args);
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
 
 //签单模板下拉框选择事件
 function templateChange(signbilltemplateid){
    $.ajax({
		type: "post",
		url : '${ctx}/signbillTemplateController/findByPrimaryKey.do?id=' + signbilltemplateid,
		dataType:"json",
		success : function(data) {
	     var dt = eval(data);
	     $("#accountbooktb tbody").empty();
	     for (var k = 0; k < dt.length; k++) {
	     var options;
		  switch (dt[k].transferaccountswayid) {
		case 1:
			options = "<option value='1'selected='selected'></option>"
	         +"<option value='2'>发生即转</option>"
	         +"<option value='3'>夜审即转</option>"
			break;
		case 2:
			options = "<option value='1'>结账即转</option>"
	         +"<option value='2'selected='selected'>发生即转</option>"
	         +"<option value='3'>夜审即转</option>"
			break;
		case 3:
			options = "<option value='1'>结账即转</option>"
	         +"<option value='2'>发生即转</option>"
	         +"<option value='3'selected='selected'>夜审即转</option>"
			break;
		default:
		     options = "<option value='1'selected='selected'>结账即转</option>"
	         +"<option value='2'>发生即转</option>"
	         +"<option value='3'>夜审即转</option>"
			break;
		}
	     $("#accountbooktb tbody").append("<tr><td hidden jsonName='accountbookid'>"+dt[k].accountbookid+"</td>"
	     +"<td hidden jsonName='transferaccountsid'></td>"
	     +"<td>"+dt[k].accountbookcode+"</td>"
	     +"<td>"+dt[k].accountbookname+"</td>"
	     +"<td><div class='row-fluid'><input class='span6' type='text' name='accountname' onclick='TransferAccounts()' placeholder='转账账户'/>"
	     +"<select class='span6' name='transferaccountswayid' id='transferaccountswayid' disabled='disabled'>"
	     + options
	     +"<td><input class='span12' type='number' name='quota' value="+dt[k].quota+" readonly='readonly' placeholder='限额'/></td>"
	     +"</select></div></td></tr>");
	     }
	     
		},
		error: function(request) {
          alert("出现异常！");
        }
	});
 }
 
 function TransferAccounts(event){
     var tr = event.currentTarget.parentNode.parentNode.parentNode;
     
     $.post('${ctx}/indentClientController/accountView.do',function(result){
      layer.open({
      type: 1,
      title: '转账账户选择',
      area: '60%',
      content: result,
      btn: ['确定', '关闭'],
      yes: function(index, layero){
        layer.close(index);//如果设定了yes回调，需进行手工关闭
       var Checked = $("#accountTb tr input[type='checkbox']:checked");
        var accountid = Checked.attr('value');
        var accountname = Checked[0].parentNode.parentNode.cells[3].innerHTML;
        event.target.value  = accountname;
        tr.cells[1].innerHTML = accountid;
      },
      btn2: function(index, layero){ //按钮【按钮二】的回调
      } 
   });
 });
}
 
</script>
