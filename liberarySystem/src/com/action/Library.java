/*    */ package com.action;
/*    */ 
/*    */ import com.actionForm.LibraryForm;
/*    */ import com.dao.LibraryDAO;
/*    */ import java.io.IOException;
/*    */ import javax.servlet.RequestDispatcher;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class Library extends HttpServlet
/*    */ {
/* 14 */   LibraryDAO libraryDAO = null;
/*    */   
/* 16 */   public Library() { libraryDAO = new LibraryDAO(); }
/*    */   
/*    */   public void doGet(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 21 */     String str = request.getParameter("action");
/* 22 */     if ("libraryQuery".equals(str)) {
/* 23 */       libraryModifyQuery(request, response);
/* 24 */     } else if ("libraryModify".equals(str)) {
/* 25 */       libraryModify(request, response);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void doPost(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 33 */     doGet(request, response);
/*    */   }
/*    */   
/*    */   private void libraryModify(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 39 */     LibraryForm libraryForm = new LibraryForm();
/* 40 */     libraryForm.setId(Integer.valueOf(1));
/* 41 */     libraryForm.setLibraryname(request.getParameter("libraryname"));
/* 42 */     libraryForm.setCurator(request.getParameter("curator"));
/* 43 */     libraryForm.setTel(request.getParameter("tel"));
/* 44 */     libraryForm.setAddress(request.getParameter("address"));
/* 45 */     libraryForm.setEmail(request.getParameter("email"));
/* 46 */     libraryForm.setUrl(request.getParameter("url"));
/* 47 */     libraryForm.setCreateDate(request.getParameter("createDate"));
/* 48 */     libraryForm.setIntroduce(request.getParameter("introduce"));
/* 49 */     int ret = libraryDAO.update(libraryForm);
/* 50 */     if (ret == 0) {
/* 51 */       request.setAttribute("error", "图书馆信息修改失败！");
/* 52 */       request.getRequestDispatcher("error.jsp").forward(request, response);
/*    */     } else {
/* 54 */       request.getRequestDispatcher("library_ok.jsp?para=2").forward(request, response);
/*    */     }
/*    */   }
/*    */   
/*    */   private void libraryModifyQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 60 */     request.setAttribute("libraryModifyif", libraryDAO.query());
/* 61 */     request.getRequestDispatcher("library_modify.jsp").forward(request, response);
/*    */   }
/*    */ }

/* Location:           E:\重要的东西\java ee工作区\liberary\WebContent\WEB-INF\classes
 * Qualified Name:     com.action.Library
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */