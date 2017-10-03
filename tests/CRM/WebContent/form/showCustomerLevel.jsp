<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>显示客户级别</title>
  </head>
  <body>
<form action="updateCustomerLevel.action" method="post">
<center><img src="image/user.gif"><font size="2">录入客户级别</font></center>
	<table align="center" border="1" cellspacing="0">
		<tr bgcolor="#666666" height="27">
			<td align="center"><font color="#FFFFFF" size="2">序号</font></td>
			<td align="center"><font color="#FFFFFF" size="2">累计业务量</font></td>
			<td align="center"><font color="#FFFFFF" size="2">选项内容</font></td>
		</tr>
		
		<s:iterator value="#request.allCustomerLevel" id="customerLevel">
		    <tr bgcolor="#E3E3E3">
				<td align="center"><s:property value="#customerLevel.levelId"/></td>
				<s:hidden name="levelId" value="%{#customerLevel.levelId}"></s:hidden>
				<td align="center"><font size="2">累计业务量<input type="text" name="business"  value='<s:property value="#customerLevel.business"/>'> 以上</font></td>
				<td align="center"><input type="text" name="levelName"   value='<s:property value="#customerLevel.levelName"/>'> </td>
		    </tr>
		</s:iterator>
		
	</table>
	<br>
	<center><input type="submit" value="提交">  </center>

</form>
  </body>
</html>
