<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>

    <input type="hidden" value="${roomreservationid}" id="roomreservationid" name="roomreservationid">
 
	<div class='row-fluid' style="border:1px solid;margin-top: 10px;">
		<div class='title'>
			<span>订房列表，共${count}条客房记录，房数：${roomnumber}，人数：${adult}/${children}，免床数：${freebed}</span>
		</div>
		<div class='responsive-table'>
			<div class='scrollable-area'>
				<table id="detailtb"
					class='table table-bordered table-hover table-striped'
					style='margin-bottom:0;'>
					<thead>
						<tr>
							<th>操作</th>
							<th>状态</th>
							<th>姓名</th>
							<th>到店日期</th>
							<th>离店日期</th>
							<th>房号</th>
							<th>等级</th>
							<th>房价</th>
							<th>房数</th>
							<th>人数</th>
							<th>留房日期</th>
							<th>Package</th>
							<th>备注</th>
						</tr>
					</thead>
					<tbody>
					  <c:forEach items="${detail}" var="item">
					    <tr>
					     <td>
					     <a class="btn btn-info btn-small" onclick="detailEdit(${item.detailid})"><i class="icon-edit icon-white"></i></a>
					     <a class="btn btn-danger btn-small" onclick="detailRemove(${item.detailid})"><i class="icon-remove icon-white"></i></a>
					     </td>
					      <td>
					      <c:choose>
					      <c:when test="${item.roomstatus == 1}">预订</c:when>
					      <c:when test="${item.roomstatus == 2}">现住</c:when>
					      <c:when test="${item.roomstatus == 3}">取消</c:when>
					      <c:when test="${item.roomstatus == 4}">离店</c:when>
					      <c:when test="${item.roomstatus == 5}">失约</c:when>
					      </c:choose>
					      </td>
					      <td>${item.chinesename}</td>
					      <td><fmt:formatDate value="${item.arrivedate}" pattern="yyyy-MM-dd"/></td>
					      <td><fmt:formatDate value="${item.leavedate}" pattern="yyyy-MM-dd"/></td>
					      <td>${item.roommark}</td>
					      <td>${item.roomtypename}</td>
					      <td>${item.realprice}</td>
					      <td>${item.roomnumber}/${item.freebed}</td>
					      <td>${item.adult}/${item.children}</td>
					      <td><fmt:formatDate value="${item.obligateroomdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					      <td>${item.packagename}</td>
					      <td>${item.comment}</td>
					    </tr>
					  </c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
<script type="text/javascript">

function detailEdit(detailid){
   $.post('${ctx}/roomReservationController/detailupdateView.do?id='+ detailid,function(result){
      layer.open({
      type: 1,
      title: '预订单明细修改',
      area: '60%',
      //shadeClose: true, //点击遮罩关闭
      content: result,
      btn: ['确定', '关闭'],
      yes: function(index, layero){
        $("#detailupdateform").submit();
        if(validate){
         layer.close(index);//如果设定了yes回调，需进行手工关闭
        }
        
      },
      btn2: function(index, layero){ //按钮【按钮二】的回调
      } 
   });
 });
}

function detailRemove(detailid){
 layer.confirm('亲！是否要删除？', {
   btn: ['确定','取消'] //按钮
  }, function(){
     $.ajax({
        type: "POST",
        url : '${ctx}/roomReservationController/detaildelete.do?roomreservationid='+ $("#RoomReservationId").val() + "&detailid=" +detailid,
		success : function(data) {
		   layer.msg('删除成功', {icon: 1});
		   
		   $('#detailcontent').empty();
		   $('#detailcontent').append(data);
		},
		error: function(request) {
          $('#content').empty();
		  $('#content').append(data);
        }
	});
     
  }, function(){
    layer.msg('亲！已取消删除', {icon: 6});
 });
   
   
}
</script>
