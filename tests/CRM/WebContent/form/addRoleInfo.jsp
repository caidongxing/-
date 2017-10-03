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
    <title>新增角色</title>
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
      function addRoleInfo(){  
       var roseNameValue = DWRUtil.getValue("roseName");// name="roseName" 
       var menuInfoIdValue = DWRUtil.getValue("menuInfoId");//name="menuInfoId" 
         AddRoleInfoAjax.saveRoleInfo(roseNameValue,menuInfoIdValue,result);
        }
         function result(data){
              alert(data);
              window.opener.document.location.reload();
              //self.opener.location.reload();//父窗口刷新
        }
      
    </script>
    
    
  </head>
  
  <body>
  <h1 align="center" style="font-family:华义彩云;">角色添加</h1>
  <center>
			<form name="addRoleInfoForm"   action="addCustomerInfo.action" method="post" target="main">
			      <table width="35%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
				    <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 角色名称</td>
				      <td align="left"><input type="text" name="roseName"  value=""> </td>
				    </tr>
				    
				     <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 角色权限</td>
				      <td align="left">
					      <input type="checkbox" onclick="quanxuan();" id="selectAll" > 全选<br>
					      <s:iterator value="#request.menuInfoFindAll" id="menuInfo">
					           <input type="checkbox" name="menuInfoId" value="${menuInfo.menuInfoId}" > ${menuInfo.menuInfoName}<br>
					      </s:iterator> 
				      </td>
				    </tr>  
				      
			      </table>
			      <p align="center">
			      <input type="button" value="提交" onclick="addRoleInfo();">
			      <input type="reset" value="重置">
			      </p>
			</form>
     </center>
  </body>
</html>
