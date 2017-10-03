//package com.dao;
//import com.core.ConnDB;
//
//import java.sql.*;
//import java.util.*;
//
//import com.actionForm.BookForm;
//
//public class BookDAO {
//    private ConnDB conn=new ConnDB();
////查询数据
//public Collection query(String strif){
//BookForm bookForm=null;
////Collection bookColl=new ArrayList();
//Collection<BookForm> bookColl=new ArrayList<BookForm>();
//String sql="";
//if(strif!="all" && strif!=null && strif!=""){
//    sql="select * from (select b.*,c.name as bookcaseName,p.pubname as publishing,t.typename from tb_bookinfo b left join tb_bookcase c on b.bookcase=c.id join tb_publishing p on b.ISBN=p.ISBN join tb_booktype t on b.typeid=t.id where b.del=0)  as book where book."+strif+"'";
//}else{
//    sql="select b.*,c.name as bookcaseName,p.pubname as publishing,t.typename from tb_bookinfo b left join tb_bookcase c on b.bookcase=c.id join tb_publishing p on b.ISBN=p.ISBN join tb_booktype t on b.typeid=t.id where b.del=0";
//}
//System.out.println("图书查询时的SQL："+sql);
//ResultSet rs=conn.executeQuery(sql);
//try {
//    while (rs.next()) {
//        bookForm=new BookForm();
//        bookForm.setBarcode(rs.getString(1));       
//        bookForm.setBookName(rs.getString(2));
//        bookForm.setTypeId(rs.getInt(3));
//        bookForm.setAuthor(rs.getString(4));
//        bookForm.setTranslator(rs.getString(5));
//        bookForm.setIsbn(rs.getString(6));
//        bookForm.setPrice(Float.valueOf(rs.getString(7)));  //此处必须进行类型转换
//        bookForm.setPage(rs.getInt(8));
//        bookForm.setBookcaseid(rs.getInt(9));
//        bookForm.setInTime(rs.getString(10));
//        bookForm.setOperator(rs.getString(11));        
//        bookForm.setDel(rs.getInt(12));     
//        bookForm.setId(Integer.valueOf(rs.getString(13)));
//        bookForm.setBookcaseName(rs.getString(14));
//        bookForm.setPublishing(rs.getString(15));
//        bookForm.setTypeName(rs.getString(16));
//        bookColl.add(bookForm);
//    }
//} catch (SQLException ex) {
//	ex.printStackTrace();
//}
//conn.close();
//return bookColl;
//}
////用于修改的查询
//public BookForm queryM(BookForm bookForm1){
//BookForm bookForm=null;
//String sql="select b.*,c.name as bookcaseName,p.pubname as publishing,t.typename from tb_bookinfo b left join tb_bookcase c on b.bookcase=c.id join tb_publishing p on b.ISBN=p.ISBN join tb_booktype t on b.typeid=t.id where b.id="+bookForm1.getId()+"";
//System.out.println("修改时的SQL："+sql);
//ResultSet rs=conn.executeQuery(sql);
//try {
//    while (rs.next()) {
//        bookForm=new BookForm();
//        bookForm.setBarcode(rs.getString(1));
//        bookForm.setBookName(rs.getString(2));
//        bookForm.setTypeId(rs.getInt(3));
//        bookForm.setAuthor(rs.getString(4));
//        bookForm.setTranslator(rs.getString(5));
//        bookForm.setIsbn(rs.getString(6));
//        bookForm.setPrice(Float.valueOf(rs.getString(7)));  //此处必须进行类型转换
//        bookForm.setPage(rs.getInt(8));
//        bookForm.setBookcaseid(rs.getInt(9));     
//        bookForm.setInTime(rs.getString(10));
//        bookForm.setOperator(rs.getString(11));
//        bookForm.setDel(rs.getInt(12));
//        bookForm.setId(Integer.valueOf(rs.getString(13)));
//        bookForm.setBookcaseName(rs.getString(14));
//        bookForm.setPublishing(rs.getString(15));
//        bookForm.setTypeName(rs.getString(16));
//    }
//} catch (SQLException ex) {
//}
//conn.close();
//return bookForm;
//}
//    //用于借阅的查询
//   public BookForm queryB(String f,String key){
//   BookForm bookForm=null;
//   String sql="select b.*,c.name as bookcaseName,p.pubname as publishing,t.typename from tb_bookinfo b left join tb_bookcase c on b.bookcase=c.id join tb_publishing p on b.ISBN=p.ISBN join tb_booktype t on b.typeid=t.id where b."+f+"='"+key+"'";
//   System.out.println("查询借阅信息时的SQL："+sql);
//   ResultSet rs=conn.executeQuery(sql);
//   try {
//       if (rs.next()) {
//           bookForm=new BookForm();
//           bookForm.setBarcode(rs.getString(1));
//           bookForm.setBookName(rs.getString(2));
//           bookForm.setTypeId(rs.getInt(3));
//           bookForm.setAuthor(rs.getString(4));
//           bookForm.setTranslator(rs.getString(5));
//           bookForm.setIsbn(rs.getString(6));
//           bookForm.setPrice(Float.valueOf(rs.getString(7)));  //此处必须进行类型转换
//           bookForm.setPage(rs.getInt(8));
//           bookForm.setBookcaseid(rs.getInt(9));     
//           bookForm.setInTime(rs.getString(10));
//           bookForm.setOperator(rs.getString(11));
//           bookForm.setDel(rs.getInt(12));
//           bookForm.setId(Integer.valueOf(rs.getString(13)));
//           bookForm.setBookcaseName(rs.getString(14));
//           bookForm.setPublishing(rs.getString(15));
//           bookForm.setTypeName(rs.getString(16));
//       }
//   } catch (SQLException ex) {
//   }
//   conn.close();
//   return bookForm;
//   }
//
////添加数据
//public int insert(BookForm bookForm){
//String sql1="SELECT * FROM tb_bookinfo WHERE barcode='"+bookForm.getBarcode()+"' or bookname='"+bookForm.getBookName()+"'";
//ResultSet rs = conn.executeQuery(sql1);
//String sql = "";
//int falg = 0;
//try {
//if (rs.next()) {
//    falg = 2;
//} else {
//    sql ="Insert into tb_bookinfo (barcode,bookname,typeid,author,translator,isbn,price,page,bookcase,inTime,operator) values('"+bookForm.getBarcode()+"','"+bookForm.getBookName()+"',"+bookForm.getTypeId()+",'"+bookForm.getAuthor()+"','"+bookForm.getTranslator()+"','"+bookForm.getIsbn()+"',"+bookForm.getPrice()+","+bookForm.getPage()+","+bookForm.getBookcaseid()+",'"+bookForm.getInTime()+"','"+bookForm.getOperator()+"')";
//    falg = conn.executeUpdate(sql);
//    System.out.println("添加图书的SQL：" + sql);
//    conn.close();
//}
//} catch (SQLException ex) {
//falg = 0;
//}
//System.out.println("falg:"+falg);
//return falg;
//}
//
////修改数据
//public int update(BookForm bookForm){
//String sql="Update tb_bookinfo set typeid="+bookForm.getTypeId()+",author='"+bookForm.getAuthor()+"',translator='"+bookForm.getTranslator()+"',isbn='"+bookForm.getIsbn()+"',price="+bookForm.getPrice()+",page="+bookForm.getPage()+",bookcase="+bookForm.getBookcaseid()+" where id="+bookForm.getId()+"";
//int falg=conn.executeUpdate(sql);
//System.out.println("修改数据时的SQL："+sql);
//conn.close();
//return falg;
//}
////删除数据
//public int delete(BookForm bookForm){
//String sql="UPDATE tb_bookinfo SET del=1 where id="+bookForm.getId()+"";
//int falg=conn.executeUpdate(sql);
//System.out.println("删除时的SQL："+sql);
//return falg;
//}
//
//
//
//
//
//
//
//}
/*     */ package com.dao;
/*     */ 
/*     */ import com.actionForm.BookForm;
/*     */ import java.sql.ResultSet;
/*     */ 
/*     */ public class BookDAO
/*     */ {
/*   8 */   private com.core.ConnDB conn = new com.core.ConnDB();
/*     */   
/*     */   public java.util.Collection query(String strif) {
/*  11 */     BookForm bookForm = null;
/*  12 */     java.util.Collection bookColl = new java.util.ArrayList();
/*  13 */     String sql = "";
/*  14 */     if ((strif != "all") && (strif != null) && (strif != "")) {
/*  15 */       sql = "select * from (select b.*,c.name as bookcaseName,p.pubname as publishing,t.typename from tb_bookinfo b left join tb_bookcase c on b.bookcase=c.id join tb_publishing p on b.ISBN=p.ISBN join tb_booktype t on b.typeid=t.id where b.del=0)  as book where book." + strif + "'";
/*     */     } else {
/*  17 */       sql = "select b.*,c.name as bookcaseName,p.pubname as publishing,t.typename from tb_bookinfo b left join tb_bookcase c on b.bookcase=c.id join tb_publishing p on b.ISBN=p.ISBN join tb_booktype t on b.typeid=t.id where b.del=0";
/*     */     }
/*  19 */     System.out.println("图书查询时的SQL：" + sql);
/*  20 */     ResultSet rs = conn.executeQuery(sql);
/*     */     try {
/*  22 */       while (rs.next()) {
/*  23 */         bookForm = new BookForm();
/*  24 */         bookForm.setBarcode(rs.getString(1));
/*  25 */         bookForm.setBookName(rs.getString(2));
/*  26 */         bookForm.setTypeId(rs.getInt(3));
/*  27 */         bookForm.setAuthor(rs.getString(4));
/*  28 */         bookForm.setTranslator(rs.getString(5));
/*  29 */         bookForm.setIsbn(rs.getString(6));
/*  30 */         bookForm.setPrice(Float.valueOf(rs.getString(7)));
/*  31 */         bookForm.setPage(rs.getInt(8));
/*  32 */         bookForm.setBookcaseid(rs.getInt(9));
/*  33 */         bookForm.setInTime(rs.getString(10));
/*  34 */         bookForm.setOperator(rs.getString(11));
/*  35 */         bookForm.setDel(rs.getInt(12));
/*  36 */         bookForm.setId(Integer.valueOf(rs.getString(13)));
/*  37 */         bookForm.setBookcaseName(rs.getString(14));
/*  38 */         bookForm.setPublishing(rs.getString(15));
/*  39 */         bookForm.setTypeName(rs.getString(16));
/*  40 */         bookColl.add(bookForm);
/*     */       }
/*     */     } catch (java.sql.SQLException ex) {
/*  43 */       ex.printStackTrace();
/*     */     }
/*  45 */     conn.close();
/*  46 */     return bookColl;
/*     */   }
/*     */   
/*     */   public BookForm queryM(BookForm bookForm1) {
/*  50 */     BookForm bookForm = null;
/*  51 */     String sql = "select b.*,c.name as bookcaseName,p.pubname as publishing,t.typename from tb_bookinfo b left join tb_bookcase c on b.bookcase=c.id join tb_publishing p on b.ISBN=p.ISBN join tb_booktype t on b.typeid=t.id where b.id=" + bookForm1.getId();
/*  52 */     System.out.println("修改时的SQL：" + sql);
/*  53 */     ResultSet rs = conn.executeQuery(sql);
/*     */     try {
/*  55 */       while (rs.next()) {
/*  56 */         bookForm = new BookForm();
/*  57 */         bookForm.setBarcode(rs.getString(1));
/*  58 */         bookForm.setBookName(rs.getString(2));
/*  59 */         bookForm.setTypeId(rs.getInt(3));
/*  60 */         bookForm.setAuthor(rs.getString(4));
/*  61 */         bookForm.setTranslator(rs.getString(5));
/*  62 */         bookForm.setIsbn(rs.getString(6));
/*  63 */         bookForm.setPrice(Float.valueOf(rs.getString(7)));
/*  64 */         bookForm.setPage(rs.getInt(8));
/*  65 */         bookForm.setBookcaseid(rs.getInt(9));
/*  66 */         bookForm.setInTime(rs.getString(10));
/*  67 */         bookForm.setOperator(rs.getString(11));
/*  68 */         bookForm.setDel(rs.getInt(12));
/*  69 */         bookForm.setId(Integer.valueOf(rs.getString(13)));
/*  70 */         bookForm.setBookcaseName(rs.getString(14));
/*  71 */         bookForm.setPublishing(rs.getString(15));
/*  72 */         bookForm.setTypeName(rs.getString(16));
/*     */       }
/*     */     }
/*     */     catch (java.sql.SQLException localSQLException) {}
/*  76 */     conn.close();
/*  77 */     return bookForm;
/*     */   }
/*     */   
/*     */   public BookForm queryB(String f, String key) {
/*  81 */     BookForm bookForm = null;
/*  82 */     String sql = "select b.*,c.name as bookcaseName,p.pubname as publishing,t.typename from tb_bookinfo b left join tb_bookcase c on b.bookcase=c.id join tb_publishing p on b.ISBN=p.ISBN join tb_booktype t on b.typeid=t.id where b." + f + "='" + key + "'";
/*  83 */     System.out.println("查询借阅信息时的SQL：" + sql);
/*  84 */     ResultSet rs = conn.executeQuery(sql);
/*     */     try {
/*  86 */       if (rs.next()) {
/*  87 */         bookForm = new BookForm();
/*  88 */         bookForm.setBarcode(rs.getString(1));
/*  89 */         bookForm.setBookName(rs.getString(2));
/*  90 */         bookForm.setTypeId(rs.getInt(3));
/*  91 */         bookForm.setAuthor(rs.getString(4));
/*  92 */         bookForm.setTranslator(rs.getString(5));
/*  93 */         bookForm.setIsbn(rs.getString(6));
/*  94 */         bookForm.setPrice(Float.valueOf(rs.getString(7)));
/*  95 */         bookForm.setPage(rs.getInt(8));
/*  96 */         bookForm.setBookcaseid(rs.getInt(9));
/*  97 */         bookForm.setInTime(rs.getString(10));
/*  98 */         bookForm.setOperator(rs.getString(11));
/*  99 */         bookForm.setDel(rs.getInt(12));
/* 100 */         bookForm.setId(Integer.valueOf(rs.getString(13)));
/* 101 */         bookForm.setBookcaseName(rs.getString(14));
/* 102 */         bookForm.setPublishing(rs.getString(15));
/* 103 */         bookForm.setTypeName(rs.getString(16));
/*     */       }
/*     */     }
/*     */     catch (java.sql.SQLException localSQLException) {}
/* 107 */     conn.close();
/* 108 */     return bookForm;
/*     */   }
/*     */   
/*     */   public int insert(BookForm bookForm)
/*     */   {
/* 113 */     String sql1 = "SELECT * FROM tb_bookinfo WHERE barcode='" + bookForm.getBarcode() + "' or bookname='" + bookForm.getBookName() + "'";
/* 114 */     ResultSet rs = conn.executeQuery(sql1);
/* 115 */     String sql = "";
/* 116 */     int falg = 0;
/*     */     try {
/* 118 */       if (rs.next()) {
/* 119 */         falg = 2;
/*     */       } else {
/* 121 */         sql = "Insert into tb_bookinfo (barcode,bookname,typeid,author,translator,isbn,price,page,bookcase,inTime,operator) values('" + bookForm.getBarcode() + "','" + bookForm.getBookName() + "'," + bookForm.getTypeId() + ",'" + bookForm.getAuthor() + "','" + bookForm.getTranslator() + "','" + bookForm.getIsbn() + "'," + bookForm.getPrice() + "," + bookForm.getPage() + "," + bookForm.getBookcaseid() + ",'" + bookForm.getInTime() + "','" + bookForm.getOperator() + "')";
/* 122 */         falg = conn.executeUpdate(sql);
/* 123 */         System.out.println("添加图书的SQL：" + sql);
/* 124 */         conn.close();
/*     */       }
/*     */     } catch (java.sql.SQLException ex) {
/* 127 */       falg = 0;
/*     */     }
/* 129 */     System.out.println("falg:" + falg);
/* 130 */     return falg;
/*     */   }
/*     */   
/*     */   public int update(BookForm bookForm)
/*     */   {
/* 135 */     String sql = "Update tb_bookinfo set typeid=" + bookForm.getTypeId() + ",author='" + bookForm.getAuthor() + "',translator='" + bookForm.getTranslator() + "',isbn='" + bookForm.getIsbn() + "',price=" + bookForm.getPrice() + ",page=" + bookForm.getPage() + ",bookcase=" + bookForm.getBookcaseid() + " where id=" + bookForm.getId();
/* 136 */     int falg = conn.executeUpdate(sql);
/* 137 */     System.out.println("修改数据时的SQL：" + sql);
/* 138 */     conn.close();
/* 139 */     return falg;
/*     */   }
/*     */   
/*     */   public int delete(BookForm bookForm) {
/* 143 */     String sql = "UPDATE tb_bookinfo SET del=1 where id=" + bookForm.getId();
/* 144 */     int falg = conn.executeUpdate(sql);
/* 145 */     System.out.println("删除时的SQL：" + sql);
/* 146 */     return falg;
/*     */   }
/*     */ }

/* Location:           E:\重要的东西\java ee工作区\liberarySystem\WebContent\WEB-INF\classes
 * Qualified Name:     com.dao.BookDAO
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */