<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>客户添加</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
    <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddCustomerInfoAjax.js'></script>
    <script type="text/javascript">
        function deleteCustomerInfo(customerId){
	        var deleteQ=window.confirm("是否确认删除该记录？");
	        if(deleteQ){
	            AddCustomerInfoAjax.deleteCustomerInfo(customerId,result);
	        }
        }
        function result(data){
              alert(data);
              location.reload();//窗口刷新本页面
              //self.opener.location.reload();//父窗口刷新
        }
        
        function deleteBetch(){
        if(DWRUtil.getValue("checkboxDelete")!=false){
	           var deleteQ=window.confirm("是否确认批量删除记录？");
		        if(deleteQ){
		           var selectCustomerIds=DWRUtil.getValue("checkboxDelete");
		            AddCustomerInfoAjax.deleteCustomerInfos(selectCustomerIds,result);
		        }
		}else{
		        var selectQ=window.confirm("请您选择要删除记录！");
		 }        
        }
        
        //发送到showContactPersonInfo.jsp页面的隐藏Id 和客户名称的name
     function toSup(customerName,customerId){
                // alert(customerId);
        //window.opener.document.getElementById("customerName").value =customerName; 
       // window.opener.document.getElementById("customerId").value =customerId;           
        //window.opener.document.getElementById("updatecustomerName").value =customerName;          
       //window.opener.document.getElementById("updatecustomerId").value =customerId;  
        
        //window.opener.document.all.customerName.value =customerName; 
        //window.opener.document.all.customerId.value =customerId;           
       // window.opener.document.all.updatecustomerName.value =customerName;          
       // window.opener.document.all.updatecustomerId.value =customerId;  
       if(window.opener !=null){
	            if(window.opener.document.getElementById("customerName")!= null){
	                window.opener.document.getElementById("customerName").value =customerName;
	             }
	             if(window.opener.document.getElementById("customerId")!= null){
	                window.opener.document.getElementById("customerId").value =customerId;
	             }
	             if(window.opener.document.getElementById("updatecustomerName${param.contactId}")!= null){
	                window.opener.document.getElementById("updatecustomerName${param.contactId}").value =customerName;
	              }
	             if(window.opener.document.getElementById("updatecustomerId${param.contactId}") != null){
	                window.opener.document.getElementById("updatecustomerId${param.contactId}").value =customerId;
	             }  
	      }
        window.close();
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
        
    </script>
  </head>
  
  <body> 
	  <form action="customerInfoQuery.action" method="post">
		  <table width="100%" height="23" border="0" cellpadding="0" cellspacing="0">
		         <tr>
			         <td colspan="2" width="100%" align="center">
			           请输入查询条件：
				         <select name="type" class="textarea">
		                  <option value="customerName" ${customerName }> 客户名称</option>
			              <option value="customerAddress" ${customerAddress }>客户地址</option>
			              <option value="customerProvinces" ${customerProvinces }>所属省份</option>
			              <option value="customerCity" ${customerCity }>所属城市</option>
			              <option value="customerCode" ${customerCode }>公司邮编</option>
			              <option value="bankAccount" ${bankAccount }>银行账号</option>
			              <option value="customerCompanyWebsize" ${customerCompanyWebsize }>公司网址</option>
			              <option value="customerCompanyPhone" ${customerCompanyPhone }>公司电话</option>
			              <option value="noteInformation" ${noteInformation }>备注信息</option>
				         </select>
				         <input name="key"  type="text" class="txt_grey" size="24" value="${key}">
				         <input type="submit" class="subt_grey" value="搜索">
			         </td>
		         </tr>
		  </table>
	  </form>
  
	  <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
	          <tr bgcolor="#eeeeee" style="padding:5px;">
				      <td align="center"> <input type="checkbox" onclick="quanxuan();" id="selectAll" ></td>
				      <td align="center"> 编号</td>
				      <td align="center"> 客户名称</td>
				      <td align="center"> 客户性质</td>
				      <td align="center"> 客户类型</td>
				      <td align="center"> 客户级别</td>
				      <td align="center"> 公司网址</td>
				      <td align="center"> 公司电话</td>
				      <td align="center"> 登记人</td>
				      <td align="center"> 查看详情</td>
				      <td align="center"> 修改</td>
				      <td align="center"> 删除</td>
			  </tr>
			  <s:iterator value="#request.findAllCustomerInfo" id="CustomerInfo">
			   <tr  style="padding:5px;font-size: 12px;">
			          <td align="center"><input type="checkbox" name="checkboxDelete" value="${CustomerInfo.customerId }"> </td>
				      <td align="center"> ${CustomerInfo.customerId }</td>
				      <td align="center"><a href="javascript:toSup('${CustomerInfo.customerName}','${CustomerInfo.customerId}');">${CustomerInfo.customerName }</a> </td>
				      <td align="center"> ${CustomerInfo.dictionaryTypeInfoByCustomerProperties.dataInformationName }</td>
				      <td align="center"> ${CustomerInfo.dictionaryTypeInfoByCustomerType.dataInformationName }</td>
				      <td align="center"> ${CustomerInfo.customerLevel.levelName }</td>
				      <td align="center"> ${CustomerInfo.customerCompanyWebsize }</td>
				      <td align="center"> ${CustomerInfo.customerCompanyPhone }</td>
				      <td align="center"> ${CustomerInfo.register }</td>
				      <td align="center"> <input type="button" name="detail"  value="查看详情" onclick="window.open('customerInfoDetail.action?customerId=${CustomerInfo.customerId}');"> </td>
				      <td align="center"> <img src="<%=basePath%>/image/modify.gif" width="15" height="15" alt="修改信息" onclick="window.open('customerInfoUpdate.action?customerId=${CustomerInfo.customerId}');"></td>
				      <td align="center"> <img src="<%=basePath%>/image/delete.gif" width="15" height="15" alt="删除信息" onclick="deleteCustomerInfo(${CustomerInfo.customerId});"></td>
			  </tr>	
			  </s:iterator>
			  <tr style="padding:5px;font-size: 12px;">
				  <td colspan="12" align="center">
				      <s:if test="#request.page.currentPage">
				         <a href="findAllCustomerInfo.action?currentPage=1">首页</a>
				         <a href="findAllCustomerInfo.action?currentPage=${request.page.currentPage-1 }">上一页</a>
				      </s:if>
				      <s:else>
				       首页
				       上一页
				      </s:else>
				      
				       <s:if test="#request.page.hasNextPage">
				         <a href="findAllCustomerInfo.action?currentPage=${request.page.currentPage+1 }">下一页</a>
				         <a href="findAllCustomerInfo.action?currentPage=${request.page.totalPage }">尾页</a>
				      </s:if>
				      <s:else>
				       下一页
				       尾页
				      </s:else>
				      当前第${request.page.currentPage}页| 共${request.page.totalPage}页 | 共${request.page.totalCount}条记录。
				  </td>
			  </tr>
			  
	  </table>
	     <input type="button" value="批量删除" onclick="deleteBetch();">
		 <input type="button" value="添加" onclick="window.open('customerInfo.action');">
  </body>
</html>

