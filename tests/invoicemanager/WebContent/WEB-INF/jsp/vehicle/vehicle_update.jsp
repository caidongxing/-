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
		<form action="${ctx }/vehicleController/update.do" method="post">
			<input type="hidden" name="id" value="${vehicles.id }" />
			<div id="content1" style="padding: 5px;">
				<div class="row-fluid main-content">
					<div class="pannel">
						<div class="pannel-header">
							<h4>车辆编码-修改</h4>
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
										<td class="text">上级编码</td>
										<td>
											<input type="text" class="span12" value="" >
										</td>
										<td class="text">*车辆类型</td>
										<td>
											<input type="text" class="span12" value="${vehicles.vehicletype }" name="vehicletype" required="" >
										</td>
										<td class="text">*编码</td>
										<td>
											<input type="text" class="span12" value="${vehicles.code }" name="code" required="">
										</td>
									</tr>
									<tr>
										<td class="text">厂牌型号</td>
										<td>
											<input type="text" class="span12" value="${vehicles.brandmodel }" name="brandmodel">
										</td>
										<td class="text">简码</td>
										<td>
											<input type="text" class="span12" value="${vehicles.simplecode }" name="simplecode" >
										</td>
										<td class="text">产地</td>
										<td>
											<input type="text" class="span12" value="${vehicles.originplace }" name="originplace" >
										</td>
									</tr>
									<tr>
										<td class="text">*税收分类编码</td>
										<td>
											<input type="text" class="span12" value="${vehicles.taxtypecode }" name="taxtypecode" required="">
										</td>
										<td class="text">生产企业名称</td>
										<td>
											<input type="text" class="span12" value="${vehicles.enterprisename }" name="enterprisename" >
										</td>
										<td class="text">税收分类名称</td>
										<td>
											<input type="text" class="span12" value="${vehicles.taxtypename }" name="taxtypename" >
										</td>
									</tr>
									<tr>
										<td class="text">享受优惠政策</td>
										<td>
											<select class="input-large m-wrap" tabindex="1" name="enjoypolicies" id="ifenjoy">
                                            	<option value="0" ${vehicles.enjoypolicies eq false ? "selected='selected'":""}>否</option>
                                            	<option value="1" ${vehicles.enjoypolicies eq true ? "selected='selected'":""}>是</option>
                                        	</select>
										</td>
										<td class="text">优惠政策类型</td>
										<td>
											<select class="input-large m-wrap" tabindex="1" name="policytype" id="policytype" disabled="disabled">
                                            	<option value="0"></option>
                                            	<option value="1" ${vehicles.policytype eq 1 ? "selected='selected'":""}>促进区域协调发展</option>
                                            	<option value="2" ${vehicles.policytype eq 2 ? "selected='selected'":""}>促进构建社会主义和谐社会</option>
                                            	<option value="3" ${vehicles.policytype eq 3 ? "selected='selected'":""}>促进资源节约型、环境友好型社会建设</option>
                                            	<option value="4" ${vehicles.policytype eq 4 ? "selected='selected'":""}>促进科技进步和自主创新</option>
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
