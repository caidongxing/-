<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8" />
<title><tiles:insertAttribute name="title" ignore="true" /></title>
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
						<i class='icon-table'></i> <span>账本设置</span>
					</h1>
					<div class="pull-right">
						<ul class='breadcrumb'>
							<li><a href='${ctx}'><i class='icon-table'></i> </a></li>
							<li class='separator'><i class='icon-angle-right'></i></li>
							<li>系统设置</li>
							<li class='separator'><i class='icon-angle-right'></i></li>
							<li>账本设置</li>
							<li class='separator'><i class='icon-angle-right'></i></li>
							<li class='active'>修改</li>
						</ul>
					</div>
				</div>

				<div class='span12'>
					<div class='box-content'>
						<form id="form" class="form-horizontal">
						
						<input type="hidden" name="accountbookid" id="accountbookid" value="${accountbook.accountbookid}">
						
							<div class='control-group'>
								<div class='span6'>
									<label class='span2' style="line-height: 30px">账本代码:</label> <input
										class='span8' name="accountbookcode" value="${accountbook.accountbookcode}" type="text"
										placeholder="账本代码" required />
								</div>

								<div class='span6'>
									<label class='span2' style="line-height: 30px">账本名称:</label> <input
										class='span8' name="accountbookname" value="${accountbook.accountbookname}" type="text"
										placeholder="账本名称" required />
								</div>
							</div>


							<div class='control-group'>
								<div class='span6'>
									<label class='span2' style="line-height: 30px">限额:</label> <input
										class='span8' name="quota" value="${accountbook.quota}" type="number" placeholder="限额"
										required />
								</div>

								<div class='span6'>
									<label class='span2' style="line-height: 30px">转账方式:</label> <select
										class='span8' name="transferaccountswayid">
										<option value="1" ${accountbook.transferaccountswayid eq 1 ? "selected='selected'":""}>结账即转</option>
										<option value="2" ${accountbook.transferaccountswayid eq 2 ? "selected='selected'":""}>发生即转</option>
										<option value="3" ${accountbook.transferaccountswayid eq 3 ? "selected='selected'":""}>夜审即转</option>
									</select>
								</div>

							</div>

							<div class='row-fluid'>
								<div class='span12 box bordered-box blue-border'
									style='margin-bottom:0;'>
									<div class='box-header blue-background'>
										<div class='title'>账本信息</div>
										<div class='actions'>
											<a href="#" class="btn box-remove btn-mini btn-link"><i
												class='icon-remove'></i> </a> <a href="#"
												class="btn box-collapse btn-mini btn-link"><i></i> </a>
										</div>
									</div>
									<div class='box-content box-no-padding'>

										<div class='span7 box bordered-box blue-border'
											style='margin-bottom:0;'>
											<div class='box-header'>
												<div class='title'>账项</div>
											</div>
											<div class='box-content box-no-padding'>
												<div class="span7" style="border:1px groove;height: 250px;">
													<ul class='unstyled' id="accountitems">
														<c:forEach items="${accountitems}" var="item">
															<li value="${item.accountitemsid}">${item.accountitemsid}、${item.itemsname}</li>
														</c:forEach>
													</ul>
												</div>
												<div class="span5">
													<div class='row-fluid' style="margin-top: 20%">
														<div class='span12'></div>

														<a class="span12 btn btn-small"
															style="line-height: 30px;text-align: center;"
															onclick="addItems()"><i
															class="icon-forward icon-white"></i><span>添加帐项</span>
														</a> <a class="span12 btn btn-primary btn-small"
															style="line-height: 30px;text-align: center;"
															onclick="removeItems()"><i
															class="icon-backward icon-white"></i><span>移除帐项</span>
														</a> <a class="span12 btn btn-danger btn-small"
															style="line-height: 30px;text-align: center;"
															onclick="clearItems()"><i
															class="icon-trash icon-white"></i><span>清空全部</span>
														</a>
													</div>

												</div>
											</div>
										</div>

										<div class='span4 box bordered-box blue-border'>
											<div class='box-header'>
												<div class='title'>账本</div>
											</div>
											<div class='box-content box-no-padding'
												style="border:1px groove;height: 250px;">
												<ul class='unstyled' id="accountbook">
												  <%-- <c:forEach items="${vo}" var="item">
													<li value="${item.accountitemsid}">${item.accountitemsid}、${item.itemsname}</li>
												  </c:forEach> --%>
												</ul>
											</div>
										</div>

									</div>

								</div>
							</div>

							<div class="pannel-footer span12" style="margin-left: 40%">
								<button type="submit" class="btn btn-primary">
									<i class="icon-save"></i><span>保存</span>
								</button>
								<button class="btn btn-warning" >
									<i class=" icon-rotate-right"></i><span>重置</span>
								</button>
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
	var li = null;
$(function(){

  $.getJSON("${ctx}/accountBookController/findByKey.do?id=" + $("#accountbookid").val(),
        function(result){
        
        var items = $('.unstyled li');
        for(var i =0;i < items.length;i++){
         //alert(items[i].value);
         for(var j =0;j < result.length;j++){
            if(items[i].value == result[j].accountitemsid){
               $("#accountbook").append(items[i]);
            }
            
         }
        }
       
   });
  //alert($("#accountbookid").val());
   $('.unstyled li').click(function(){
   $('.unstyled li').removeAttr("style");
   this.style.backgroundColor = "moccasin";
   li = this;
  });
  
  
  
  $("#form").validate({
     
     submitHandler: function(form) {  //通过之后回调 
        updateAccountbook();
     },
     invalidHandler: function(form, validator) {  //不通过回调
       alert("修改失败！！！");
     }
   });
    
})


function addItems(){
  $("#accountbook").append(li);
}
function removeItems(){
  $("#accountitems").append(li);
}
function clearItems(){
   var items = $('#accountbook li')
   for(var i =0;i<items.length;i++){
      $("#accountitems").append(items[i]);
   }
}

function updateAccountbook(){
   var items = $('#accountbook li')
   var accountitems = [];
   for(var i =0;i<items.length;i++){
      accountitems[i] = items[i].value;
   }
   
    $.ajax({
	    cache: true,
        type: "POST",
        url : '${ctx}/accountBookController/update.do?accountitems=' + accountitems,
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