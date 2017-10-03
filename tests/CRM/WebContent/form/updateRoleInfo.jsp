<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>角色修改</title>
    <link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
    <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddRoleInfoAjax.js'></script>
    
    <script type="text/javascript">
            function quanxuan(){
                var quanxuan=document.getElementById("selectAll").checked;
                //alert(quanxuan);
                var selectAll=document.getElementsByName("menuInfoId");
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
      function updateRoleInfo(){  
       var roleIdValue = DWRUtil.getValue("roleId");// name="roleId" 
       var menuInfoIdValue = DWRUtil.getValue("menuInfoId");//name="menuInfoId" 
         AddRoleInfoAjax.updateRoleInfo(roleIdValue,menuInfoIdValue,result);
        }
         function result(data){
              alert(data);
              window.opener.location.reload();
         }
      
    </script>
    
    
  </head>
  
  <body>
  <h1 align="center" style="font-family:华义彩云;">角色修改</h1>
  <center>
			<form name="addRoleInfoForm"   action="addCustomerInfo.action" method="post" target="main">
			      <table width="35%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
				   <input type="hidden" name="roleId" value="${roleInfo.roleId }" />
				    <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 角色名称</td>
				      <td align="left"><input type="text" name="roseName"  value="${roleInfo.roleName}" readonly> </td>
				    </tr>
				    
				     <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 角色权限</td>
				      <td align="left">
					      <input type="checkbox" onclick="quanxuan();" id="selectAll" > 全选<br>
					      <s:iterator value="#request.roleInfoLimits" id="roleInfoLimit">
					           <input type="checkbox" name="menuInfoId" value="${roleInfoLimit.menuInfo.menuInfoId}"  
					           <s:if test="#request.roleInfoLimit.access==1">  checked  </s:if> 
					           >${roleInfoLimit.menuInfo.menuInfoName}<br>
					      </s:iterator> 
				      </td>
				    </tr>  
				      
			      </table>
			      <p align="center">
			      <input type="button" value="提交" onclick="updateRoleInfo();">
			      <input type="reset" value="重置">
			      </p>
			</form>
     </center>
  </body>
</html>
