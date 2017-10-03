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
             <span>订单处理</span>
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
                        订单处理
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li class='active'>客房预订单列表</li>
                </ul>
            </div>
	   </div>
	   
	   <form id="form" class="form-horizontal">    
	   
	   <div class='toolheader'>
	     <div class="pull-left span10">
	      
           <div class='row-fluid'>
                <div class='span2'>
                <label class='span5' style="line-height: 30px">客团名:</label>
                    <input class='span7' name="teamname" placeholder="客团名" type="text" value="${roomReservation.teamname}" />
                </div>
                <div class='span2'>
                <label class='span5' style="line-height: 30px">订单号:</label>
                    <input class='span7' name="reservationnumber" placeholder="订单号" type="text" value="${roomReservation.reservationnumber}" />
                </div>
                <div class='span2'>
                <label class='span5' style="line-height: 30px">散团:</label>
                   <select class='span7' name="signbilltemplateid" id="signbilltemplateid">
                   <option value="">全部</option>
                   <option value="1" ${roomReservation.signbilltemplateid eq 1 ? "selected='selected'" : "" }>散客</option>
                   <option value="2" ${roomReservation.signbilltemplateid eq 2 ? "selected='selected'" : "" }>团会</option>
				  </select>
                </div>
                <div class='span3'>
                <label class='span5' style="line-height: 30px">协议客户:</label>
                    <input class='span7' name="agreementclientname" placeholder="协议客户" type="text" value="${roomReservation.agreementclientname}" />
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
           <table class='table table-bordered table-hover table-striped' style='margin-bottom:0;'>
            <thead>
             <tr>
              <th>标志</th>
              <th>状态</th>
              <th>订单号</th>
              <th>协议客户</th>
              <th>团会</th>
              <th>销售员</th>
              <th>到店日期</th>
              <th>离店日期</th>
              <th>房数</th>
              <th>人数</th>
              <th>联系人</th>
              <th>电话</th>
              <th>备注</th>
             </tr>
            </thead>
            <tbody>
               <c:forEach items="${page.result}" var="item">
                <tr class="TableRowMenu" data-row-id="${item.roomreservationid}">
                 <td>${item.roomreservationid}</td>
                 <td>
                 <c:choose>
					<c:when test="${item.reservationstatus == 1}"><span class="label label-warning">预订</span></c:when>
					<c:when test="${item.reservationstatus == 2}"><span class="label label-success">现住</span></c:when>
					<c:when test="${item.reservationstatus == 3}"><span class="label label-important">取消</span></c:when>
					<c:when test="${item.reservationstatus == 4}"><span class="label label-important">离店</span></c:when>
					<c:when test="${item.reservationstatus == 5}"><span class="label label-important">失约</span></c:when>
				 </c:choose></td>
                 <td>${item.reservationnumber}</td>
                 <td>${item.agreementclientname}</td>
                 <td>${item.teamname}</td>
                 <td>${item.salesmanname}</td>
                 <td><fmt:formatDate value="${item.arrivedate}" pattern="yyyy-MM-dd"/>
                 </td>
                 <td><fmt:formatDate value="${item.leavedate}" pattern="yyyy-MM-dd"/>
                 </td>
                 <td>${item.roomnumber}/${item.freebed}</td>
                 <td>${item.adult}/${item.children}</td>
                 <td>${item.contacts}</td>
                 <td>${item.phone}</td>
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
     <div id="certigier" class="box" style="display: none;">
      <div class='control-group'>
         <label class='span4' style="line-height: 30px">授权人</label>
         <select class='span8' id="certigierid" name="certigierid">
          <c:forEach items="${user}" var="item">
			 <option value="${item.userid}">${item.rolename}</option>
		  </c:forEach>
         </select>
       </div>
       <div class='control-group'>
         <label class='span4' style="line-height: 30px">原因</label>
         <input class='span8' name="reason" id="reason" type="text" placeholder="原因" required="required" />
       </div>
     
     </div>
     
</div>
</div>
<script type="text/javascript">

function queryPage() {
   $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/roomReservationController/list.do',
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

 var rowId = 0 ;
 var rowElem;
 var menu = new BootstrapMenu('.TableRowMenu', {
  
  fetchElementData: function($rowElem) {
    rowId = $rowElem.data('rowId');
    rowElem = $rowElem;
  },
  actions: [{
    name: '修改订单',
    iconClass: 'icon-edit',
    onClick: function() {
    var status = rowElem[0].cells[1].innerText;
    if(status == "预订"){
      optionByPath("${ctx}/roomReservationController/updateView.do?id=" + rowId)
    }else{
       layer.msg("亲！只有预订状态才能修改喔！", {icon: 6});
    }
      
    }
  },{
    name: '复制订单',
    iconClass: 'icon-copy',
    onClick: function() {
      $.post('${ctx}/roomReservationController/copyindentView.do?id='+ rowId,function(result){
       layer.open({
        type: 1,
        title: '复制订单',
        area: '40%',
        shadeClose: true, //点击遮罩关闭
        content: result, //注意，如果str是object，那么需要字符拼接。
        btn: ['确定', '关闭'],
        yes: function(index, layero){
           $.ajax({
            cache: true,
            type: "POST",
            url : '${ctx}/roomReservationController/copyindent.do',
            data:$('#copyindentform').serialize(),// 你的formid
            async: false,
            success : function(data) {
              layer.close(index);//如果设定了yes回调，需进行手工关闭
              
              layer.confirm('需要查询新订单吗？', {
                btn: ['确定','取消'] //按钮
              },function(){
                layer.msg('大宗订单界面', {icon: 1});
              }, function(){
                $('#content').empty();
                $('#content').append(data);
              });
              
            },
            error: function(request) {
              $('#content').empty();
              $('#content').append(data);
            }
          });
        },
        btn2: function(index, layero){ //按钮【按钮二】的回调
          layer.msg("没有修改！", {icon: 1});
        }
        
       });
       
      });
    }
  },{
    name: '取消订单',
    iconClass: 'icon-remove ',
    onClick: function() {
      layer.open({
      title: '授权人',
      type: 1,
      area: '20%',
      shadeClose: true, //点击遮罩关闭
      content: $('#certigier'),
      btn: ['确定', '关闭'],
      yes: function(index, layero){
        $.ajax({
          type: "POST",
          url : '${ctx}/roomReservationController/abolish.do?roomreservationid='+ rowId + "&certigierid="+$("#certigierid").val()+"&reason="+$("#reason").val(),
          success : function(data) {
            layer.close(index);//如果设定了yes回调，需进行手工关闭
            layer.msg("取消成功！", {icon: 1});
            $('#content').empty();
		    $('#content').append(data);
          }
        });
        
      },
      btn2: function(index, layero){ //按钮【按钮二】的回调
        layer.msg("没有修改！", {icon: 1});
      }
     });
    }
  }]
});

</script>     
