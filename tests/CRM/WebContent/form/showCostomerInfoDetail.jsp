<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>查看客户详细信息</title>
	<link href="../css/rightStyle.css" rel="stylesheet" type="text/css">

  </head>
  
  <body> 
		 <h1 align="center" style="font-family:华义彩云;"> 客户详细信息</h1>
			
			      <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
				    <tr style="padding:5px;">
				      <td bgcolor="#eeeeee"> 客户名称：</td>
				      <td>${customerInfo.customerName} </td>
				     
				      <td bgcolor="#eeeeee"> 客户性质：</td>
				      <td>
					     ${customerInfo.dictionaryTypeInfoByCustomerProperties.dataInformationName}
				      </td>
				    </tr>
				      
				      
				      
				      <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 客户类型：</td>
					      <td>
						     ${customerInfo.dictionaryTypeInfoByCustomerType.dataInformationName}
					      </td>
					      
					       <td bgcolor="#eeeeee"> 客户级别：</td>
					       <td>
						     ${customerInfo.customerLevel.levelName}
					      </td>
					    </tr>
					  
					  
					  
					  <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 公司网址：</td>
					      <td>${customerInfo.customerCompanyWebsize} </td>
					      <td bgcolor="#eeeeee"> 公司电话：</td>
					      <td>${customerInfo.customerCompanyPhone} </td>
					  </tr>     
				
				
				        <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 登记人：</td>
					      <td> ${customerInfo.register}</td>
					      <td bgcolor="#eeeeee"> 客户地址：</td>
					      <td> ${customerInfo.customerAddress}</td>
					     </tr>  
					     
					     
					    <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 所属省份：</td>
					      <td> ${customerInfo.customerProvinces}</td>
					      <td bgcolor="#eeeeee"> 所属城市：</td>
					      <td> ${customerInfo.customerCity}</td>
					    </tr> 
					    
					    <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 公司邮编：</td>
					      <td> ${customerInfo.customerCode}</td>
					      <td bgcolor="#eeeeee"> 开户银行：</td>
					      <td>
						      ${customerInfo.dictionaryTypeInfoByOpenBank.dataInformationName}
					      </td>
					    </tr> 
					    
					    <tr style="padding:5px;">
					      <td bgcolor="#eeeeee"> 银行账号：</td>
					       <td> ${customerInfo.bankAccount}</td>
					       <td bgcolor="#eeeeee"> 客户来源：</td>
					      <td>
						      ${customerInfo.dictionaryTypeInfoByCustomerSource.dataInformationName}
					       </td>
					     </tr> 
					    
					     <tr>
					     <td bgcolor="#eeeeee"> 备注信息：</td>
					      <td colspan="3"> 
					      ${customerInfo.noteInformation}
					       </td>
					    </tr> 
			      </table>
		
  </body>
</html>

