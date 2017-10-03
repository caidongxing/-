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
							<li>客人信息列表</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li class='active'>分房</li>
						</ul>
					</div>
				</div>

				<div class="row-fluid" style="margin-top: -20px;">
					<div class='row-fluid'>
						<div class='tabbable span6'>
							<ul class='nav nav-tabs'>
								<li class='active'><a data-toggle='tab' href='#tab1'> <i
										class='icon-user'></i> 已选账户列表 </a>
								</li>

							</ul>
							<div class='tab-content' style="margin-top: -20px;">
								<div class='tab-pane active' id='tab1'>
								  <div class='responsive-table' style="border-style: groove;">
								  <div class='scrollable-area' style="height: 500px;overflow-y: auto; ">
								   <table id="detailTb" class='table table-bordered table-hover table-striped' style='margin-bottom:0;'>
								     <thead>
								      <tr>
								      <th>序号</th>
								      <th hidden>明细id</th>
								      <th hidden>房间等级id</th>
								      <th>等级</th>
								      <th>人数</th>
								      <th>到店日期</th>
								      <th>离店日期</th>
								      <th>选房要求</th>
								      </tr>
								     </thead>
								     <c:forEach items="${detail}" var="item" varStatus="status">
								       <tr>
								        <td>${status.index + 1}</td>
								        <td hidden>${item.detailid}</td>
								        <td hidden>${item.roomtype}</td>
								        <td>${item.roomtypename}</td>
								        <td>${item.adult}/${item.children}</td>
								        <td><fmt:formatDate value="${item.arrivedate}" pattern="yyyy-MM-dd"/></td>
								        <td><fmt:formatDate value="${item.leavedate}" pattern="yyyy-MM-dd"/></td>
								        <td>${item.choosehouseclaim}</td>
								       </tr>
								     </c:forEach>
								   </table>
								   </div>
								 </div>
								</div>
							</div>
						</div>
						
						<div class='tabbable span6'>
							<ul class='nav nav-tabs'>
								<li class='active'><a data-toggle='tab' href='#tab1'> <i
										class='icon-home'></i> 选房列表 </a>
								</li>

							</ul>
							<div class='tab-content' style="margin-top: -20px;">
								<div class='tab-pane active' id='tab1'>
								 <div class='responsive-table span8' style="border-style: groove;">
								   <div class='scrollable-area' style="height: 500px;overflow-y: auto; ">
								   <table id="roomstb" class='table table-bordered table-hover table-striped' style='width: 500px;'>
								     <thead>
								      <tr>
								      <th><input type="checkbox" id="ckbox"/></th>
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
								         <td><input type="checkbox" name="Ck" value="${item.roomsid}" /></td>
								         <td>${item.roomnumber}</td>
								         <td hidden>${item.roomtypeid}</td>
								         <td>${item.roomtypename}</td>
								         <td>${item.floorname}</td>
								         <td>
								         <c:choose>
								         <c:when test="${item.orientation == 1}"><span class="label label-warning">东</span></c:when>
								         <c:when test="${item.orientation == 2}"><span class="label label-success">南</span></c:when>
								         <c:when test="${item.orientation == 3}"><span class="label">西</span></c:when>
								         <c:when test="${item.orientation == 4}"><span class="label label-important">北</span></c:when>
								         </c:choose></td>
								         <td>${item.characteristic}</td>
								         </tr>
								       </c:forEach>
								     </tbody>
								   </table>
								   </div>
								 </div>
								 <form id="Roomsform" class="form-horizontal" style="margin-top: -21px;">
								 <div class='row-fluid span4' style="margin: 0">
								   <div class="span12"></div>
								   <div class="span12">
									<label class='span4' style="line-height: 30px">楼号:</label>
									<select class='span8' name="floorid" id="floorid"  onchange="selectById()">
									  <option value="0">---全部---</option>
									  <c:forEach items="${floor}" var="item">
									   <option value="${item.floorid}">${item.floornumber}</option>
									  </c:forEach>
									</select>
								   </div>
								   <div class="span12">
									<label class='span4' style="line-height: 30px">楼层:</label>
									<select class='span8' name="floornumber" id="floornumber">
									  <option value="0">---全部---</option>
									  
									</select>
								   </div>
								   <div class="span12">
									<label class='span4' style="line-height: 30px">朝向:</label>
									<select class='span8' name="orientation">
									  <option value="0">---全部---</option>
									  <option value="1">东</option>
									  <option value="2">南</option>
									  <option value="3">西</option>
									  <option value="4">北</option>
									</select>
								   </div>
								   <div class="span12">
									<label class='span4' style="line-height: 30px">特性:</label>
									<select class='span8' name="characteristic" >
									  <option value="">---全部---</option>
									  <c:forEach items="${characteristic}" var="item">
									   <option value="${item.characteristic}">${item.characteristic}</option>
									  </c:forEach>
									</select>
								   </div>
								   <div class="span12" style="border-style: groove;border-bottom: aliceblue;border-left: aliceblue;border-right: aliceblue;margin-top: 15px;"></div>
								   <div class="span12">
									<label class='span4' style="line-height: 30px">房号:</label>
									<input class="span8" type="text" name="starnumber" placeholder="房号">
								   </div>
								   <div class="span12">
									<label class='span4' style="line-height: 30px">--至:</label>
									<input class="span8" type="text" name="endnumber" placeholder="房号">
								   </div>
								   <div class="pull-right">
								    <button type="button" class="btn btn-primary" onclick="queryRoomsByParam()"> <i class="icon-search"></i><span>查找</span></button>
								   </div>
								   <div class="span12" style="border-style: groove;border-bottom: aliceblue;border-left: aliceblue;border-right: aliceblue;margin-top: 15px;"></div>
								   
								   <div class="span12">
									<label class='span5' style="line-height: 30px">已选房数:</label>
									<label class='span3' id="ckNum" style="line-height: 30px;color: red;font-size: xx-large;">0</label>
								   </div>
								   
								   <div class="span12">
									<label class='span5' style="line-height: 30px">待分房数:</label>
									<label class='span3' id="Num" style="line-height: 30px;color: red;font-size: xx-large;">0</label>
								   </div>
								   
								   <div class="span12" style="border-style: groove;border-bottom: aliceblue;border-left: aliceblue;border-right: aliceblue;margin-top: 10px;"></div>
								   <div class="pull-right">
								    <button type="button" class="btn btn-success" onclick="AllotRoom()"> <i class="icon-ok"></i><span>确定</span></button>
								    <button type="button" class="btn btn-danger" onclick="GoBackList('${ctx}/indentClientController/list.do')"> <i class="icon-remove"></i><span>关闭</span></button>
								   </div>
								 </div>
								 </form>
								</div>
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

