<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>已购发票退回金税设备</title>
	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    <script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>

   	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link rel="stylesheet" href="css/common.css" />
   	<style type="text/css">
		.btn{width:60px;}
   	</style>
   	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		//单选
    		$("tr").click(function(){
    			var r = document.getElementsByName("radio");
    			for(var i=0;i<r.length;i++){
        			if(i==$(this).index()){
        				r[i].checked = true;
       				}else{
       					r[i].checked = false;
       				}
    			}
			}); 
　　		}); 

	onload = function ()
    {
       var years=new Date();
	   var sel = document.getElementById ('sel');
	   sel.options.add(new Option('全部', -1));
	   for ( var i = years.getFullYear(); i > 1969; i--)
	   {
		   var option = document.createElement ('option');
		   option.value = i;
		   var txt = document.createTextNode (i);
		   option.appendChild (txt);
		   sel.appendChild (option);
	   }
	   
	   var mon = document.getElementById ('month');
	   mon.options.add(new Option('全部', -1));
	   for ( var i = 1; i < 13; i++)
	   {
		   var option = document.createElement ('option');
		   option.value = i;
		   var txt = document.createTextNode (i);
		   option.appendChild (txt);
		   mon.appendChild (option);
	   }
	   
    }
    
    function Search(){
    	location="${ctx}/returninvoiceController/findByDateOrType.do";
    }
    function Return(){
    	var id=getcheckboxItem();
		if(id!=0){
			$("#myModal").modal("toggle");
		}else{
			alert("请选择数据");
		}
    	
    }
    function Close(){
    	$(this).parents(".widget").parent().remove();
    }
    //退回发票
    function btn_yes(){
    	var id=getcheckboxItem();
    	location="${ctx}/returninvoiceController/confirm_list.do?id="+id;
    }
    
    //获取选中的数据
function getcheckboxItem(){
    var r=document.getElementsByName("radio"); 
    var ck = new Array();
    var j  =  0;  
    for(var i=0;i<r.length;i++){
        if(r[i].checked){
       		ck[j] = r[i].value; 
       		j++; 
       	}
    }
    return j == 0 ? 0 : ck.join();
}

   	</script>
  </head>
  
  <body>
    <div data-spy="scroll" style="height:500px;overflow:auto; position: relative;">
    	<div id="main-content">
    		<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN EXAMPLE TABLE widget-->
					<div class="widget blue">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 已购发票退回金税设备
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body" style="height: 100%;">
							<p style="text-align: center;color:red">关于“已购发票退回”：此操作只有因税务机关原因，造成购买的发票代码或号码有误时方可使用，
								并且执行此操作前须征得主管税务机关同意。否则，造成后果由企业承担！</p>
							
							<div>
								<div>
									<div class="btn-toolbar" style="float:left;">
										<label>发票种类：<select class="span6 "
												style="width: 200px;padding: 5px;">
													<option value="">全部</option>
													<c:forEach items="${invoicetypes}" var="item">
														<option value="${item.id}">${item.classname}</option>
													</c:forEach>
											</select></label>
										<label>领购年份：<select id="sel" style="width: 75px;padding: 5px;"></select></label>
										<label>领购月份：<select id="month" style="width: 75px;padding: 5px;" class="span6 " ></select></label>
									</div>
									<div class="btn-toolbar" style="float:right;">
										<div class="btn-group">
											<button class="btn">格式</button>
											<button class="btn">统计</button>
											<button class="btn">打印</button>
											<button class="btn" onclick="Search()">查找</button>
											<button class="btn" onclick="Return()">退回</button>
											<button class="btn" onclick="Close()">退出</button>
										</div>
									</div>
								</div>
								<div class="space15"></div>
								<table class="table table-striped table-hover table-bordered"
									id="editable-sample">
									<thead>
										<tr>
											<th>选择</th>
											<th>发票种类</th>
											<th>开票限额</th>
											<th>卷号</th>
											<th>类别代码</th>
											<th>类别名称</th>
											<th>起始号码</th>
											<th>发票张数</th>
											<th>领购日期</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${invoiceinventories}" var="item" varStatus="status">
											<tr class="odd gradeX">
												<td><input type="checkbox" class="checkboxes" value="${item.id}" id="radio" name="radio"/></td>
												<td>${item.invoicetypename}</td>
												<td>${item.billinglimit}</td>
												<td>${status.index}</td>
												<td>${item.classcode}</td>
												<td>${item.classname}</td>
												<td>${item.startnumber}</td>
												<td>${item.invoicenumber}</td>
												<td><fmt:formatDate value="${item.linggoudate}" type="both" pattern="yyyy-MM-dd" /></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!-- END EXAMPLE TABLE widget-->
				</div>
			</div>
    	</div>
    </div>


	<!--BEGIN 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">警告</h4>
				</div>
				<div class="modal-body">
					<img alt="" src="${ctx }/img/sign-warning.png" style="width: 30px;float: left;-webkit-transform: translateY(50%);">
					<ul>
						<li><label>注意：</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;此操作只有因税务机关原因，造成购买的发票代码或号码有误时方可使用，并且执行此操作前须征得主管税务机关同意，否则，造成后果由企业承担！</label></li>
						<li><label>&nbsp;&nbsp;&nbsp;请慎重确认本卷发票是否退回?</label></li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" id="btn_yes" onclick="btn_yes()">是</button>
					<button type="button" class="btn btn-primary" id="btn_no" data-dismiss="modal">否</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
</body>
</html>
