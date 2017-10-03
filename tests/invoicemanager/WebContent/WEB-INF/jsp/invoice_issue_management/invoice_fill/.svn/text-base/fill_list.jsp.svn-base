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
    <title>发票填开-清单</title>
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
  	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
  	<script type="text/javascript" src="js/page_table/bootstrap-table-zh-CN.js"></script>
  	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap.min.css" >
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
	<script type="text/javascript" src="js/export_execl/tableExport.js"></script>
	<style type="text/css">
		.bootstrap-table{
			margin-top: -21px;
		}
		#myModal{
			margin-left: 10px;
    		margin-top: -80px;
    		width: 100%;
    		background: transparent;
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
								<i class="icon-reorder"></i> 清单填开
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="btn-group" style="float: right;margin-bottom:10px;">
								<button class="btn" onclick="turn_invoice()">
									<i class="icon-share"></i>转发票
								</button>
								<button class="btn" data-toggle="modal" data-target="#myModal">
									<i class="icon-bar-chart"></i>折扣
								</button>
								<button class="btn" onclick="price()">
									<i class="icon-jpy"></i>价格
								</button>
								<button class="btn" onclick="addtr()">
									<i class="icon-plus-sign"></i>增行
								</button>
								<button class="btn" onclick="deltr()">
									<i class="icon-minus-sign"></i>减行
								</button>
								<button class="btn">
									<i class="icon-print"></i>打印
								</button>
								<button class="btn" onclick="window.history.go(-1);">
									<i class="icon-off"></i>退出
								</button>
							</div>
							<div class="panel panel-default" style="background:#F5F5F5;margin-top: 35px;margin-bottom:1px;padding: 20px;">
								<div style="float:left;margin-left: 15px;margin-top: -10px;color:blue;">发票代码：<span>${invoiceinventoryVo.classcode }</span></div>
								<div style="float:left;margin-left: 65px;margin-top: -10px;color:blue;">发票号码：<span>${invoiceinventoryVo.startnumber }</span></div>
							</div>
							<!-- 货物(不含税)  start -->
							<table  class="table table-bordered"  data-height="324" id="table_goods">
       						<thead>
									<tr>
										<th style="width:10px;"></th>
										<th>货物或应税劳务 、服务名称</th>
										<th>规格型号</th>
										<th>单位</th>
										<th>数量</th>
										<th>单价(不含税)</th>
										<th>金额(不含税)</th>
										<th>税率</th>
										<th>税额</th>
									</tr>
							</thead>
							<tbody>
								<tr id="tr">
									<td><a href='javascript:;' onclick="deltr(this)">X</a></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
							</tbody>
       						</table>
       						<!-- 货物  end -->
       						
       						<!-- 货物(含税)  start -->
							<table  class="table table-bordered" data-height="324" id="table_goods1" style="display:none;">
       						<thead>
									<tr>
										<th style="width:10px;"></th>
										<th>货物或应税劳务 、服务名称</th>
										<th>规格型号</th>
										<th>单位</th>
										<th>数量</th>
										<th>单价(含税)</th>
										<th>金额(含税)</th>
										<th>税率</th>
										<th>税额</th>
									</tr>
							</thead>
							<tbody>
								<tr id="tr1">
									<td><a href='javascript:;' onclick="deltr(this)">X</a></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
							</tbody>
       						</table>
       						<!-- 货物  end -->
						</div>
					</div>
					<!-- END EXAMPLE TABLE widget-->
				</div>
			</div>
		</div>
	</div>

	

	<!--BEGIN 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content" style="border-radius: 4px!important;">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">添加折扣行</h4>
				</div>
				<div class="modal-body">
					<ul>
						<li><label>折扣行数&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="span5" value="" style="height: 35px;border-radius: 4px!important;"></label></li>
						<li><label>商品金额&nbsp;&nbsp;&nbsp;&nbsp;</label></li>
						<li><label>折&nbsp;扣&nbsp;&nbsp;率&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="span5" value="" style="height: 35px;border-radius: 4px!important;">&nbsp;&nbsp;&nbsp;%</label></li>
						<li><label>折扣金额&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="span5" value="" style="height: 35px;border-radius: 4px!important;"></label></li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" id="btn_confirm">确认</button>
					<button type="button" class="btn btn-primary" style="border-radius: 4px!important;" data-dismiss="modal">取消</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
	
	
