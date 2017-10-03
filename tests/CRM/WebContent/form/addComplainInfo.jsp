<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>客户投诉添加</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
	<script type='text/javascript' src='<%=basePath%>/js/date.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddComplainInfoAjax.js'></script>
    
	<script type="text/javascript">
	       //打开查找 角色名称
	 		function  OpenUser(){
	 		  window.open('userInfoFindAll.action?currentPage=1',"win","top=200px,left=300px,height=400px,toolbar=false,menubar=false,resizable=true,location=false");
	 		}
	 		 //打开查找 上级名称
	 		function  OpenCustomer(){
	 		  window.open('findAllCustomerInfo.action?currentPage=1',"win","top=200px,left=300px,height=400px,toolbar=false,menubar=false,resizable=true,location=false");
	 		}
	 		//
	 		function addComplainInfo(){
	 		     var complainInfoFormValue = DWRUtil.getValues("addComplainInfoForm");
	 		     
	 		     AddComplainInfoAjax.saveComplainInfo(complainInfoFormValue,result);
	 		}
	 		
	 	function result(data){
              alert(data);
              window.opener.document.location.reload();
         }
	 		
	</script>
  </head>
  
  <body> 
  <center>
		 <h5 align="center" style="font-family:华义彩云;"> 客户投诉添加</h5>
			<form name="addComplainInfoForm"   action=" " method="post" target="main">
			      <table width="55%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
				    
				    <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 投诉主题：</td>
				      <td><input type="text" name="complainTheme"  value=""> </td>
				     
				      <td bgcolor="#eeeeee"> 投诉客户：</td>
				      <td><input type="text" name="customerName" id="customerName" value="" readOnly="readonly"> 
				          <input type="hidden" name="customerId" id="customerId"   value=""/> <!-- 隐藏上级id -->
					      <img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenCustomer();'/>
				      </td>
				      
				    </tr>
				    
				      <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 投 诉 人：</td>
					      <td align="left">
					      <input type="text" name="complainPerson"  value=""> 
					      </td>
					      
					       <td bgcolor="#eeeeee">受 理 人：</td>
					       <td align="left">
					            <input type="text" name="userName" id="userLeadName"  value="" readOnly="readonly"> 
					            <input type="hidden" name="userId"   id="userLeadId"   value=""/> <!-- 隐藏上级id -->
					            <img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenUser();'/>
					       </td>
					  </tr>
					  
					  <tr style="padding:5px;">
					       <td bgcolor="#eeeeee"> 客户满意：</td>
					      <td align="left" > 
					      <select name="customerSatisfaction">
					              <s:iterator value="#request.customerSatisfaction" id="Satisfaction">
					                  <s:if test="#Satisfaction.dataInformationName !='' && #Satisfaction.dataEnable=='yes'">
						                  <option value="${Satisfaction.dataId }">
						                       ${Satisfaction.dataInformationName}
						                  </option>
					                  </s:if>
					              </s:iterator>
					         </select>
					      </td>
					      <td bgcolor="#eeeeee"> 处理状态：</td>
					      <td align="left">
					        <select name="complainStatus">
					              <s:iterator value="#request.customerStatus" id="status">
					                  <s:if test="#status.dataInformationName !='' && #status.dataEnable=='yes'">
						                  <option value="${status.dataId }">
						                       ${status.dataInformationName}
						                  </option>
					                  </s:if>
					              </s:iterator>
					         </select>
					      </td>
					  </tr>     
				
				      <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 投诉日期：</td>
					      <td align="left" colspan="3">
					      <input type="text" name="complainDate"  value="" readOnly="readonly" onfocus="HS_setDate(this)">
					  </td>
				    
					  </tr>  
					     
					  <tr style="padding:5px;">
						      <td bgcolor="#eeeeee"> 投诉内容：</td>
						      <td align="left"  colspan="3"> 
						      <textarea rows="5" cols="60" name="complainContent"></textarea>
						      </td>
					  </tr>
					    
					  <tr style="padding:5px;" > 
						      <td bgcolor="#eeeeee" > 处理办法：</td>
						      <td align="left"  colspan="3"> 
						          <textarea rows="5" cols="60" name="complainHandleWay"></textarea>
						      </td>
					  </tr>  
					  <tr style="padding:5px;">    
						      <td bgcolor="#eeeeee"> 备注信息：</td>
						      <td align="left"  colspan="3"> 
						          <textarea rows="5" cols="60" name="complainRemarkInfo"></textarea>
						      </td>
					  </tr>  
			      </table>
			      <p align="center">
			      <input type="button" value="添加"  onclick="addComplainInfo();">
			      <input type="reset" value="重置">
			      </p>
			</form>
			</center>
  </body>
</html>

