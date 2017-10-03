<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<body>
   <form id="nohireroomfrom" class="form-horizontal" >
	
	<input type="hidden" value="${nohireroom.nohireroomid}" name="nohireroomid">
	<input type="hidden" value="${nohireroom.roomsid}" name="roomsid">
	<div class="row-fluid" style="margin-top: 5px;">
	   <label class='span3' style="line-height: 30px;text-align: right;">状态:</label>
	   <select class="span8" name="status">
	     <option value="3" ${nohireroom.status eq 3 ? "selected='selected'" :"" }>维修中</option>
	     <option value="2" ${nohireroom.status eq 2 ? "selected='selected'" :"" }>可出租</option>
	   </select>
	</div>
	<div class="row-fluid" style="margin-top: 5px;">
	   <label class='span3' style="line-height: 30px;text-align: right;">房号:</label>
	   <input class="span8" type="text" name="roomnumber" value="${nohireroom.roomnumber}" placeholder="房号" readonly="readonly" />
	</div>
	<div class="row-fluid" style="margin-top: 5px;">
	   <label class='span3' style="line-height: 30px;text-align: right;">开始时间:</label>
	   <input class="span8 Wdate" type="text" name="starttime" placeholder="开始时间" required
	   value="<fmt:formatDate value='${nohireroom.starttime}' pattern='yyyy-MM-dd HH:mm:ss'/>" 
	   onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'2020-10-01'})" />
	</div>
	<div class="row-fluid" style="margin-top: 5px;">
	   <label class='span3' style="line-height: 30px;text-align: right;">结束时间:</label>
	   <input class="span8 Wdate" type="text" name="endtime" placeholder="结束时间" required
	   value="<fmt:formatDate value='${nohireroom.endtime}' pattern='yyyy-MM-dd HH:mm:ss'/>" 
	   onFocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'2020-10-01'})" />
	</div>
	<div class="row-fluid" style="margin-top: 5px;">
	   <label class='span3' style="line-height: 30px;text-align: right;">原因:</label>
	   <input class="span8" type="text" name="reason" value='${nohireroom.reason}' placeholder="原因" required />
	</div>
	<div class="row-fluid" style="margin-top: 5px;">
	   <label class='span3' style="line-height: 30px;text-align: right;">备注:</label>
	   <textarea rows="6" class="span8" name="comment">${nohireroom.comment}</textarea>
	</div>
	
  </form>
</body>
<script type="text/javascript">
var validate = true;
$(function(){
  
  $("#nohireroomfrom").validate({
     submitHandler: function(form) {  //通过之后回调 
        validate = true;
        nohireUpdate();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       validate = false;
       layer.msg("还有必填项没填，请填完！", {icon: 5});
     }
   });

})

//修改非出租房
function nohireUpdate(){
  
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/roomStatusController/maintainroomUpdate.do',
        data:$('#nohireroomfrom').serialize(),// 你的formid
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
