/*    */ package com.action;
/*    */ 
/*    */ import com.actionForm.ParameterForm;
/*    */ import com.dao.ParameterDAO;
/*    */ import java.io.IOException;
/*    */ import javax.servlet.RequestDispatcher;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ 
/*    */ public class Parameter
/*    */   extends HttpServlet
/*    */ {
/* 16 */   ParameterDAO parameterDAO = null;
/*    */   
/*    */   public Parameter() {
/* 19 */     parameterDAO = new ParameterDAO();
/*    */   }
/*    */   
/*    */   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 24 */     String str = request.getParameter("action");
/* 25 */     if ("parameterQuery".equals(str)) {
/* 26 */       parameterModifyQuery(request, response);
/* 27 */     } else if ("parameterModify".equals(str)) {
/* 28 */       parameterModify(request, response);
/*    */     }
/*    */   }
/*    */   
/*    */   private void parameterModify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 34 */     ParameterForm parameterForm = new ParameterForm();
/* 35 */     parameterForm.setId(Integer.valueOf(1));
/* 36 */     parameterForm.setCost(Integer.parseInt(request.getParameter("cost")));
/* 37 */     parameterForm.setValidity(Integer.parseInt(request.getParameter("validity")));
/* 38 */     int ret = parameterDAO.update(parameterForm);
/* 39 */     if (ret == 0) {
/* 40 */       request.setAttribute("error", "参数设置信息修改失败！");
/* 41 */       request.getRequestDispatcher("error.jsp")
/* 42 */         .forward(request, response);
/*    */     } else {
/* 44 */       request.getRequestDispatcher("parameter_ok.jsp?para=2").forward(request, 
/* 45 */         response);
/*    */     }
/*    */   }
/*    */   
/*    */   private void parameterModifyQuery(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 52 */     request.setAttribute("parameterModifyif", parameterDAO.query());
/* 53 */     request.getRequestDispatcher("parameter_modify.jsp").forward(request, 
/* 54 */       response);
/*    */   }
/*    */   
/*    */   public void doPost(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 60 */     doGet(request, response);
/*    */   }
/*    */ }

/* Location:           E:\重要的东西\java ee工作区\liberary\WebContent\WEB-INF\classes
 * Qualified Name:     com.action.Parameter
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */