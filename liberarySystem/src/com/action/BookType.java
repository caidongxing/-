/*     */ package com.action;
/*     */ 
/*     */ import com.actionForm.BookTypeForm;
/*     */ import com.dao.BookTypeDAO;
/*     */ import java.io.IOException;
/*     */ import javax.servlet.RequestDispatcher;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ 
/*     */ public class BookType extends javax.servlet.http.HttpServlet
/*     */ {
/*  13 */   private BookTypeDAO bookTypeDAO = null;
/*     */   
/*     */   public BookType() {
/*  16 */     bookTypeDAO = new BookTypeDAO();
/*     */   }
/*     */   
/*     */   public void doGet(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  22 */     String action = request.getParameter("action");
/*  23 */     System.out.println("\nbookType*********************action=" + action);
/*  24 */     if ((action == null) || ("".equals(action))) {
/*  25 */       request.setAttribute("error", "您的操作有误！");
/*  26 */       request.getRequestDispatcher("error.jsp")
/*  27 */         .forward(request, response);
/*  28 */     } else if ("bookTypeAdd".equals(action)) {
/*  29 */       bookTypeAdd(request, response);
/*  30 */     } else if ("bookTypeQuery".equals(action)) {
/*  31 */       bookTypeQuery(request, response);
/*  32 */     } else if ("bookTypeModifyQuery".equals(action)) {
/*  33 */       bookTypeModifyQuery(request, response);
/*  34 */     } else if ("bookTypeModify".equals(action)) {
/*  35 */       bookTypeModify(request, response);
/*  36 */     } else if ("bookTypeDel".equals(action)) {
/*  37 */       bookTypeDel(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void bookTypeAdd(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  44 */     BookTypeForm bookTypeForm = new BookTypeForm();
/*  45 */     bookTypeForm.setTypeName(request.getParameter("typeName"));
/*  46 */     bookTypeForm.setDays(Integer.parseInt(request.getParameter("days")));
/*  47 */     int a = bookTypeDAO.insert(bookTypeForm);
/*  48 */     if (a == 0) {
/*  49 */       request.setAttribute("error", "图书类型信息添加失败！");
/*  50 */       request.getRequestDispatcher("error.jsp")
/*  51 */         .forward(request, response);
/*  52 */     } else if (a == 2) {
/*  53 */       request.setAttribute("error", "该图书类型信息已经添加！");
/*  54 */       request.getRequestDispatcher("error.jsp")
/*  55 */         .forward(request, response);
/*     */     } else {
/*  57 */       request.getRequestDispatcher("bookType_ok.jsp?para=1").forward(request, 
/*  58 */         response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void bookTypeQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  65 */     String str = null;
/*  66 */     request.setAttribute("bookType", bookTypeDAO.query(str));
/*  67 */     request.getRequestDispatcher("bookType.jsp")
/*  68 */       .forward(request, response);
/*     */   }
/*     */   
/*     */   private void bookTypeModifyQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  74 */     BookTypeForm bookTypeForm = new BookTypeForm();
/*  75 */     bookTypeForm.setId(Integer.valueOf(request.getParameter("ID")));
/*  76 */     request.setAttribute("bookTypeQueryif", bookTypeDAO
/*  77 */       .queryM(bookTypeForm));
/*  78 */     request.getRequestDispatcher("bookType_Modify.jsp").forward(request, 
/*  79 */       response);
/*     */   }
/*     */   
/*     */   private void bookTypeModify(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  85 */     BookTypeForm bookTypeForm = new BookTypeForm();
/*  86 */     bookTypeForm.setId(Integer.valueOf(Integer.parseInt(request.getParameter("id"))));
/*  87 */     bookTypeForm.setTypeName(request.getParameter("typeName"));
/*  88 */     bookTypeForm.setDays(Integer.parseInt(request.getParameter("days")));
/*  89 */     int ret = bookTypeDAO.update(bookTypeForm);
/*  90 */     if (ret == 0) {
/*  91 */       request.setAttribute("error", "修改图书类型信息失败！");
/*  92 */       request.getRequestDispatcher("error.jsp")
/*  93 */         .forward(request, response);
/*     */     } else {
/*  95 */       request.getRequestDispatcher("bookType_ok.jsp?para=2").forward(request, 
/*  96 */         response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void bookTypeDel(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 103 */     BookTypeForm bookTypeForm = new BookTypeForm();
/* 104 */     bookTypeForm.setId(Integer.valueOf(request.getParameter("ID")));
/* 105 */     int ret = bookTypeDAO.delete(bookTypeForm);
/* 106 */     if (ret == 0) {
/* 107 */       request.setAttribute("error", "删除图书类型信息失败！");
/* 108 */       request.getRequestDispatcher("error.jsp")
/* 109 */         .forward(request, response);
/*     */     } else {
/* 111 */       request.getRequestDispatcher("bookType_ok.jsp?para=3").forward(request, 
/* 112 */         response);
/*     */     }
/*     */   }
/*     */   
/*     */   public void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 119 */     doGet(request, response);
/*     */   }
/*     */ }

/* Location:           E:\重要的东西\java ee工作区\liberary\WebContent\WEB-INF\classes
 * Qualified Name:     com.action.BookType
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */