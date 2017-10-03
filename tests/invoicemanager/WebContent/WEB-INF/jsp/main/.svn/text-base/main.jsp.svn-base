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
   <title>税控开票发票|主界面</title>
   <meta content="width=device-width, initial-scale=1.0" name="viewport" />
   <meta content="" name="description" />
   <meta content="Mosaddek" name="author" />
   <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   <link href="assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   <link href="assets/bootstrap/css/bootstrap-fileupload.css" rel="stylesheet" />
   <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   <link href="css/style.css" rel="stylesheet" />
   <link href="css/style-responsive.css" rel="stylesheet" />
   <link href="css/style-default.css" rel="stylesheet" id="style_color" />
   <link href="assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
   <link href="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen">
   <style type="text/css">
   	a{
   	cursor: hand;
   	cursor: pointer;
   	}
   	.fixed-top #container {
     margin-top: 0px!important; 
	}
	ul,li{list-style: none;}
	a:hover,a{text-decoration: none;color: #a0a0a0;}
    .nav-collapse ul li ul li ul{display: none;}
	.sub li ul li{
		padding: 5px!important; 
		margin-left: 15px!important; 
	}
	.sub li ul{
		margin-bottom: 1px!important;
	}
	
   </style>
 	<script type="text/javascript">
 			/* 系统设置 */
			function Initialization() {
				$('#iframe').attr("src", "${ctx}/mainController/reset.do");//初始化
			}
			function Parameter_setting() {
				$('#iframe').attr("src", "${ctx}/mainController/systemsettings.do");//系统设置
			}
			function Receiver_Dispatch() {
				$('#iframe').attr("src", "${ctx}/receiveController/list.do");//收发货人
			}
			function Customer_code() {
				$('#iframe').attr("src", "${ctx}/customerController/list.do");//客户编码
			}
			function Purchase_units() {
				$('#iframe').attr("src", "${ctx}/purchaseunitsController/list.do");//购货单位
			}
			function Cost_items() {
				$('#iframe').attr("src", "${ctx}/costitemsController/list.do");//费用项目
			}
			function Commodity_code() {
				$('#iframe').attr("src", "${ctx}/commodityController/list.do");//商品编码
			}
			function Vehicle_coding() {
				$('#iframe').attr("src", "${ctx}/vehicleController/list.do");//车辆编码
			}
			/*开始 系统设置 -系统设置*/
			function Register() {
				$('#iframe').attr("src", "${ctx}/mainController/register.do");//系统注册
			}
			function Mail_server_settings() {
				$('#iframe').attr("src", "");//邮件服务器设置
			}
			function Tax_return_register() {
				$('#iframe').attr("src", "");//报税盘注册
			}
			/*结束 系统设置 -系统设置*/
			/*开始 系统设置 -编码管理*/
			function Taxitem() {
				$('#iframe').attr("src", "${ctx}/taxitemController/list.do");//税目编码
			}
			function Administrativedivision() {
				$('#iframe').attr("src", "${ctx}/administrativedivisionController/list.do");//行政区域编码
			}
			function Goodsandservicestax() {
				$('#iframe').attr("src", "${ctx}/goodsandservicestaxController/list.do");//商品和服务税收分类编码
			}
			/*结束 系统设置 -系统设置*/
			
			
			/* 发票管理 */
			function Invoice_reading() {
				$('#iframe').attr("src", "${ctx}/invoicereadController/choice_medium.do");//发票读入
			}
			function Invoice_distribution() {
				$('#iframe').attr("src", "${ctx}/extensioninvoiceController/list.do");//发票分配
			}
			function Inventory_query() {
				$('#iframe').attr("src", "${ctx}/invoiceinventoryController/inventory_query.do");//库存查询
			}
			function Invoice_return() {
				$('#iframe').attr("src", "${ctx}/returninvoiceController/list.do");//发票退回
			}
			function Invoice_fill() {
				$('#iframe').attr("src", "${ctx}/invoicefillController/confirm.do");//发票填开
			}
			function Invoice_Inquiry() {
				$('#iframe').attr("src", "${ctx}/invoiceselectController/list_date.do");//发票查询
			}
			function Invoice_void() {
				$('#iframe').attr("src", "${ctx}/invoicescrapController/list.do");//发票作废
			}
			function Invoice_repair() {
				$('#iframe').attr("src", "${ctx}/invoicerepairController/first.do");//发票修复
			}
			function Information_table() {
				$('#iframe').attr("src", "");//信息表
			}
			/*开始 发票管理-发票领用管理 */
			function Setting_specifications(){
				$('#iframe').attr("src", "${ctx}/setvolumeController/set_volume.do");//设置卷票规格
			}
			function Dowload_invoice(){
				$('#iframe').attr("src", "${ctx}/onlineticketController/online_ticket.do");//网上领票
			}
			function Main_onlineticket(){
				$('#iframe').attr("src", "${ctx}/onlineshareController/online_list.do");//主机网上分票
			}
			function Dowload_onlineticket(){
				$('#iframe').attr("src", "${ctx}/onlineshareController/download_list.do");//下载主机分票
			}
			function Leading_status(){
				$('#iframe').attr("src", "${ctx}/onlineshareController/status.do");//领用状态查询
			}
			function Read_new_invoices(){
				$('#iframe').attr("src", "${ctx}/invoicereadController/choice_medium.do");//读入新购发票
			}
			function Purchase_invoice_return(){
				$('#iframe').attr("src", "${ctx}/returninvoiceController/list.do");//已购发票退回
			}
			function Extension_Distribution_invoice(){
				$('#iframe').attr("src", "${ctx}/extensioninvoiceController/list.do");//向分机分配发票
			}
			function Recover_extension(){
				$('#iframe').attr("src", "${ctx}/extensioninvoiceController/extension_first.do");//收回分机剩余发票
			}
			function Recover_new_invoices(){
				$('#iframe').attr("src", "${ctx}/extensioninvoiceController/new_first.do");//收回分机新购发票
			}
			/*结束 发票管理-发票领用管理 */
			/*开始 发票管理-发票开具管理 */
			function Open_invoice_scrap(){
				$('#iframe').attr("src", "${ctx}/invoicescrapController/list.do");//已开发票作废
			}
			function Noopen_invoice_scrap(){
				$('#iframe').attr("src", "${ctx}/newinvoicescrapController/first.do");//未开发票作废
			}
			function Deduction_invoice_export(){
				$('#iframe').attr("src", "${ctx}/deducibleController/list.do");//抵扣发票下载导出
			}
			function Deduction_invoice_download(){
				$('#iframe').attr("src", "${ctx}/vehicleController/list.do");//抵扣发票批量下载
			}
			/*结束 发票管理-发票开具管理 */
			/*开始 发票管理-红字发票信息表 */
			function Special_invoice_fill(){
				$('#iframe').attr("src", "${ctx}/specialfillController/first.do");//红字增值税专用发票信息表填开
			}
			function Special_invoice_export(){
				$('#iframe').attr("src", "${ctx}/specialexportController/list.do");//红字增值税专用发票信息表查询导出
			}
			function Transportation_invoice_fill(){
				$('#iframe').attr("src", "${ctx}/transportationfillController/first.do");//红字货物运输业增值税专用发票信息表填开
			}
			function Transportation_invoice_export(){
				$('#iframe').attr("src", "${ctx}/transportationexportController/list.do");//红字货物运输业增值税专用发票信息表查询导出
			}
			/*结束 发票管理-红字发票信息表 */
			
			/* 报税处理 */
			function Report_summary() {
				$('#iframe').attr("src", "");//上报汇总
			}
			function Remote_clear_card() {
				$('#iframe').attr("src", "");//远程清卡
			}
			function The_tax_office_report() {
				$('#iframe').attr("src", "${ctx}/taxofficereportController/choice.do");//办税厅抄报
			}
			function Data_spread() {
				$('#iframe').attr("src", "${ctx}/dataspreadController/first.do");//资料传出
			}
			function State_query() {
				$('#iframe').attr("src", "");//状态查询
			}
			function Monthly_statistics() {
				$('#iframe').attr("src", "${ctx}/monthlycountController/first.do");//月度统计
			}
			function Invoice_data() {
				$('#iframe').attr("src", "${ctx}/invoicedataController/list.do");//发票资料
			}
			/*开始 报税处理-报税管理 */
			function Invoice_data_export() {
				$('#iframe').attr("src", "${ctx}/invoiceexportController/first.do");//发票数据导出
			}
			function List_invoice_data_export() {
				$('#iframe').attr("src", "");//清单发票数据导出
			}
			function Vehicle_declare_export() {
				$('#iframe').attr("src", "");//车购税申报导出
			}
			/*结束 报税处理-报税管理 */
			/*开始 报税处理-金税设备管理 */
			function Equipment_status_query() {
				$('#iframe').attr("src", "${ctx}/statusqueryController/stateInfor.do");//金税设备状态查询
			}
			function Equipment_password_setting() {
				$('#iframe').attr("src", "${ctx}/passwordsettingController/passwordsetting.do");//金税设备口令设置
			}
			function Equipment_clock_setting() {
				$('#iframe').attr("src", "${ctx}/clocksettingController/clocksetting.do");//金税设备时钟设置
			}
			/*结束 报税处理-金税设备管理 */
			/*开始 报税处理-发票资料统计 */
			function Equipment_annual_statistics() {
				$('#iframe').attr("src", "${ctx}/yearcountController/first.do");//金税设备年度资料统计
			}
			function Equipment_monthly_statistics() {
				$('#iframe').attr("src", "${ctx}/monthlycountController/first.do");//金税设备月度资料统计
			}
			/*结束 报税处理-发票资料统计 */
			
			
			/* 系统维护 */
			function data_migration() {
				$('#iframe').attr("src", "${ctx}/datamigrationController/transfer.do");//数据迁移
			}
			function Data_backup() {
				$('#iframe').attr("src", "");//数据备份
			}
			function Role_management() {
				$('#iframe').attr("src", "${ctx}/roleController/list.do");//角色管理
			}
			function User_management() {
				$('#iframe').attr("src", "${ctx}/userController/list.do");//用户管理
			}
			/*开始 系统维护-系统维护 */
			function Change_number() {
				$('#iframe').attr("src", "${ctx}/changenumberController/transfer.do");//税号变更
			}
			function Data_backup_settting() {
				$('#iframe').attr("src", "${ctx}/backupsettingController/backupsetting.do");//数据库备份设置
			}
			function Data_recovery() {
				$('#iframe').attr("src", "${ctx}/datarecoveryController/recovery.do");//数据恢复工具
			}
			/*结束 系统维护-系统维护 */
		</script>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="fixed-top" >
   <!-- BEGIN HEADER -->
   <div id="header" class="navbar navbar-inverse navbar-fixed-top">
       <!-- BEGIN TOP NAVIGATION BAR -->
       <div class="navbar-inner">
           <div class="container-fluid">
               <!--BEGIN SIDEBAR TOGGLE-->
               <div class="sidebar-toggle-box hidden-phone">
                   <div class="icon-reorder tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
               </div>
               <!--END SIDEBAR TOGGLE-->
               <!-- BEGIN LOGO -->
               <a class="brand" >
                   <img src="img/logo.png" alt="Metro Lab" />
               </a>
               <!-- END LOGO -->
               <!-- BEGIN RESPONSIVE MENU TOGGLER -->
               <a class="btn btn-navbar collapsed" id="main_menu_trigger" data-toggle="collapse" data-target=".nav-collapse">
                   <span class="icon-bar"></span>
                   <span class="icon-bar"></span>
                   <span class="icon-bar"></span>
                   <span class="arrow"></span>
               </a>
               <!-- END RESPONSIVE MENU TOGGLER -->
               <!-- END  NOTIFICATION -->
               <div class="top-nav ">
                   <ul class="nav pull-right top-menu" >
                       <!-- BEGIN SUPPORT -->
                       
                       <li class="dropdown mtop5">
                           <a class="dropdown-toggle element" data-placement="bottom" data-toggle="tooltip"  data-original-title="帮助">
                               <i class="icon-question-sign"></i>
                           </a>
                       </li>
                       <!-- END SUPPORT -->
                       <!-- BEGIN USER LOGIN DROPDOWN -->
                       <li class="dropdown">
                           <a  class="dropdown-toggle" data-toggle="dropdown">
                               <img src="img/avatar1_small.jpg" alt="">
                               <span class="username">${Users.username }</span>
                               <b class="caret"></b>
                           </a>
                           <ul class="dropdown-menu extended logout">
                               <li><a href="${ctx }/index.jsp"><i class="icon-key"></i>退出</a></li>
                           </ul>
                       </li>
                       <!-- END USER LOGIN DROPDOWN -->
                   </ul>
                   <!-- END TOP NAVIGATION MENU -->
               </div>
           </div>
       </div>
       <!-- END TOP NAVIGATION BAR -->
   </div>
   <!-- END HEADER -->
   
	<!-- BEGIN 顶部菜单 -->
	<div class="navbar navbar-static-top" style="margin-top: 60px;">
		<div class="navbar-inner">
			<ul class="nav" style="display:inline-block;" id="highlight">
				<li class="active" mes="homepage"><a class="navbar-brand" onclick="home()">首页</a></li>
				<li mes="personal"><a class="navbar-brand" onclick="setting()">系统设置</a></li>
				<li mes="personal"><a class="navbar-brand" onclick="invoice()">发票管理</a></li>
				<li mes="personal"><a class="navbar-brand" onclick="taxHandle()">报税处理</a></li>
				<li mes="personal"><a class="navbar-brand" onclick="maintain()">系统维护</a></li>
				<li class="divider-vertical"></li>
				<li mes="personal"><a  href="${ctx }/mainController/lock.do"  class="navbar-brand" data-toggle="modal">锁屏</a></li>
				<li mes="personal"><a class="navbar-brand" href="${ctx }/index.jsp">退出</a></li>
			</ul>
		</div>
	</div>
	<!-- END 顶部菜单 -->
	
	<!-- BEGIN CONTAINER -->
   <div id="container" class="row-fluid one" >
      <!-- BEGIN SIDEBAR -->
      <div class="sidebar-scroll">
        <div id="sidebar" class="nav-collapse collapse">
         <!-- BEGIN SIDEBAR MENU -->
          <ul class="sidebar-menu one">
              <li class="sub-menu active">
                  <a class="" href="${ctx }/loginController/refresh.do">
                      <i class="icon-dashboard"></i>
                      <span>控制台</span>
                  </a>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-cogs"></i>
                      <span>系统设置</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="Initialization()">初始化</a></li>
                      <li><a class="" onclick="Parameter_setting()">参数设置</a></li>
                      <li><a class="" onclick="Receiver_Dispatch()">收发货人</a></li>
                      <li><a class="" onclick="Customer_code()">客户编码</a></li>
                      <li><a class="" onclick="Purchase_units()">购货单位</a></li>
                      <li><a class="" onclick="Cost_items()">费用项目</a></li>
                      <li><a class="" onclick="Commodity_code()">商品编码</a></li>
                      <li><a class="" onclick="Vehicle_coding()">车辆编码</a></li>
                  </ul>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-book"></i>
                      <span>发票管理</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="Invoice_reading()">发票读入</a></li>
                      <li><a class="" onclick="Invoice_distribution()">发票分配</a></li>
                      <li><a class="" onclick="Inventory_query()">库存查询</a></li>
                      <li><a class="" onclick="Invoice_return()">发票退回</a></li>
                      <li><a class="" onclick="Invoice_fill()">发票填开</a></li>
                      <li><a class="" onclick="Invoice_Inquiry()">发票查询</a></li>
                      <li><a class="" onclick="Invoice_void()">发票作废</a></li>
                      <li><a class="" onclick="Invoice_repair()">发票修复</a></li>
                      <li><a class="" onclick="Information_table()">信息表</a></li>
                  </ul>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-tasks"></i>
                      <span>报税处理</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="Report_summary()">上报汇总</a></li>
                      <li><a class="" onclick="Remote_clear_card()">远程清卡</a></li>
                      <li><a class="" onclick="The_tax_office_report()">办税厅抄报</a></li>
                      <li><a class="" onclick="Data_spread()">资料传出</a></li>
                      <li><a class="" onclick="State_query()">状态查询</a></li>
                      <li><a class="" onclick="Monthly_statistics()">月度统计</a></li>
                      <li><a class="" onclick="Invoice_data()">发票资料</a></li>
                  </ul>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-th"></i>
                      <span>系统维护</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="data_migration()">数据迁移</a></li>
                      <li><a class="" onclick="Data_backup()">数据备份</a></li>
                      <li><a class="" onclick="Role_management()">角色管理</a></li>
                      <li><a class="" onclick="User_management()">用户管理</a></li>
                  </ul>
              </li>
          </ul>
         <!-- END SIDEBAR MENU -->
         
         <!-- BEGIN 系统设置 -->
          <ul class="sidebar-menu two" style="display:none;">
              <li class="sub-menu active">
                  <a class="" href="${ctx }/loginController/refresh.do">
                      <i class="icon-dashboard"></i>
                      <span>控制台</span>
                  </a>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-folder-open-alt"></i>
                      <span>系统设置</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="Register()">系统注册</a></li>
                      <li><a class="inactive">系统参数设置<span class="arrow" style="margin-top: 5px;"></a>
                      	<ul >
                      		<li><a class="" onclick="Parameter_setting()"><i class=" icon-cog"></i>基本参数设置</a></li>
                      		<li><a class="" onclick="Mail_server_settings()"><i class=" icon-cog"></i>邮件服务器设置</a></li>
                      	</ul>
                      </li>
                      <li><a class="" onclick="Initialization()">系统初始化</a></li>
                      <li><a class="" onclick="Tax_return_register()">报税盘注册</a></li>
                      <li><a class="inactive">打印模板设置<span class="arrow" style="margin-top: 5px;"></a>
                      	<ul >
                      		<li><a class="" onclick="">增值税专用发票模板设置</a></li>
                      		<li><a class="" onclick="">增值税普通发票模板设置</a></li>
                      		<li><a class="" onclick="">货物运输业增值税专用发票模板设置</a></li>
                      		<li><a class="" onclick="">旧版机动车销售统一发票模板设置</a></li>
                      		<li><a class="" onclick="">新版机动车销售统一发票模板设置</a></li>
                      		<li><a class="" onclick="">发票清单模板设置</a></li>
                      		<li><a class="" onclick="">红字增值税专用发票信息表模板设置</a></li>
                      		<li><a class="" onclick="">红字货物运输业增值税专用发票信息表模板设置</a></li>
                      	</ul>
                      </li>
                  </ul>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-folder-open-alt"></i>
                      <span>编码管理</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="Customer_code()">客户管理</a></li>
                      <li><a class="" onclick="Commodity_code()">商品管理</a></li>
                      <li><a class="" onclick="Purchase_units()">购货单位编码</a></li>
                      <li><a class="" onclick="Cost_items()">费用项目编码</a></li>
                      <li><a class="" onclick="Receiver_Dispatch()">收发货人编码</a></li>
                      <li><a class="" onclick="Vehicle_coding()">车辆编码</a></li>
                      <li><a class="" onclick="Taxitem()">税目编码</a></li>
                      <li><a class="" onclick="Administrativedivision()">行政区域编码</a></li>
                      <li><a class="" onclick="Goodsandservicestax()">商品和服务税收分类编码</a></li>
                  </ul>
              </li>
          </ul>
         <!-- END   系统设置 -->
         
         <!-- BEGIN 发票管理 -->
          <ul class="sidebar-menu three" style="display:none;">
              <li class="sub-menu active">
                  <a class="" href="${ctx }/loginController/refresh.do">
                      <i class="icon-dashboard"></i>
                      <span>控制台</span>
                  </a>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-folder-open-alt"></i>
                      <span>发票领用管理</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="Inventory_query()">发票库存查询</a></li>
                      <li><a class="" onclick="Setting_specifications()">设置卷票规格</a></li>
                      <li><a class="" onclick="Dowload_invoice()">网上领票管理</a></li>
                      <li><a class="inactive" >网上分票管理<span class="arrow" style="margin-top: 5px;"></span></a>
                      	<ul >
                      		<li><a class="" onclick="Main_onlineticket()"><i class=" icon-cog"></i>主机网上分票</a></li>
                      		<li><a class="" onclick="Dowload_onlineticket()"><i class=" icon-cog"></i>下载主机分票</a></li>
                      		<li><a class="" onclick="Leading_status()"><i class=" icon-cog"></i>领用状态查询</a></li>
                      	</ul>
                      </li>
                      <li><a class="" onclick="Read_new_invoices()">读入新购发票</a></li>
                      <li><a class="" onclick="Purchase_invoice_return()">已购发票退回</a></li>
                      <li><a class="inactive" >分机发票管理<span class="arrow" style="margin-top: 5px;"></span></a>
                      	<ul >
                      		<li><a class="" onclick="Extension_Distribution_invoice()"><i class=" icon-cog"></i>向分机分配发票</a></li>
                      		<li><a class="" onclick="Recover_extension()"><i class=" icon-cog"></i>收回分机剩余发票</a></li>
                      		<li><a class="" onclick="Recover_new_invoices()"><i class=" icon-cog"></i>收回分机新购发票</a></li>
                      	</ul>
                      </li>
                  </ul>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-folder-open-alt"></i>
                      <span>发票开具管理</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="inactive" >发票填开<span class="arrow" style="margin-top: 5px;"></span></a>
                      	<ul >
                      		<li><a class="" onclick="Invoice_fill()"><i class=" icon-cog"></i>增值税专用发票填开</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>增值税普通发票填开</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>电子增值税普通发票填开</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>增值税普通发票（卷票）填开</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>货物运输业增值税专用发票填开</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>机动车销售统一发票填开</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>收购发票填开</a></li>
                      	</ul>
                      </li>
                      <li><a class="" onclick="Invoice_Inquiry()">已开发票查询</a></li>
                      <li><a class="" onclick="Open_invoice_scrap()">已开发票作废</a></li>
                      <li><a class="inactive" >未开发票作废<span class="arrow" style="margin-top: 5px;"></span></a>
                      	<ul >
                      		<li><a class="" onclick="Noopen_invoice_scrap()"><i class=" icon-cog"></i>增值税专用发票作废</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>增值税普通发票作废</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>增值税普通发票（卷票）作废</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>货物运输业增值税专用发票作废</a></li>
                      		<li><a class="" onclick=""><i class=" icon-cog"></i>机动车销售统一发票作废</a></li>
                      	</ul>
                      </li>
                      <li><a class="" onclick="Invoice_repair()">发票修复</a></li>
                      <li><a class="" onclick="Deduction_invoice_export()">抵扣发票下载导出</a></li>
                      <li><a class="" onclick="Deduction_invoice_download()">抵扣发票批量下载</a></li>
                  </ul>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-folder-open-alt"></i>
                      <span>红字发票信息表</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="Special_invoice_fill()">红字增值税专用发票信息表填开</a></li>
                      <li><a class="" onclick="Special_invoice_export()">红字增值税专用发票信息表查询导出</a></li>
                      <li><a class="" onclick="Transportation_invoice_fill()">红字货物运输业增值税专用发票信息表填开</a></li>
                      <li><a class="" onclick="Transportation_invoice_export()">红字货物运输业增值税专用发票信息表查询导出</a></li>
                  </ul>
              </li>
          </ul>
         <!-- END   发票管理 -->
         
         <!-- BEGIN 报税处理 -->
          <ul class="sidebar-menu four" style="display:none;">
              <li class="sub-menu active">
                  <a class="" href="${ctx }/loginController/refresh.do">
                      <i class="icon-dashboard"></i>
                      <span>控制台</span>
                  </a>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-folder-open-alt"></i>
                      <span>报税管理</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="The_tax_office_report()">办税厅抄报</a></li>
                      <li><a class="" onclick="Data_spread()">报税资料传出</a></li>
                      <li><a class="inactive" >发票资料查询打印<span class="arrow" style="margin-top: 5px;"></span></a>
                      	<ul>
                      		<li><a class="" onclick="Invoice_data_export()"><i class=" icon-cog"></i>发票数据导出</a></li>
                      		<li><a class="" onclick="List_invoice_data_export()"><i class=" icon-cog"></i>清单发票数据导出</a></li>
                      		<li><a class="" onclick="Vehicle_declare_export()"><i class=" icon-cog"></i>车购税申报导出</a></li>
                      	</ul>
                      </li>
                      <li><a class="" onclick="Invoice_data_export()">发票数据导出</a></li>
                      <li><a class="inactive" >上报汇总管理<span class="arrow open" style="margin-top: 5px;"></span></a>
                      	<ul>
                      		<li><a class="" onclick="Report_summary()"><i class=" icon-cog"></i>上报汇总</a></li>
                      		<li><a class="" onclick="Remote_clear_card()"><i class=" icon-cog"></i>远程清卡</a></li>
                      	</ul>
                      </li>
                  </ul>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-folder-open-alt"></i>
                      <span>金税设备管理</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="Equipment_status_query()">金税设备状态查询</a></li>
                      <li><a class="" onclick="Equipment_password_setting()">金税设备口令设置</a></li>
                      <li><a class="" onclick="Equipment_clock_setting()">金税设备时钟设置</a></li>
                  </ul>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-folder-open-alt"></i>
                      <span>发票资料统计</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="Equipment_annual_statistics()">金税设备年度资料统计</a></li>
                      <li><a class="" onclick="Equipment_monthly_statistics()">金税设备月度资料统计</a></li>
                  </ul>
              </li>
          </ul>
         <!-- END   报税处理 -->
         
         <!-- BEGIN 系统维护 -->
          <ul class="sidebar-menu five" style="display:none;">
              <li class="sub-menu active">
                  <a class="" href="${ctx }/loginController/refresh.do">
                      <i class="icon-dashboard"></i>
                      <span>控制台</span>
                  </a>
              </li>
              <li class="sub-menu">
                  <a href="javascript:;" class="">
                      <i class="icon-folder-open-alt"></i>
                      <span>系统维护</span>
                      <span class="arrow"></span>
                  </a>
                  <ul class="sub">
                      <li><a class="" onclick="data_migration()">数据迁移工具</a></li>
                      <li><a class="" onclick="Change_number()">税号变更</a></li>
                      <li><a class="" onclick="Data_backup()">执行数据库备份</a></li>
                      <li><a class="" onclick="Data_backup_settting()">数据库备份设置</a></li>
                      <li><a class="" onclick="Data_recovery()">数据恢复工具</a></li>
                      <li><a class="inactive" >用户权限设置<span class="arrow" style="margin-top: 5px;"></span></a>
                      	<ul >
                      		<li><a class="" onclick="Role_management()"><i class="icon-cog"></i>角色管理</a></li>
                      		<li><a class="" onclick="User_management()"><i class="icon-user"></i>用户管理</a></li>
                      	</ul>
                      </li>
                  </ul>
              </li>
          </ul>
         <!-- END   系统维护 -->
      	</div>
      </div>
      <!-- END SIDEBAR -->
      <!-- BEGIN PAGE -->
       <div id="main-content">
      	<iframe id="iframe" name="iframe"  style="height: 85%;width: 100%;"></iframe>
       </div>  
      <!-- END PAGE -->  
   </div>
   <!-- END CONTAINER -->
   
   <!-- BEGIN FOOTER -->
   <div id="footer">
       2016 &copy; MetroAdmin.
   </div>
   <!-- END FOOTER -->

   <!-- BEGIN JAVASCRIPTS -->
   <!-- Load javascripts at bottom, this will reduce page load time -->
   <script src="js/jquery-1.8.3.min.js"></script>
   <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
   <script type="text/javascript" src="assets/jquery-slimscroll/jquery-ui-1.9.2.custom.min.js"></script>
   <script type="text/javascript" src="assets/jquery-slimscroll/jquery.slimscroll.min.js"></script>
   <script src="assets/fullcalendar/fullcalendar/fullcalendar.min.js"></script>
   <script src="assets/bootstrap/js/bootstrap.min.js"></script>

   <!-- ie8 fixes -->
   <!--[if lt IE 9]>
   <script src="js/excanvas.js"></script>
   <script src="js/respond.js"></script>
   <![endif]-->

   <script src="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js" type="text/javascript"></script>
   <script src="js/jquery.sparkline.js" type="text/javascript"></script>
   <script src="assets/chart-master/Chart.js"></script>
   <script src="js/jquery.scrollTo.min.js"></script>


   <!--common script for all pages-->
   <script src="js/common-scripts.js"></script>

   <!--script for this page only-->

   <script src="js/easy-pie-chart.js"></script>
   <script src="js/sparkline-chart.js"></script>
   <script src="js/home-page-calender.js"></script>
   <script src="js/home-chartjs.js"></script>

   <!-- END JAVASCRIPTS -->
   <script type="text/javascript">
   		$(function() {
				//左导航切换
				$(".sidebar-menu .sub-menu .sub li").click(function() {
					$(".sidebar-menu .sub-menu .sub li.active").removeClass("active");
					$(this).addClass("active");//当前菜单
					/* $(this).siblings().removeClass("active"); *///当前菜单其他兄弟元素
					$(this).parent().parent().addClass("active");
					$(this).parent().parent().siblings().removeClass("active");
				});
				
				//顶部导航切换
				$("#highlight li").click(function() {
						$("#highlight li").removeClass("active");
						$(this).addClass("active");
				});
		});
		
		//topMenu
			function home() {
				$(".sidebar-menu").css('display','none');
				$(".one").css('display','block');
			}
			function setting() {
				$(".sidebar-menu").css('display','none');
				$(".two").css('display','block');
			}
			function invoice() {
				$(".sidebar-menu").css('display','none');
				$(".three").css('display','block');
			}
			function taxHandle() {
				$(".sidebar-menu").css('display','none');
				$(".four").css('display','block');
			}
			function maintain() {
				$(".sidebar-menu").css('display','none');
				$(".five").css('display','block');
			}
		
	</script> 
	 
	<script language="javascript">
		//禁止右键和复制
    	$(document).ready(function(){  
    		$(document).bind("contextmenu",function(e){   
          	return false;   
    		});
    		
    		//二级菜单伸展和收缩 
        	$('.inactive').click(function(){  
             
            if($(this).siblings('ul').css('display')=='none'){
            	$('.inactive').siblings('ul').slideUp(100);  
                $(this).siblings('ul').slideDown(100);  
            }else{  
                $(this).siblings('ul').slideUp(100);  
            }  
        	})  
		});
	 </script>
</body>
<!-- END BODY -->
</html>
