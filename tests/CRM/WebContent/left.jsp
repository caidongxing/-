<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>导航栏</title>
    
    <script type="text/javascript" src="js/dtree.js"></script> 
    <link rel="StyleSheet" href="css/dtree.css" type="text/css" /> 
    <link rel="StyleSheet" href="css/leftStyle.css" type="text/css" /> 
    
    <!-- dwr要引用的js engine.js文件是固定的；DictionaryTypeDAO.js文件的命名是根据 dwr.xml 的javascript="?"里面的 -->
    <script type="text/javascript" src="dwr/engine.js"></script>
    <script type="text/javascript" src="dwr/interface/DictionaryTypeDAO.js"></script>
    
  </head>
  <body>

 <p> <a href="javascript:d.openAll();">打开全部</a> |  <a href="javascript:d.closeAll();">关闭全部</a></p>
  
        <script type="text/javascript">
       
       /***
        DictionaryTypeDAO.findAll(load);
        function load(data){
        //alert(data[0].dataTypeName);
	        for(var i=0;i<data.length;i++){
	            alert(data[i].dataTypeId+","+data[i].dataTypeName);
	        }
        }
        **/
         var DictionaryTypeArr;
        DWREngine.setAsync(false);
        DictionaryTypeDAO.findAll(load);
        DWREngine.setAsync(true);
        function load(data){
                 DictionaryTypeArr=data;
        } 
      
        var d=new dTree('d');
	        d.config.userCookies=false; //不使用cookies
	        d.config.useStatusText=true;//状态栏显示文本
	        d.config.closeSameLevel=true;//关闭同一层次的节点
	        //root
	        d.add(0,-1,"客户关系管理系统");
		      /*** 
		       d.add(1,0,"客户信息");
		       d.add(2,0,"客户服务");
		       d.add(3,0,"日程/任务");
		       d.add(4,0,"项目管理");
		       d.add(5,0,"系统管理");
		       d.add(6,0,"数据字典");
		       d.add(7,0,"消息提醒");
		       */
		        <s:iterator value="#session.roleRelationship" id="roleRelation" status="stu" >
				 <s:if test="#roleRelation.access==1">
				      d.add(${stu.index+1 },0,"${roleRelation.menuInfo.menuInfoName}");
				 </s:if>
			    </s:iterator>
			    
			    
			    
		           d.add(11,1,"客户","form/loadingCostomerInfo.jsp","","main");
			       d.add(12,1,"联系人","form/loadingContactPersonInfo.jsp","","main");
			       
			       d.add(21,2,"客户投诉","form/loadingComplainInfo.jsp","","main");
			       d.add(22,2,"投诉报表","form/loadingCreateJFreeChart.jsp","","main");
			      
			       d.add(31,3,"日程");
			       d.add(32,3,"任务");
			       
				   d.add(41,4,"项目管理");
				   d.add(42,4,"项目立项");
				   d.add(43,4,"项目审批");
				   d.add(44,4,"项目进程");
				   d.add(45,4,"项目总结");
			       d.add(46,4,"项目交易");
			       
			       d.add(51,5,"用户","form/loadingUserInfo.jsp","","main");
				   d.add(52,5,"角色","form/loadingRoleInfo.jsp","","main");
				   
			     /***
			       d.add(61,6,"企业类型-分类");
			       d.add(62,6,"企业性质-分类");
			       d.add(63,6,"开户银行-分类");
			       d.add(64,6,"信息来源-分类");
			       d.add(65,6,"客户满意度-分类");
			       d.add(66,6,"客户级别-分类");
                   ****/ 
		          d.add(61,6,"数据字典分类","dictionaryType.action","","main");
		                  var i;
					      for(i=0;i<DictionaryTypeArr.length;i++){
					         if(DictionaryTypeArr[i].dataTypeName!=null && DictionaryTypeArr[i].dataTypeName!="" && DictionaryTypeArr[i].dataEnable=="yes"  ){
					            d.add(61+i,6,DictionaryTypeArr[i].dataTypeName,"dictionaryTypeInfo.action?dataTypeId="+DictionaryTypeArr[i].dataTypeId,"","main");
					          }
			               }
			       d.add(62+i,6,"客户级别","customerLevel.action","","main");
			       d.add(71,7,"短消息");
		    document.write(d);   
        
       

    </script>
  </body>
</html>
