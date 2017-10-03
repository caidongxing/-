<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<div class='container-fluid'>
<div class='row-fluid' id='content-wrapper'>
     <div class='span12'>
       <div class='page-header'>
	        <h1 class='pull-left'>
             <i class='icon-group'></i>
             <span>住店客人</span>
            </h1>
            <div class="pull-right">
              <ul class='breadcrumb'>
                    <li>
                        <a href='${ctx}'><i class='icon-group'></i>
                        </a>
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li class='active'>
                        住店客人
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li class='active'>住店客人列表</li>
                </ul>
            </div>
	   </div>
	   
	   <form id="form" class="form-horizontal">    
	   
	   <div class='toolheader'>
	     <div class="pull-left span10">
	      
           <div class='row-fluid'>
                <div class='span2'>
                <label class='span5' style="line-height: 30px">房号:</label>
                    <input class='span7' name="roomnumber" placeholder="房号" type="text" value="${detailParam.roomnumber}" />
                </div>
                <div class='span2'>
                <label class='span5' style="line-height: 30px">客名:</label>
                    <input class='span7' name="chinesename" placeholder="客名" type="text" value="${detailParam.chinesename}" />
                </div>
                <div class='span2'>
                <label class='span5' style="line-height: 30px">团会名:</label>
                 <input class='span7' name="teamname" placeholder="团会名" type="text" value="${detailParam.teamname}" />
                </div>
                <div class='span3'>
                <label class='span5' style="line-height: 30px">协议客户:</label>
                    <input class='span7' name="agreementclientname" placeholder="协议客户" type="text" value="${detailParam.agreementclientname}" />
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
           <table id="detailTbId" class='table table-bordered table-hover table-striped' style='margin-bottom:0;width: 1600px;'>
            <thead>
             <tr>
              <th>选择</th>
              <th>操作</th>
              <th>状态</th>
              <th>订单号</th>
              <th>姓名</th>
              <th>到店日期</th>
              <th>离店日期</th>
              <th hidden>房间id</th>
              <th>房号</th>
              <th>等级</th>
              <th>房价</th>
              <th>房数</th>
              <th>人数</th>
              <th>性别</th>
              <th hidden>账号id</th>
              <th>余额</th>
              <th>押金</th>
              <th>团会</th>
              <th>协议客户</th>
              <th>备注</th>
             </tr>
            </thead>
            <tbody>
               <c:forEach items="${page.result}" var="item">
                <tr class="DetailMenu" data-row-id="${item.detailid}">
                 <td><input type="checkbox" name="ck" value="${item.detailid}"></td>
                 <td>
                 <div class="btn btn-primary btn-small has-tooltip" data-placement="top" title=""  data-original-title="客人信息"
                 onclick="optionByPath('${ctx}/resideClientController/clientinfoView.do?detailid=${item.detailid}' + '&roomreservationid=${item.roomreservationid}' + '&clientinfoid=${item.clientinfoid}')">
                 <i class=" icon-user icon-white"></i>
                 </div>
                 <%-- <div class="btn btn-success btn-small has-tooltip" data-placement="right" title="" data-original-title="分配账号"
                 onclick="AllotAccount('${ctx}/resideClientController/allotaccountView.do?detailid=${item.detailid}' + '&roomreservationid=${item.roomreservationid}' + '&clientinfoid=${item.clientinfoid}')" >
                 <i class="icon-book icon-white"></i>
                 </div> --%>
                 <div class="btn btn-info btn-small has-tooltip" data-placement="bottom" title=""  data-original-title="换房" onclick="changeRoomView(${item.detailid})" ><i class="icon-retweet icon-white"></i>
                 </div>
                 <div class="btn btn-warning btn-small has-tooltip" data-placement="right" title=""   data-original-title="收押金" onclick="CashPledge(${item.detailid})" ><i class="icon-star-empty icon-white"></i>
                 </div>
                 <%-- <a class="btn btn-primary btn-small" onclick="optionByPath('${ctx}/resideClientController/clientinfoView.do?detailid=${item.detailid}' + '&roomreservationid=${item.roomreservationid}' + '&clientinfoid=${item.clientinfoid}')" ><i class=" icon-user icon-white"></i></a>
                 <a class="btn btn-success btn-small" onclick="AllotAccount('${ctx}/resideClientController/allotaccountView.do?detailid=${item.detailid}' + '&roomreservationid=${item.roomreservationid}' + '&clientinfoid=${item.clientinfoid}')" ><i class="icon-book icon-white"></i></a>
                 <a class="btn btn-info btn-small" onclick="changeRoomView(${item.detailid})" ><i class="icon-retweet icon-white"></i></a>
                 <a class="btn btn-warning btn-small" onclick="CashPledge(${item.detailid})" ><i class="icon-star-empty icon-white"></i></a>
                  --%>
                 </td>
                 <td><span class="label label-success">现住</span>
                 </td>
				 <td>${item.reservationnumber}</td>
				 <td>${item.chinesename}</td>
				 <td><fmt:formatDate value="${item.arrivedate}" pattern="yyyy-MM-dd"/></td>
				 <td><fmt:formatDate value="${item.leavedate}" pattern="yyyy-MM-dd"/></td>
				 <td hidden>${item.roomsid}</td>
				 <td>${item.roommark}</td>
				 <td>${item.roomtypename}</td>
				 <td>${item.realprice}</td>
				 <td>${item.roomnumber}/${item.freebed}</td>
				 <td>${item.adult}/${item.children}</td>
				 <td><c:choose>
				   <c:when test="${item.sex == 1}"><span class="label label-warning">男</span></c:when>
				   <c:when test="${item.sex == 2}"><span class="label label-success">女</span></c:when>
				   <c:otherwise></c:otherwise>
				 </c:choose></td>
				 <td hidden>${item.accountid}</td>
				 <td>${item.accountbalance}</td>
				 <td>${item.cashpledge}</td>
				 <td>${item.teamname}</td>
				 <td>${item.agreementclientname}</td>
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
        url : '${ctx}/resideClientController/list.do',
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

