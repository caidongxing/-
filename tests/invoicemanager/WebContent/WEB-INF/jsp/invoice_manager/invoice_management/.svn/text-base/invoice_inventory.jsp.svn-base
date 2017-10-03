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
    <title>发票库存查询</title>
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
    
    function search(){
    	alert("123");
    	location="${ctx}/invoiceinventoryController/list.do";
    }
    function exit(){
    	
    }
    
	</script>
  </head>
  
  <body>
    <div id="main-content">
         <!-- BEGIN PAGE CONTAINER-->
         <div class="container-fluid">
            <div class="row-fluid">
				<div class="navbar">
					<div class="navbar-inner">
						<div class="container">
							<a  class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> 
								<span class="icon-bar"></span>
								<span class="icon-bar"></span> 
								<span class="icon-bar"></span> 
							</a> 

							<div class="nav-collapse">
								<ul class="nav">
									<li style="padding: 10px;">领购年份：</li>
									<li>
										<select id="sel" style="width: 75px;"></select>
									</li>
									<li style="padding: 10px;">领购月份：</li>
									<li >
										<select class="span6 " data-placeholder="Choose a Category" tabindex="1" style="width: 75px;">
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
										</select>
									</li>
									<li style="padding: 10px;">发票种类：</li>
									<li >
										<select class="span6 " data-placeholder="Choose a Category" tabindex="1" style="width: 200px;">
											<option value="">全部</option>
											<c:forEach items="${invoicetypes}" var="item">
												<option value="${item.id}">${item.classname}</option>
											</c:forEach>
										</select>
									</li>
								</ul>
								<ul class="nav pull-right">
									<li><a onclick="format()">格式</a></li>
									<li><a onclick="statistics()">统计</a></li>
									<li><a onclick="print()">打印</a></li>
									<li><a onclick="search()">查找</a></li>
									<li class="divider-vertical"></li>
									<li><a onclick="exit()">退出</a></li>
								</ul>
							</div>

						</div>
					</div>
				</div>
			</div>
            
            <!-- BEGIN ADVANCED TABLE widget-->
            <div class="row-fluid">
                <div class="span12">
                <!-- BEGIN EXAMPLE TABLE widget-->
                <div class="widget blue">
                    <div class="widget-title">
                        <h4><i class="icon-reorder"></i> Dynamic Table</h4>
                            <span class="tools">
                                <a href="javascript:;" class="icon-chevron-down"></a>
                                <a href="javascript:;" class="icon-remove"></a>
                            </span>
                    </div>
                    <div class="widget-body">
                        <table class="table table-striped table-bordered" id="sample_1">
                            <thead>
                            <tr>
                                <th>序号</th>
                                <th class="hidden-phone">发票种类</th>
                                <th class="hidden-phone">开票限额</th>
                                <th class="hidden-phone">类别代码</th>
                                <th class="hidden-phone">类别名称 </th>
                                <th class="hidden-phone">起始号码</th>
                                <th class="hidden-phone">发票张数</th>
                                <th class="hidden-phone">卷终止号</th>
                                <th class="hidden-phone">领购日期</th>
                            </tr>
                            </thead>
                            <tbody>
									<c:forEach items="${invoiceinventories}" var="item" varStatus="status">
										<tr class="odd gradeX">
											<td>${item.id}</td>
											<td>${item.invoicetypename}</td>
											<td>${item.billinglimit}</td>
											<td>${item.classcode}</td>
											<td>${item.classname}</td>
											<td>${item.startnumber}</td>
											<td>${item.invoicenumber}</td>
											<td>${item.endnumber}</td>
											<td>${item.linggoudate}</td>
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
         <!-- END PAGE CONTAINER-->
      </div>
  </body>
</html>
