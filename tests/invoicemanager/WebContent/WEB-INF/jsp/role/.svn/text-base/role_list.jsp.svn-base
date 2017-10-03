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
    <title>角色管理</title>
	<link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
	<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet"/>
	<link href="css/style.css" rel="stylesheet" />
	<link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
  	
  	<link rel="stylesheet" href="css/zTreeStyle/demo.css" type="text/css">
	<link rel="stylesheet" href="css/zTreeStyle/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="js/zTreeStyle/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="js/zTreeStyle/jquery.ztree.core-3.5.js"></script>
	<script type="text/javascript" src="js/zTreeStyle/jquery.ztree.excheck-3.5.js"></script>
  	<style type="text/css">
  		#left{
  			float:left;
  			width:25%;
  			height:100%;
  		}
  		#right{
  			float:left;
  			width:75%;
  			height:100%;
  		}
  		input[type=text]{
			padding:5px;
			border-radius: 4px!important;
		}
		.control-group{
			margin-left: 30px;
			margin-bottom: 0px;
		}
  	</style>
  	<script type="text/javascript">
  		$(document).ready(function(){
　　			$('.widget .tools .icon-remove').click(function () {
        		$(this).parents(".widget").parent().remove();
    		});
　　		});
  		function Add(){
  			location="${ctx}/roleController/toadd.do";
  		}
  		function Update(){
  			/* location="${ctx}/roleController/toedit.do"; */
  			$(".btn").attr({"disabled":"disabled"});
  		}
  		function Delete(){
  			if(confirm("是否删除??")){
				window.location.href="${ctx}/roleController/delete.do?id="+id;
			}
  		}
  		
  		
  		//=================begin-生成下拉树=================
  		var setting = {
			check: {
				enable: true
			},
			data: {
				simpleData: {
					enable: true
				}
			}
		};

		var zNodes =[
			{ id:1, pId:0, name:"系统设置", open:true},
			{ id:11, pId:1, name:"系统注册"},
			{ id:12, pId:1, name:"系统初始化"},
			{ id:2, pId:0, name:"编码管理", open:true},
			{ id:21, pId:2, name:"客户管理"},
			{ id:22, pId:2, name:"商品管理"},
			{ id:23, pId:2, name:"购货单位编码"},
			{ id:24, pId:2, name:"费用项目编码"},
			{ id:25, pId:2, name:"收发货人编码"},
			{ id:26, pId:2, name:"车辆编码"},
			{ id:27, pId:2, name:"税目编码"},
			{ id:28, pId:2, name:"行政区域编码"},
			{ id:29, pId:2, name:"商品和服务税收分类编码"},
			{ id:3, pId:0, name:"发票领用管理", open:true},
			{ id:31, pId:3, name:"发票库存查询"},
			{ id:32, pId:3, name:"网上领票管理"},
			{ id:33, pId:3, name:"网上分票管理", open:true},
			{ id:331, pId:33, name:"主机网上分票"},
			{ id:332, pId:33, name:"下载主机分票"},
			{ id:333, pId:33, name:"领用状态查询"},
			{ id:34, pId:3, name:"已购发票退回"},
			{ id:35, pId:3, name:"分机发票管理", open:true},
			{ id:351, pId:35, name:"向分机分配发票"},
			{ id:352, pId:35, name:"收回分机剩余发票"},
			{ id:353, pId:35, name:"收回分机新购发票"},
			{ id:4, pId:0, name:"发票管理", open:true},
			{ id:41, pId:4, name:"已开发票查询"},
			{ id:42, pId:4, name:"已开发票作废"},
			{ id:43, pId:4, name:"发票修复"},
			{ id:44, pId:4, name:"抵扣发票下载导出"},
			{ id:5, pId:0, name:"红字发票信息表", open:true},
			{ id:51, pId:5, name:"红字增值税专用发票信息表填开"},
			{ id:52, pId:5, name:"红字增值税专用发票信息表查询导出"},
			{ id:53, pId:5, name:"红字货物运输业增值税专用发票信息表填开"},
			{ id:54, pId:5, name:"红字货物运输业增值税专用发票信息表查询导出"},
			{ id:6, pId:0, name:"报税管理", open:true},
			{ id:61, pId:6, name:"办税厅抄报"},
			{ id:62, pId:6, name:"报税资料传出"},
			{ id:63, pId:6, name:"发票资料查询打印"},
			{ id:64, pId:6, name:"发票数据导出"},
			{ id:65, pId:6, name:"远程抄报管理", open:true},
			{ id:651, pId:65, name:"远程抄报"},
			{ id:652, pId:65, name:"远程清卡"},
			{ id:7, pId:0, name:"金税设备管理", open:true},
			{ id:71, pId:7, name:"金税设备状态查询"},
			{ id:72, pId:7, name:"金税设备口令设置"},
			{ id:73, pId:7, name:"金税设备时钟设置"},
			{ id:8, pId:0, name:"发票资料统计", open:true},
			{ id:81, pId:8, name:"金税设备年度资料统计"},
			{ id:82, pId:8, name:"金税设备月度资料统计"},
			{ id:9, pId:0, name:"系统维护", open:true},
			{ id:91, pId:9, name:"数据迁移工具"},
			{ id:92, pId:9, name:"执行数据备份"},
			{ id:10, pId:0, name:"系统参数设置", open:true},
			{ id:101, pId:10, name:"系统设置", open:true},
			{ id:1011, pId:101, name:"邮件服务器设置"}
		];
		
		var code;
		
		function setCheck() {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			py = $("#py").attr("checked")? "p":"",
			sy = $("#sy").attr("checked")? "s":"",
			pn = $("#pn").attr("checked")? "p":"",
			sn = $("#sn").attr("checked")? "s":"",
			type = { "Y":py + sy, "N":pn + sn};
			zTree.setting.check.chkboxType = type;
			showCode('setting.check.chkboxType = { "Y" : "' + type.Y + '", "N" : "' + type.N + '" };');
		}
		function showCode(str) {
			if (!code) code = $("#code");
			code.empty();
			code.append("<li>"+str+"</li>");
		}
		
		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			setCheck();
			$("#py").bind("change", setCheck);
			$("#sy").bind("change", setCheck);
			$("#pn").bind("change", setCheck);
			$("#sn").bind("change", setCheck);
		});
		//=================end-生成下拉树=================
		
		$(document).ready(function(){
			
		});
		
  	</script>
  	
  </head>
  
  <body>
  	<div style="display:none;">
  		<input type="checkbox" id="py" class="checkbox first" checked /><span>关联父</span>
		<input type="checkbox" id="sy" class="checkbox first" checked /><span>关联子</span><br/>
		<input type="checkbox" id="pn" class="checkbox first" checked /><span>关联父</span>
		<input type="checkbox" id="sn" class="checkbox first" checked /><span>关联子</span><br/>
	</div>
    <div data-spy="scroll" style="height:600px;overflow:auto; position: relative;">
		<div id="main-content">
			<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN EXAMPLE TABLE widget-->
					<div class="widget blue">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 角色管理
							</h4>
							<span class="tools"> <a href="javascript:;" class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="btn-group" style="margin-bottom:10px;">
								<button class="btn" onclick="Add()" style="color: #17AA6B;">
									<i class="icon-user"></i>新增
								</button>
								<button class="btn" onclick="Update()" style="color: #F5A16A;">
									<i class="icon-user"></i>修改
								</button>
								<button class="btn" onclick="Delete()" style="color: #D63E3E;">
									<i class="icon-user"></i>删除
								</button>
							</div>
							<div class="btn-group" style="margin-bottom:10px;float:right;">
								<a><img alt="" src="${ctx }/img/success_icon.png" style="width:20px;"></a>
								<a><img alt="" src="${ctx }/img/x_alt.png" style="width:20px;margin-left: 15px;"></a>
							</div>
							<div style="height: 100%;">
								<div id="left">
									<div style="background:#E0E0E0;">
										<label>角色列表</label>
									</div>
									<!-- <div style="height:97%;background: #ccc;">
									</div> -->
									<ul id="treeDemo1" class="ztree" style="height:93%;width: 95%;"></ul>
								</div>
								<div id="right">
									<div class="control-group">
										<label class="control-label" style="float: left;">角色名称&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls">
											<input type="text" class="span6 " name="rolename">
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" style="float: left;">角色描述&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls">
											<input type="text" class="span6 " name="rolename">
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" style="float: left;width:72px;">创建人&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls">
											<input type="text" class="span6 " name="creater">
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" style="float: left;">创建时间&nbsp;&nbsp;&nbsp;&nbsp;</label>
										<div class="controls">
											<input type="text" class="span6 " name="createtime">
										</div>
									</div>
									<div style="background:#E0E0E0;margin-left: 30px;">
										<label>权限列表(选中则拥有操作该功能的权限)</label>
									</div>
									<!-- <div style="height:70%;background: #ccc;margin-left: 30px;">
										<div data-spy="scroll" style="height:400px;overflow:auto; position: relative;">
											
										</div>
									</div> -->
									<ul id="treeDemo" class="ztree" style="height:66%;width: 95%;margin-left: 30px;"></ul>
								</div>
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