//换房
function changeRoomView(detailid){
      $.post('${ctx}/resideClientController/changeRoomView.do?detailid='+ detailid,function(result){
      layer.open({
      type: 1,
      title: '换房',
      area: '60%',
      content: result,
      btn: ['确定', '关闭'],
      yes: function(index, layero){
        $("#ChangeRoomform").submit();
        if(validate){
         layer.msg("换房成功！", {icon: 6});
         layer.close(index);//如果设定了yes回调，需进行手工关闭
        }
      },
      btn2: function(index, layero){ //按钮【按钮二】的回调
      }
    });
  });
}


//分配账号
function AllotAccount(path){
   var accountid = this.event.target.offsetParent.parentNode.cells[14].innerHTML;//offsetParent
  if(accountid < 0 || accountid == ""){
   layer.confirm('温馨提示，是否为该客人分配账号？', {
     btn: ['确定','取消'] //按钮
   },function(index, layero){
      layer.close(index);//如果设定了yes回调，需进行手工关闭
      $.ajax({
	    type : "get",
		async : false,
		url : path,
		cache: false,
		timeout : 2000,
		contentType : "application/json;charset=utf-8;",
		success : function(data) {
		  $('#content').empty();
		  $('#content').append(data);
		},
		error: function(request) {
          $('#content').empty();
		  $('#content').append(data);
        }
	 });
   });
  }else{
    layer.msg("亲！该客人已经分配了账号！", {icon: 6});
  }
}

