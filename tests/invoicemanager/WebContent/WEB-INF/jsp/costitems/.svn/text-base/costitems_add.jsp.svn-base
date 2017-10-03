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
		<form action="${ctx }/costitemsController/add.do" method="post">
			<div id="content1" style="padding: 5px;">
				<div class="row-fluid main-content">
					<div class="pannel">
						<div class="pannel-header">
							<h4>费用编码-新增</h4>
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
										<td class="text">*费用名称</td>
										<td>
											<input type="text" class="span12" value="" name="name" required="" >
										</td>
										<td class="text">*编码</td>
										<td>
											<input type="text" class="span12" value="" name="code" required="">
										</td>
									</tr>
									<tr>
										<td class="text">税收分类编码</td>
										<td>
											<input type="text" class="span12" value="" name="taxtypecode" required="">
										</td>
										<td class="text">简码</td>
										<td>
											<input type="text" class="span12" value="" name="simplecode" >
										</td>
										<td class="text">税收分类名称</td>
										<td>
											<input type="text" class="span12" value="" name="taxtypename" >
										</td>
									</tr>
									<tr>
										<td class="text">享受优惠政策</td>
										<td>
											<select class="input-large m-wrap" tabindex="1" name="enjoypolicies" id="ifenjoy">
                                            	<option value="0">否</option>
                                            	<option value="1">是</option>
                                        	</select>
										</td>
										<td class="text">优惠政策类型</td>
										<td>
											<select class="input-large m-wrap" tabindex="1" name="policytype" id="policytype" disabled="disabled">
                                            	<option value="0"></option>
                                            	<option value="1">促进区域协调发展</option>
                                            	<option value="2">促进构建社会主义和谐社会</option>
                                            	<option value="3">促进资源节约型、环境友好型社会建设</option>
                                            	<option value="4">促进科技进步和自主创新</option>
                                        	</select>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="pannel-footer text-center">
							<button type="submit" class="btn btn-success">保 存</button>
							<a href="" class="btn" onClick="history.go(-1);">取消</a>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
  </body>
</html>
