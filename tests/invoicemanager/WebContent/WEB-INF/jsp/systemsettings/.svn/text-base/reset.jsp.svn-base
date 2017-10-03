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
    <title>系统初始化</title>
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
    
	<link rel="stylesheet" href="css/progressbar/ystep.css" type="text/css"></link>
	<script src="js/jquery.min.js"></script>
  	<script type="text/javascript" src="js/bootstrap.min.js"></script>
  	<script type="text/javascript">

    function openYearEnd(){
    	 var _s = document.getElementById('num_year'); 
		 _s.style.display = 'none';
		 var select = document.getElementById('years'); 
		 select.style.display = '';
    }
    
    function openMonthEnd(){
    	var _s = document.getElementById('num_month'); 
		 _s.style.display = 'none';
		 var select = document.getElementById('months'); 
		 select.style.display = '';
    }
    
    window.onload = function(){
       var years=new Date();
	   var sel = document.getElementById ('years');
	   sel.options.add(new Option('', -1));
	   for ( var i = years.getFullYear(); i > 2000; i--)
	   {
		   var option = document.createElement ('option');
		   option.value = i;
		   var txt = document.createTextNode (i);
		   option.appendChild (txt);
		   sel.appendChild (option);
	   }
	   
	   var month = document.getElementById ('months');
	   month.options.add(new Option('', -1));
	   for ( var i = 1; i < 13; i++)
	   {
		   var option = document.createElement ('option');
		   option.value = i;
		   var txt = document.createTextNode (i);
		   option.appendChild (txt);
		   month.appendChild (option);
	   }
    
    	//选择下拉框的值赋给文本框
    	var select = document.getElementById('years');
    	select.onchange = function(){
       		var _s = document.getElementById('num_year'); 
		 	_s.style.display = '';
		 	var select = document.getElementById('years'); 
		 	select.style.display = 'none';
		 	document.getElementById("num_year").value=$('#years option:selected').text();
   		}
   		
   		var select = document.getElementById('months');
    	select.onchange = function(){
       		var _s = document.getElementById('num_month'); 
		 	_s.style.display = '';
		 	var select = document.getElementById('months'); 
		 	select.style.display = 'none';
		 	document.getElementById("num_month").value=$('#months option:selected').text();
   		}
	}
  	</script>
  	<script type="text/javascript">
   		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
    		
    		jQuery('.widget .tools .icon-chevron-down').click(function () {
        		var el = jQuery(this).parents(".widget").children(".widget-body");
        		if (jQuery(this).hasClass("icon-chevron-down")) {
           			 jQuery(this).removeClass("icon-chevron-down").addClass("icon-chevron-up");
            		 el.slideUp(200);
        		} else {
            	jQuery(this).removeClass("icon-chevron-up").addClass("icon-chevron-down");
            	el.slideDown(200);
        		}
    		});
　　		}); 

		
   	</script>
  </head>
  
  <body>
     <div id="main-content">
    	 <div class="row-fluid">
                <div class="span12">
                    <div class="widget box blue">
                        <div class="widget-title">
                            <h4>
                                <i class="icon-reorder"></i>系统参数设置</span>
                            </h4>
                        <span class="tools">
                           <a href="javascript:;" class="icon-chevron-down"></a>
                           <a href="javascript:;" class="icon-remove"></a>
                        </span>
                        </div>
                        <div class="widget-body">
                            <form class="form-horizontal" action="#">
                                <div id="tabsleft" class="tabbable tabs-left">
                               
                                <div class="ystep1" style="margin-bottom: 30px;"></div>
                                 
                                <div class="tab-content">
                                    <div class="tab-pane active" id="tabsleft-tab1">
                                        <p><strong>欢迎</strong></p>
										<div class=" alert alert-block">
											此向导用于初始化管理员名称，删除本帐套中所有业务单据，清空各项累加信息，使系统
											恢复到该会计期间的初始状态。
										</div>
										<h5>注意：此项操作除保留编码信息和企业基本信息外，将删除大量数据，且不可恢复。</h5>
										<ul class="pager wizard">
											<li  class="next"><a href="javascript:;">下一步</a></li>
										</ul>
                                    </div>
                                    <div class="tab-pane" id="tabsleft-tab2">
                                        <p><strong>管理员认证</strong></p>
										<div class=" alert alert-block">
											主管用户认证：
										</div>
										<div>
										 <p style="float: left;">主管理姓名<input type="text" style="padding: 15px;" ></p>	
										 <p>用户密码<input type="password" style="200px;padding: 15px;"></p>	
										</div>
										<div class=" alert alert-block">
											初始税务日期：
										</div>
										<div>
										 <p style="float: left;">初始税务年份<input id="num_year" type="text" style="padding: 15px;"   onfocus="openYearEnd()"></p>
										 <select id="years" style="float: left;width: 100px;display:none;"></select>
										 <p>初始税务月份<input id="num_month" type="text" style="padding: 15px;" onfocus="openMonthEnd()"></p>	
										 <select id="months" style="width: 100px;display:none;"></select>
										</div>
										<ul class="pager wizard">
											<li class="previous"><a href="javascript:;">上一步</a></li>
											<li class="next"><a href="javascript:;">下一步</a></li>
											<li class="cancel"><a href="javascript:;">取消</a></li>
										</ul>
									</div>
                                    <div class="tab-pane" id="tabsleft-tab3">
                                        <p><strong>基本参数设置</strong></p>
                                        <p>纳税登记号：${users.businesstax }</p>
                                        <p>企业名称：${users.enterprisename }</p>
                                        <div class="control-group">
                                             <label class="control-label">*营业地址：</label>
                                             <div class="controls">
                                                 <input type="text" class="span6" required="">
                                             </div>
                                         </div>
                                         <div class="control-group">
                                             <label class="control-label">*电话号码：</label>
                                             <div class="controls">
                                                 <input type="text" class="span6" required="">
                                             </div>
                                         </div>
                                         <div class="control-group">
                                             <label class="control-label">开户行及账号：</label>
                                             <div class="controls">
                                                 <textarea class="span6 " rows="3"  name="remarks"></textarea>
                                             </div>
                                         </div>
                                         <p>税务机关代码：${users.enterprisename }</p>
                                         <p>税务机关名称：${users.enterprisename }</p>
                                         <ul class="pager wizard">
											<li class="previous"><a href="javascript:;">上一步</a></li>
											<li class="next"><a href="javascript:;">下一步</a></li>
											<li class="cancel"><a href="javascript:;">取消</a></li>
										 </ul>
                                    </div>
                                    <div class="tab-pane" id="tabsleft-tab4">
                                        <p><strong>上传参数设置</strong></p>
                                        <p>安全接入服务器地址：<input type="text" style="width:200px;padding: 15px;"> <input type="button" value="测试"></p>
                                        <p>发票上传方式</p>
                                        <p>单张上传（每开一张发票即时上传）</p>
                                        <p>间隔<input type="number" style="width:100px;padding: 15px;" value="5">分钟后上传</p>
                                        <p>未上传张数达到<input type="number" style="width:100px;padding: 15px;" value="5">分钟后上传</p>
                                        <p>上传数据包大小：10张/包</p>
                                        <ul class="pager wizard">
											<li class="previous"><a href="javascript:;">上一步</a></li>
											<li class="next"><a href="javascript:;">下一步</a></li>
											<li class="cancel"><a href="javascript:;">取消</a></li>
										 </ul>
                                    </div>
                                    <div class="tab-pane" id="tabsleft-tab5">
                                    	<p><strong>完成</strong></p>
                                    	<p>确认信息之后点击确认完成设置</p>
                                        <ul class="pager wizard">
											<li class="previous"><a href="javascript:;">上一步</a></li>
											<li class="confirm"><a data-toggle="modal" data-target="#myModal">确认</a></li>
										 </ul>
                                    </div>

									<!--BEGIN 模态框（Modal） -->
									<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
													<h4 class="modal-title" id="myModalLabel">提示</h4>
												</div>
												<div class="modal-body">
													<img alt="" src="${ctx }/img/success.png" style="width: 30px;">连接成功
												</div>
												<div class="modal-footer">
													<button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
												</div>
											</div>
										</div>
									</div>
									<!--END 模态框（Modal） -->

								</div>
                            	</div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
    </div>
    
  <script type="text/javascript" src="js/progressbar/jquery.min.js"></script>
  <script type="text/javascript" src="js/progressbar/ystep.js"></script>
  <script type="text/javascript">
  	$(".ystep1").loadStep({
  //ystep的外观大小
  //可选值：small,large
  size: "small",
  //ystep配色方案
  //可选值：green,blue
  color: "green",
  //ystep中包含的步骤
  steps: [{
	//步骤名称
	title: "欢迎",
	//步骤内容(鼠标移动到本步骤节点时，会提示该内容)
	content: "欢迎使用"
  },{
	title: "初始化",
	content: "初始化基础数据"
  },{
	title: "参数设置",
	content: "设置公司名称等信息"
  },{
	title: "上传参数",
	content: "上传到后台"
  },{
	title: "完成",
	content: "Finish"
  }]
});

$(".ystep1").setStep(1);
  </script>
<script type="text/javascript">
var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F96790c81142777e7724407f030936c10' type='text/javascript'%3E%3C/script%3E"));
</script> 

<script type="text/javascript">

	$(document).ready(function() {
		$(".previous").click(function() {
			if($(".ystep1").getStep()>0)
			{
				$(".ystep1").setStep($(".ystep1").getStep()-1);
				$("#tabsleft-tab"+($(".ystep1").getStep()-1)+"").addClass("active");
				$("#tabsleft-tab"+($(".ystep1").getStep()-1)+"").next().removeClass("active");
			}
		});
		$(".next").click(function() {
			if($(".ystep1").getStep()<6)
			{
				$(".ystep1").setStep($(".ystep1").getStep()+1);
				$("#tabsleft-tab"+($(".ystep1").getStep()+1)+"").prev().removeClass("active");
				$("#tabsleft-tab"+($(".ystep1").getStep()+1)+"").addClass("active");
			}
		});
		$(".cancel").click(function() {
			
		});
		$(".confirm").click(function() {
			
		});
		
	});
</script> 
  </body>
</html>
