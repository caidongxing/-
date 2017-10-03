<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<div class='container-fluid'>
<div class='row-fluid' id='content-wrapper'>
     <div class='span12'>
       <div class='page-header'>
	        <h1 class='pull-left'>
             <i class='icon-list-alt'></i>
             <span>账务处理</span>
            </h1>
            <div class="pull-right">
              <ul class='breadcrumb'>
                    <li>
                        <a href='${ctx}'><i class='icon-table'></i>
                        </a>
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li>
                        账务处理
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li class='active'>账务单列表</li>
                </ul>
            </div>
	   </div>
	   
	   <form id="form" class="form-horizontal">    
	   
	   <div class='toolheader'>
	     <div class="pull-left span10">
	      
           <div class='row-fluid'>
                <div class='span3'>
                <label class='span5' style="line-height: 30px">客人姓名:</label>
                    <input class='span7' name="chinesename" placeholder="客人姓名" type="text" value="${chinesename}" />
                </div>
                <div class='span3'>
                <label class='span5' style="line-height: 30px">身份证号:</label>
                    <input class='span7' name="idnumber" placeholder="身份证号" type="text" value="${idnumber}" />
                </div>
                <div class='span2'>
                <label class='span5' style="line-height: 30px">房号:</label>
                    <input class='span7' name="roomnumber" placeholder="房号" type="text" value="${roomnumber}" />
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
           <table class='table table-bordered table-hover table-striped' style='width: 1200px;'>
            <thead>
             <tr>
              <th>标志</th>
              <th>客人姓名</th>
              <th>身份证号</th>
              <th>房号</th>
              <th>房价</th>
              <th>到店时间</th>
              <th>离店时间</th>
              <th>操作员</th>
              <th>结账时间</th>
              <th>结账金额</th>
              <th>结账方式</th>
              <th>备注</th>
             </tr>
            </thead>
            <tbody>
               <c:forEach items="${page.result}" var="item">
                <tr>
                 <td>${item.settleaccountsid}</td>
                 <td>${item.chinesename}</td>
                 <td>${item.idnumber}</td>
                 <td>${item.roomnumber}</td>
                 <td>${item.realprice}</td>
                 <td><fmt:formatDate value="${item.arrivedate}" pattern="yyyy-MM-dd"/></td>
                 <td><fmt:formatDate value="${item.leavedate}" pattern="yyyy-MM-dd"/></td>
                 <td>${item.operator}</td>
                 <td><fmt:formatDate value="${item.settleaccountstime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                 <td>${item.payable}</td>
                 <td>
                 <c:choose>
					<c:when test="${item.payway == 1}"><span class="label label-warning">现金</span></c:when>
					<c:when test="${item.payway == 2}"><span class="label label-success">银行卡</span></c:when>
					<c:when test="${item.payway == 3}"><span class="label label-important">支票</span></c:when>
				 </c:choose></td>
                 <td>${item.comment}</td>
                </tr>
               </c:forEach>
            </tbody>
           </table>
           
           <tiles:insertDefinition name="pagesTemplate"/>
         </div>
        </div>
	   </div>
	   
	   </form>
	   
     </div>
     
</div>
</div>
<script type="text/javascript">

function queryPage() {
   $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/settleAccountsController/list.do',
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

</script>     
