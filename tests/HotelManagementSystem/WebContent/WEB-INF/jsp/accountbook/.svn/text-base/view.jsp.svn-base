<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8" />
<title><tiles:insertAttribute name="title" ignore="true" />
</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="Mosaddek" name="author" />

<style type="text/css">
.select2-container {
	margin-left: -1px !important;
}

.unstyled li {
	cursor: pointer;
}
</style>

</head>

<body>
	<div class='container-fluid'>
		<div class='row-fluid' id='content-wrapper'>
			<div class='span12'>
				<div class='page-header'>
					<h1 class='pull-left'>
						<i class='icon-table'></i> <span>账本设置</span>
					</h1>
					<div class="pull-right">
						<ul class='breadcrumb'>
							<li><a href='${ctx}'><i class='icon-table'></i> </a>
							</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li>系统设置</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li>账本设置</li>
							<li class='separator'><i class='icon-angle-right'></i>
							</li>
							<li class='active'>详情</li>
						</ul>
					</div>
				</div>

				<div class='row-fluid'>
					<div class='span12 box' style='margin-bottom:0'>
						<div class='box-header blue-background'>
							<div class='title'>账本详情</div>
							<div class='actions'>
								<a href="#" class="btn box-remove btn-mini btn-link"><i
									class='icon-remove'></i> </a> 
									<a onclick="OnloadContent('${ctx}/accountBookController/list.do')" class="btn btn-mini btn-link"><i class="icon-mail-reply"></i> </a>
							</div>
						</div>
						<div class='box-content box-double-padding'>
							<div class='row-fluid'>
								<div class='span6'>

									<div class='box-header'>
										<div class='title purple-background'>账本</div>
										<div class='box-content box-no-padding'>

											<div class='row-fluid span12'>
												<div class='span12'></div>
												<div class='span12'>
													<label class='span2' style="line-height: 30px">账本代码:</label>
													<label class='span3' style="line-height: 30px">${accountbook.accountbookcode}</label>
												</div>

												<div class='span12'>
													<label class='span2' style="line-height: 30px">账本名称:</label>
													<label class='span3' style="line-height: 30px">${accountbook.accountbookname}</label>
												</div>

												<div class='span12'>
													<label class='span2' style="line-height: 30px">限额:</label>
													<label class='span3' style="line-height: 30px">${accountbook.quota}</label>
												</div>

												<div class='span12'>
													<label class='span2' style="line-height: 30px">转账方式:</label>
													<label class='span3' style="line-height: 30px"> <c:choose>
															<c:when test="${accountbook.transferaccountswayid == 1}">结账即转</c:when>
															<c:when test="${accountbook.transferaccountswayid == 2}">发生即转</c:when>
															<c:when test="${accountbook.transferaccountswayid == 3}">夜审即转</c:when>
														</c:choose> </label>
												</div>

											</div>

										</div>
									</div>

								</div>
								<div class='span6'>

									<div class='box-header'>
										<div class='title purple-background'>账项</div>
										<div class='box-content box-no-padding'>
											<div class='row-fluid span12'>
											<ul class='unstyled' id="accountbook">
											<li class="span12" ></li>
												<c:forEach items="${vo}" var="item">
													<li class="span12" value="${item.accountitemsid}">${item.accountitemsid}、${item.itemsname}</li>
												</c:forEach>
											</ul>
											</div>
										</div>
									</div>

								</div>
							</div>

						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

</body>
</html>

<script type="text/javascript">
	
</script>