<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<div class='container-fluid'>
<div class='row-fluid' id='content-wrapper'>
     <div class='span12'>
       <div class='page-header'>
	        <h1 class='pull-left'>
             <i class='icon-home'></i>
             <span>客房预订</span>
            </h1>
            <div class="pull-right">
              <ul class='breadcrumb'>
                    <li>
                        <a href='${ctx}'><i class='icon-home'></i>
                        </a>
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li>
                        客房预订
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li class='active'>预订列表</li>
                </ul>
            </div>
	   </div>
	   
	   <form id="form" class="form-horizontal">    
	   
	   <div class='toolheader'>
	     <div class="pull-left">
	      <a class="btn btn-success start" onclick="OnloadContent('${ctx}/roomReservationController/addView.do')" ><i class="icon-plus icon-white"></i><span>新增订单</span></a>
          <a class="btn btn-primary start" onclick="OnloadContent('${ctx}/roomReservationController/list.do')" ><i class="icon-edit icon-white"></i><span>订单处理</span></a>
          
	     </div>
	     <div class="pull-right">
	     <a class="btn btn-warning start" onclick="" ><i class="icon-bar-chart icon-white"></i><span>分类统计</span></a>
	     </div>
	   </div>
	   
	   <div class='row-fluid'>
	    <div class='responsive-table'>
          <div class='scrollable-area'>
           <table id="tb" class='table table-bordered table-hover table-striped' style='margin-bottom:0;'>
            <thead>
             <tr>
              <th style="width: 20%">等级及描述</th>
              <th>房数</th>
              <c:forEach items="${datetime}" var="item">
               <th>${item}</th>
              </c:forEach>
             </tr>
            </thead>
            <tbody>
              
               <c:forEach items="${roomstotal}" var="item">
                <tr class="TableRowMenu" data-row-id="${item.roomtypeid}">
                 <td>${item.roomtypename}</td>
                 <td>${item.roomstotal}</td>
                 <td>${item.onedate}</td>
                 <td>${item.twodate}</td>
                 <td>${item.threedate}</td>
                 <td>${item.fourdate}</td>
                 <td>${item.fivedate}</td>
                 <td>${item.sixdate}</td>
                 <td>${item.sevendate}</td>
                </tr>
               </c:forEach>
              
            </tbody>
           </table>
           
         </div>
        </div>
	   </div>
	   
	   </form>
	   
     </div>
     
     
</div>
</div>
<script type="text/javascript">

var tdNode;
$(function(){
  var td = document.getElementById("tb").getElementsByTagName("td"); 
  for(var i=0;i<td.length;i++){
    td[i].oncontextmenu= function(){
      tdNode = this;
    }
  }
})

var rowId = 0 ;
var rowElem;
 var menu = new BootstrapMenu('.TableRowMenu', {
  
  fetchElementData: function($rowElem) {
    rowId = $rowElem.data('rowId');
    rowElem = $rowElem;
  },
  actions: [{
    name: '新增订单',
    iconClass: 'icon-plus',
    onClick: function() {
      
      var rowIndex = rowElem[0].rowIndex;
      var cellIndex =tdNode.cellIndex;
      var rows = document.getElementById("tb").rows.length - 1;
      var tdText = tdNode.innerHTML;
      if(tdText > 0){
      if(cellIndex > 1 && rowIndex < rows){
        var thText = document.getElementById("tb").rows[0].cells[cellIndex].innerHTML;
        var md = thText.split("星")[0];
        var myDate = new Date();
        var Year = myDate.getFullYear();
        var date = Year + "-" + md;
        //var rr = rrr.value();
        optionByPath("${ctx}/roomReservationController/addView.do?roomtypeid=" + rowId +"&arrivedate=" + date +"&tenantablenumber=" + tdText)
      }else{
        alert("请选择日期区域内数据进行操作！");
      }
      }else{
        alert("该天该房已出租完，请选其它房！");
      }
      
    }
  },{
    name: '订单处理',
    iconClass: 'icon-edit',
    onClick: function() {
      optionByPath("${ctx}/roomReservationController/list.do")
    }
  }]
     
});

</script>     
