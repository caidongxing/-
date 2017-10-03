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
    <title>组合条件查询</title>
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
    <link rel="stylesheet" href="css/style.css"  />
   	<link rel="stylesheet" href="css/common.css" />
    
	<link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    <script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$('.widget .tools .icon-remove').click(function () {
        		window.history.go(-1);
    		});
    		//table选中行高亮
    		$('table tr').click(function(){
       			$('table tr').removeClass('success');
       			$(this).addClass('success');
    		});
		}); 
	</script>
	<style type="text/css">
		th{
			text-align: center;
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
								<i class="icon-reorder"></i> 选择要分配的发票卷
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div>
								<div>
									<div class="btn-toolbar" style="float:right;">
										<div class="btn-group">
											<button class="btn" onclick="Select()"><i class="icon-search"></i>执行查找</button>
											<button class="btn"><i class="icon-plus-sign"></i>添加</button>
											<button class="btn"><i class="icon-minus-sign"></i>删除</button>
											<button class="btn" onclick="window.history.go(-1);"><i class="icon-off"></i>退出</button>
										</div>
									</div>
								</div>
								<div class="space15"></div>
								<table class="table table-striped table-hover table-bordered" id="editable-sample">
									<thead>
										<tr>
											<th>条件名称</th>
											<th>查询字段</th>
											<th>关系符号</th>
											<th>查询参数</th>
										</tr>
									</thead>
									<tbody>
										<tr class="odd gradeX">
											<td>负数发票</td>
											<td>合计金额</td>
											<td>小于</td>
											<td>0</td>
										</tr>
										<tr class="odd gradeX">
											<td>作废发票</td>
											<td>作废标志</td>
											<td>等于</td>
											<td>是</td>
										</tr>
										<tr class="odd gradeX">
											<td>按税率查询</td>
											<td>税率</td>
											<td>等于</td>
											<td>|参数|</td>
										</tr>
										<tr class="odd gradeX">
											<td>正数发票</td>
											<td>合计金额</td>
											<td>大于等于</td>
											<td>0</td>
										</tr>
										<tr class="odd gradeX">
											<td>正常发票</td>
											<td>作废标志</td>
											<td>等于</td>
											<td>否</td>
										</tr>
										<tr class="odd gradeX">
											<td>按开票人查询</td>
											<td>开票人</td>
											<td>等于</td>
											<td>|参数|</td>
										</tr>
										<tr class="odd gradeX">
											<td>带有销货清单</td>
											<td>清单标志</td>
											<td>等于</td>
											<td>是</td>
										</tr>
										<tr class="odd gradeX">
											<td>尚未打印的发票</td>
											<td>打印标志</td>
											<td>等于</td>
											<td>否</td>
										</tr>
										<tr class="odd gradeX">
											<td>从金税卡底层修复的发票</td>
											<td>修复标志</td>
											<td>等于</td>
											<td>是</td>
										</tr>
										<tr class="odd gradeX">
											<td>导入的发票</td>
											<td>外开标志</td>
											<td>等于</td>
											<td>是</td>
										</tr>
										<tr class="odd gradeX">
											<td>按开票日期查询</td>
											<td>开票日期</td>
											<td>等于</td>
											<td>|参数|</td>
										</tr>
										<tr class="odd gradeX">
											<td>按发票种类查询</td>
											<td>发票种类</td>
											<td>等于</td>
											<td>|参数|</td>
										</tr>
										<tr class="odd gradeX">
											<td>专用发票</td>
											<td>发票种类</td>
											<td>等于</td>
											<td>s</td>
										</tr>
										<tr class="odd gradeX">
											<td>普通发票</td>
											<td>发票种类</td>
											<td>等于</td>
											<td>c</td>
										</tr>
										<tr class="odd gradeX">
											<td>废旧物资发票</td>
											<td>发票种类</td>
											<td>等于</td>
											<td>v</td>
										</tr>
										<tr class="odd gradeX">
											<td>负数废票</td>
											<td>负数发票</td>
											<td>并且</td>
											<td>作废发票</td>
										</tr>
										<tr class="odd gradeX">
											<td>正数废票</td>
											<td>正数发票</td>
											<td>并且</td>
											<td>作废发票</td>
										</tr>
										<tr class="odd gradeX">
											<td>正数正常票</td>
											<td>正数发票</td>
											<td>并且</td>
											<td>正常发票</td>
										</tr>
										<tr class="odd gradeX">
											<td>负数正常票</td>
											<td>负数发票</td>
											<td>并且</td>
											<td>正常发票</td>
										</tr>
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
</html>
