<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>角色信息</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
    <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddRoleInfoAjax.js'></script>
    
    
    
    
    <script type="text/javascript">
           
      function deleteRoleInfo(roleId){  
         var selectQ=window.confirm("是否确认注销该角色！");
         if(selectQ){
             AddRoleInfoAjax.deleteRoleInfo(roleId,result);
             //alert(roleId);
         }
      }
      function result(data){
              alert(data);
              window.location.reload();
        }
        
      function deleteRoleInfoBatchs(){
       if(DWRUtil.getValue("checkboxDelete")!=false){
             var allselectQ=window.confirm("是否确认批量注销角色！");
	         if(allselectQ){
	             var roleInfoIdValue = DWRUtil.getValue("checkboxDelete");//name="checkboxDelete" 
	             AddRoleInfoAjax.deleteRoleInfoBatch(roleInfoIdValue,result);
	             //alert(roleId);
	          }
         }else{
		        var selectQ=window.confirm("请您选择要注销角色！");
		 }
      }  
      
      
       function quanxuan(){
                var quanxuan=document.getElementById("selectAll").checked;
                //alert(quanxuan);
                var selectAll=document.getElementsByName("checkboxDelete");
	            if(quanxuan){
	                for(var i=0;i<selectAll.length;i++){
	                selectAll[i].checked=true;
	                }
	            }else{
		            for(var i=0;i<selectAll.length;i++){
		                selectAll[i].checked=false;
		            }
	            } 
            }
       function toSup(userRoleName,roleInfoId){
          //alert(rolerId);
          //alert(roleName);
          if(window.opener !=null){
	           window.opener.document.getElementById("userRoleName").value=userRoleName; /*** window.opener.document.getElementById("userRoleName") 是从addUserInfo.jsp 的id接收过来的***/ 
	           window.opener.document.getElementById("roleInfoId").value =roleInfoId;
           }
       window.close();
       }     
    </script>
    
    
  </head>
  
  <body> 
  
	  <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
	          <tr bgcolor="#eeeeee" style="padding:5px;">
				      <td align="center"> <input type="checkbox" onclick="quanxuan();" id="selectAll" > </td>
				      <td align="center"> 角色编号</td>
				      <td align="center"> 角色名称</td>
				      <td align="center"> 查看权限</td>
				      <td align="center"> 更新角色</td>
				      <td align="center"> 注销角色</td>
			  </tr>
			  <s:iterator value="#request.findAllRoleInfo" id="RoleInfo">
			   <tr  style="padding:5px;font-size: 12px;">
			          <td align="center"><input type="checkbox" name="checkboxDelete" value="${RoleInfo.roleId }"> </td>
				      <td align="center"><a href="javascript:toSup('${RoleInfo.roleName}','${RoleInfo.roleId}');"> ${RoleInfo.roleId }</a></td>
				      <td align="center"><a href="javascript:toSup('${RoleInfo.roleName}','${RoleInfo.roleId}');"> ${RoleInfo.roleName}</a></td>
				      <td align="center"> <input type="button" name="detail"  value="查看权限" onclick="window.open('roleInfoDetail.action?roleId=${RoleInfo.roleId }');"> </td>
				      <td align="center"> <img src="<%=basePath%>/image/modify.gif" width="15" height="15" alt="更新角色" onclick="window.open('roleInfoUpdate.action?roleId=${RoleInfo.roleId }');"></td>
				      <td align="center"> <img src="<%=basePath%>/image/delete.gif" width="15" height="15" alt="注销角色" onclick="deleteRoleInfo(${RoleInfo.roleId })"></td>
			  </tr>	
			  </s:iterator>
			  <tr style="padding:5px;font-size: 12px;">
				  <td colspan="12" align="center">
				      <s:if test="#request.page.currentPage">
				         <a href="roleInfoFindAll.action?currentPage=1">首页</a>
				         <a href="roleInfoFindAll.action?currentPage=${request.page.currentPage-1 }">上一页</a>
				      </s:if>
				      <s:else>
				       首页
				       上一页
				      </s:else>
				      
				       <s:if test="#request.page.hasNextPage">
				         <a href="roleInfoFindAll.action?currentPage=${request.page.currentPage+1 }">下一页</a>
				         <a href="roleInfoFindAll.action?currentPage=${request.page.totalPage }">尾页</a>
				      </s:if>
				      <s:else>
				       下一页
				       尾页
				      </s:else>
				      当前第${request.page.currentPage}页| 共${request.page.totalPage}页 | 共${request.page.totalCount}条记录。
				  </td>
			  </tr>
			  
	  </table>
	     <input type="button" value="批量删除" onclick="deleteRoleInfoBatchs()">
		 <input type="button" value="添加" onclick="window.open('menuInfoFindAll.action')">
  </body>
</html>

