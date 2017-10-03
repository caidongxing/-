<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>
	<div class='row-fluid'>
		<div class='box-content' style="margin: 10px;">
			<form id="detailupdateform" class="form-horizontal">
			  <input type="hidden" value="${detail.detailid}" name="detailid">
			 <input type="hidden" value="${detail.roomreservationid}" name="roomreservationid">
				<div class="row-fluid">
					<div style="text-align: center;margin-top: 5px;">
						<div class='span4'>
							<label class='span4' style="line-height: 30px">到店日期:</label> <input
								class="span8 Wdate" type="text" name="arrivedate"
								value="<fmt:formatDate value='${detail.arrivedate}' pattern='yyyy-MM-dd'/>" id="arrivedate" required
								placeholder="到店日期" onchange="findSurplusRooms()"
								onFocus="WdatePicker({minDate:'new Date()',maxDate:'2020-10-01'})" />
						</div>
						<div class='span4'>
							<label class='span4' style="line-height: 30px">离店日期:</label> <input
								class="span8 Wdate" type="text" value="<fmt:formatDate value='${detail.leavedate}' pattern='yyyy-MM-dd'/>" 
								name="leavedate" id="leavedate" required placeholder="离店日期"
								onFocus="WdatePicker({minDate:'#F{$dp.$D(\'arrivedate\')}',maxDate:'2020-10-01'})" />
						</div>
						<div class='span4'>
							<label class='span4' style="line-height: 30px">留房日期:</label> <input
								class="span8 Wdate" type="text" value="<fmt:formatDate value='${detail.obligateroomdate}' pattern='yyyy-MM-dd HH:mm:ss'/>" 
								name="obligateroomdate" id="obligateroomdate" placeholder="留房日期"
								onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'2020-10-01'})" />
						</div>
					</div>
				</div>

				<div class="row-fluid">
					<div style="text-align: center;margin-top: 5px;">

						<div class='span4'>
							<label class='span4' style="line-height: 30px">实际/标准:</label> <input
								class='span4' name="realprice" value="${detail.realprice}" type="number" placeholder="实际价格"
								required /> <input class='span4' value="${detail.standardprice}" name="standardprice"
								type="number" placeholder="标准价格" />
						</div>
						<div class='span4'>
							<label class='span4' style="line-height: 30px">房间等级:</label> <select
								class='span8' name="roomtype" id="roomtype"
								onchange="findSurplusRooms()">
								<c:forEach items="${roomtype}" var="item">
									<option value="${item.roomtypeid}" ${item.roomtypeid eq
										detail.roomtype ? "selected='selected'" :""}>${item.roomtypename}</option>
								</c:forEach>
							</select>
						</div>
						<div class='span4'>
							<label class='span4' style="line-height: 30px">房价代码:</label> <select
								class='span8' name="roompricecodeid" id="roompricecodeid">
								<option value="1" ${detail.roompricecodeid eq 1 ? "selected='selected'" :""}>门市价</option>
								<option value="2" ${detail.roompricecodeid eq 2 ? "selected='selected'" :""}>散客价</option>
								<option value="3" ${detail.roompricecodeid eq 3 ? "selected='selected'" :""}>团会价</option>
								<option value="4" ${detail.roompricecodeid eq 4 ? "selected='selected'" :""}>代理价</option>
							</select>
						</div>

					</div>
				</div>

				<div class="row-fluid">
					<div style="text-align: center;margin-top: 5px;">
						<div class='span4'>
							<label class='span4' style="line-height: 30px">房数/免床:</label> <input
								class='span4' name="roomnumber" value="${detail.roomnumber}" type="number" placeholder="房数"
								required /> <input class='span4' name="freebed" value="${detail.roomnumber}"
								type="number" placeholder="免床" />
						</div>
						<div class='span4'>
							<label class='span4' style="line-height: 30px">成人/儿童:</label> <input
								class='span4' name="adult" value="${detail.adult}" type="number" placeholder="成人"
								required /> <input class='span4' name="children" value="${detail.children}"
								type="number" placeholder="儿童" />
						</div>
						<div class='span4'>
							<label class='span4' style="line-height: 30px">币种代码:</label> <select
								class='span8' name="currencytype" id="currencytype">
								<option value="1" ${detail.currencytype eq 1 ? "selected='selected'" :""}>人民币</option>
								<option value="2" ${detail.currencytype eq 2 ? "selected='selected'" :""}>美元</option>
								<option value="3" ${detail.currencytype eq 4 ? "selected='selected'" :""}>欧元</option>
								<option value="4" ${detail.currencytype eq 4 ? "selected='selected'" :""}>日元</option>
								<option value="5" ${detail.currencytype eq 5 ? "selected='selected'" :""}>法郎</option>
							</select>
						</div>
					</div>
				</div>

				<div class="row-fluid">
					<div style="margin-top: 5px;">
						<div class='span12'>
							<label class='span1' style="line-height: 30px;text-align: right;">备注:</label>
							<input class='span11' name="comment" value="${detail.comment}" type="text" placeholder="备注" />
						</div>
					</div>
				</div>

			</form>
		</div>

	</div>
</body>
</html>
<script type="text/javascript">
var validate = true;
$(function(){
  $("#detailupdateform").validate({
     submitHandler: function(form) {  //通过之后回调 
        validate = true;
        detailUpdate();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
       validate = false;
     }
   });
})

function detailUpdate(){
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/roomReservationController/detailupdate.do',
        data:$('#detailupdateform').serialize(),// 你的formid
        async: false,
		success : function(data) {
		  $('#detailcontent').empty();
		  $('#detailcontent').append(data);
		},
		error: function(request) {
          $('#content').empty();
		  $('#content').append(data);
        }
	});
   
 }
 
 function closeLayer(){
   alert(index);
   layer.close(index);//关闭弹层
 }
</script>
