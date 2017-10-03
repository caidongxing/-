<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
    <div class='row-fluid' style="margin: 5px 8px;width: 95%;">
	     <div class='row-fluid span6'>
	       <span style="font-size: 25px;font-weight: 800;">${detail.chinesename}</span>
	       <span style="color: royalblue;font-size: 16px;font-weight: 600;">&nbsp;&nbsp;${detail.roommark}&nbsp;/&nbsp;${detail.roomtypename}</span><br>
	       <span><fmt:formatDate value="${detail.arrivedate}" pattern="yyyy-MM-dd"/></span>
	       <span>&nbsp;至&nbsp;</span>
	       <span><fmt:formatDate value="${detail.leavedate}" pattern="yyyy-MM-dd"/></span>
	     </div>
	     <div class='row-fluid span3' style="margin: 0px;margin-top: 15px;">
	       <span style="font-size: 25px;font-weight: 800;color: initial;background-color: #e8a8cf;border-radius: 10px;">${rooms.floorname}</span>
	     </div>
	     <div class='row-fluid span2' style="margin: 0px;margin-top: 15px;">
	       <span style="font-size: 25px;font-weight: 800;color: aliceblue;background-color: #049cdb;border-radius: 10px;">
	       <c:choose>
	        <c:when test="${detail.roomstatus == 1}">预订</c:when>
	        <c:when test="${detail.roomstatus == 2}">现住</c:when>
	       </c:choose>
	       </span>
	     </div>
	   </div>
	   <div class='row-fluid' style="border: 1px solid red;width: 95%;margin: 5px 12px;">
	     <div class='row-fluid span3'>
	       <div style="height: 80px;width: 80px;background: #6db0ea;border-radius: 40px;margin: 5px 15px;">
	         <span style="line-height: 80px;margin: 0px 15%;font-weight: 800;color: aliceblue;">${detail.realprice}</span>
	       </div>
	       <div><span style="margin: 0 40px;color: #6db0ea;font-size: 16px;font-weight: 600;">房价</span></div>
	     </div>
	     <div class='row-fluid span3'>
	       <div style="height: 80px;width: 80px;background: #4cbd3f;border-radius: 40px;margin: 5px 15px;">
	         <span style="line-height: 80px;margin: 0px 15%;font-weight: 800;color: aliceblue;">${expenditure != 0 ? expenditure : '0.00'}</span>
	       </div>
	       <div><span style="margin: 0 40px;color: #4cbd3f;font-size: 16px;font-weight: 600;">消费</span></div>
	     </div>
	     <div class='row-fluid span3'>
	       <div style="height: 80px;width: 80px;background: #cac416;border-radius: 40px;margin: 5px 15px;">
	         <span style="line-height: 80px;margin: 0px 15%;font-weight: 800;color: aliceblue;">${detail.cashpledge != null ? detail.cashpledge : '0.00'}</span>
	       </div>
	       <div><span style="margin: 0 40px;color: #cac416;font-size: 16px;font-weight: 600;">收款</span></div>
	     </div>
	     <div class='row-fluid span3'>
	       <div style="height: 80px;width: 80px;background: #de49da;border-radius: 40px;margin: 5px 15px;">
	         <span style="line-height: 80px;margin: 0px 15%;font-weight: 800;color: aliceblue;">${detail.accountbalance != null ? detail.accountbalance : '0.00'}</span>
	       </div>
	       <div><span style="margin: 0 40px;color: #de49da;font-size: 16px;font-weight: 600;">余额</span></div>
	     </div>
	   </div>
  </body>
</html>
