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
    <title>下载主机分配发票</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    <script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>

   	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link rel="stylesheet" href="css/common.css" />
   	
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
   	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		
    		//============默认选择当月第一天和最后一天=============
    		var date = new Date();
    		var  day = new Date(date.getFullYear(),date.getMonth()+1,0);
        	var daycount = day.getDate();
    		var start=date.getFullYear()+"-"+(date.getMonth()<10?"0"+(date.getMonth()+1):date.getMonth()+1)+"-01";
    		var end	 =date.getFullYear()+"-"+(date.getMonth()<10?"0"+(date.getMonth()+1):date.getMonth()+1)+"-"+daycount;
    		document.getElementById("startime").value = start;
    		document.getElementById("endtime").value  = end;
    		
　　		}); 

		function Select(){
			location="${ctx}/onlineshareController/list.do";
			/* $("#dowload").removeAttr("disabled"); */
		}

		function Download(){
			location="${ctx}/onlineshareController/download_check.do";
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
								<i class="icon-reorder"></i> 下载主机分配发票
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body" style="height: 100%;">
							<div>
								<div class="btn-group">
									<input type="checkbox" style="float:left" checked="checked"> <label
										style="float:left">购票日期起</label>
									<div id="datetimepicker" class="input-append date">
										<input type="text" id="startime" readonly style="width: 110px;"></input> <span
											class="add-on"><i data-time-icon="icon-time"
											data-date-icon="icon-calendar"></i> </span>
									</div>

									<input type="checkbox" style="float:left" checked="checked"> <label
										style="float:left">购票日期止</label>
									<div id="datetimepicker1" class="input-append date">
										<input type="text" id="endtime" readonly style="width: 110px;"> </input> <span
											class="add-on"> <i data-time-icon="icon-time"
											data-date-icon="icon-calendar"></i> </span>
									</div>
								</div>
								<div class="btn-group" style="margin-left: 110px;">
									<button class="btn btn btn-primary" style="padding: 10px;border-radius: 4px!important;" onclick="Select()">查询</button>
								</div>
								<div class="btn-group" style="margin-left: 110px;">
									<button class="btn btn btn-primary" style="padding: 10px;border-radius: 4px!important;" onclick="Download()" id="dowload">发票下载</button>
								</div>
							</div>
							<div>
								<div class="space15"></div>
								<table class="table table-striped table-hover table-bordered"
									id="editable-sample">
									<thead>
										<tr>
											<th style="width: 30px;">选择</th>
											<th>发票种类</th>
											<th>发票代码</th>
											<th>起始号码</th>
											<th>发票张数</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${invoiceinventories}" var="item" varStatus="status">
											<tr class="odd gradeX">
												<td><input type="checkbox" value="${item.id}" id="radio" name="radio"/></td>
												<td>${item.invoicetypename}</td>
												<td>${item.classcode}</td>
												<td>${item.startnumber}</td>
												<td>${item.invoicenumber}</td>
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
    
    <script src="js/daterangepicker/jquery-1.8.2.min.js"></script>  
    <script src="js/daterangepicker/bootstrap.min.js"></script>  
    <script src="js/daterangepicker/bootstrap-datetimepicker.min.js"></script>  
    
    <script type="text/javascript">  
      $('#datetimepicker').datetimepicker({  
        format: 'yyyy-MM-dd',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
           
       $('#datetimepicker1').datetimepicker({  
        format: 'yyyy-MM-dd',  
        language: 'zh-CN',  
                   pickTime: false  
      }).on('changeDate',function(){  
                   $(this).datetimepicker('hide');  
           });
    </script>
  </body>
</html>
