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
    <title></title>
    <link href="css/add_update/bootstrap.min.css" rel="stylesheet" />
    <link href="css/add_update/bootstrap.covering.css" rel="stylesheet" />
    <link href="css/add_update/jquery-ui-1.10.4.custom.min.css" rel="stylesheet" />
	<link href="css/add_update/framework.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
  		
				$(document).ready(function() {
					$("#ifenjoy").change(function() {
						if($('#ifenjoy option:selected') .val()==0){
							$("#policytype").attr("disabled","disabled");
							document.getElementsByName('policytype')[0].options[0].selected=true;
						}else{
							$("#policytype").removeAttr("disabled");
						}
					});
				})
	</script>

  </head>
  
  <body>
    <div id="main-content">
		<form action="${ctx }/taxitemController/update.do" method="post">
			<input type="hidden" name="id" value="${taxitems.id }" />
			<div id="content1" style="padding: 5px;">
				<div class="row-fluid main-content">
					<div class="pannel">
						<div class="pannel-header">
							<h4>商品税目编码修改</h4>
						</div>
						<div class="pannel-body">
							<table class="table table-bordered">
								<colgroup>
									<col width="100px">
									<col>
									<col width="100px">
									<col>
									<col width="100px">
									<col>
								</colgroup>
								<tbody>
									<tr>
										<td class="text">*税种</td>
										<td>
											<input type="text" class="span12" value="${taxitems.taxcategory }" name="taxcategory" required="">
										</td>
										<td class="text">*编码</td>
										<td>
											<input type="text" class="span12" value="${taxitems.code }" name="code" required="">
										</td>
										<td class="text">*名称</td>
										<td>
											<input type="text" class="span12" value="${taxitems.name }" name="name" required="" >
										</td>
									</tr>
									<tr>
										<td class="text">*税率</td>
										<td>
											<select class="input-large m-wrap" tabindex="1" name="taxrate">
                                            	<option value="17%" ${taxitems.taxrate eq "17%" ? "selected='selected'":""}>17%</option>
                                            	<option value="13%" ${taxitems.taxrate eq "13%" ? "selected='selected'":""}>13%</option>
                                            	<option value="11%" ${taxitems.taxrate eq "11%" ? "selected='selected'":""}>11%</option>
                                            	<option value="6%"  ${taxitems.taxrate eq "6%" ? "selected='selected'":""}>6%</option>
                                            	<option value="5%"  ${taxitems.taxrate eq "5%" ? "selected='selected'":""}>5%</option>
                                            	<option value="4%"  ${taxitems.taxrate eq "4%" ? "selected='selected'":""}>4%</option>
                                            	<option value="3%"  ${taxitems.taxrate eq "3%" ? "selected='selected'":""}>3%</option>
                                        	</select>
										</td>
										<td class="text">*征收率</td>
										<td>
											<input type="text" class="span12" value="${taxitems.percentagecharges }" name="percentagecharges" required="">
										</td>
										<td class="text">非核定标志</td>
										<td>
											<select class="input-large m-wrap" tabindex="1" name="nonauthorizedmark" id="ifenjoy">
                                            	<option value="0" ${taxitems.nonauthorizedmark eq false ? "selected='selected'":""}>否</option>
                                            	<option value="1" ${taxitems.nonauthorizedmark eq true ? "selected='selected'":""}>是</option>
                                        	</select>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="pannel-footer text-center">
							<button type="submit" class="btn btn-success">修改</button>
							<a href="" class="btn" onClick="history.go(-1);">取消</a>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
  </body>
</html>
