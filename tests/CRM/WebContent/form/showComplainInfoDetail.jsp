<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>客户投诉详细信息</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
	<script type='text/javascript' src='<%=basePath%>/js/date.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddComplainInfoAjax.js'></script>
    
	<script type="text/javascript">
	       //打开查找 受 理 人
	 		function  OpenUser(){
	 		  window.open('userInfoFindAll.action?currentPage=1',"win","top=200px,left=300px,height=400px,toolbar=false,menubar=false,resizable=true,location=false");
	 		}
	 		 //打开查找 投诉客户
	 		function  OpenCustomer(){
	 		  window.open('findAllCustomerInfo.action?currentPage=1',"win","top=200px,left=300px,height=400px,toolbar=false,menubar=false,resizable=true,location=false");
	 		}
	 		//更新保存
	 	    function updateComplainInfo(){
              var complainInfoValue = DWRUtil.getValues("updateComplainInfoForm");//<form name="addCustomerInfoForm"
              AddComplainInfoAjax.updateComplainInfo(complainInfoValue,result);
            }
	        function result(data){
	              alert(data);
	              window.opener.document.location.reload();//刷新父页
	        }
	 		
	 		//触发事件更新
	 		function updatedo(){
				updateComplainInfoForm.complainTheme.disabled=false;
				updateComplainInfoForm.customerName.disabled=false;
				updateComplainInfoForm.complainPerson.disabled=false;
				updateComplainInfoForm.userName.disabled=false;
				updateComplainInfoForm.customerSatisfaction.disabled=false;
				updateComplainInfoForm.complainStatus.disabled=false;
				updateComplainInfoForm.complainDate.disabled=false;
				updateComplainInfoForm.complainContent.disabled=false;
				updateComplainInfoForm.complainHandleWay.disabled=false;
				updateComplainInfoForm.complainRemarkInfo.disabled=false;
				
				updateComplainInfoForm.updateButton.disabled=true;
				updateComplainInfoForm.addButton.disabled=false;
	 		
	 		}
	 		
	</script>
  </head>
  
  <body> 
  <center>
		 <h5 align="center" style="font-family:华义彩云;"> 客户投诉详细信息</h5>
			<form name="updateComplainInfoForm"   action=" " method="post" target="main">
			      <table width="55%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
				    <input type="hidden" name="complainId"  value="${requestScope.complainInfo.complainId }"/>
				    <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 投诉主题：</td>
				      <td><input type="text" name="complainTheme"  value="${requestScope.complainInfo.complainTheme }" disabled="disabled"> </td>
				     
				      <td bgcolor="#eeeeee"> 投诉客户：</td>
				      <td><input type="text" name="customerName" id="customerName" value="${requestScope.complainInfo.customerInfo.customerName}" readOnly="readonly" disabled="disabled"> 
				          <input type="hidden" name="customerId" id="customerId"   value="${requestScope.complainInfo.customerInfo.customerId}" /> <!-- 隐藏id -->
					      <img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenCustomer();'/>
				      </td>
				      
				    </tr>
				    
				      <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 投 诉 人：</td>
					      <td align="left">
					      <input type="text" name="complainPerson"  value="${requestScope.complainInfo.complainPerson }" disabled="disabled"> 
					      </td>
					      
					       <td bgcolor="#eeeeee">受 理 人：</td>
					       <td align="left">
					            <input type="text" name="userName" id="userLeadName"  value="${requestScope.complainInfo.userInfo.userName}"  readOnly="readonly" disabled="disabled"> 
					            <input type="hidden" name="userId"   id="userLeadId"  value="${requestScope.complainInfo.userInfo.userId}"/> <!-- id -->
					            <img  src='<%=basePath%>/image/serch.gif' style='height:20; cursor:hand' border='0' onclick='OpenUser();'/>
					       </td>
					  </tr>
					  
					  <tr style="padding:5px;">
					       <td bgcolor="#eeeeee"> 客户满意：</td>
					      <td align="left" > 
					      <select name="customerSatisfaction" disabled="disabled">
					              <s:iterator value="#request.customerSatisfaction" id="Satisfaction">
					                  <s:if test="#Satisfaction.dataInformationName !='' && #Satisfaction.dataEnable=='yes'">
						                  <option value="${Satisfaction.dataId }" 
							                  <s:if test="#request.complainInfo.dictionaryTypeInfoByCustomerSatisfaction.dataId==#Satisfaction.dataId">
							                  selected
							                  </s:if>
						                  >
						                       ${Satisfaction.dataInformationName}
						                  </option>
					                  </s:if>
					              </s:iterator>
					         </select>
					      </td>
					      <td bgcolor="#eeeeee"> 处理状态：</td>
					      <td align="left">
					        <select name="complainStatus" disabled="disabled">
					              <s:iterator value="#request.customerStatus" id="status">
					                  <s:if test="#status.dataInformationName !='' && #status.dataEnable=='yes'">
						                  <option value="${status.dataId }"
						                  <s:if test="#request.complainInfo.dictionaryTypeInfoByComplainStatus.dataId==#status.dataId">
							                  selected
							                  </s:if>
						                  >
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
					      <input type="text" name="complainDate"  value="<s:date name='#request.complainInfo.complainDate' format='yyyy-MM-dd'/>" readOnly="readonly" onfocus="HS_setDate(this)" disabled="disabled">
					  </td>
				    
					  </tr>  
					     
					  <tr style="padding:5px;">
						      <td bgcolor="#eeeeee"> 投诉内容：</td>
						      <td align="left"  colspan="3"> 
						      <textarea rows="5" cols="60" name="complainContent" disabled="disabled">${requestScope.complainInfo.complainContent }</textarea>
						      </td>
					  </tr>
					    
					  <tr style="padding:5px;" > 
						      <td bgcolor="#eeeeee" > 处理办法：</td>
						      <td align="left"  colspan="3"> 
						          <textarea rows="5" cols="60" name="complainHandleWay" disabled="disabled">${requestScope.complainInfo.complainHandleWay }</textarea>
						      </td>
					  </tr>  
					  <tr style="padding:5px;">    
						      <td bgcolor="#eeeeee"> 备注信息：</td>
						      <td align="left"  colspan="3"> 
						          <textarea rows="5" cols="60" name="complainRemarkInfo" disabled="disabled">${requestScope.complainInfo.complainRemarkInfo }</textarea>
						      </td>
					  </tr>  
			      </table>
			      <p align="center">
			      <input type="button" value="更新"  onclick="updatedo()" name="updateButton">
			      <input type="button" value="更新保存"  onclick="updateComplainInfo()" disabled="disabled" name="addButton">
			      <input type="reset" value="重置">
			      </p>
			</form>
			</center>
  </body>
</html>

