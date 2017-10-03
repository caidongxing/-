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
    <title>系统参数设置</title>
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
    
    <link rel="stylesheet" href="css/modal_frame/bootstrap.min.css">
  	<script src="js/modal_frame/jquery.min.js"></script>
	<script src="js/modal_frame/bootstrap.min.js"></script>
  </head>
  
  <body>
	<div class="row-fluid">
		<div class="span12">
			<div class="widget blue">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> Inline Tabs
					</h4>
					<span class="tools"> 
						<a href="javascript:;" class="icon-chevron-down"></a> 
						<a href="javascript:;" class="icon-remove"></a> 
					</span>
				</div>
				<div class="widget-body" style="height: 60%;">
					<div class="row-fluid">
						<div class="span12">
							<!--BEGIN TABS-->
							<div class="tabbable custom-tab tabs-left">
								<!-- Only required for left/right tabs -->
								<ul class="nav nav-tabs tabs-left">
									<li class="active">
										<a href="#tab_3_1" data-toggle="tab">基本信息</a>
									</li>
									<li>
										<a href="#tab_3_2" data-toggle="tab">凭证接口</a>
									</li>
									<li>
										<a href="#tab_3_3" data-toggle="tab">上传设置</a>
									</li>
									<li>
										<a href="#tab_3_4" data-toggle="tab">其他设置</a>
									</li>
								</ul>
								<div class="tab-content" style="height: 90%;">
									<div class="tab-pane active" id="tab_3_1">
										<h4><strong>基本信息设置</strong></h4>
										<div>
											<label>纳税登记号：</label>
										</div>
										<div>
											<label>企业名称     ：</label>
										</div>
										<div class="control-group">
											<label class="control-label" style="float:left;margin-top: 5px;">*营业地址:</label>
											<div class="controls">
												<input type="text" style="width: 60%;padding: 15px;"/> 
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" style="float:left;margin-top: 5px;">*电话号码:</label>
											<div class="controls">
												<input type="text" style="width: 60%;padding: 15px;"/> 
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" style="float:left;margin-top: 5px;">开户行及账号:</label>
											<div class="controls">
												<textarea class="span6 " rows="3"  name="remarks"></textarea>
											</div>
										</div>
										<div>
											<label>税务机关代码：</label>
										</div>
										<div>
											<label>税务机关名称：</label>
										</div>
										<div class="pannel-footer text-center">
											<button type="submit" class="btn btn-success">确认</button>
											<a href="" class="btn" onClick="history.go(-1);">取消</a>
										</div>
									</div>
									<div class="tab-pane" id="tab_3_2">
										<h4><strong>凭证接口设置</strong></h4>
										<div class="panel panel-default">
											<div class="panel-heading">
												<h3 class="panel-title">凭证接口选项</h3>
											</div>
											<div class="panel-body" style="margin-left: 20px;">
												<label class="radio">
    											<input type="radio" name="gender" value="male">启用凭证接口</label>
    											<label class="radio">
    											<input type="radio" name="gender" value="female">停用凭证接口</label>
											</div>
										</div>
										<p>提示：凭证接口修改后需重启开票软件生效</p>
										<div class="pannel-footer text-center">
											<button type="submit" class="btn btn-success">确认</button>
											<a href="" class="btn" onClick="history.go(-1);">取消</a>
										</div>
									</div>
									<div class="tab-pane" id="tab_3_3">

										<div class="span12">
											<div class="tabbable custom-tab">
												<ul class="nav nav-tabs">
													<li class="active">
														<a href="#tab_1_1" data-toggle="tab">服务器设置</a>
													</li>
													<li>
														<a href="#tab_1_2" data-toggle="tab">上传方式设置</a>
													</li>
												</ul>
												<div class="tab-content" style="height: 90%;">
													<div class="tab-pane active" id="tab_1_1">
														<div class="control-group">
															<label class="control-label" style="float:left;margin-top: 5px;">安全接入服务器地址:</label>
															<div class="controls">
																<input type="text" style="width: 60%;padding: 15px;" />
																 <span class="help-inline"><input type="button" value="测试"/></span>
															</div>
														</div>
														<div class="panel panel-default">
															<div class="panel-heading">
																<h3 class="panel-title"><label class="checkbox" style="margin-left: 20px;"><input type="checkbox" name="cms" value="US">代理服务器</label></h3>
															</div>
															<div class="panel-body">
																<div>
																	<p style="float:left;">代理类型</p>
																	<label checkbox-inline><input type="radio" name="gender" value="http">Http</label>
																	<label checkbox-inline><input type="radio" name="gender" value="socks">Socks</label>
																</div>
																<div>
																	<label class="control-label">代理服务器<input type="text" style="width: 500px;padding: 15px;" /></label>
																	<label class="control-label">端口<input type="text" style="width: 75px;padding: 15px;" /></label>
																</div>
																<div>
																
																</div>
															</div>
														</div>
													</div>
													<div class="tab-pane" id="tab_1_2">
														
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="tab-pane" id="tab_3_4">
										
									</div>
								</div>
							</div>
							<!--END TABS-->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
  <!-- BEGIN JAVASCRIPTS -->
  <!-- Load javascripts at bottom, this will reduce page load time -->
  <script src="js/jquery-1.8.3.min.js"></script>
  <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
  <script src="assets/jquery-ui/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="js/jquery.scrollTo.min.js"></script>

   <!-- ie8 fixes -->
   <!--[if lt IE 9]>
   <script src="js/excanvas.js"></script>
   <script src="js/respond.js"></script>
   <![endif]-->

   <!--common script for all pages-->
   <script src="js/common-scripts.js"></script>

   <!--script for this page only-->


   <!-- END JAVASCRIPTS -->
  </body>
</html>
