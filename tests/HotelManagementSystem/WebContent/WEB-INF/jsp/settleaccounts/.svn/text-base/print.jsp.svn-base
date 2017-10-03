<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
    <div class='row-fluid'>
      <h1 style="text-align: center;">华仪酒店结账凭证</h1>
      <div class='pull-right' style="margin-right: 40px;">
        <label class='span5' style="line-height: 30px;font-size: 18px;">单号:</label>
		<label class='span7' style="line-height: 30px;font-size: 18px;">20170220200657</label>
      </div>
      <div class="span12" style="border-style: groove;border-bottom: aliceblue;border-left: aliceblue;border-right: aliceblue;margin-top: 15px;margin: 0px;"></div>
      <div class='row-fluid' style="text-align: center;">
        <div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">房号:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${detail.roommark}</label>
		</div>
		<div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">姓名:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${detail.chinesename}</label>
		</div>
		<div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">房间类型:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${detail.roomtypename}</label>
		</div>
      </div>
      <div class='row-fluid' style="text-align: center;margin-top: 5px;">
        <div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">到店时间:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">
			<fmt:formatDate value="${detail.arrivedate}" pattern="yyyy-MM-dd"/>
			</label>
		</div>
		<div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">离店时间:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">
			<fmt:formatDate value="${detail.leavedate}" pattern="yyyy-MM-dd"/>
			</label>
		</div>
		<div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">住店天数:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${day}</label>
		</div>
      </div>
      <div class='row-fluid' style="text-align: center;margin-top: 5px;">
        <div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">已收金额:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${Proceeds}</label>
		</div>
        <div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">房租:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${Realprice}</label>
		</div>
		<div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">消费金额:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${Expenditure}</label>
		</div>
      </div>
      <div class='row-fluid' style="text-align: center;margin-top: 5px;">
        <div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">结账金额:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${Payable}</label>
		</div>
		<div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">退款金额:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${Payable < 0 ? 0-Payable : 00.00}</label>
		</div>
		<div class='span4'>
			<label class='span5' style="line-height: 30px;font-size: 18px;">操作员:</label>
			<label class='span7' style="line-height: 30px;font-size: 18px;">${user.username}</label>
		</div>
      </div>
      <div class="row-fluid" style="text-align: center;margin-top: 5px;">
	    <div class='span12'>
		   <label class='span2' style="line-height: 30px;font-size: 18px;">备注:</label>
		   <label class='span7' style="line-height: 30px;font-size: 18px;"></label>
		</div>
	  </div>
	  <h2>宾客消费明细</h2>
	  <div class='row-fluid' style="text-align: center;margin-top: 5px;">
	    <div class='responsive-table'>
	      <div class='scrollable-area'>
	        <table class='table table-bordered table-hover table-striped'>
	          <thead>
	           <tr>
	            <th>代码</th>
	            <th>描述</th>
	            <th>金额</th>
	            <th>记录数</th>
	           </tr>
	          </thead>
	          <tbody>
	            <c:forEach items="${signbilldetail}" var="item">
	              <tr>
	               <td>${item.accountitemsid}</td>
	               <td>${item.consumerdescribe}</td>
	               <td>${item.expenditure}
	               <c:choose>
	                <c:when test="${item.isproceeds == 0}"><span class='label label-warning'>待收</span></c:when>
					<c:when test="${item.isproceeds == 1}"><span class='label label-success'>已收</span></c:when>
	               </c:choose>
	               </td>
	               <td>${item.quantity}</td>
	              </tr>
	            </c:forEach>
	          </tbody>
	        </table>
	      </div>
	    </div>
	  </div>
	  <div class="span12" style="border-style: groove;border-bottom: aliceblue;border-left: aliceblue;border-right: aliceblue;margin-top: 15px;margin: 0px;"></div>
      <div class="row-fluid" style="text-align: center;margin-top: 5px;">
	    <div class='pull-left'>
	    <label style="line-height: 30px;font-size: 18px;">客人签名:</label>
	    </div>
	    <div class='pull-right'>
	    <label style="line-height: 30px;font-size: 18px;">
	    <fmt:formatDate value="${nowadays}" pattern="yyyy-MM-dd HH:mm:ss"/>
	    </label>
	    </div>
	  </div>
    </div>
  </body>
</html>
