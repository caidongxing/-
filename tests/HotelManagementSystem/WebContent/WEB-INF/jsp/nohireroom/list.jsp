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
             <span>非出租房管理</span>
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
                    <li class='active'>非出租房列表</li>
                </ul>
            </div>
	   </div>
	   
	   <form id="form" class="form-horizontal">    
	   
	   <div class='toolheader'>
	     <div class="pull-left span8">
           <div class='row-fluid'>
                <div class='span5'>
                  <label class='span4' style="line-height: 30px">房号区间：</label>
                  <input class='span8' name="starnumber" placeholder="开始房号" type="text" value="${starnumber}" />
                </div>
                <div class='span4' style="margin: 0;">
                  <label class='span2' style="line-height: 30px">——</label>
                  <input class='span8' name="endnumber" placeholder="结束房号" type="text" value="${endnumber}" />
                </div>
            </div>
	     </div>
	     <div class="pull-right">
	     <a class="btn btn-primary start" onclick="queryPage()"><i class="icon-search icon-white"></i><span>查询</span></a>
	     <a class="btn btn-success start" onclick="add()"><i class="icon-plus icon-white"></i><span>新增</span></a>
	     <a class="btn btn-warning start" onclick="accomplish()"><i class="icon-ok icon-white"></i><span>完成</span></a>
	     </div>
	   </div>
	   
	   <div class='row-fluid'>
	    <div class='responsive-table'>
          <div class='scrollable-area'>
           <table id="nohireroomTb" class='table table-bordered table-hover table-striped' style='margin-bottom:0;'>
            <thead>
             <tr>
              <th>选择</th>
              <th>状态</th>
              <th>房号</th>
              <th>起始时间</th>
              <th>终止时间</th>
              <th>原因</th>
              <th>备注</th>
             </tr>
            </thead>
            <tbody>
               <c:forEach items="${page.result}" var="item">
                <tr>
                 <td><input type="checkbox" name="Ck" value="${item.nohireroomid}"/></td>
                 <td><span class="label purple-background">非出租</span></td>
                 <td>${item.roomnumber}</td>
                 <td><fmt:formatDate value="${item.starttime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                 <td><fmt:formatDate value="${item.endtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                 <td>${item.reason}</td>
                 <td>${item.comment}</td>
                 <td><a class="btn btn-warning btn-small" onclick="UpdateView(${item.nohireroomid})" ><i class="icon-edit icon-white"></td>
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
        url : '${ctx}/roomStatusController/nohireList.do?roomstatus=4',
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

function add(){
  $.post('${ctx}/roomStatusController/nohireAddView.do',function(result){
      $('#content').empty();
	  $('#content').append(result);
  });
}

function UpdateView(nohireroomid){
  $.post('${ctx}/roomStatusController/nohireUpdateView.do?nohireroomid='+ nohireroomid,function(result){
      layer.open({
      type: 1,
      title: '非出租房修改',
      area: '30%',
      content: result,
      btn: ['确定', '关闭'],
      yes: function(index, layero){
        $("#nohireroomfrom").submit();
        if(validate){
         layer.msg("修改成功！", {icon: 6});
         layer.close(index);//如果设定了yes回调，需进行手工关闭
        }
      },
      btn2: function(index, layero){ //按钮【按钮二】的回调
      }
    });
  });
}

function accomplish(){
    var ck = $("#nohireroomTb input[name='Ck']:checked");
    if(ck.length > 0){
      var roomsid = [];
      for(var k = 0; k < ck.length; k++){
         roomsid.push(ck[k].value);
      }
      layer.confirm('是否要将房间改为可出租状态？', {
          btn: ['确定','取消'] //按钮
      },function(index){
        $.post('${ctx}/roomStatusController/accomplish.do?ckValue='+ roomsid,
         function(result){
          $('#content').empty();
		  $('#content').append(result);
       });
       layer.close(index);
      });
      
    }else{
      layer.msg("亲！还未选择房间！", {icon: 5});
    }
    
}
</script>     
