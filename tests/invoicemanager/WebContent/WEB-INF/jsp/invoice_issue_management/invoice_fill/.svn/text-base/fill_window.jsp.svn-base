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
    <title>发票填开</title>
    <link rel="stylesheet" href="css/response_table/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css"  />
   	<link rel="stylesheet" href="css/style.css"  />
	<link rel="stylesheet" href="css/common.css" />
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-combined.min.css" >  
	<link rel="stylesheet" href="css/daterangepicker/bootstrap-datetimepicker.min.css">
	<script type="text/javascript" src="js/response_table/jquery.min.js"></script>
  	<script type="text/javascript" src="js/response_table/bootstrap.min.js"></script>
	<style type="text/css">
		input[type=text]{
			border-radius: 4px!important;
		}
		#tablelast .radio{
			color:#ccc;
		}
		body{
			font-family: Microsoft Yahei, sans-serif;
		}
		/* #table_goods  tbody tr{
			height:35px;
		} */
	</style>
	
	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
  </head>
  
  <body>
    <div data-spy="scroll" style="height:1500px;overflow:auto; position: relative;">
		<div id="main-content">
			<div class="row-fluid">
				<div class="span12">
					<!-- BEGIN EXAMPLE TABLE widget-->
					<div class="widget blue">
						<div class="widget-title">
							<h4>
								<i class="icon-reorder"></i> 开具增值税专用发票
							</h4>
							<span class="tools"> <a href="javascript:;"
								class="icon-remove"></a> </span>
						</div>
						<div class="widget-body">
							<div class="btn-group" style="float: right;">
								<button class="btn">
									<i class="icon-download-alt"></i>导入
								</button>
								<button class="btn" onclick="window.location.href='${ctx}/invoicefillController/fill_customer.do'">
									<i class="icon-user"></i>客户
								</button>
								<button class="btn" onclick="window.location.href='${ctx}/invoicefillController/fill_copy.do'">
									<i class="icon-copy"></i>复制
								</button>
								<button class="btn">
									<i class="icon-file-text-alt"></i>红字
								</button>
								<button class="btn" onclick="window.location.href='${ctx}/invoicefillController/fill_list.do'">
									<i class="icon-list"></i>清单
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
								<button class="btn" onclick="print()">
									<i class="icon-print"></i>打印
								</button>
								<button class="btn" onclick="Close()">
									<i class="icon-off"></i>退出
								</button>
							</div>
							<div>
								<label style="float:left;margin-left: 250px;margin-top: 50px;font-size: 16px;">${invoiceinventoryVo.classcode }</label>
								<label style="float:left;margin-left: 150px;margin-top: 20px;font-size: 18px;"><strong>北京增值税专用发票信息表</strong></label>
								<label style="float:right;margin-right: 150px;margin-top: 20px;font-size: 16px;"><strong>NO</strong>&nbsp;&nbsp;&nbsp;<span>${invoiceinventoryVo.startnumber }</span></label>
							</div>
							
							<div style="text-align: center;">
								<label style="float:left;margin-left: 480px;margin-top: 20px;">此联不作报销、扣税凭证使用</label>
								<label style="float:left;margin-left: 150px;margin-top: 20px;">开票日期：<span id="span_id"></span></label>
							</div>
							<!-- 购买方与密码区  start -->
							<table class="table table-bordered">
								<colgroup>
									<col width="20px">
									<col>
									<col width="20px">
									<col>
								</colgroup>
								<tbody>
									<tr>
										<td class="text" style="width: 20px;line-height: 55px;">购<br>买<br>方</td>
										<td>
											<ul>
												<li>
													<label>名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：<input type="text" class="span9" value="${customers.name }"></label>
												</li>
												<li><label>纳税人识别号：<input type="text" class="span9" value="${customers.dutyparagraph }"></label></li>
												<li><label>地址、&nbsp;&nbsp;&nbsp;电话：<input type="text" class="span9" value="${customers.telephone }"></label></li>
												<li><label>开户行及账号：<input type="text" class="span9" value="${customers.bankaccount }"></label></li>
											</ul>
										</td>
										<td class="text" style="width: 20px;line-height: 55px;">密<br>码<br>区</td>
										<td style="width: 40%;">
											<ul>
												<li><span id="span_id1"></span></li>
												<li><span id="span_id2"></span></li>
												<li><span id="span_id3"></span></li>
												<li><span id="span_id4"></span></li>
											</ul>
										</td>
									</tr>
								</tbody>
							</table>
							<!-- 购买方与密码区  end -->
							
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
       						
       						
       						<!-- 合计 start-->
							<table class="table table-bordered">
								<tbody>
									<tr>
										<td style="width: 150px;text-align: center;vertical-align: middle;">合&nbsp;&nbsp;&nbsp;&nbsp;计</td>
										<td>
											<label style="float: left;margin-right: 250px;">金额：&nbsp;&nbsp;&nbsp;&nbsp;￥${ites.items ==0?0.00:ites.items}</label>
											<label>税额：&nbsp;&nbsp;&nbsp;&nbsp;￥${ites.items ==0?0.00:ites.items}</label>
										</td>
									</tr>
								</tbody>
							</table>
							<table class="table table-bordered">
								<tbody>
									<tr>
										<td style="width: 150px;text-align: center;vertical-align: middle;">价税合计（大写）</td>
										<td>
											<label style="float: left;margin-right: 650px;"></label>
											<label>（小写）&nbsp;&nbsp;&nbsp;&nbsp;￥${ites.items ==0?0.00:ites.items}</label>
										</td>
									</tr>
								</tbody>
							</table>
							<!-- 合计 end-->
							
							<!-- 销售方 start-->
							<table class="table table-bordered">
								<colgroup>
									<col width="20px">
									<col>
									<col width="20px">
									<col>
								</colgroup>
								<tbody>
									<tr>
										<td class="text" style="width: 20px;line-height: 45px;">销<br>售<br>方</td>
										<td>
											<ul>
												<li>
													<label>名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</label>
												</li>
												<li><label>纳税人识别号：</label></li>
												<li><label>地址、&nbsp;&nbsp;&nbsp;电话：<input type="text" class="span9"></label></li>
												<li><label>开户行及账号：<input type="text" class="span9"></label></li>
											</ul>
										</td>
										<td class="text" style="width: 20px;line-height: 55px;">备<br>注</td>
										<td style="width: 40%;">
											
										</td>
									</tr>
								</tbody>
							</table>
							<!-- 销售方 end-->
							<table style="margin-top:10px;">
								<tbody>
									<tr>
										<td>
											<label style="float:left;">收款人：<input type="text" class="span5" style="margin-top: 5px;"></label>
											<label style="float:left;">复&nbsp;&nbsp;&nbsp;核：<input type="text" class="span5" style="margin-top: 5px;"></label>
											<label style="float:left;margin-right:350px;margin-top: 8px;">开票人：${users.username }</label>
											<label style="float:left;margin-top: 8px;">销售方：（章）</label>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- END EXAMPLE TABLE widget-->
				</div>
			</div>
		</div>
	</div>

	<!--BEGIN 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true" style="width: 50%;background: transparent;">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">添加折扣行</h4>
				</div>
				<div class="modal-body">
					<label>折扣行数&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="span5" value="${customers.dutyparagraph }" style="height: 35px;"></label>
					<label>商品金额&nbsp;&nbsp;&nbsp;&nbsp;</label>
					<label>折&nbsp;扣&nbsp;&nbsp;率&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="span5" value="${customers.dutyparagraph }" style="height: 35px;">&nbsp;&nbsp;&nbsp;%</label>
					<label>折扣金额&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="span5" value="${customers.dutyparagraph }" style="height: 35px;"></label>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">确认</button>
					<button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
				</div>
			</div>
		</div>
	</div>
	<!--END 模态框（Modal） -->
	
	
