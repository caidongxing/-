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
    <title>向分开票机分配发票</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
    <script src="js/response_table/jquery.min.js"></script>
	<script src="js/response_table/bootstrap.min.js"></script>

   	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link rel="stylesheet" href="css/common.css" />
	<style type="text/css">
   		.box{width:80%;}
		.btn{width:100px;margin:0 auto;}
   	</style>
   	<script type="text/javascript">
   		var action="${ctx}/extensioninvoiceController/";
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		window.history.back(-1); 
    		});
    		
    		$('#btn_cancel').click(function () {
        		window.history.back(-1); 
    		});
    		var text=document.getElementById('number').value;
    		//鼠标移开输入框触发事件
    		$("#number").mouseout(function(){
       			 if(document.getElementById('number').value>text||document.getElementById('number').value<=0){
       			 	/* alert(text); */
       			 	document.getElementById('number').value=text;
       			 }
   			});
   			
   			$("#btn_confirm").click(function(){
       			 
   			});
   			
   			$("#btn_yes").click(function(){
   				var ids = $('input[name="gender"]:checked ').val();//获取raido选中的值
   				var numbers=document.getElementById('number').value;//获取文本值
   				$.ajax({
  					url:action+"share.do?id="+ids+"&"+"number="+numbers,
 					type:"post",
 					dataType:"json",
  					success: function(data){ 
  						location=action+"finish.do";      
  					}
				});
   			});
　　		}); 

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
							<i class="icon-reorder"></i> 向分开票机分配发票
						</h4>
						<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
					</div>
					<div class="widget-body" style="height: 100%;">
						<p style="color: #A64D4D;"><strong>注意事项：</strong></p>
						<p style="color: #A64D4D;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;连续进行此操作时，时间间隔不能少于一分钟。</p>
						<p style="color: #A64D4D;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发票卷起始号码:&nbsp;&nbsp;${invoiceinventories.startnumber }</p>
						<p style="color: #A64D4D;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发票卷终止号码:&nbsp;&nbsp;${invoiceinventories.endnumber }</p>
						<ul style="border:1px solid #ccc;padding: 15px;border-radius: 4px!important;margin-left: 25px;">
							<li><p style="color:#309898;">分配起始号码:&nbsp;&nbsp;${invoiceinventories.startnumber }</p></li>
							<li><p style="color:#309898;">分配张数:&nbsp;&nbsp;<input type="text" style="padding:5px;" value="${invoiceinventories.invoicenumber }" id="number" maxlength="5" onkeyup="(this.v=function(){this.value=this.value.replace(/[^0-9-]+/,'');}).call(this)" onblur="this.v();"></p></li>
						</ul>
						<div class="box" style="margin-top:10px;">
							<button id="btn_cancel" type="button" class="btn btn-primary" style="margin-left: 450px;border-radius: 4px!important;">取消</button>
							<button id="btn_confirm" type="button" class="btn btn-primary" style="border-radius: 4px!important;" data-toggle="modal" data-target="#myModal">确定</button>
							<!--BEGIN 模态框（Modal） -->
							<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
								aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">分发发票卷</h4>
										</div>
										<div class="modal-body">
												<div class="panel panel-default">
													<div class="panel-heading">
														<h3 class="panel-title">请选择要分发的来源介质</h3>
													</div>
													<div class="panel-body">
														<div class="box" style="margin-left: 50px;">
															<label class="radio"> <input type="radio" name="gender" value="15" checked="checked">金税盘</label> 
															<label class="radio"> <input type="radio" name="gender" value="16">报税盘</label>
														</div>
													</div>
												</div>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-primary"  style="border-radius: 4px!important;" id="btn_yes">确认</button>
											<button type="button" class="btn btn-primary"  style="border-radius: 4px!important;" data-dismiss="modal">取消</button>
										</div>
									</div>
								</div>
							</div>
							<!--END 模态框（Modal） -->
							
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
