<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="com.dao.BorrowDAO" %>
<%@ page import="com.actionForm.BorrowForm" %>
<%@ page import="java.util.*"%>
<html>
<%
Collection coll=(Collection)request.getAttribute("bookBorrowSort");
%>
<head>
<title>ͼ��ݹ���ϵͳ</title>
<link href="CSS/style.css" rel="stylesheet">
</head>
<body onLoad="clockon(bgclock)">
<%@include file="banner.jsp"%>
<%@include file="navigation.jsp"%>
<table width="778"  border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top" bgcolor="#FFFFFF"><table width="99%" height="510"  border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF" class="tableBorder_gray">
  <tr>
    <td height="510" valign="top" style="padding:5px;"><table width="98%" height="487"  border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="22" valign="top" class="word_orange">��ǰλ�ã�ͼ��������а� &gt;&gt;&gt;</td>
      </tr>
      <tr>
        <td align="center" valign="top"><%
if(coll==null || coll.isEmpty()){
%>
          <table width="100%" height="30"  border="0" cellpadding="0" cellspacing="0">
            <tr>
              <td height="36" align="center">����ͼ�������Ϣ��</td>
            </tr>
          </table>
          <%
}else{
  //ͨ��������ʽ��ʾ����
  Iterator it=coll.iterator();
  int degree=0;
  String bookname="";
  String typename="";
  String barcode_book="";
  String bookcase="";
  String pub="";
  String author="";
  String translator="";
  Float price=new Float(0);
  %>
 <table width="98%"  border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#0080ff" bordercolorlight="#FFFFFF">
  <tr align="center" bgcolor="#e3F4F7">
  <td width="8%" bgcolor="#0080ff">���Ĵ���</td>
    <td width="11%" bgcolor="#0080ff">ͼ��������</td>
    <td width="17%" bgcolor="#0080ff">ͼ������</td>
    <td width="15%" bgcolor="#0080ff">ͼ������</td>
    <td width="16%" bgcolor="#0080ff">���</td>
    <td width="14%" bgcolor="#0080ff">������</td>
    <td width="11%" bgcolor="#0080ff">����</td>
    <td colspan="2" bgcolor="#0080ff">����(Ԫ)</td>
    </tr>
<%
  while(it.hasNext()){
    BorrowForm borrowForm=(BorrowForm)it.next();
	bookname=borrowForm.getBookName();
        barcode_book=borrowForm.getBookBarcode();
        typename=borrowForm.getBookType();
	degree=borrowForm.getDegree();
bookcase=borrowForm.getBookcaseName();
        pub=borrowForm.getPubName();
        author=borrowForm.getAuthor();
        price=borrowForm.getPrice();
	%>
  <tr>
    <td align="center">&nbsp;<%=degree%></td>
    <td style="padding:5px;">&nbsp;<%=barcode_book%></td>
    <td style="padding:5px;"><%=bookname%></td>
    <td style="padding:5px;"><%=typename%></td>
    <td align="center">&nbsp;<%=bookcase%></td>
    <td align="center">&nbsp;<%=pub%></td>
    <td width="11%" align="center"><%=author%></td>
    <td width="8%" align="center"><%=price%></td>
  </tr>
<%
  }
}
%>
</table></td>
      </tr>
    </table>
</td>
  </tr>
</table><%@ include file="copyright.jsp"%></td>
  </tr>
</table>
</body>
</html>