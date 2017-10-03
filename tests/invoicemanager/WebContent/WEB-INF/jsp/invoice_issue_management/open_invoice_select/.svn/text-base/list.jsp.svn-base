<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>选择发票号码查询</title>
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link rel="stylesheet" href="css/common.css" />
   	
   	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    <script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>
   	<style type="text/css">
.subnavs {
    display: none;
    position: absolute;
    top: 100%;
    left: 590px;
    right: 0px;
    padding-bottom: 12px;
    line-height: 30px;
    background-color: white;
    border: 1px solid #d9d9d9;
    border-top: 0;
    z-index: 99;
}

body{
	font-family: Microsoft Yahei, sans-serif;
}

#editable-sample{
	table-layout:fixed
}
#editable-sample td{
	overflow:hidden;
	text-overflow:ellipsis;
	white-space:nowrap
}

   	</style>
    

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
								<i class="icon-reorder"></i> 选择发票号码查询
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body" style="height: 100%;">
							<div>
								<div>
									<div class="btn-toolbar" style="float:left;">
										<select id="sel"   style="width: 65px;padding: 5px;"></select>
										<select id="month" style="width: 65px;padding: 5px;"></select>
										<select class="span6" style="width: 180px;padding: 5px;">
											<option value="0">全部发票</option>
											<c:forEach items="${invoicetypes}" var="item">
												<option value="${item.id}">${item.classname}</option>
											</c:forEach>
										</select>
										<select class="span6" style="padding: 5px;">
											<option value="0">报送状态</option>
											<c:forEach items="${attributedetails}" var="item">
												<option value="${item.id}">${item.attributedetailsname}</option>
											</c:forEach>
										</select>
									</div>
									<div class="btn-toolbar" style="float:right;">
										<div class="btn-group">
											<button class="btn" onclick="Export()"><i class="icon-arrow-up"></i>销售项发票导出</button>
											<button class="btn"><i class="icon-upload"></i>发票上传</button>
											<button class="btn"><i class="icon-list"></i>查看明细</button>
											<button class="btn"><i class="icon-ok-circle"></i>核对</button>
											<button class="btn"><i class="icon-th"></i>格式</button>
											<button class="btn"><i class="icon-bar-chart"></i>统计</button>
											<button class="btn" onclick="Select()"><i class="icon-search"></i>查找</button>
											<button class="btn" id="btn_print"><i class="icon-print"></i>打印</button>
											<ul class="subnavs">
												<li><a href="#">发票</a></li>
												<li><a href="#">销货清单</a></li>
												<li><a href="#">发票列表</a></li>
											</ul>
											<button class="btn" onclick="Close()"><i class="icon-off"></i>退出</button>
										</div>
									</div>
								</div>
								<div class="space15"></div>
								<table class="table table-striped table-hover table-bordered"
									id="editable-sample">
									<thead>
										<tr>
											<th style="width: 5px;"></th>
											<th>发票种类</th>
											<th>发票代码</th>
											<th>发票号码</th>
											<th>开票机号</th>
											<th>购方名称</th>
											<th>购方税号</th>
											<th>购方地址电话</th>
											<th>购方银行账号</th>
											<th>开票日期</th>
											<th>报送状态</th>
											<th>报送日志</th>
											<th>所属月份</th>
											<th>合计金额</th>
											<th>税率</th>
											<th>合计税额</th>
											<th>主要商品名称</th>
											<!-- <th>商品名称</th> -->
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${customers}" var="item" varStatus="status">
											<tr class="odd gradeX">
												<td>${item.id}</td>
												<td>${item.code}</td>
												<td>${item.name}</td>
												<td>${item.code}</td>
												<td>${item.id}</td>
												<td>${item.code}</td>
												<td>${item.simplecode}</td>
												<td>${item.dutyparagraph}</td>
												<td>${item.dutyparagraph}</td>
												<td>${item.id}</td>
												<td>${item.code}</td>
												<td>${item.name}</td>
												<td>${item.code}</td>
												<td>${item.id}</td>
												<td>${item.code}</td>
												<td>${item.simplecode}</td>
												<td>${item.dutyparagraph}</td>
												<%-- <td>${item.dutyparagraph}</td> --%>
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
  </body>
  
  <script type="text/javascript">
    $(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		//table选中行高亮
    		$('table tr').click(function(){
       			$('table tr').removeClass('success');
       			$(this).addClass('success');
    		});
       //年份
       var years=new Date();
	   var sel = document.getElementById ('sel');
	   sel.options.add(new Option('所有', -1));
	   for ( var i = years.getFullYear(); i > 1969; i--)
	   {
		   var option = document.createElement ('option');
		   option.value = i;
		   var txt = document.createTextNode (i+"年");
		   option.appendChild (txt);
		   sel.appendChild (option);
	   }
	   //月份	
	   var mon = document.getElementById ('month');
	   mon.options.add(new Option('所有', -1));
	   for ( var i = 1; i < 13; i++)
	   {
		   var option = document.createElement ('option');
		   option.value = i;
		   var txt = document.createTextNode (i+"月份");
		   option.appendChild (txt);
		   mon.appendChild (option);
	   }
	   
	    $("#btn_print").mouseover(function(){
        	$(".subnavs").show();
    	});

    	/* $(".subnavs").mouseout(function(){
        	$(".subnavs").hide();
    	}); */
    		
　　		}); 

		function Select(){
			location="${ctx}/invoiceselectController/list_select.do";
		}
		
		function Export(){
			location="${ctx}/invoiceselectController/output_export.do";
		}
    </script>
</html>
