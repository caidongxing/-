<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>loading</title>
    <script type="text/javascript">
	    function showDusyMsg(msg){
			window.document.all.MsgText.innerHTML="正在加载信息，请稍后...";
			window.document.all.BusyMsg.style.display=""; 
			window.document.all.BusyDiv.style.display=""; 
		}
	    function loadingData(){
	    showDusyMsg("正在加载客户信息，请稍后...");
	    window.location='userInfoFindAll.action?currentPage=1';
	    }		
    </script>
  </head>
  <body onload="loadingData();">
  <div id="BusyMsg" align="center" style="z-index:101;left:25%;top:20%;width:50%; height:60;position:absolute;display:'none';">
    <table height="100%" align="center">
           <tr valign="bottom" align="center">
	          <td valign="bottom" align="center">
	           <img src="<%=basePath%>/image/loading.gif" alt="" width="150" height="13"/>
	          </td>
           </tr>
            <tr valign="top" align="center">
	          <td valign="top" align="center"> 
               <label style="font:12px;color:green;" id="MsgText"></label>
	          </td>
           </tr>
    </table>
  </div>
  <div id="BusyDiv" style="position:absolute; top:0;left:0;width:100%;height:100%;z-index:100;">
  <table style="width:100%;height:100%;background-color:transparent;display:'none';">
	  <tr>
		  <td>
		  </td>
	  </tr>
  </table>
  
  </div>
  
  </body>
</html>
