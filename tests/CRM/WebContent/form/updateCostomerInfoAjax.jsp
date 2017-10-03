<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改详情信息</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
    <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddCustomerInfoAjax.js'></script>
    
    <script type="text/javascript">
        function updateCustomerInfo(){
              var formMap = DWRUtil.getValues("updateCustomerInfoForm");//<form name="addCustomerInfoForm"
              AddCustomerInfoAjax.updateCustomerInfo(formMap,result);
              
        }
        function result(data){
              alert(data);
              self.opener.location.reload();//父窗口刷新
        }
    </script>
  </head>
  
  <body> 
		 <h1 align="center" style="font-family:华义彩云;"> 修改客户信息</h1>
			<form name="updateCustomerInfoForm"   action="addCustomerInfo.action" method="post" target="main">
			      <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
				   <s:hidden name="customerId"></s:hidden>
				    <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 客户名称：</td>
				      <td><input type="text" name="customerName"  value="${requestScope.customerInfo.customerName}" readonly="readonly"  ><font color="red">${requestScope.error }</font> </td>
				     
				      <td bgcolor="#eeeeee"> 客户性质：</td>
				      <!-- #requestScope.customerInfo是那边获取的  dictionaryTypeInfoByCustomerProperties.dataId性质的id== （id="CustomerProperties" ） dataId等于左边的那个id-->
				      <td>
					      <select name="customerPropertiesId">
					              <s:iterator value="#request.allCustomerProperties" id="CustomerProperties">
					                  <s:if test="#CustomerProperties.dataInformationName !='' && #CustomerProperties.dataEnable=='yes'">
						                  <option value="${CustomerProperties.dataId }"
						                  <s:if test="#request.customerInfo.dictionaryTypeInfoByCustomerProperties.dataId == #CustomerProperties.dataId ">
						                  selected="selected"
						                  </s:if>
						                  >
						                       ${CustomerProperties.dataInformationName}
						                  </option>
					                  </s:if>
					              </s:iterator>
					              <!--
						              <option value="20">其他</option>
						              <option value="21">外资企业</option>
						              <option value="22">合资企业</option>
						              <option value="23">国有企业</option>
						              <option value="24">私企企业</option>
					              -->
					      </select>
				      </td>
				    </tr>
				      
				      
				      
				      <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 客户类型：</td>
					      <td>
						      <select name="customerTypeId">
						         <s:iterator value="#request.allCustomerType" id="CustomerType">
					                  <s:if test="#CustomerType.dataInformationName !='' && #CustomerType.dataEnable=='yes'">
						                  <option value="${CustomerType.dataId }"
						                    <s:if test="#request.customerInfo.dictionaryTypeInfoByCustomerType.dataId == #CustomerType.dataId ">
						                     selected="selected"
						                     </s:if>
						                   >
						                       ${CustomerType.dataInformationName}
						                  </option>
					                  </s:if>
					              </s:iterator>
						      <!--  
						          <option value="20">制造业</option>
						          <option value="31">金融业</option>
						          <option value="3">其他</option>
						          <option value="2">服务业</option>
						       -->
						      </select>
					      </td>
					      
					       <td bgcolor="#eeeeee"> 客户级别：</td>
					       <td>
						      <select name="levelId">
						         <s:iterator value="#request.allCustomerLevel" id="CustomerLevel">
					                  <s:if test="#CustomerLevel.levelName !=''">
						                  <option value="${CustomerLevel.levelId }"
                                             <s:if test="#request.customerInfo.customerLevel.levelId == #CustomerLevel.levelId">
						                     selected="selected"
						                     </s:if>
						                   >
						                       ${CustomerLevel.levelName}
						                  </option>
					                  </s:if>
					              </s:iterator>
						              <!--  
						              <option value="20">潜在客户</option>
						              <option value="21">VIP客户</option>
						              <option value="22">高级客户</option>
						              -->
						      </select>
					      </td>
					    </tr>
					  
					  
					  
					  <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 公司网址：</td>
					      <td>
					      <input type="text" name="customerCompanyWebsize"  value="${requestScope.customerInfo.customerCompanyWebsize}">
					      </td>
					      <td bgcolor="#eeeeee"> 公司电话：</td>
					      <td>
					      <input type="text" name="customerCompanyPhone"  value="${requestScope.customerInfo.customerCompanyPhone}">
					      </td>
					  </tr>     
				
				
				        <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 登记人：</td>
					      <td>
					      <input type="text" name="register" readonly="readonly" value="${requestScope.customerInfo.register}">
					      <input type="hidden" name="hyId" value="1">
					      </td>
					      <td bgcolor="#eeeeee"> 客户地址：</td>
					      <td>
					      <input type="text" name="customerAddress"  value="${requestScope.customerInfo.customerAddress}">
					      </td>
					     </tr>  
					     
					     
					    <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 所属省份：</td>
					      <td>
					      <input type="text" name="customerProvinces"  value="${requestScope.customerInfo.customerProvinces}">
					      </td>
					      <td bgcolor="#eeeeee"> 所属城市：</td>
					      <td>
					      <input type="text" name="customerCity"  value="${requestScope.customerInfo.customerCity}">
					      </td>
					    </tr> 
					    
					    <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 公司邮编：</td>
					      <td>
					      <input type="text" name="customerCode" value="${requestScope.customerInfo.customerCode}" >
					      </td>
					      <td bgcolor="#eeeeee"> 开户银行：</td>
					      <td>
						      <select name="openBankId">
						              <s:iterator value="#request.allCustomerOpenBank" id="CustomerOpenBank">
					                    <s:if test="#CustomerOpenBank.dataInformationName !='' && #CustomerOpenBank.dataEnable=='yes'">
						                  <option value="${CustomerOpenBank.dataId }"
                                             <s:if test="#request.customerInfo.dictionaryTypeInfoByOpenBank.dataId == #CustomerOpenBank.dataId ">
						                     selected="selected"
						                     </s:if>
						                   >
						                       ${CustomerOpenBank.dataInformationName}
						                  </option>
					                    </s:if>
					                  </s:iterator>
					                  <!-- 
						              <option value="20">中国银行</option>
						              <option value="21">工商银行</option>
						              <option value="22">农业银行</option>
						              <option value="23">招商银行</option>
						              <option value="24">建设银行</option>
						              <option value="24">其他</option>
						               -->
						      </select>
					      </td>
					    </tr> 
					    
					    <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 银行账号：</td>
					      <td>
					      <input type="text" name="bankAccount"  value="${requestScope.customerInfo.noteInformation}" >
					      </td>
					      <td bgcolor="#eeeeee"> 客户来源：</td>
					      <td>
						      <select name="customerSourceId">
						              <s:iterator value="#request.allCustomerSource" id="CustomerSource">
					                    <s:if test="#CustomerSource.dataInformationName !='' && #CustomerSource.dataEnable=='yes'">
						                  <option value="${CustomerSource.dataId }"
						                    <s:if test="#request.customerInfo.dictionaryTypeInfoByCustomerSource.dataId == #CustomerSource.dataId ">
						                     selected="selected"
						                     </s:if>
						                   >
						                       ${CustomerSource.dataInformationName}
						                  </option>
					                    </s:if>
					                  </s:iterator>
					                  <!--  
						              <option value="20">其他 展销会</option>
						              <option value="21">网络</option>
						              <option value="22">商业活动</option>
						              -->
						      </select>
					        </td>
					     </tr> 
					    
					     <tr>
					      <td bgcolor="#eeeeee"> 备注信息：</td>
					      <td colspan="3">
					          <textarea rows="3" cols="48" name="noteInformation">${requestScope.customerInfo.customerName}</textarea>
					      </td>
					    </tr> 
			      </table>
			      <p align="center">
			      <input type="button" value="提交" onclick="updateCustomerInfo();">
			      <input type="reset" value="重置">
			      </p>
			</form>
  </body>
</html>

