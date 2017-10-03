<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>
   <form id="cashpledgeform" class="form-horizontal" >
	
	<input type="hidden" value="${detail.accountid}" name="accountid">
	<input type="hidden" value="${detail.detailid}" name="detailid">
	
	<div class="row-fluid" style="background-color: floralwhite">
		<div style="text-align: center;">
			<div class='title' style="background-color: darkgrey">
				<span>计算公式选择</span>
				<div class="pull-right"></div>
			</div>
			<div class='row-fluid'>
				<div style="text-align: center;margin-top: 5px;">
					<input type="radio" style="width: 20px;height: 20px;margin: 0px;" checked="checked"
						name="DesignFormulas" value="1"/><span>押金 = 房价 X 天数 + 杂费</span>
				    <input type="radio" style="width: 20px;height: 20px;margin: 0px 0px 0px 35px"
						name="DesignFormulas" value="2"/><span>押金 = (房价 + 杂费) X 天数</span>
				</div>
			</div>
			<div style="text-align: center;margin-top: 5px;">
			   <div class='span3'></div>
				<div class='span2' style="margin: 0">
				<label class='span4' style="line-height: 30px">房价:</label>
				<input class='span8' type="number" name="realprice" value="${detail.realprice}" readonly="readonly"/>
			</div>
			<div class='span2'>
				<label class='span4' style="line-height: 30px">杂费:</label>
				<input class='span8' type="number" value="0" name="incidentals" />
			</div>
			<div class='span3'>
				<label class='span5' style="line-height: 30px">住店天数:</label>
				<input class='span6' type="number" name="datenumber" value="${datenumber}" readonly="readonly" style="margin-left: -25px;" />
			</div>
			<div class='span1'>
				<input class="btn btn-primary" type="button" onclick="caculate()" value="计算"/>
			</div>
			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div style="text-align: center;margin-top: 5px;">
			<div class='span6'>
				<label class='span4' style="line-height: 30px">所属账本:</label>
				<select class='span8' name="signbillid" id="signbillid" onchange="signbillChange(this.value)">
				  <option value="">--请选择--</option>
				  <c:forEach items="${signbill}" var="item">
					<option value="${item.signbillid}">${item.accountbookname}</option>
				</c:forEach>
				</select>
			</div>
			<div class='span6'>
				<label class='span4' style="line-height: 30px">所属账项:</label>
				<select class='span8' name="accountitemsid" id="accountitemsid">
				
				</select>
			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div style="text-align: center;margin-top: 5px;">
			<div class='span6'>
				<label class='span4' style="line-height: 30px">消费描述:</label>
				<input class='span8' type="text" name="consumerdescribe" id="consumerdescribe" required placeholder="消费描述" />
			</div>
			<div class='span6'>
				<label class='span4' style="line-height: 30px">消费金额:</label>
				<input class='span8' type="number" name="expenditure" id="expenditure" readonly="readonly" placeholder="消费金额" />
			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div style="text-align: center;margin-top: 5px;">
			<div class='span6'>
				<label class='span4' style="line-height: 30px">签单时间:</label>
				 <input class="span8 Wdate" type="text" name="signbilldate" id="signbilldate" required
				 onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'new Date()',maxDate:'2020-10-01'})" />
			</div>
			<div class='span6'>
				<label class='span4' style="line-height: 30px">支付方式:</label>
				<select class='span8' name="payway" id="payway">
				  <option value="1">余额</option>
				  <option value="2">现金</option>
				  <option value="3">银行卡</option>
				  <option value="4">支票</option>
				</select>
			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div style="text-align: center;margin-top: 5px;">
			<div class='span12'>
				<label class='span2' style="line-height: 30px">消费备注:</label>
				<input class='span10' type="text" name="comment" placeholder="消费备注" />
			</div>
		</div>
	</div>
  </form>
</body>
</html>
<script type="text/javascript">

var validate = true;
$(function(){
  $("#cashpledgeform").validate({
     submitHandler: function(form) {  //通过之后回调 
        validate = true;
        cashpledge();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
       validate = false;
     }
   });
})

function cashpledge(){
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/indentClientController/cashpledge.do',
        data:$('#cashpledgeform').serialize(),// 你的formid
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
//表单验证方法
function checkCashpledge(){
   var consumerdescribe = document.getElementById("consumerdescribe").value;
   var signbilldate = document.getElementById("signbilldate").value;
   var signbillid = document.getElementById("signbillid").value;
   var expenditure = document.getElementById("expenditure").value;
   if(signbillid == ""){
      layer.msg("亲！所属账本没选！", {icon: 5});
      return false;
   }
   if(consumerdescribe == ""){
      layer.msg("亲！消费描述没填！", {icon: 5});
      return false;
   }
   if(expenditure == ""){
      layer.msg("亲！消费金额没计算！", {icon: 5});
      return false;
   }
   if(signbilldate == ""){
      layer.msg("亲！签单时间没填！", {icon: 5});
      return false;
   }else{
      document.getElementById("cashpledgeform").submit();
      return true;
   }
    
 
}

function signbillChange(signbillid){
   $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/indentClientController/signbillChange.do?signbillid='+ signbillid,
        async: false,
		success : function(data) {
		  var dt = eval(data);
		  $("#accountitemsid").empty();
		  for (var k = 0; k < dt.length; k++) {
		    $("#accountitemsid").append('<option value="'+ dt[k].accountitemsid +'">'+ dt[k].itemsname +'</option>');
		  } 
		},
		error: function(request) {
         
        }
   });
}


function caculate(){
   var value = $('input:radio:checked').val();
   
   var realprice = $("input[name='realprice']").val();
   var incidentals = $("input[name='incidentals']").val();
   var datenumber = $("input[name='datenumber']").val();
   if(value == 1){
     //押金 = 房价 X 天数 + 杂费
     $("#expenditure").val(realprice * datenumber + parseFloat(incidentals));
   }else{
     //押金 = (房价 + 杂费) X 天数
     $("#expenditure").val((realprice + parseFloat(incidentals)) * datenumber);
   }
}
</script>

