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
    <title>系统注册</title>
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   	<link href="assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   	<link href="assets/bootstrap/css/bootstrap-fileupload.css" rel="stylesheet" />
   	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   	<link href="css/style.css" rel="stylesheet" />
   	<link href="css/style-responsive.css" rel="stylesheet" />
   	<link href="css/style-default.css" rel="stylesheet" id="style_color" />
    <!-- <link href="assets/fancybox/source/jquery.fancybox.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/uniform/css/uniform.default.css" /> -->
    <link rel="stylesheet" href="css/common.css" />
    
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/bootstrap-spinner.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
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
                    <!-- BEGIN INLINE TABS PORTLET-->
                    <div class="widget blue">
                        <div class="widget-title">
                           <h4><i class="icon-reorder"></i> 系统注册 </h4>
                           <span class="tools">
                           <a href="javascript:;" class="icon-chevron-down"></a>
                           <a href="javascript:;" class="icon-remove"></a>
                           </span>
                        </div>
                        <div class="widget-body">
                            <div class="row-fluid">
                                <div>
                                    <!--BEGIN TABS-->
                                    <div class="tabbable custom-tab">
                                        <ul class="nav nav-tabs">
                                            <li class="active"><a href="#tab_1_1" data-toggle="tab">基本信息</a></li>
                                            <li><a href="#tab_1_2" data-toggle="tab">注册信息</a></li>
                                            <li><a href="#tab_1_3" data-toggle="tab">下载注册文件</a></li>
                                        </ul>
                                        <div class="tab-content">
                                            <div class="tab-pane active" id="tab_1_1">
												<div class="control-group">
													<label class="control-label" style="float: left;margin-top: 5px;">企业税号：</label>
													<div class="controls">
														<input type="text" class="span6" >
													</div>
												</div>
												<div class="control-group">
													<label class="control-label" style="float: left;margin-top: 5px;">企业名称：</label>
													<div class="controls">
														<input type="text" class="span6">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label" style="float: left;margin-top: 5px;">开票机号：</label>
													<div class="input-group spinner">
														<input type="text" class="form-control" value="0" data-rule="quantity" style="padding:16px;">
														<div class="input-group-btn-vertical">
															<button class="btn btn-default" type="button"><i class="fa fa-caret-up"></i></button>
      														<button class="btn btn-default" type="button"><i class="fa fa-caret-down"></i></button>
														</div>
													</div>

												</div>
												 <p>版本信息</p>
												 <textarea rows="3" cols="span6" style="width:100%">基本的防伪税控开票功能，对金税设备进行管理，密文发票的开具、打印、查询等功能！
												 </textarea>
												
											</div>
                                            <div class="tab-pane" id="tab_1_2">
                                                <p>参数设置</p>
                                                 <label style="padding-left: 20px !important;" class="checkbox"><input type="checkbox" name="cms" value="US" style="margin-top: 15px;">注册文件到期，提前<input type="number" value="30" style="width: 55px;" class="span6">天提示</label>
    											 <label style="padding-left: 20px !important;" class="checkbox"><input type="checkbox" name="cms" value="ES<">注册文件已过期提示</label>
                                                 <p>当前已安装的版本</p>
                                                 <textarea rows="4" cols="span6" style="width:100%"></textarea>
                                                 <button>安装注册文件</button>
                                                 <p>版本信息</p>
                                                 <textarea rows="4" cols="span6" style="width:100%">基本的防伪税控开票功能，对金税设备进行管理，密文发票的开具、打印、查询等功能！
                                                 </textarea>
                                                 
                                            </div>
                                            <div class="tab-pane" id="tab_1_3">
                                                <p>下载地址<input type="text" class="span6">网络超时<input type="number" value="8" style="width: 55px;" class="span6">秒</p>
                                                <p style="float:left;width: 40%;">文件提取号<input type="text" class="span6">(20位数字)</p>
                                                <div class="btn-group">
                                                	<button class="btn">+</button>
    												<button class="btn">-</button>
                                                </div>
                                                
                                                 <textarea rows="4" cols="span6" style="width:100%"></textarea>
                                                 <button>下载</button>
                                                 <textarea rows="4" cols="span6" style="width:100%">基本的防伪税控开票功能，对金税设备进行管理，密文发票的开具、打印、查询等功能！
                                                 </textarea>
                                            </div>
                                        </div>
                                    </div>
                                    <!--END TABS-->
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END INLINE TABS PORTLET-->
                </div>
            </div>
   	</div>
   	<script type="text/javascript">
   		(function ($) {
		  $('.spinner .btn:first-of-type').on('click', function() {
		    $('.spinner input').val( parseInt($('.spinner input').val(), 10) + 1);
		  });
		  $('.spinner .btn:last-of-type').on('click', function() {
			  if($('.spinner input').val()>0){
		    $('.spinner input').val( parseInt($('.spinner input').val(), 10) - 1);}
		  });
		})(jQuery);
   	</script>
  </body>
</html>
