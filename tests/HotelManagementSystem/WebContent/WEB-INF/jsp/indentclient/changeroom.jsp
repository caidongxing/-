<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>
	<form id="ChangeRoomform" class="form-horizontal" style="margin-top: 0px;">
	<input type="hidden" value="${detail.detailid}" name="detailid">
	<input type="hidden" value="${detail.roomsid}" name="oldroomsid">
	<input type="hidden" value="${detail.roomstatus}" name="roomstatus">
	
	<div class='row-fluid' style="margin-left: 2px;">
		<div class='tabbable span6'>
			<ul class='nav nav-tabs'>
				<li class='active'><a data-toggle='tab' href='#tab1'> <i
						class='icon-user'></i> 客人住店信息 </a>
				</li>

			</ul>
			
			<div class='tab-content' style="margin-top: -20px;">
				
				<div class='tab-pane active' id='tab1'>
					<div class='responsive-table' style="border-style: groove;height: 300px;">
						
						<div class='row-fluid' style="text-align: center;margin-top: 10px;">
							<label class='span3' style="line-height: 30px;text-align: right;">订单号:</label>
							<input class='span8' name="reservationnumber" value="${detail.reservationnumber}" type="text" readonly="readonly"/>
						</div>
						<div class='row-fluid' style="text-align: center;">
							<label class='span3' style="line-height: 30px;text-align: right;">姓名:</label>
							<input class='span8' name="chinesename" value="${detail.chinesename}" type="text" readonly="readonly"/>
						</div>
						<div class='row-fluid' style="text-align: center;">
							<label class='span3' style="line-height: 30px;text-align: right;">到店日期:</label>
							<input class='span8' name="arrivedate" type="text" readonly="readonly"
							value="<fmt:formatDate value='${detail.arrivedate}' pattern='yyyy-MM-dd'/>" />
						</div>
						<div class='row-fluid' style="text-align: center;">
							<label class='span3' style="line-height: 30px;text-align: right;">离店日期:</label>
							<input class='span8' name="leavedate" type="text" readonly="readonly"
							value="<fmt:formatDate value='${detail.leavedate}' pattern='yyyy-MM-dd'/>" />
						</div>
						<div class='row-fluid' style="text-align: center;">
							<label class='span3' style="line-height: 30px;text-align: right;">房间等级:</label>
							<select class='span8' name="roomtype" id="roomtype" onchange="queryByRoomTypeId()">
							  <c:forEach items="${roomtype}" var="item">
							    <option value="${item.roomtypeid}">${item.roomtypename}</option>
							  </c:forEach>
							</select>
						</div>
						<div class='row-fluid' style="text-align: center;">
							<label class='span3' style="line-height: 30px;text-align: right;">房价:</label>
							<input class='span8' name="realprice" placeholder="房价" type="number" required />
						</div>
					</div>
				</div>
			</div>
			
		</div>
		

		<div class='tabbable span6' style="margin: 0px;">
			<ul class='nav nav-tabs'>
				<li class='active'><a data-toggle='tab' href='#tab1'> <i
						class='icon-home'></i> 选房列表 </a>
				</li>

			</ul>
			<div class='tab-content' style="margin-top: -20px;">
				<div class='tab-pane active' id='tab1'>
					<div class='responsive-table' style="border-style: groove;">
						<div class='scrollable-area'
							style="height: 300px;overflow-y: auto; ">
							<table id="roomstb" class='table table-bordered table-hover table-striped' style='width: 500px;'>
								<thead>
									<tr>
										<th><input type="radio" name="Ck" id="ckbox" /></th>
										<th>房号</th>
										<th hidden>房间等级id</th>
										<th>等级</th>
										<th>楼名</th>
										<th>朝向</th>
										<th>特性</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${rooms}" var="item">
										<tr>
											<td><input type="radio" name="Ck"
												value="${item.roomsid}" /></td>
											<td>${item.roomnumber}</td>
											<td hidden>${item.roomtypeid}</td>
											<td>${item.roomtypename}</td>
											<td>${item.floorname}</td>
											<td><c:choose>
													<c:when test="${item.orientation == 1}">
														<span class="label label-warning">东</span>
													</c:when>
													<c:when test="${item.orientation == 2}">
														<span class="label label-success">南</span>
													</c:when>
													<c:when test="${item.orientation == 3}">
														<span class="label">西</span>
													</c:when>
													<c:when test="${item.orientation == 4}">
														<span class="label label-important">北</span>
													</c:when>
												</c:choose></td>
											<td>${item.characteristic}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	</form>
</body>
</html>
<script type="text/javascript">
var validate = true;
$(function(){
  $("#ChangeRoomform").validate({
     submitHandler: function(form) {  //通过之后回调 
        validate = true;
        changeRoom();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
       validate = false;
     }
   });
})

function changeRoom(){
  var ck = $("#roomstb input[name='Ck']:checked");
  var roomtypeid =  $("#roomtype option:selected").val();
  var ckid = ck[0].offsetParent.parentNode.cells[2].innerText;
  if(ckid == roomtypeid){
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/indentClientController/changeRoom.do?roomsid='+ ck.val(),
        data:$('#ChangeRoomform').serialize(),// 你的formid
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
  }else{
    validate = false;
    layer.msg("亲！选房信息有误，请重选！", {icon: 5});
  }
    
   
 }
 
function queryByRoomTypeId(){
  var roomtypeid =  $("#roomtype option:selected").val();
  $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/indentClientController/queryByRoomTypeId.do?roomtypeid='+ roomtypeid,
        async: false,
		success : function(data) {
		  var dt = eval(data);
	     $("#roomstb tbody").empty();
	     for (var k = 0; k < dt.length; k++) {
	        var orientation;
	        if(dt[k].orientation == 1){
	          orientation = "<span class='label label-warning'>东</span>"
	        }else if(dt[k].orientation == 2){
	          orientation = "<span class='label label-success'>南</span>"
	        }
	        else if(dt[k].orientation == 3){
	          orientation = "<span class='label'>西</span>"
	        }
	        else if(dt[k].orientation == 4){
	         orientation = "<span class='label label-important'>北</span>"
	        }
	        $("#roomstb tbody").append("<tr><td><input type='radio' name='Ck' value="+dt[k].roomsid+"></td>"
	        +"<td>"+dt[k].roomnumber+"</td>"
	        +"<td hidden>"+dt[k].roomtypeid+"</td>"
	        +"<td>"+dt[k].roomtypename+"</td>"
	        +"<td>"+dt[k].floorname+"</td>"
	        +"<td>"+orientation+"</td>"
	        +"<td>"+dt[k].characteristic+"</td></tr>");
	     }
		},
		error: function(request) {
           alert("出现异常！");
        }
	});
}
</script>
