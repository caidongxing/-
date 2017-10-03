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
    
    <title></title>
    <script type="text/javascript" src="js/page_table/jquery.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap-table.min.js"></script>
	<script type="text/javascript" src="js/page_table/bootstrap-table-zh-CN.js"></script>

	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap.min.css" >
	<link rel="stylesheet" type="text/css" href="css/page_table/bootstrap-table.min.css" >
	
  </head>
  
  <body>
  	<p><button id="button" class="btn btn-default">刷新</button></p>
    <table id="table"
       data-toggle="table"
       data-height="500"
       data-pagination="true"
       data-search="true"
       data-show-refresh="true"
       data-toolbar="#toolbar">
        <thead>
			<tr>
				<th data-field="code">编码</th>
				<th data-field="name">名称</th>
				<th data-field="simplecode">简码</th>
				<th data-field="dutyparagraph">税号</th>
				<th data-field="telephone">地址电话</th>
				<th data-field="bankaccount">银行账号</th>
				<th data-field="mailingaddress">邮件地址</th>
				<th data-field="remarks">备注</th>
			</tr>
		</thead>
      </table>
	<script>  
    var $table = $('#table');  
    $(function () {  
        $table.bootstrapTable({  
            data: [{  
                "code": "$0"
                "name": "$0",  
                "simplecode": "$0",
                "dutyparagraph": "$0",
                "telephone": "Item 0",  
                "bankaccount": "$0",
                "mailingaddress": "$0",
                "remarks": "Item 0"  
            }]  
        });  
        $('#button').click(function () {  
            $table.bootstrapTable('refresh', {url: '${ctx}/testController/list.do'});  
        });  
    });  
</script>
  </body>
</html>