</body>
<script type="text/javascript">
$(document).ready(function(){
　　	$('.widget .tools .icon-remove').click(function () {
        $(this).parents(".widget").parent().remove();
    });
    		
    $('#table_goods tbody tr').click(function(){
       	$('#table_goods tbody tr').removeClass('success');
       	$(this).addClass('success');
    });
    
    $("#tr").hide();//隐藏table的第一行
    $("#tr1").hide();
    
    //获取当前日期格式化
    var date = new Date();
    document.getElementById('span_id').innerText=date.getFullYear()+"年"+(date.getMonth()+1)+"月"+date.getDate()+"日";
    
    //密码生成
    var str = "0123456789+-<>*/";
    var code = "";
    for (var i = 0; i < 84; i++) {
        var random = parseInt(Math.random() * str.length);
        code += str.charAt(random)
    }
    
    //分行显示
    var strs = code;
　　var flag = 21;
　　var arr = [];
　　var count =0;
　　for(var i=0,len=strs.length/21;i<len;i++) {
　　		str1 = strs.substr(0,21);
　　		strs = strs.replace(str1,'');
		document.getElementById('span_id'+(i+1)).innerText=str1;
　　}
    
});

//金额转大写
//代码如下所示：
function convertCurrency(money) {
	
  //汉字的数字
  var cnNums = new Array('零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖');
  //基本单位
  var cnIntRadice = new Array('', '拾', '佰', '仟');
  //对应整数部分扩展单位
  var cnIntUnits = new Array('', '万', '亿', '兆');
  //对应小数部分单位
  var cnDecUnits = new Array('角', '分', '毫', '厘');
  //整数金额时后面跟的字符
  var cnInteger = '整';
  //整型完以后的单位
  var cnIntLast = '元';
  //最大处理的数字
  var maxNum = 999999999999999.9999;
  //金额整数部分
  var integerNum;
  //金额小数部分
  var decimalNum;
  //输出的中文金额字符串
  var chineseStr = '';
  //分离金额后用的数组，预定义
  var parts;
  if (money == '') { return ''; }
  money = parseFloat(money);
  if (money >= maxNum) {
    //超出最大处理数字
    return '';
  }
  if (money == 0) {
    chineseStr = cnNums[0] + cnIntLast + cnInteger;
    return chineseStr;
  }
  //转换为字符串
  money = money.toString();
  if (money.indexOf('.') == -1) {
    integerNum = money;
    decimalNum = '';
  } else {
    parts = money.split('.');
    integerNum = parts[0];
    decimalNum = parts[1].substr(0, 4);
  }
  //获取整型部分转换
  if (parseInt(integerNum, 10) > 0) {
    var zeroCount = 0;
    var IntLen = integerNum.length;
    for (var i = 0; i < IntLen; i++) {
      var n = integerNum.substr(i, 1);
      var p = IntLen - i - 1;
      var q = p / 4;
      var m = p % 4;
      if (n == '0') {
        zeroCount++;
      } else {
        if (zeroCount > 0) {
          chineseStr += cnNums[0];
        }
        //归零
        zeroCount = 0;
        chineseStr += cnNums[parseInt(n)] + cnIntRadice[m];
      }
      if (m == 0 && zeroCount < 4) {
        chineseStr += cnIntUnits[q];
      }
    }
    chineseStr += cnIntLast;
  }
  //小数部分
  if (decimalNum != '') {
    var decLen = decimalNum.length;
    for (var i = 0; i < decLen; i++) {
      var n = decimalNum.substr(i, 1);
      if (n != '0') {
        chineseStr += cnNums[Number(n)] + cnDecUnits[i];
      }
    }
  }
  if (chineseStr == '') {
    chineseStr += cnNums[0] + cnIntLast + cnInteger;
  } else if (decimalNum == '') {
    chineseStr += cnInteger;
  }
  
  return chineseStr;
}
//================金额转中文大写   结束=========================


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
    var newNameTD=newTR.insertCell(0);
    //添加列内容
    newNameTD.innerHTML = "<a href='javascript:;' onclick=\"deltr('tr" + xuhao + "')\">X</a>";
    
    //添加列:
    var newNameTD=newTR.insertCell(1);
    //添加列内容
    newNameTD.innerHTML = "";
 
    //添加列:
    var newEmailTD=newTR.insertCell(2);
    //添加列内容
    newEmailTD.innerHTML = "";
 
    //添加列:
    var newTelTD=newTR.insertCell(3);
    //添加列内容
    newTelTD.innerHTML = "";
         
    //添加列:
    var newDeleteTD=newTR.insertCell(4);
    //添加列内容
    newDeleteTD.innerHTML = "";
    
    //添加列:
    var newNameTD=newTR.insertCell(5);
    //添加列内容
    newNameTD.innerHTML = "";
 
    //添加列:
    var newEmailTD=newTR.insertCell(6);
    //添加列内容
    newEmailTD.innerHTML = "";
 
    //添加列:
    var newTelTD=newTR.insertCell(7);
    //添加列内容
    newTelTD.innerHTML = "";
         
    //添加列:
    var newDeleteTD=newTR.insertCell(8);
    //添加列内容
    newDeleteTD.innerHTML = "";
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
</script>
</html>
