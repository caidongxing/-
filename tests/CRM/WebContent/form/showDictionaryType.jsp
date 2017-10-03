<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>显示字典分类</title>
  </head>
  <body>
<form action="updateDictionaryType.action" method="post">
<center><img src="image/user.gif"><font size="2">录入数据字典分类</font></center>
	<table align="center" border="1" cellspacing="0">
		<tr bgcolor="#666666" height="27">
			<td align="center"><font color="#FFFFFF" size="2">序号</font></td>
			<td align="center"><font color="#FFFFFF" size="2">启用</font></td>
			<td align="center"><font color="#FFFFFF" size="2">选项</font></td>
		</tr>
		
		<s:iterator value="#request.allDictionaryType" id="dictionaryType">
			<tr bgcolor="#E3E3E3" >
				<td align="center"><s:property value="#dictionaryType.dataTypeId"/></td>
				<s:hidden name="dictionaryTypeIds" value="%{#dictionaryType.dataTypeId}"></s:hidden>
				<td align="center"><input type="checkbox" 
					<s:if test="#dictionaryType.dataEnable=='yes'" >
					      checked="checked" 
					</s:if>
				name="checks" value='qiyong<s:property value="#dictionaryType.dataTypeId"/>'> </td>
				<td align="center"><input type="text" name="dictionaryTypeNames"  value='<s:property value="#dictionaryType.dataTypeName"/>'> </td>
		    </tr>
		</s:iterator>
		
		
	</table>
	<br>
	<center><input type="submit" value="提交">  </center>

</form>
  </body>
</html>