$("document").ready(function(){ 
   $("#roomstb input[name='Ck']").click(function(){
       var length = $("#roomstb input[name='Ck']:checked").length;
       document.getElementById("ckNum").innerText = length;
   });
   
   $("#ckbox").click(function(){
     if($(this).attr("checked") != undefined){
       $("#roomstb input[name='Ck']").attr("checked",'true');//全选
       var length = $("#roomstb input[name='Ck']:checked").length;
        document.getElementById("ckNum").innerText = length;
     }else{
       $("#roomstb input[name='Ck']").removeAttr("checked");//取消全选
       var length = $("#roomstb input[name='Ck']:checked").length;
       document.getElementById("ckNum").innerText = length; 
     }
   });
   
   //待分房数
   document.getElementById("Num").innerText = $("#detailTb tr").length - 1;
   
})


  function selectById(){
     var floorid =  $("#floorid option:selected").val();
     $.ajax({
	    type : "get",
		async : false,
		url : '${ctx}/roomStatusController/selectById.do?id='+ floorid,
		cache: false,
		timeout : 2000,
		contentType : "application/json;charset=utf-8;",
		dataType : "json",
		success : function(data) {
		  $('#floornumber').empty();
		  $('#floornumber').append('<option value="0">---全部---</option>');
		  for(var i =1; i <= data['numberplies']; i++){
		    var C = i > 9 ? i : "0"+ i;
		    
		    $('#floornumber').append('<option value="'+ i +'">'+ C +'楼</option>');
		  }
		}
	});
   }
function queryRoomsByParam(){
  $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/indentClientController/queryRoomsByParam.do',
        data:$('#Roomsform').serialize(),// 你的formid
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
	        $("#roomstb tbody").append("<tr><td><input type='checkbox' value="+dt[k].roomsid+"></td>"
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


//确定分房
function AllotRoom(){
  
  var yixuan = document.getElementById("ckNum").innerText;
  var yifen = document.getElementById("Num").innerText;
  if(yixuan > yifen){
    layer.msg("亲！已选房数大于待分房数，请重选！", {icon: 5});
  }else if(yixuan < yifen){
    layer.msg("亲！已选房数小于待分房数，请重选！", {icon: 5});
  }else{
    var tr = $("#detailTb tr");
    var ck = $("#roomstb input[name='Ck']:checked");
    var detailid = [];
    var roomsid = [];
    for (var i = 1; i < tr.length; i++) {
    
      var detailId = tr[i].cells[1].innerText;
      var rtid = tr[i].cells[2].innerText;
    for(var k = 0; k < ck.length; k++){
      
      var roomsId = ck[k].value;
      var roomtypeid = ck[k].offsetParent.parentNode.cells[2].innerText;
      if(rtid == roomtypeid && detailid.indexOf(detailId) < 0 && roomsid.indexOf(roomsId) < 0){
         detailid.push(detailId);
         roomsid.push(roomsId);
      }
    }
  }
  if(tr.length-1 != detailid.length){
    layer.msg("亲！有已选和待分房间等级不同，亲重选！", {icon: 6});
    return false;
  }
  $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/indentClientController/allotRoom.do?detailid='+detailid+"&roomsid="+roomsid,
        async: false,
		success : function(data) {
		  layer.msg("亲！分房成功！", {icon: 6});
		  $('#content').empty();
		  $('#content').append(data);
		},
		error: function(request) {
          $('#content').empty();
		  $('#content').append(data);
        }
	});
 }
}
</script>
