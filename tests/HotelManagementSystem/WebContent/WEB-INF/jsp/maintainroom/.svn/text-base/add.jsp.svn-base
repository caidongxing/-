<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<div class='container-fluid'>
<div class='row-fluid' id='content-wrapper'>
     <div class='span12'>
       <div class='page-header'>
	        <h1 class='pull-left'>
             <i class='icon-strikethrough'></i>
             <span>维修房管理</span>
            </h1>
            <div class="pull-right">
              <ul class='breadcrumb'>
                    <li>
                        <a href='${ctx}'><i class='icon-strikethrough'></i>
                        </a>
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li>
                        房态管理
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li class='active'>维修房新增</li>
                </ul>
            </div>
	   </div>
	   
	   <form id="form" class="form-horizontal">    
	   
	   <div class='toolheader'>
	     <div class="pull-left span10">
	      
           <div class='row-fluid'>
                <div class='span4'>
                  <label class='span4' style="line-height: 30px">房号区间：</label>
                  <input class='span8' name="starnumber" id="starnumber" placeholder="开始房号" type="text" value="${starnumber}" />
                </div>
                <div class='span4' style="margin: 0;">
                  <label class='span2' style="line-height: 30px">——</label>
                  <input class='span8' name="endnumber" id="endnumber" placeholder="结束房号" type="text" value="${endnumber}" />
                </div>
            </div>
            
          
	     </div>
	     <div class="pull-right">
	     <a class="btn btn-primary start" onclick="queryRoomsByParam()"><i class="icon-search icon-white"></i><span>查询</span></a>
	     </div>
	   </div>
	   
	   <div class='row-fluid'>
	    
	    <div class='row-fluid span8'>
	    <div class='responsive-table'>
          <div class='scrollable-area' style="height: 450px;overflow-y: auto; ">
           <table id="roomstb" class='table table-bordered table-hover table-striped' style='margin-bottom:0;'>
            <thead>
             <tr>
              <th>选择</th>
              <th>房号</th>
              <th>楼号</th>
              <th>楼层</th>
              <th>等级</th>
              <th>特性</th>
             </tr>
            </thead>
            <tbody>
               <c:forEach items="${rooms}" var="item">
                <tr>
                 <td><input type="checkbox" name="Ck" value="${item.roomsid}"/></td>
                 <td>${item.roomnumber}</td>
                 <td>${item.floorname}</td>
                 <td>${item.floornumber}</td>
                 <td>${item.roomtypename}</td>
                 <td>${item.characteristic}</td>
                </tr>
               </c:forEach>  
            </tbody>
           </table>
           
         </div>
        </div>
        </div>
         <div class='row-fluid span4'>
           
           <div class="span12" style="border-style: groove;border-top: aliceblue;border-left: aliceblue;border-right: aliceblue;margin-top: -25px;"></div>
           <div class="span12">
				<label class='span5' style="line-height: 30px">已选房数:</label>
				<label class='span3' id="ckNum" style="line-height: 30px;color: red;font-size: xx-large;">0</label>
			</div>
			<div class="span12">
				<label class='span5' style="line-height: 30px">总计房数:</label>
				<label class='span3' id="Num" style="line-height: 30px;color: red;font-size: xx-large;">${Total}</label>
			</div>
			<div class="span12" style="border-style: groove;border-bottom: aliceblue;border-left: aliceblue;border-right: aliceblue;margin-top: 15px;">
				<label class='span3' style="line-height: 30px">开始时间:</label>
				<input class="span8 Wdate" type="text" name="starttime" placeholder="开始时间" required
				onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'2020-10-01'})" />
			</div>
			<div class="span12" style="margin-top: 15px;">
				<label class='span3' style="line-height: 30px">终止时间:</label>
				<input class="span8 Wdate" type="text" name="endtime" placeholder="终止时间" required
				onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'2020-10-01'})" />
			</div>
			
			<div class="span12" style="margin-top: 15px;">
				<label class='span3' style="line-height: 30px">原因:</label>
				<input class="span8" type="text" name="reason" placeholder="原因" required/>
			</div>
			
			<div class="span12" style="margin-top: 15px;">
				<label class='span3' style="line-height: 30px">备注:</label>
				<textarea rows="6" class="span8" name="comment"></textarea>
			</div>
			
			<div class="span12" style="border-style: groove;border-bottom: aliceblue;border-left: aliceblue;border-right: aliceblue;margin-top: 10px;"></div>
				<div class="pull-right">
					<button type="submit" class="btn btn-success" > <i class="icon-ok"></i><span>确定</span></button>
					<button type="button" class="btn btn-danger" onclick="GoBackList('${ctx}/roomStatusController/maintainList.do?roomstatus=3')"> <i class="icon-remove"></i><span>关闭</span></button>
			    </div>
			</div>
			
         </div>
        
	   </div>
	   
	   </form>
	   
     </div>
     
</div>
</div>
<script type="text/javascript">

function queryRoomsByParam(){
  var starnumber = $("#starnumber").val(); 
  var endnumber = $("#endnumber").val(); 
  $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/indentClientController/queryRoomsByParam.do?starnumber='+starnumber+"&endnumber="+endnumber,
        async: false,
		success : function(data) {
		  var dt = eval(data);
	     $("#roomstb tbody").empty();
	     for (var k = 0; k < dt.length; k++) {
	        
	        $("#roomstb tbody").append("<tr><td><input type='checkbox' value="+dt[k].roomsid+"></td>"
	        +"<td>"+dt[k].roomnumber+"</td>"
	        +"<td>"+dt[k].floorname+"</td>"
	        +"<td>"+dt[k].floornumber+"</td>"
	        +"<td>"+dt[k].roomtypename+"</td>"
	        +"<td>"+dt[k].characteristic+"</td></tr>");
	     }
		},
		error: function(request) {
           alert("出现异常！");
        }
	});   
}

$(function(){
  
  $("#form").validate({
     submitHandler: function(form) {  //通过之后回调 
        maintainroomAdd();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       layer.msg("还有必填项没填，请填完！", {icon: 5});
     }
   });
   
   
   $("#roomstb input[name='Ck']").click(function(){
       var length = $("#roomstb input[name='Ck']:checked").length;
       document.getElementById("ckNum").innerText = length;
   });
})

//新增非出租房
function maintainroomAdd(){
  
  var yixuan = document.getElementById("ckNum").innerText;
  var yifen = document.getElementById("Num").innerText;
  if(yixuan <= 0){
    layer.msg("亲！还未选择房间！", {icon: 5});
  }else{
    var ck = $("#roomstb input[name='Ck']:checked");
    var roomsid = [];
    for(var k = 0; k < ck.length; k++){
      roomsid.push(ck[k].value);
    }
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/roomStatusController/maintainroomAdd.do?ckValue=' + roomsid,
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
}
</script>     
