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
    <title>网上领票</title>
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
    
    <link rel="stylesheet" href="css/daterangepicker/bootstrap.min.css">
  	<script src="js/daterangepicker/jquery.min.js"></script>
	<script src="js/daterangepicker/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript">
		var action="${ctx}/onlineticketController/";
		
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
    		
    		
    		//单选
    		$("tr").click(function(){
    			//选中高亮
    			$('table tr').removeClass('success');
       			$(this).addClass('success');
       			//选中勾上
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
		
		function Select(){
			var startime=document.getElementById("startime").value;
			var endtime =document.getElementById("endtime").value;
			
			location=action+"findByDate.do?startime="+startime+"&"+"endtime="+endtime;
		}
		
		function AutoDowload(){
			var id=getcheckboxItem();
			if(id!=0){
				if(confirm("是否核对信息无误，确定下载?")){
					location=action+"autoDowload.do?id="+id;
					/* alert(id); */
				}
			}else{
				alert("请选择需要下载的数据");
			}
			
		}
		
		function Dowload(){
			
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
	
<style type="text/css">
.modal {
	top: 0!important;
	right: 0!important;
	bottom: 0!important;
	left: 0!important;
	width: 100%!important;
	margin-left: 0px!important;
	background-color: transparent!important;
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
							<i class="icon-reorder"></i> 网上领票
						</h4>
						<span class="tools"> <a href="javascript:;"
							class="icon-remove"></a> </span>
					</div>
					<div class="widget-body">
						<div class="btn-toolbar">
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
										<button class="btn" style="padding: 10px;" onclick="Select()">查询</button>
										<button class="btn" style="padding: 10px;" onclick="AutoDowload()">发票下载</button>
										<button class="btn" style="padding: 10px;" data-toggle="modal"
											data-target="#myModal">手工下载</button>

										<!--BEGIN 模态框（Modal） -->
										<div class="modal fade" id="myModal" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal"
															aria-hidden="true">&times;</button>
														<h4 class="modal-title" id="myModalLabel">网上领票</h4>
													</div>
													<div class="modal-body">
														<div class="control-group">
															<label class="control-label"
																style="float: left;margin-top: 5px;margin-right: 20px;">发票类型：</label>
															<div class="controls">
																<select class="span6 chzn-select"
																	data-placeholder="Choose a Category" tabindex="1"
																	style="width: 60%;">
																	<option value=""></option>
																	<option value="Category 1">增值税专用发票</option>
																</select>
															</div>
														</div>
														<div class="control-group">
															<label class="control-label"
																style="float: left;margin-top: 5px;margin-right: 20px;">发票代码：</label>
															<div class="controls">
																<input type="text" class="span6 "
																	style="width: 60%;padding: 15px;" /> <span
																	class="help-inline">00</span>
															</div>
														</div>
														<div class="control-group">
															<label class="control-label"
																style="float: left;margin-top: 5px;margin-right: 20px;">起始号码：</label>
															<div class="controls">
																<input type="text" class="span6 "
																	style="width: 60%;padding: 15px;" /> <span
																	class="help-inline">00</span>
															</div>
														</div>
														<div class="control-group">
															<label class="control-label"
																style="float: left;margin-top: 5px;margin-right: 20px;">发票张数：</label>
															<div class="controls">
																<input type="text" class="span6 "
																	style="width: 60%;padding: 15px;" /> <span
																	class="help-inline">00</span>
															</div>
														</div>
													</div>
													<div class="modal-footer" style="padding-left: 220px;">
														<button type="button" class="btn btn-primary" onclick="Dowload()">下载</button>
														<button type="button" class="btn btn-default"
															data-dismiss="modal">取消</button>
													</div>
												</div>
											</div>
										</div>
										<!--END 模态框（Modal） -->
									</div>
								</div>
								<!--begin 表 -->
								<div class="table-responsive">
									<table class="table table-striped table-bordered" id="refresh">
										<thead>
											<tr>
												<th style="width:30px;">选择</th>
												<th>发票种类</th>
												<th>发票代码</th>
												<th>起始号码</th>
												<th>发票张数</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${invoicereceiveVos}" var="item" varStatus="status">
												<tr>
													<td><input type="checkbox" name="radio" value="${item.id}"/></td>
													<td>${item.classname}</td>
													<td>${item.classcode}</td>
													<td>${item.startnumber}</td>
													<td>${item.invoicenumber}</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
								<!--end 表 -->
						
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
