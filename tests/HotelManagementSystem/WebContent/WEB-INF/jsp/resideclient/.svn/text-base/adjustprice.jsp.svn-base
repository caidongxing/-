<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>
	<form id="adjustPriceform" class="form-horizontal">
		<input type="hidden" value="${detail.detailid}" name="detailid">

		<div class='row-fluid' style="text-align: center;">
			<label class='span3' style="line-height: 30px;text-align: right;">住店房号:</label>
			<input class='span8' value="${detail.roommark}" type="text" readonly="readonly" />
		</div>
		<div class='row-fluid' style="text-align: center;">
			<label class='span3' style="line-height: 30px;text-align: right;">房间等级:</label>
			<input class='span8' value="${detail.roomtypename}" type="text" readonly="readonly" />
		</div>
		<div class='row-fluid' style="text-align: center;">
			<label class='span3' style="line-height: 30px;text-align: right;">到店日期:</label>
			<input class='span8' name="arrivedate" type="text" readonly="readonly"
				value="<fmt:formatDate value='${detail.arrivedate}' pattern='yyyy-MM-dd'/>" />
		</div>
		<div class='row-fluid' style="text-align: center;">
			<label class='span3' style="line-height: 30px;text-align: right;">原房价:</label>
			<input class='span8' value="${detail.realprice}" type="number" readonly="readonly" />
		</div>
		<div class='row-fluid' style="text-align: center;">
			<label class='span3' style="line-height: 30px;text-align: right;">新房价:</label>
			<input class='span8' name="realprice" type="number" required/>
		</div>
	</form>
</body>
</html>
<script type="text/javascript">

var validate = true;
$(function(){
  $("#adjustPriceform").validate({
     submitHandler: function(form) {  //通过之后回调 
        validate = true;
        adjustPrice();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
       validate = false;
     }
   });
})

function adjustPrice(){
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/resideClientController/adjustPrice.do',
        data:$('#adjustPriceform').serialize(),// 你的formid
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
</script>
