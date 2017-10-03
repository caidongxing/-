/*     */ package com.action;
/*     */ 
/*     */ import com.actionForm.ReaderTypeForm;
/*     */ import com.dao.ReaderTypeDAO;
/*     */ import javax.servlet.RequestDispatcher;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ 
/*     */ public class ReaderType extends javax.servlet.http.HttpServlet
/*     */ {
/*  12 */   private ReaderTypeDAO readerTypeDAO = null;
/*     */   
/*     */   public ReaderType() {
/*  15 */     readerTypeDAO = new ReaderTypeDAO();
/*     */   }
/*     */   
/*     */   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException
/*     */   {
/*  20 */     String action = request.getParameter("action");
/*  21 */     System.out.println("\nreaderType*********************action=" + action);
/*  22 */     if ((action == null) || ("".equals(action))) {
/*  23 */       request.setAttribute("error", "您的操作有误！");
/*  24 */       request.getRequestDispatcher("error.jsp")
/*  25 */         .forward(request, response);
/*  26 */     } else if ("readerTypeAdd".equals(action)) {
/*  27 */       readerTypeAdd(request, response);
/*  28 */     } else if ("readerTypeQuery".equals(action)) {
/*  29 */       readerTypeQuery(request, response);
/*  30 */     } else if ("readerTypeModifyQuery".equals(action)) {
/*  31 */       readerTypeModifyQuery(request, response);
/*  32 */     } else if ("readerTypeModify".equals(action)) {
/*  33 */       readerTypeModify(request, response);
/*  34 */     } else if ("readerTypeDel".equals(action)) {
/*  35 */       readerTypeDel(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void readerTypeAdd(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, java.io.IOException
/*     */   {
/*  48 */     ReaderTypeForm readerTypeForm = new ReaderTypeForm();
/*  49 */     System.out.println("servlet:" + request.getParameter("name"));
/*  50 */     readerTypeForm.setName(request.getParameter("name"));
/*  51 */     readerTypeForm.setNumber(Integer.parseInt(request
/*  52 */       .getParameter("number")));
/*  53 */     int a = readerTypeDAO.insert(readerTypeForm);
/*  54 */     if (a == 0) {
/*  55 */       request.setAttribute("error", "读者类型信息添加失败！");
/*  56 */       request.getRequestDispatcher("error.jsp")
/*  57 */         .forward(request, response);
/*  58 */     } else if (a == 2) {
/*  59 */       request.setAttribute("error", "该读者类型信息已经添加！");
/*  60 */       request.getRequestDispatcher("error.jsp")
/*  61 */         .forward(request, response);
/*     */     } else {
/*  63 */       request.getRequestDispatcher("readerType_ok.jsp?para=1").forward(
/*  64 */         request, response);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void readerTypeQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, java.io.IOException
/*     */   {
/*  77 */     String str = null;
/*  78 */     request.setAttribute("readerType", readerTypeDAO.query(str));
/*  79 */     request.getRequestDispatcher("readerType.jsp").forward(request, 
/*  80 */       response);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void readerTypeModifyQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, java.io.IOException
/*     */   {
/*  92 */     ReaderTypeForm readerTypeForm = new ReaderTypeForm();
/*  93 */     readerTypeForm.setId(Integer.valueOf(request.getParameter("ID")));
/*  94 */     request.setAttribute("readerTypeQueryif", readerTypeDAO
/*  95 */       .queryM(readerTypeForm));
/*  96 */     request.getRequestDispatcher("readerType_Modify.jsp").forward(request, 
/*  97 */       response);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void readerTypeModify(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, java.io.IOException
/*     */   {
/* 109 */     ReaderTypeForm readerTypeForm = new ReaderTypeForm();
/* 110 */     readerTypeForm.setId(Integer.valueOf(Integer.parseInt(request.getParameter("id"))));
/* 111 */     readerTypeForm.setName(request.getParameter("name"));
/* 112 */     readerTypeForm.setNumber(Integer.parseInt(request
/* 113 */       .getParameter("number")));
/* 114 */     int ret = readerTypeDAO.update(readerTypeForm);
/* 115 */     if (ret == 0) {
/* 116 */       request.setAttribute("error", "修改读者类型信息失败！");
/* 117 */       request.getRequestDispatcher("error.jsp")
/* 118 */         .forward(request, response);
/*     */     } else {
/* 120 */       request.getRequestDispatcher("readerType_ok.jsp?para=2").forward(
/* 121 */         request, response);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void readerTypeDel(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, java.io.IOException
/*     */   {
/* 134 */     ReaderTypeForm readerTypeForm = new ReaderTypeForm();
/* 135 */     readerTypeForm.setId(Integer.valueOf(request.getParameter("ID")));
/* 136 */     int ret = readerTypeDAO.delete(readerTypeForm);
/* 137 */     if (ret == 0) {
/* 138 */       request.setAttribute("error", "删除读者类型信息失败！");
/* 139 */       request.getRequestDispatcher("error.jsp")
/* 140 */         .forward(request, response);
/*     */     } else {
/* 142 */       request.getRequestDispatcher("readerType_ok.jsp?para=3").forward(
/* 143 */         request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   public void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, java.io.IOException
/*     */   {
/* 150 */     doGet(request, response);
/*     */   }
/*     */ }

/* Location:           E:\重要的东西\java ee工作区\liberary\WebContent\WEB-INF\classes
 * Qualified Name:     com.action.ReaderType
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */