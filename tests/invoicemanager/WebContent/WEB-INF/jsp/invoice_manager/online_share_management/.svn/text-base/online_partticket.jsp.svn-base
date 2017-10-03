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
    <title>网上分票</title>
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   	<link href="assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   	<link href="assets/bootstrap/css/bootstrap-fileupload.css" rel="stylesheet" />
   	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link href="css/style-responsive.css" rel="stylesheet" />
   	<link href="css/style-default.css" rel="stylesheet" id="style_color" />
    <link href="assets/fancybox/source/jquery.fancybox.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/uniform/css/uniform.default.css" />
    <link rel="stylesheet" href="css/common.css" />
 	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
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
    }
	</script>
  </head>
  
  <body>
    <div data-spy="scroll" style="height:600px;overflow:auto; position: relative;">
    	 <div id="main-content">
    	 	 <div class="container-fluid">
				<!-- BEGIN ADVANCED TABLE widget-->
				<div class="row-fluid">
					<div class="span12">
						<!-- BEGIN EXAMPLE TABLE widget-->
						<div class="widget blue">
							<div class="widget-title">
								<h4>
									<i class="icon-reorder"></i> 主机网上分票
								</h4>
								<span class="tools"> <a href="javascript:;"
									class="icon-chevron-down"></a> <a href="javascript:;"
									class="icon-remove"></a> </span>
							</div>
							<div class="widget-body">
								<div class="navbar">
						<div class="navbar-inner">
							<div class="container">
								<a class="btn btn-navbar" data-toggle="collapse"
									data-target=".nav-collapse"> <span class="icon-bar"></span>
									<span class="icon-bar"></span> <span class="icon-bar"></span> </a>

								<div class="nav-collapse">
									<ul class="nav">
										<li style="padding: 10px;">领购年份：</li>
										<li><select id="sel" style="width: 75px;"></select></li>
										<li style="padding: 10px;">领购月份：</li>
										<li><select class="span6 "
											data-placeholder="Choose a Category" tabindex="1"
											style="width: 75px;">
												<option value="">全部</option>
												<option value="1">1月</option>
												<option value="2">2月</option>
												<option value="3">3月</option>
												<option value="4">4月</option>
												<option value="5">5月</option>
												<option value="6">6月</option>
												<option value="7">7月</option>
												<option value="8">8月</option>
												<option value="9">9月</option>
												<option value="10">10月</option>
												<option value="11">11月</option>
												<option value="12">12月</option>
										</select></li>
										<li style="padding: 10px;">发票种类：</li>
										<li><select class="span6 "
											data-placeholder="Choose a Category" tabindex="1"
											style="width: 75px;">
												<option value="">全部</option>
												<c:forEach items="${invoicetypes}" var="item">
													<option value="${item.id}">${item.classname}</option>
												</c:forEach>
										</select></li>
									</ul>
									<ul class="nav pull-right">
										<li><a onclick="format()">格式</a>
										</li>
										<li><a onclick="statistics()">统计</a>
										</li>
										<li><a onclick="print()" data-toggle="modal" data-target="#myModal">打印</a>
										</li>
										<li><a onclick="search()">查找</a>
										</li>
										<li class="divider-vertical"></li>
										<li><a onclick="choice()">选择</a>
										</li>
										<li><a onclick="exit()">退出</a>
										</li>
									</ul>
								</div>

							</div>
						</div>
					</div>
								<table class="table table-striped table-bordered" id="sample_1">
									<thead>
										<tr>
											<th>发票种类</th>
											<th>开票限额</th>
											<th>卷号</th>
											<th>类别代码</th>
											<th>类别名称</th>
											<th>起始号码</th>
											<th>发票张数</th>
											<th>卷终止号</th>
											<th>领购日期</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${customers}" var="item" varStatus="status">
											<tr class="odd gradeX">
												<td>${item.code}</td>
												<td>${item.name}</td>
												<td>${item.simplecode}</td>
												<td>${item.dutyparagraph}</td>
												<td>${item.telephone}</td>
												<td>${item.bankaccount}</td>
												<td>${item.mailingaddress}</td>
												<td>${item.remarks}</td>
												<td>${item.remarks}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
						<!-- END EXAMPLE TABLE widget-->
					</div>
				</div>
				<!-- END ADVANCED TABLE widget-->
			</div>
    	 </div>
    </div>

	<!--BEGIN 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">向分开票机分配发票</h4>
				</div>
				<div class="modal-body">
					<ul style="padding: 15px;">
						<li><label style="color: #A64D4D;">发票种类：</label></li>
						<li><label style="color: #A64D4D;">起始号码：</label></li>
						<li><label style="color: #A64D4D;">终止号码：</label></li>
					</ul>
					<ul
						style="border: 1px solid #ccc;padding: 15px;border-radius: 5px;">
						<li><label style="color:#309898;">起始号码：</label></li>
						<li><label style="color:#309898;">分配张数：<input type="text" class="span6 " /></label></li>
						<li><label style="color:#309898;">分开票机：<input type="text" class="span6 " /></label></li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" id="btn_confirm">确定</button>
					<button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/data-tables/jquery.dataTables.js"></script>
    <script type="text/javascript" src="assets/data-tables/DT_bootstrap.js"></script>
    <script src="js/dynamic-table.js"></script>
  </body>
</html>
