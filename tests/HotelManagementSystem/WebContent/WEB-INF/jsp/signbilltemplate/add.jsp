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
.select2-container {
	margin-left: -1px !important;
}

.unstyled li {
	cursor: pointer;
}
</style>

</head>

<body>
	<div class='container-fluid'>
		<div class='row-fluid' id='content-wrapper'>
			<div class='span12'>
				<div class='page-header'>
					<h1 class='pull-left'>
						<i class='icon-table'></i> <span>签单模板</span>
					</h1>
					<div class="pull-right">
						<ul class='breadcrumb'>
							<li><a href='${ctx}'><i class='icon-table'></i> </a>
							</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li>系统设置</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li>签单模板</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li class='active'>新增</li>
						</ul>
					</div>
				</div>

				<div class='row-fluid'>
					<div class='box-content'>
						<form id="form" class="form-horizontal">
							<div class="row-fluid" style="border:1px solid;">

								<div style="text-align: center;margin-top: 5px;">
									<div class='span6'>
										<label class='span2' style="line-height: 30px">模板名称:</label> <input
											class='span8' name="templatename" type="text"
											placeholder="模板名称" required />
									</div>

									<div class='span6'>
										<label class='span2' style="line-height: 30px">备注:</label> <input
											class='span8' name="comment" type="text"
											placeholder="备注" required />
									</div>
								</div>



							</div>

							<div class="row-fluid">
								<div class='title'>账本列表</div>
								<div style="margin-top: 5px;border:1px solid;margin-bottom: 10px;">
									<c:forEach items="${accountbook}" var="item">
									  <input type="checkbox" name="accountbookid" value="${item.accountbookid}" style="width: 20px;height: 20px;margin-left: 20px;">${item.accountbookname}
									</c:forEach>
								</div>
							</div>



							<div class="pannel-footer span12" style="margin-left: 40%">
								<button type="submit" class="btn btn-primary">
									<i class="icon-save"></i><span>保存</span>
								</button>
								<a class="btn btn-warning">
									<i class=" icon-rotate-right"></i><span>重置</span>
								</a>
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
$(function(){
  
  $("#form").validate({
     submitHandler: function(form) {  //通过之后回调 
        addSignbillTemplate();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       alert("新增失败！");
     }
   });
    
})


function addSignbillTemplate(){
   
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/signbillTemplateController/save.do',
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
