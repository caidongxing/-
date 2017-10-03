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
    <title>购货单位编码</title>
    <link href="css/add_update/bootstrap.min.css" rel="stylesheet" />
    <link href="css/add_update/bootstrap.covering.css" rel="stylesheet" />
    <link href="css/add_update/jquery-ui-1.10.4.custom.min.css" rel="stylesheet" />
	<link href="css/add_update/framework.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/common.css" />

  </head>
  
  <body>
    <div id="main-content">
		<form action="${ctx }/purchaseunitsController/add.do" method="post">
			<div id="content1" style="padding: 5px;">
				<div class="row-fluid main-content">
					<div class="pannel">
						<div class="pannel-header">
							<h4>购货单位编码-新增</h4>
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
										<td class="text">*名称</td>
										<td>
											<input type="text" class="span12" value="" name="name" required="" >
										</td>
										<td class="text">*编码</td>
										<td>
											<input type="text" class="span12" value="" name="code" required="">
										</td>
									</tr>
									<tr>
										<td class="text">*身份证号码/组织机构代码</td>
										<td>
											<input type="text" class="span12" value="" name="organizationcode">
										</td>
										<td class="text">简码</td>
										<td>
											<input type="text" class="span12" value="" name="simplecode" >
										</td>
										<td class="text">税号</td>
										<td>
											<input type="text" class="span12" value="" name="taxpayeridentificationnumber">
										</td>
									</tr>
									<tr rowspan="2">
										<td class="text">地址电话</td>
										<td colspan="5">
											<textarea class="span6 " rows="3" value="" name="telephone"></textarea>
										</td>
									</tr>
									<tr rowspan="2">
										<td class="text">银行账号</td>
										<td colspan="5">
											<textarea class="span6 " rows="3" value="" name="bankaccount"></textarea>
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