<script type="text/javascript">
$(document).ready(function(){
　　	$('.widget .tools .icon-remove').click(function () {
        $(this).parents(".widget").parent().remove();
    });
    		
    $('table tr').click(function(){
       	$('table tr').removeClass('selected');
       	$(this).addClass('selected');
    });
    $("#tr").hide();//隐藏table的第一行
    $("#tr1").hide();	
    		
});

//================增行 、删行 开始=========================
var rowes_one=0;
var rowes_two=0;
var rowesCount=0;
//添加方法
function addtr()
{
	if(document.getElementById("table_goods").style.display != 'none'){ 
		tab=document.getElementById("table_goods");
		rowesCount=rowes_one;
	}else{
    	tab=document.getElementById("table_goods1");
    	rowesCount=rowes_two;
    }
	if(rowesCount<8){
	
    //var trid=0;
    var tab="";
    if(document.getElementById("table_goods").style.display != 'none'){ 
		tab=document.getElementById("table_goods");
		rowes_one++;
	}else{
    	tab=document.getElementById("table_goods1");
    	rowes_two++;
    }
    //添加行
    var newTR = tab.insertRow(tab.rows.length);
    //trid++;
     
    //获取序号=行索引
    var  xuhao=newTR.rowIndex.toString();
    newTR.id = "tr" + xuhao;
    //添加列:序号
    var newPrimarykeyTD=newTR.insertCell(0);
    //添加列内容
    newPrimarykeyTD.innerHTML = "<a href='javascript:;' onclick=\"deltr('tr" + xuhao + "')\">X</a>";
    
    //添加列:
    var newNameTD=newTR.insertCell(1);
    //添加列内容
    newNameTD.innerHTML = "<input name='time" + xuhao + "' id='time" + xuhao + "' size='19'/><button type='button' style='border-radius: 4px!important;' onclick='choice_commodity()'>▦</button>";
 
    //添加列:
    var newSpecTD=newTR.insertCell(2);
    //添加列内容
    newSpecTD.innerHTML = "";
 
    //添加列:
    var newCompanyTD=newTR.insertCell(3);
    //添加列内容
    newCompanyTD.innerHTML = "";
         
    //添加列:
    var newNumberTD=newTR.insertCell(4);
    //添加列内容
    newNumberTD.innerHTML = "<input name='time" + xuhao + "' id='time" + xuhao + "' size='19'/>";
    
    //添加列:
    var newPriceTD=newTR.insertCell(5);
    //添加列内容
    newPriceTD.innerHTML = "<input name='time" + xuhao + "' id='time" + xuhao + "' size='19'/>";
 
    //添加列:
    var newMoneyTD=newTR.insertCell(6);
    //添加列内容
    newMoneyTD.innerHTML = "";
 
    //添加列:
    var newTaxrateTD=newTR.insertCell(7);
    //添加列内容
    newTaxrateTD.innerHTML = "<select style='width:70px;' name='way" + xuhao + "' id='way" + xuhao + "'><option  value='0.17'>17%</option><option value='0.13'>13%</option><option value='0.11'>11%</option><option value='0.06'>6%</option><option value='0.05'>5%</option><option value='0.04'>4%</option><option value='0.03'>3%</option>   </select>";
         
    //添加列:
    var newTaxTD=newTR.insertCell(8);
    //添加列内容
    newTaxTD.innerHTML = "";
    }else{
    	alert("已达到发票能开具的最大商品明细行数");
    }
    
   
}

//删除其中一行
function deltr(trid)
{    //alert(trid);
    var tab="";
    if(document.getElementById("table_goods").style.display != 'none'){ 
		tab=document.getElementById("table_goods");
		rowes_one--;
	}else{
    	tab=document.getElementById("table_goods1");
    	rowes_two--;
    }
    var row=document.getElementById(trid);    
    var index=row.rowIndex;//rowIndex属性为tr的索引值，从0开始   
    tab.deleteRow(index);  //从table中删除
 
}
//================增行 、删行结束=========================
//================增行 、删行结束=========================
function price(){
	if(document.getElementById("table_goods1").style.display == 'none'){
		document.getElementById("table_goods").style.display='none';
		document.getElementById("table_goods1").style.display='';
	}
    else{
     	document.getElementById("table_goods1").style.display='none';
     	document.getElementById("table_goods").style.display='';
    }
}
function turn_invoice(){
	location="${ctx}/invoicefillController/fill_window.do?";
}
function choice_commodity(){
	location="${ctx}/invoicefillController/fill_commodity.do?";
}

</script>
  </body>
</html>
