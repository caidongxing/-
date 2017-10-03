<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>

<style>
.page a:HOVER {
	cursor: pointer;
}
</style>

</head>
<body>

<input type="hidden" id="currentPage" name="currentPage" value="${page.currentPage}" />

<div class="page span12">
	
	<div class="span3" style="font-size: 10px;font-weight: 600;line-height: 40px">
	共<span style="color:red;font-size:16px;">${page.totalPage}</span>页，
	当前第<span style="color:red;font-size:16px;">${page.currentPage}</span>页，                                      
		        每页显示:<select id="pageSize" name="pageSize" style="width:22%" onchange="selectPageSize()">
		                   <option value="5"  ${page.pageSize eq 5 ? "selected='selected'":""}>5</option>
		                   <option value="10" ${page.pageSize eq 10 ? "selected='selected'":""}>10</option>
		                   <option value="15" ${page.pageSize eq 15 ? "selected='selected'":""}>15</option>
		                   <option value="20" ${page.pageSize eq 20 ? "selected='selected'":""}>20</option>
		                 </select>条
	
	</div>
	
	<div class="span6" >
		<a class="btn btn-xs btn-primary" onclick="clickPage(1)">首页</a>
		<c:if test="${page.currentPage == 1}">
			<a class="btn btn-xs btn-primary" disabled="">上一页</a>
		</c:if>
		
		<c:if test="${page.currentPage > 1}">
			<a class="btn btn-xs btn-primary"
				onclick="clickPage(${page.currentPage - 1})">上一页</a>
		</c:if>
		<c:forEach begin="${page.start}" end="${page.end}" var="item">
			<c:if test="${page.currentPage == item}">
				<font class="badge badge-grey" disabled="" color="red"
					style="font-size:17px;">${item}</font>
			</c:if>
			<c:if test="${page.currentPage != item}">
				<a class="badge badge-info" style="font-size:17px;"
					onclick="clickPage(${item})">${item}</a>
			</c:if>
		</c:forEach>
		
		<c:if test="${page.currentPage == page.totalPage}">
			<a class="btn btn-xs btn-primary" disabled="">下一页</a>
		</c:if>
		
		<c:if test="${page.currentPage != page.totalPage}">
			<a class="btn btn-xs btn-primary"
				onclick="clickPage(${page.currentPage + 1})">下一页</a>
		</c:if>
		
		<a class="btn btn-xs btn-primary" onclick="clickPage(${page.totalPage})">末页</a>
		</div>
		
		
		<div class="span3" style="font-size: 10px;font-weight: 600;line-height: 40px">
		跳转到第<select id="pagenum" style="width:22%" onchange="clickPage(this.options[this.options.selectedIndex].value)">
			<c:forEach begin="1" end="${page.totalPage}" var="item">
				<option value="${item}" ${item eq page.currentPage ? "selected='selected'":""}>${item}</option>	
			</c:forEach>
		  </select>页
	
        <!-- <a class="btn btn-xs btn-success" onclick="gotopitchup()">GO</a> -->
        </div>
        
	</div>
<script type="text/javascript">
function clickPage(c){
	document.getElementById("currentPage").value=c;
	queryPage();
	//document.getElementById("form").submit();
}

function selectPageSize(){
  document.getElementById("currentPage").value=1;
  queryPage();
}
/* function queryPage() {
	document.getElementById("currentPage").value=1;
	document.getElementById("form").submit();
} */
</script>


</body>
</html>