//收押金
function CashPledge(detailid){
  var accountid = this.event.target.offsetParent.parentNode.cells[14].innerHTML;//offsetParent
  //余额
  var accountbalance = this.event.target.offsetParent.parentNode.cells[15].innerHTML;
  var cashpledge = this.event.target.offsetParent.parentNode.cells[16].innerHTML;
  if(cashpledge =="" || cashpledge == 0){
    if(accountid !="" && accountid >0){
      $.post('${ctx}/resideClientController/cashpledgeView.do?detailid='+detailid+"&accountid="+accountid,function(result){
      layer.open({
      type: 1,
      title: '收押金',
      area: '60%',
      content: result,
      btn: ['确定', '关闭'],
      yes: function(index, layero){
        if($("#payway").val() !=1){
          $("#cashpledgeform").submit();
          if(validate){
           layer.msg("成功收取押金！", {icon: 6});
           layer.close(index);//如果设定了yes回调，需进行手工关闭
          }
        }else{
        if(parseInt(accountbalance)  > $("#expenditure").val()){
          $("#cashpledgeform").submit();
          if(validate){
           layer.msg("成功收取押金！", {icon: 6});
           layer.close(index);//如果设定了yes回调，需进行手工关闭
          }
        }else{
          layer.msg("余额不足，请换一种支付方式！", {icon: 5});
        }
       }
      },
      btn2: function(index, layero){ //按钮【按钮二】的回调
      } 
    });
  });
 }else{
    layer.msg("亲！该客人暂未分配账号！", {icon: 5});
 }
  }else{
    layer.msg("亲！该客人已收取押金！", {icon: 6});
  }
  
}

  var rowId = 0 ;
  var rowElem;
  var menu = new BootstrapMenu('.DetailMenu', {
  fetchElementData: function($rowElem) {
    rowId = $rowElem.data('rowId');
    rowElem = $rowElem;
  },
  actions: [{
    name: '延住',
    iconClass: 'icon-key',
    onClick: function() {
       var len = $("#detailTbId input[name='ck']:checked").length;
       if(len > 0){
           //单一延住
         if(len == 1){
             var detailid = $("#detailTbId input[name='ck']:checked").val();
             $.post('${ctx}/resideClientController/extendedStayView.do?detailid='+ detailid,function(result){
             layer.open({
             type: 1,
             title: '延住',
             area: '25%',
             content: result,
             btn: ['确定', '关闭'],
             yes: function(index, layero){
             $("#extendedStayform").submit();
               if(validate){
                 layer.msg("延住成功！", {icon: 6});
                 layer.close(index);//如果设定了yes回调，需进行手工关闭
              }
            },
            btn2: function(index, layero){ //按钮【按钮二】的回调
            } 
          });
          
        });
          }else{  //多人延住
            var check_val = [];
             $("#detailTbId input[name='ck']:checked").each(function(){
               check_val.push($(this).val());
             });
             layer.confirm('多人延住，将会延住一天，继续吗？', function(index){
                $.post('${ctx}/resideClientController/manyExtendedStay.do?ckValue='+ check_val,
                  function(result){
                    $('#content').empty();
                    $('#content').append(result);
                });
                layer.msg("延住成功！", {icon: 6});
                layer.close(index);
             });
          }
       }else{
         layer.msg("亲！请选择客人！", {icon: 6});
       }
    }
  },{
    name: '调价',
    iconClass: 'icon-plus',
    onClick: function() {
       var len = $("#detailTbId input[name='ck']:checked").length;
       if(len > 0){
         //单一调价
        if(len == 1){
           var detailid = $("#detailTbId input[name='ck']:checked").val();
           $.post('${ctx}/resideClientController/adjustPriceView.do?detailid='+ detailid,function(result){
             layer.open({
               type: 1,
               title: '单一调价',
               area: '25%',
               content: result,
               btn: ['确定', '关闭'],
               yes: function(index, layero){
                 $("#adjustPriceform").submit();
                 if(validate){
                   layer.msg("调价成功！", {icon: 6});
                   layer.close(index);//如果设定了yes回调，需进行手工关闭
                 }
               }
             });
           });
         }else{//多人调价
          var check_val = [];
           $("#detailTbId input[name='ck']:checked").each(function(){
              check_val.push($(this).val());
           });
           layer.open({
             type: 1,
             title: '批量调价',
             area: '25%',
             content: "<form id='adjustPriceform' class='form-horizontal'style='margin: 0px;'>"
             +"<div class='row-fluid' style='text-align: center;margin-top: 15px;'>"
             +"<label class='span3' style='line-height: 30px;text-align: right;'>浮动金额:</label>"
             +"<input class='span8' name='floatMoney' id='floatMoney' type='number' required />"
             +"<div class='row-fluid' style='text-align: center;margin-top: 15px;'>"
             +"<label class='span3' style='line-height: 30px;text-align: right;'>浮动比例%:</label>"
             +"<input class='span8' name='floatRatio' id='floatRatio' type='number' required />"
             +"</div></div></form>"
             +"<span style='color: red;'>1、浮动比例只能输入正数。</span><br>"
             +"<span style='color: red;'>2、浮动金额整数上浮，负数下浮。</span><br>"
             +"<span style='color: red;'>3、浮动金额和浮动比例任输一个。</span>",
             btn: ['确定', '关闭'],
             yes: function(index, layero){
               var floatMoney = document.getElementById("floatMoney").value;
               var floatRatio = document.getElementById("floatRatio").value;
               if(floatMoney == "" && floatRatio == ""){
                  layer.msg("亲！请输入浮动金额或浮动比例！", {icon: 6});
               }else{
                $.ajax({
                 type: "POST",
                 url : '${ctx}/resideClientController/manyAdjustPrice.do?ckValue='+ check_val,
                 data:$('#adjustPriceform').serialize(),// 你的formid
                 async: false,
                 success : function(data) {
                   $('#content').empty();
                   $('#content').append(data);
                   layer.msg("调价成功！", {icon: 6});
                   layer.close(index);//如果设定了yes回调，需进行手工关闭
                 },
                 error: function(request) {
                   $('#content').empty();
                   $('#content').append(data);
                 }
               });
              }
             }
           });
         }
       }else{
         layer.msg("亲！请选择客人！", {icon: 6});
       }
    }
  },{
    name: '消费/挂账',
    iconClass: 'icon-credit-card',
    onClick: function() {
      var accountid = rowElem[0].cells[14].innerHTML;
      if(accountid !="" && accountid >0){
         $.post('${ctx}/resideClientController/expenseView.do?detailid='+ rowId+"&accountid="+accountid,
         function(result){
            layer.open({
               type: 1,
               title: '消费 / 挂账',
               area: '50%',
               content: result,
               btn: ['确定', '关闭'],
               yes: function(index, layero){
                 $("#expenseform").submit();
                 if(validate){
                   layer.msg("挂账成功！", {icon: 6});
                   layer.close(index);//如果设定了yes回调，需进行手工关闭
                 }
               }
            });
         });
      }else{
        layer.msg("亲！该客人暂未分配账号！", {icon: 5});
      }
    }
  }]
  
});

</script>
