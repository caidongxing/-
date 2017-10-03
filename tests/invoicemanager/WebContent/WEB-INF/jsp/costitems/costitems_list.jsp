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
    <title>费用编码</title>
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
    <script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
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
function showAdd(){
	location="${ctx}/costitemsController/toadd.do";
}
function showupdate(){
	var id=getcheckboxItem();
	if(id!=0){
		if(id.indexOf(",")>0){
			alert('您选择了多条数据，请重新选择在进行操作');
		}else{
			location="${ctx}/costitemsController/toedit.do?id="+id;
		}
	}else{
		alert("请选择数据");
	}
}
function delete_list(){
	var id=getcheckboxItem();
	if(id!=0){
		if(id.indexOf(",")>0){
			if(confirm("是否删除??")){
				window.location.href="${ctx}/costitemsController/delitem.do?ids="+id;
			}
		}else{
			if(confirm("是否删除??")){
				window.location.href="${ctx}/costitemsController/delete.do?id="+id;
			}
		}
	}else{
		alert("请选择数据");
	}
}
function print(){
	//打印
	
}
function search(){
	//查找
	
}
function statistics(){
	//统计
	
}
function format(){
	//格式
	
}
function Import(){
	//导入
	
}
function Export(){
	//导出
	
}
function Exit(){
	//退出
	
}
</script>
  </head>
  
  <body>
    <div data-spy="scroll" style="height:600px;overflow:auto; position: relative;">
    <div id="main-content">
         <!-- BEGIN PAGE CONTAINER-->
         <div class="container-fluid">
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
									<li ><a >控制台</a></li>
									<li ><a >费用编码</a></li>
									<li class="active"><a >列表</a></li>
								</ul>
								<ul class="nav pull-right">
									<li><a onclick="showAdd()">新增</a></li>
									<li><a onclick="showupdate()">修改</a></li>
									<li><a onclick="delete_list()">删除</a></li>
									<li class="divider-vertical"></li>
									<li><a onclick="print()">打印</a></li>
									<li><a onclick="search()">查找</a></li>
									<li><a onclick="statistics()">统计</a></li>
									<li><a onclick="format()">格式</a></li>
									<li class="divider-vertical"></li>
									<li><a onclick="Import()">导入</a></li>
									<li><a onclick="Export()">导出</a></li>
									<li class="divider-vertical"></li>
									<li><a onclick="Exit()">退出</a></li>
								</ul>
							</div>

						</div>
					</div>
				</div>
                        <table class="table table-striped table-bordered" id="sample_1">
                            <thead>
                            <tr>
                                <th style="width:8px;">
                                	<input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes" />
                                </th>
                                <th>编码</th>
                                <th class="hidden-phone">名称</th>
                                <th class="hidden-phone">简码</th>
                                <th class="hidden-phone">税收分类编码</th>
                                <th class="hidden-phone">税收分类名称</th>
                                <th class="hidden-phone">优惠政策类型</th>
                                <th class="hidden-phone">享受优惠政策</th>
                            </tr>
                            </thead>
                            <tbody>
									<c:forEach items="${costitemss}" var="item" varStatus="status">
										<tr class="odd gradeX">
											<td><input type="checkbox" class="checkboxes" value="${item.id}" id="radio" name="radio"/></td>
											<td>${item.code}</td>
											<td>${item.name}</td>
											<td>${item.simplecode}</td>
											<td>${item.taxtypecode}</td>
											<td>${item.taxtypename}</td>
											<td>${item.policytype}</td>
											<td>${item.enjoypolicies=="true"?"是":"否"}</td>
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
   </div> 
      <!-- BEGIN JAVASCRIPTS -->
   <!-- Load javascripts at bottom, this will reduce page load time -->
   
   <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
   <script src="assets/bootstrap/js/bootstrap.min.js"></script>
   <script src="js/jquery.blockui.js"></script>
   <!-- ie8 fixes -->
   <!--[if lt IE 9]>
   <script src="js/excanvas.js"></script>
   <script src="js/respond.js"></script>
   <![endif]-->
   <script type="text/javascript" src="assets/uniform/jquery.uniform.min.js"></script>
   <script type="text/javascript" src="assets/data-tables/jquery.dataTables.js"></script>
   <script type="text/javascript" src="assets/data-tables/DT_bootstrap.js"></script>
   <script src="js/jquery.scrollTo.min.js"></script>


   <!--common script for all pages-->
   <script src="js/common-scripts.js"></script>

   <!--script for this page only-->
   <script src="js/dynamic-table.js"></script>

   <!-- END JAVASCRIPTS -->
  </body>
</html>
