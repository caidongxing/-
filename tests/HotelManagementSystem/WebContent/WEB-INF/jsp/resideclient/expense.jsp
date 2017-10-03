<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>
   <form id="expenseform" class="form-horizontal" >
	
	<input type="hidden" value="${detail.detailid}" name="detailid">
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
				<select class='span8' name="accountitemsid" id="accountitemsid" required>
				
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
				<input class='span8' type="number" name="expenditure" id="expenditure" required placeholder="消费金额" />
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
				<label class='span4' style="line-height: 30px">消费数量:</label>
				<input class='span8' type="number" name="quantity" value="1" />
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
  $("#expenseform").validate({
     submitHandler: function(form) {  //通过之后回调 
        validate = true;
        expense();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
       validate = false;
     }
   });
})

//消费挂账
function expense(){
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/resideClientController/expense.do',
        data:$('#expenseform').serialize(),// 你的formid
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

</script>

