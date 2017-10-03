<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<div class='container-fluid'>
<div class='row-fluid' id='content-wrapper'>
     <div class='span12'>
       <div class='page-header'>
	        <h1 class='pull-left'>
             <i class='icon-list-alt'></i>
             <span>签单模板</span>
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
                        系统设置
                    </li>
                    <li class='separator'>
                        <i class='icon-angle-right'></i>
                    </li>
                    <li class='active'>签单模板</li>
                </ul>
            </div>
	   </div>
	   
	   <form id="form" class="form-horizontal">    
	   
	   <div class='toolheader'>
	     <div class="pull-left span8">
	      
           <div class='row-fluid'>
                <div class='span6'>
                <label class='span3' style="line-height: 30px">模板名称:</label>
                    <input class='span9' name="templatename" placeholder="模板名称" type="text" value="${templatename}" />
                </div>
                
            </div>
            
          
	     </div>
	     <div class="pull-right">
	     <a class="btn btn-primary start" onclick="queryPage()"><i class="icon-search icon-white"></i><span>查询</span></a>
	     <a class="btn btn-success start" onclick="OnloadContent('${ctx}/signbillTemplateController/addView.do')" ><i class="icon-plus icon-white"></i><span>新增</span></a>
	     <%-- <button class="btn btn-warning start" onclick="OnloadContent('${ctx}/roomStatusController/update.do')" ><i class="icon-edit icon-white"></i><span>修改</span></button>
	     <button class="btn btn-danger delete" onclick="OnloadContent('${ctx}/roomStatusController/delete.do')"><i class="icon-trash icon-white"></i><span>删除</span></button> --%>
	     </div>
	   </div>
	   
	   <div class='row-fluid'>
	    <div class='responsive-table'>
          <div class='scrollable-area'>
           <table class='table table-bordered table-hover table-striped' style='margin-bottom:0;'>
            <thead>
             <tr>
              <th>签单名称</th>
              <th>备注</th>
              <th style="width: 5%;text-align: center;">操作</th>
             </tr>
            </thead>
            <tbody>
              <c:forEach items="${page.result}" var="item">
               <tr>
                <td>${item.templatename}</td>
                <td>${item.comment}</td>
                <td>
                <a class="btn btn-info btn-small" onclick="optionByPath('${ctx}/signbillTemplateController/updateView.do?id=${item.signbilltemplateid}')" ><i class="icon-edit icon-white"></i></a>
                <a class="btn btn-danger btn-small" onclick="optionByPath('${ctx}/signbillTemplateController/delete.do?id=${item.signbilltemplateid}')" ><i class="icon-remove icon-white"></i></a>
                </td>
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
        url : '${ctx}/signbillTemplateController/list.do',
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
