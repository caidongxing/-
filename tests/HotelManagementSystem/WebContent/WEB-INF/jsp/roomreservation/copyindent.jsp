<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
   <form id="copyindentform" class="form-horizontal">
     <input name="roomreservationid" value="${vo.roomreservationid}" type="hidden" />
     <input name="otherinfoid" value="${vo.otherinfoid}" type="hidden" />
     <div id="copyindent" class="box">
       
       <div class='row-fluid'>
         <label class='span3' style="line-height: 30px">订单号</label>
         <input class='span9' name="reservationnumber" value="${vo.reservationnumber}" type="text" placeholder="订单号" readonly="readonly" />
       </div>
       <div class='row-fluid'>
         <label class='span3' style="line-height: 30px">客人姓名</label>
         <input class='span9' name="chinesename" id="chinesename" type="text" placeholder="客人姓名" />
       </div>
       <div class='row-fluid'>
         <label class='span3' style="line-height: 30px">团会名称</label>
         <select class='span9' name="teamid" id="teamid" placeholder="团会名称">
			<option value="">--团会名称--</option>
			<c:forEach items="${team}" var="item">
				<option value="${item.teamid}">${item.teamname}</option>
			</c:forEach>
		 </select>
       </div>
       <div class='row-fluid'>
         <div class="span6">
         <label class='span6' style="line-height: 30px">新到点时间</label>
         <input class="span6 Wdate" type="text" name="arrivedate" id="arrivedate" placeholder="到点时间" 
         onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'2020-10-01'})" />
         </div>
         <div class="span6">
         <label class='span6' style="line-height: 30px">新离店时间</label>
         <input class="span6 Wdate" type="text" name="leavedate" id="leavedate" placeholder="离店时间" 
         onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'2020-10-01'})" />
         </div>
       </div>
       <div class='row-fluid'>
         <div class="span6">
         <label class='span6' style="line-height: 30px">旧到点时间</label>
         <input class='span6' name="oldarrivedate" value="<fmt:formatDate value='${vo.arrivedate}' pattern='yyyy-MM-dd'/>" type="text" readonly="readonly" />
         </div>
         <div class="span6">
         <label class='span6' style="line-height: 30px">旧离店时间</label>
         <input class='span6' name="oldleavedate" value="<fmt:formatDate value='${vo.leavedate}' pattern='yyyy-MM-dd'/>" type="text" readonly="readonly" />
         </div>
       </div>
     </div>
     </form>
  </body>
</html>
