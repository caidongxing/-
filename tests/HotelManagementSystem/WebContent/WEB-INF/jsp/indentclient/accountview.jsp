<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
     <form id="form" class="form-horizontal">
     <div class='toolheader' style="margin: -30px 0 10px;">
	     <div class="pull-left">
           <div class='row-fluid'>
                <div class='span4'>
                <label class='span5' style="line-height: 30px">账户类型:</label>
                    <select class='span7' name="accounttype" id="accounttype">
						<option value="1">客人</option>
						<option value="2">团队</option>
						<option value="3">特殊</option>
						<option value="4">应收</option>
					</select>
                </div>
                <div class='span3'>
                <label class='span5' style="line-height: 30px">账户名:</label>
                    <input class='span7' name="accountname" placeholder="账户名" type="text" value="" />
                </div>
                <div class='span3'>
                <label class='span4' style="line-height: 30px">编号:</label>
                 <input class='span8' name="accountcode" placeholder="编号" type="text" value="" />
                </div>
                
            </div>
	     </div>
	     <div class="pull-right">
	     <a class="btn btn-primary start" onclick="queryPage()"><i class="icon-search icon-white"></i><span>查询</span></a>
	     </div>
	   </div>
	   
	    <div class='row-fluid'>
	    <div class='responsive-table'>
          <div class='scrollable-area'>
           <table id="accountTb" class='table table-bordered table-hover table-striped' style='margin-bottom:0;'>
            <thead>
             <tr>
              <th style="width: 35px;">选择</th>
              <th hidden>账户id</th>
              <th>编号</th>
              <th>名称</th>
              <th>类型</th>
              <th>余额</th>
             </tr>
            </thead>
            <tbody>
               <c:forEach items="${account}" var="item">
                <tr>
                  <td style="width: 20px;text-align: center;"><input type="checkbox" name="checkbox" value="${item.accountid}" style="width: 15px;height: 20px"></td>
                  <td hidden>${item.accountid}</td>
                  <td>${item.accountcode}</td>
                  <td>${item.accountname}</td>
                  <td>
                   <c:choose>
					<c:when test="${item.accounttype == 1}"><span class="label label-warning">客人</span></c:when>
					<c:when test="${item.accounttype == 2}"><span class="label label-success">团队</span></c:when>
					<c:when test="${item.accounttype == 3}"><span class="label label-important">特殊</span></c:when>
					<c:when test="${item.accounttype == 4}"><span class="label label-important">应收</span></c:when>
				 </c:choose></td>
                  <td>${item.accountbalance}</td>
                </tr>
               </c:forEach>
            </tbody>
           </table>
          </div>
        </div>
       </div>
	   </form>
  </body>
</html>
<script type="text/javascript">

//实现多框单选功能
$(function(){
  $(":checkbox").click(function(){
   if($(this).attr("checked") != undefined){
     $(":checkbox").attr("checked",false);
     $(this).attr("checked",true);
    }
  });
});
</script> 
