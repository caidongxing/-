<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8" />
<title><tiles:insertAttribute name="title" ignore="true" />
</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="Mosaddek" name="author" />

<style type="text/css">
.select2-container{
  margin-left: -1px !important;
}
</style>

</head>

<body>
<div class='container-fluid'>
  <div class='row-fluid' id='content-wrapper'>
     <div class='span12'>
      <div class='page-header'>
	        <h1 class='pull-left'>
             <i class='icon-table'></i>
             <span>房态图</span>
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
                        房态管理
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li>房态图</li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li class='active'>新增</li>
                </ul>
            </div>
	       </div>
	       
	       <div class='span12'>
	         <div class='box-content'>
	           <form id="form" class="form-horizontal">
	             
                <div class='control-group'>
                <div class='span6'>
                   <label class='span2' style="line-height: 30px">房间数量:</label>
                   <input class='span8' name="roomsnumber" type="number" placeholder="房间数量"/>
                </div>
                
                <div class='span6'>
                   <label class='span2' style="line-height: 30px">楼号:</label>
                   <select class='span8' name="floorid" id="floorid"  onchange="selectById()">
                   <option value="">---选择楼号---</option>
                    <c:forEach items="${floors}" var="item">
					 <option value="${item.floorid}">${item.floornumber}</option>
					</c:forEach>
				  </select>
                </div>
                </div>
                
                <div class='control-group'>
                <div class='span6'>
                   <label class='span2' style="line-height: 30px">房间等级:</label>
                   <select class='span8' name="roomtypeid">
                    <c:forEach items="${roomtypes}" var="item">
					 <option value="${item.roomtypeid}">${item.roomtypename}</option>
					</c:forEach>
				   </select>
                </div>
                
                <div class='span6'>
                   <label class='span2' style="line-height: 30px">楼层:</label>
                   <select class='span8' name="floornumber" id="floornumber">
                    <option value="">---选择楼层---</option>
				   </select>
                </div>
                </div>
                
                <div class='control-group'>
                
               <div class='span6'>
                   <label class='span2' style="line-height: 30px">房间状态:</label>
                   <select class='span8' name="roomstatus">
                   <option value="">---选择状态---</option>
                   <option value="1">现住</option>
                   <option value="2" selected="selected">空房</option>
                   <option value="3">维修房</option>
                   <option value="4">非出租房</option>
                   <option value="5">锁房</option>
				   </select>
                </div>
                
                <div class='span6'>
                   <label class='span2' style="line-height: 30px">朝向:</label>
                   <select class='span8' name="orientation">
                   <option value="">---选择朝向---</option>
                   <option value="1">东</option>
                   <option value="2">南</option>
                   <option value="3">西</option>
                   <option value="4">北</option>
				   </select>
                </div>
                </div>
                
                <div class='control-group'>
                  <div class='span6'>
                   <label class='span2' style="line-height: 30px">特性:</label>
                   <select class='span8 select2' multiple="" id="characteristic" name="characteristic" placeholder='特性可多选'>
                   <c:forEach items="${characteristics}" var="item">
					 <option value="${item.characteristic}">${item.characteristic}</option>
					</c:forEach>
				   </select>
                 </div>
                </div>
                
                <div class="pannel-footer span12" style="margin-left: 40%">
                <a type="button" class="btn btn-primary" onclick="Submit('${ctx}/roomStatusController/save.do')"><i class="icon-save"></i><span>保存</span></a>
                <button class="btn btn-warning"><i class=" icon-rotate-right"></i><span>重置</span></button>
                </div>
		
	           </form>
	         </div>
	         
	       </div>
     </div>
  </div>
</div>



</body>
</html>

<script type="text/javascript">

  $("#characteristic").select2();

   function selectById(){
  
     var floorid =  $("#floorid option:selected").val();
     $.ajax({
	    type : "get",
		async : false,
		url : '${ctx}/roomStatusController/selectById.do?id='+ floorid,
		cache: false,
		timeout : 2000,
		contentType : "application/json;charset=utf-8;",
		dataType : "json",
		success : function(data) {
		  $('#floornumber').empty();
		  $('#floornumber').append('<option value="">---选择楼层---</option>');
		  for(var i =1; i <= data['numberplies']; i++){
		    var C = i > 9 ? i : "0"+ i; 
		    $('#floornumber').append('<option value="'+ i +'">'+ C +'楼</option>');
		  }
		}
	});
   }
</script>