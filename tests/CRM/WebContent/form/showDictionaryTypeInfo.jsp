<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>显示字典信息</title>
  </head>
  <body>
<form action="updateDictionaryTypeInfo.action" method="post">
<center><img src="image/user.gif"><font size="2">录入${requestScope.DataTypeName}</font></center>
	<table align="center" border="1" cellspacing="0">
		<tr bgcolor="#666666" height="27">
			<td align="center"><font color="#FFFFFF" size="2">序号</font></td>
			<td align="center"><font color="#FFFFFF" size="2">启用</font></td>
			<td align="center"><font color="#FFFFFF" size="2">选项</font></td>
		</tr>
		<!-- 将 数据分类id 传过去  也将数据分类信息ids传过去-->
		<s:hidden name="dataTypeId" value="%{#request.dataTypeId}"></s:hidden>
		<s:iterator value="#request.allDictionaryTypeInfo" id="dictionaryTypeInfo">
			<tr bgcolor="#E3E3E3" >
				<td align="center"><s:property value="%{#dictionaryTypeInfo.dataId % 10 !=0 ? #dictionaryTypeInfo.dataId % 10 : #dictionaryTypeInfo.dataId % 10 + 10}"/></td>
				<s:hidden name="dataIds" value="%{#dictionaryTypeInfo.dataId}"></s:hidden>
				
				<td align="center"><input type="checkbox" 
					<s:if test="#dictionaryTypeInfo.dataEnable=='yes'" >
					checked="checked" 
					</s:if>
				name="checks" value='qiyong<s:property value="%{#dictionaryTypeInfo.dataId % 10 !=0 ? #dictionaryTypeInfo.dataId % 10 : #dictionaryTypeInfo.dataId % 10 + 10}"/>'> </td>
				<td align="center"><input type="text" name="dataInformationName" value='<s:property value="#dictionaryTypeInfo.dataInformationName"/>'> </td>
		    </tr>
		</s:iterator>
		
		
	</table>
	<br>
	<center><input type="submit" value="提交">  </center>

</form>
  </body>
</html>
