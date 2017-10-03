/*    */ package com.action;
/*    */ 
/*    */ import com.actionForm.BookCaseForm;
/*    */ import com.dao.BookCaseDAO;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintStream;
/*    */ import javax.servlet.RequestDispatcher;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class BookCase extends javax.servlet.http.HttpServlet
/*    */ {
/* 14 */   private BookCaseDAO bookCaseDAO = null;
/*    */   
/* 16 */   public BookCase() { bookCaseDAO = new BookCaseDAO(); }
/*    */   
/*    */   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 20 */     String action = request.getParameter("action");
/* 21 */     System.out.println("\nbookCase*********************action=" + action);
/* 22 */     if ((action == null) || ("".equals(action))) {
/* 23 */       request.getRequestDispatcher("error.jsp").forward(request, response);
/* 24 */     } else if ("bookCaseAdd".equals(action)) {
/* 25 */       bookCaseAdd(request, response);
/* 26 */     } else if ("bookCaseQuery".equals(action)) {
/* 27 */       bookCaseQuery(request, response);
/* 28 */     } else if ("bookCaseModifyQuery".equals(action)) {
/* 29 */       bookCaseModifyQuery(request, response);
/* 30 */     } else if ("bookCaseModify".equals(action)) {
/* 31 */       bookCaseModify(request, response);
/* 32 */     } else if ("bookCaseDel".equals(action)) {
/* 33 */       bookCaseDel(request, response);
/*    */     }
/*    */   }
/*    */   
/*    */   private void bookCaseAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 39 */     BookCaseForm bookCaseForm = new BookCaseForm();
/* 40 */     bookCaseForm.setName(request.getParameter("name"));
/* 41 */     int a = bookCaseDAO.insert(bookCaseForm);
/* 42 */     if (a == 0) {
/* 43 */       request.setAttribute("error", "书架信息添加失败！");
/* 44 */       request.getRequestDispatcher("error.jsp").forward(request, response);
/* 45 */     } else if (a == 2) {
/* 46 */       request.setAttribute("error", "该书架信息已经添加！");
/* 47 */       request.getRequestDispatcher("error.jsp").forward(request, response);
/*    */     } else {
/* 49 */       request.getRequestDispatcher("bookcase_ok.jsp?para=1").forward(request, response);
/*    */     }
/*    */   }
/*    */   
/*    */   private void bookCaseQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 55 */     String str = null;
/* 56 */     request.setAttribute("bookcase", bookCaseDAO.query(str));
/* 57 */     request.getRequestDispatcher("bookcase.jsp").forward(request, response);
/*    */   }
/*    */   
/*    */   private void bookCaseModifyQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 62 */     BookCaseForm bookCaseForm = new BookCaseForm();
/* 63 */     bookCaseForm.setId(Integer.valueOf(request.getParameter("ID")));
/* 64 */     request.setAttribute("bookCaseQueryif", bookCaseDAO.queryM(bookCaseForm));
/* 65 */     request.getRequestDispatcher("bookCase_Modify.jsp").forward(request, response);
/*    */   }
/*    */   
/*    */   private void bookCaseModify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 70 */     BookCaseForm bookCaseForm = new BookCaseForm();
/* 71 */     bookCaseForm.setId(Integer.valueOf(Integer.parseInt(request.getParameter("id"))));
/* 72 */     bookCaseForm.setName(request.getParameter("name"));
/* 73 */     int ret = bookCaseDAO.update(bookCaseForm);
/* 74 */     if (ret == 0) {
/* 75 */       request.setAttribute("error", "修改书架信息失败！");
/* 76 */       request.getRequestDispatcher("error.jsp").forward(request, response);
/*    */     } else {
/* 78 */       request.getRequestDispatcher("bookcase_ok.jsp?para=2").forward(request, response);
/*    */     }
/*    */   }
/*    */   
/*    */   private void bookCaseDel(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 84 */     BookCaseForm bookCaseForm = new BookCaseForm();
/* 85 */     bookCaseForm.setId(Integer.valueOf(request.getParameter("ID")));
/* 86 */     int ret = bookCaseDAO.delete(bookCaseForm);
/* 87 */     if (ret == 0) {
/* 88 */       request.setAttribute("error", "删除书架信息失败！");
/* 89 */       request.getRequestDispatcher("error.jsp").forward(request, response);
/*    */     } else {
/* 91 */       request.getRequestDispatcher("bookcase_ok.jsp?para=3").forward(request, response);
/*    */     }
/*    */   }
/*    */   
/*    */   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 97 */     doGet(request, response);
/*    */   }
/*    */ }

/* Location:           E:\重要的东西\java ee工作区\liberary\WebContent\WEB-INF\classes
 * Qualified Name:     com.action.BookCase
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */