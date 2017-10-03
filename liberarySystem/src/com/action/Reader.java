/*     */ package com.action;
/*     */ 
/*     */ import com.actionForm.ReaderForm;
/*     */ import com.dao.ReaderDAO;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import javax.servlet.RequestDispatcher;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ 
/*     */ public class Reader extends javax.servlet.http.HttpServlet
/*     */ {
/*  14 */   private ReaderDAO readerDAO = null;
/*     */   
/*     */   public Reader() {
/*  17 */     readerDAO = new ReaderDAO();
/*     */   }
/*     */   
/*     */   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/*  22 */     String action = request.getParameter("action");
/*  23 */     System.out.println("\nreader*********************action=" + action);
/*  24 */     if ((action == null) || ("".equals(action))) {
/*  25 */       request.setAttribute("error", "您的操作有误！");
/*  26 */       request.getRequestDispatcher("error.jsp")
/*  27 */         .forward(request, response);
/*  28 */     } else if ("readerAdd".equals(action)) {
/*  29 */       readerAdd(request, response);
/*  30 */     } else if ("readerQuery".equals(action)) {
/*  31 */       readerQuery(request, response);
/*  32 */     } else if ("readerModifyQuery".equals(action)) {
/*  33 */       readerModifyQuery(request, response);
/*  34 */     } else if ("readerModify".equals(action)) {
/*  35 */       readerModify(request, response);
/*  36 */     } else if ("readerDel".equals(action)) {
/*  37 */       readerDel(request, response);
/*  38 */     } else if ("readerDetail".equals(action)) {
/*  39 */       readerDetail(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void readerAdd(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  46 */     ReaderForm readerForm = new ReaderForm();
/*  47 */     readerForm.setName(request.getParameter("name"));
/*  48 */     readerForm.setSex(request.getParameter("sex"));
/*  49 */     readerForm.setBarcode(request.getParameter("barcode"));
/*  50 */     readerForm.setVocation(request.getParameter("vocation"));
/*  51 */     readerForm.setBirthday(request.getParameter("birthday"));
/*  52 */     readerForm.setPaperType(request.getParameter("paperType"));
/*  53 */     readerForm.setPaperNO(request.getParameter("paperNO"));
/*  54 */     readerForm.setTel(request.getParameter("tel"));
/*  55 */     readerForm.setEmail(request.getParameter("email"));
/*     */     
/*  57 */     java.util.Date date1 = new java.util.Date();
/*  58 */     java.sql.Date date = new java.sql.Date(date1.getTime());
/*  59 */     readerForm.setCreateDate(date.toString());
/*  60 */     readerForm.setOperator(request.getParameter("operator"));
/*  61 */     readerForm.setRemark(request.getParameter("remark"));
/*  62 */     readerForm.setTypeid(Integer.parseInt(request.getParameter("typeid")));
/*  63 */     int a = readerDAO.insert(readerForm);
/*  64 */     if (a == 0) {
/*  65 */       request.setAttribute("error", "读者信息添加失败！");
/*  66 */       request.getRequestDispatcher("error.jsp")
/*  67 */         .forward(request, response);
/*  68 */     } else if (a == 2) {
/*  69 */       request.setAttribute("error", "该读者信息已经添加！");
/*  70 */       request.getRequestDispatcher("error.jsp")
/*  71 */         .forward(request, response);
/*     */     } else {
/*  73 */       request.getRequestDispatcher("reader_ok.jsp?para=1").forward(
/*  74 */         request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void readerQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  81 */     String str = null;
/*  82 */     request.setAttribute("reader", readerDAO.query(str));
/*  83 */     request.getRequestDispatcher("reader.jsp").forward(request, response);
/*     */   }
/*     */   
/*     */   private void readerModifyQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  89 */     ReaderForm readerForm = new ReaderForm();
/*  90 */     System.out.println("查询修改读者信息：" + request.getParameter("ID"));
/*  91 */     readerForm.setId(Integer.valueOf(request.getParameter("ID")));
/*  92 */     request.setAttribute("readerQueryif", readerDAO.queryM(readerForm));
/*  93 */     request.getRequestDispatcher("reader_Modify.jsp").forward(request, 
/*  94 */       response);
/*     */   }
/*     */   
/*     */   private void readerDetail(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 100 */     ReaderForm readerForm = new ReaderForm();
/* 101 */     readerForm.setId(Integer.valueOf(request.getParameter("ID")));
/* 102 */     request.setAttribute("readerDetail", readerDAO.queryM(readerForm));
/* 103 */     request.getRequestDispatcher("reader_detail.jsp").forward(request, 
/* 104 */       response);
/*     */   }
/*     */   
/*     */   private void readerModify(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 110 */     ReaderForm readerForm = new ReaderForm();
/* 111 */     readerForm.setId(Integer.valueOf(Integer.parseInt(request.getParameter("id"))));
/* 112 */     readerForm.setName(request.getParameter("name"));
/* 113 */     readerForm.setSex(request.getParameter("sex"));
/* 114 */     readerForm.setBarcode(request.getParameter("barcode"));
/* 115 */     readerForm.setVocation(request.getParameter("vocation"));
/* 116 */     readerForm.setBirthday(request.getParameter("birthday"));
/* 117 */     readerForm.setPaperType(request.getParameter("paperType"));
/* 118 */     readerForm.setPaperNO(request.getParameter("paperNO"));
/* 119 */     readerForm.setTel(request.getParameter("tel"));
/* 120 */     readerForm.setEmail(request.getParameter("email"));
/* 121 */     readerForm.setOperator(request.getParameter("operator"));
/* 122 */     readerForm.setRemark(request.getParameter("remark"));
/* 123 */     readerForm.setTypeid(Integer.parseInt(request.getParameter("typeid")));
/* 124 */     int ret = readerDAO.update(readerForm);
/* 125 */     if (ret == 0) {
/* 126 */       request.setAttribute("error", "修改读者信息失败！");
/* 127 */       request.getRequestDispatcher("error.jsp")
/* 128 */         .forward(request, response);
/*     */     } else {
/* 130 */       request.getRequestDispatcher("reader_ok.jsp?para=2").forward(
/* 131 */         request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void readerDel(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 138 */     ReaderForm readerForm = new ReaderForm();
/* 139 */     readerForm.setId(Integer.valueOf(request.getParameter("ID")));
/* 140 */     int ret = readerDAO.delete(readerForm);
/* 141 */     if (ret == 0) {
/* 142 */       request.setAttribute("error", "删除读者信息失败！");
/* 143 */       request.getRequestDispatcher("error.jsp")
/* 144 */         .forward(request, response);
/*     */     } else {
/* 146 */       request.getRequestDispatcher("reader_ok.jsp?para=3").forward(
/* 147 */         request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   public void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 154 */     doGet(request, response);
/*     */   }
/*     */ }

/* Location:           E:\重要的东西\java ee工作区\liberary\WebContent\WEB-INF\classes
 * Qualified Name:     com.action.Reader
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */