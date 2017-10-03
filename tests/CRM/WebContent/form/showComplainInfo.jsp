<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>投诉信息</title>
	<link href="<%=basePath%>/css/rightStyle.css" rel="stylesheet" type="text/css">
 <script type='text/javascript' src='<%=basePath%>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/util.js'></script>
    <script type='text/javascript' src='<%=basePath%>/dwr/interface/AddComplainInfoAjax.js'></script>
    
    <script type="text/javascript">
    
      function deleteComplainInfo(complainId){  
		       var selectQ=window.confirm("是否确认注销客户投诉信息！");
		         if(selectQ){
		             AddComplainInfoAjax.deleteComplainInfo(complainId,result);
		             //alert(complainId);
		         }
	      
      }
      function result(data){
              alert(data);
              window.location.reload();
        }
        
      function deleteComplainInfoBatchs(){
	      if(DWRUtil.getValue("checkboxDelete")!=false){
	             var allselectQ=window.confirm("是否确认批量注销客户投诉信息！");
		         if(allselectQ){
		         var complainInfoIdValue = DWRUtil.getValue("checkboxDelete");//name="checkboxDelete" 
		             AddComplainInfoAjax.deleteComplainInfoBatch(complainInfoIdValue,result);
		             //alert(roleId);
		         }
	       }else{
		        var selectQ=window.confirm("请您选择要注销客户投诉信息！");
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
          
    </script>
    
    
  </head>
  
  <body> 
  
	  <table width="100%" height="48" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#aaaaaa"  bordercolorlight="#FFFFFF">
	          <tr bgcolor="#eeeeee" style="padding:5px;">
				      <td align="center"> <input type="checkbox" onclick="quanxuan();" id="selectAll" > </td>
				      <td align="center"> 投诉编号</td>
				      <td align="center"> 投诉主题</td>
				      <td align="center"> 投诉客户</td>
				      <td align="center"> 处理状态</td>
				      <td align="center"> 查看投诉</td>
				      <td align="center"> 注销投诉</td>
			  </tr>
			  <s:iterator value="#request.findAllComplainInfo" id="ComplainInfo">
			   <tr  style="padding:5px;font-size: 12px;">
			          <td align="center"><input type="checkbox" name="checkboxDelete" value="${ComplainInfo.complainId }"> </td>
				      <td align="center"> ${ComplainInfo.complainId }</td>
				      <td align="center"> ${ComplainInfo.complainTheme }</td>
				      <td align="center"> ${ComplainInfo.customerInfo.customerName }</td>
				      <td align="center"> ${ComplainInfo.dictionaryTypeInfoByComplainStatus.dataInformationName }</td>
				      <td align="center"> <input type="button" name="detail"  value="查看投诉" onclick="window.open('complainInfoDetail.action?complainId=${ComplainInfo.complainId}');"> </td>
				      <td align="center"> <img src="<%=basePath%>/image/delete.gif" width="15" height="15" alt="注销投诉" onclick="deleteComplainInfo(${ComplainInfo.complainId });"></td>
			  </tr>	
			  </s:iterator>
			  <tr style="padding:5px;font-size: 12px;">
				  <td colspan="12" align="center">
				      <s:if test="#request.page.currentPage">
				         <a href="complainInfoFindAll.action?currentPage=1">首页</a>
				         <a href="complainInfoFindAll.action?currentPage=${request.page.currentPage-1 }">上一页</a>
				      </s:if>
				      <s:else>
				       首页
				       上一页
				      </s:else>
				      
				       <s:if test="#request.page.hasNextPage">
				         <a href="complainInfoFindAll.action?currentPage=${request.page.currentPage+1 }">下一页</a>
				         <a href="complainInfoFindAll.action?currentPage=${request.page.totalPage }">尾页</a>
				      </s:if>
				      <s:else>
				       下一页
				       尾页
				      </s:else>
				      当前第${request.page.currentPage}页| 共${request.page.totalPage}页 | 共${request.page.totalCount}条记录。
				  </td>
			  </tr>
			  
	  </table>
	     <input type="button" value="批量删除" onclick="deleteComplainInfoBatchs()">
		 <input type="button" value="添加" onclick="window.open('complainInfoSave.action')">
  </body>
</html>

