/*     */ package com.action;
/*     */ 
/*     */ import com.actionForm.ManagerForm;
/*     */ import com.dao.ManagerDAO;
/*     */ import java.io.IOException;
/*     */ import javax.servlet.RequestDispatcher;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import javax.servlet.http.HttpSession;
/*     */ 
/*     */ public class Manager extends javax.servlet.http.HttpServlet
/*     */ {
/*  14 */   private ManagerDAO managerDAO = null;
/*     */   
/*     */   public Manager() {
/*  17 */     managerDAO = new ManagerDAO();
/*     */   }
/*     */   
/*     */   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/*  22 */     String action = request.getParameter("action");
/*  23 */     System.out.println("获取的查询字符串：" + action);
/*  24 */     if ((action == null) || ("".equals(action)))
/*     */     {
/*  26 */       request.getRequestDispatcher("error.jsp").forward(request, response);
/*  27 */     } else if ("login".equals(action)) {
/*  28 */       managerLogin(request, response);
/*  29 */     } else if ("managerAdd".equals(action)) {
/*  30 */       managerAdd(request, response);
/*  31 */     } else if ("managerQuery".equals(action)) {
/*  32 */       managerQuery(request, response);
/*  33 */     } else if ("managerModifyQuery".equals(action)) {
/*  34 */       managerModifyQuery(request, response);
/*  35 */     } else if ("managerModify".equals(action)) {
/*  36 */       managerModify(request, response);
/*  37 */     } else if ("managerDel".equals(action)) {
/*  38 */       managerDel(request, response);
/*  39 */     } else if ("querypwd".equals(action)) {
/*  40 */       pwdQuery(request, response);
/*  41 */     } else if ("modifypwd".equals(action)) {
/*  42 */       modifypwd(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void managerLogin(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  50 */     ManagerForm managerForm = new ManagerForm();
/*  51 */     managerForm.setName(request.getParameter("name"));
/*  52 */     managerForm.setPwd(request.getParameter("pwd"));
/*  53 */     int ret = managerDAO.checkManager(managerForm);
/*  54 */     if (ret == 1)
/*     */     {
/*  56 */       HttpSession session = request.getSession();
/*  57 */       session.setAttribute("manager", managerForm.getName());
/*     */       
/*  59 */       request.getRequestDispatcher("main.jsp").forward(request, response);
/*     */     } else {
/*  61 */       request.setAttribute("error", "您输入的管理员名称或密码错误！");
/*  62 */       request.getRequestDispatcher("error.jsp")
/*  63 */         .forward(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void managerQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  70 */     String str = null;
/*  71 */     request.setAttribute("managerQuery", managerDAO.query(str));
/*  72 */     request.getRequestDispatcher("manager.jsp").forward(request, response);
/*     */   }
/*     */   
/*     */   private void managerAdd(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  78 */     ManagerForm managerForm = new ManagerForm();
/*  79 */     managerForm.setName(request.getParameter("name"));
/*  80 */     managerForm.setPwd(request.getParameter("pwd"));
/*  81 */     int ret = managerDAO.insert(managerForm);
/*  82 */     if (ret == 1) {
/*  83 */       request.getRequestDispatcher("manager_ok.jsp?para=1").forward(
/*  84 */         request, response);
/*     */     }
/*  86 */     else if (ret == 2) {
/*  87 */       request.setAttribute("error", "该管理员信息已经添加！");
/*  88 */       request.getRequestDispatcher("error.jsp")
/*  89 */         .forward(request, response);
/*     */     } else {
/*  91 */       request.setAttribute("error", "添加管理员信息失败！");
/*  92 */       request.getRequestDispatcher("error.jsp")
/*  93 */         .forward(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void managerModifyQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 100 */     ManagerForm managerForm = new ManagerForm();
/* 101 */     managerForm.setId(Integer.valueOf(request.getParameter("id")));
/* 102 */     System.out.print("查询到的id:" + request.getParameter("id"));
/* 103 */     request.setAttribute("managerQueryif", managerDAO
/* 104 */       .query_update(managerForm));
/* 105 */     request.getRequestDispatcher("manager_Modify.jsp").forward(request, 
/* 106 */       response);
/*     */   }
/*     */   
/*     */   private void pwdQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 112 */     ManagerForm managerForm = new ManagerForm();
/* 113 */     HttpSession session = request.getSession();
/* 114 */     String manager = (String)session.getAttribute("manager");
/* 115 */     managerForm.setName(manager);
/* 116 */     System.out.print("查询到的manager:" + manager);
/* 117 */     request.setAttribute("pwdQueryif", managerDAO.query_pwd(managerForm));
/* 118 */     request.getRequestDispatcher("pwd_Modify.jsp").forward(request, 
/* 119 */       response);
/*     */   }
/*     */   
/*     */   private void managerModify(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 125 */     ManagerForm managerForm = new ManagerForm();
/* 126 */     managerForm.setId(Integer.valueOf(Integer.parseInt(request.getParameter("id"))));
/* 127 */     managerForm.setName(request.getParameter("name"));
/* 128 */     managerForm.setPwd(request.getParameter("pwd"));
/* 129 */     managerForm.setSysset(request.getParameter("sysset") == null ? 0 : 
/* 130 */       Integer.parseInt(request.getParameter("sysset")));
/* 131 */     managerForm.setReaderset(request.getParameter("readerset") == null ? 0 : 
/* 132 */       Integer.parseInt(request.getParameter("readerset")));
/* 133 */     managerForm.setBookset(request.getParameter("bookset") == null ? 0 : 
/* 134 */       Integer.parseInt(request.getParameter("bookset")));
/* 135 */     managerForm
/* 136 */       .setBorrowback(request.getParameter("borrowback") == null ? 0 : 
/* 137 */       Integer.parseInt(request.getParameter("borrowback")));
/* 138 */     managerForm.setSysquery(request.getParameter("sysquery") == null ? 0 : 
/* 139 */       Integer.parseInt(request.getParameter("sysquery")));
/* 140 */     int ret = managerDAO.update(managerForm);
/* 141 */     if (ret == 0) {
/* 142 */       request.setAttribute("error", "设置管理员权限失败！");
/* 143 */       request.getRequestDispatcher("error.jsp")
/* 144 */         .forward(request, response);
/*     */     } else {
/* 146 */       request.getRequestDispatcher("manager_ok.jsp?para=2").forward(
/* 147 */         request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void managerDel(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 154 */     ManagerForm managerForm = new ManagerForm();
/* 155 */     managerForm.setId(Integer.valueOf(request.getParameter("id")));
/* 156 */     int ret = managerDAO.delete(managerForm);
/* 157 */     if (ret == 0) {
/* 158 */       request.setAttribute("error", "删除管理员信息失败！");
/* 159 */       request.getRequestDispatcher("error.jsp")
/* 160 */         .forward(request, response);
/*     */     } else {
/* 162 */       request.getRequestDispatcher("manager_ok.jsp?para=3").forward(
/* 163 */         request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void modifypwd(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 170 */     ManagerForm managerForm = new ManagerForm();
/* 171 */     managerForm.setName(request.getParameter("name"));
/* 172 */     managerForm.setPwd(request.getParameter("pwd"));
/* 173 */     int ret = managerDAO.updatePwd(managerForm);
/* 174 */     if (ret == 0) {
/* 175 */       request.setAttribute("error", "更改口令失败！");
/* 176 */       request.getRequestDispatcher("error.jsp")
/* 177 */         .forward(request, response);
/*     */     } else {
/* 179 */       request.getRequestDispatcher("pwd_ok.jsp").forward(request, 
/* 180 */         response);
/*     */     }
/*     */   }
/*     */   
/*     */   public void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 187 */     doGet(request, response);
/*     */   }
/*     */ }

/* Location:           E:\重要的东西\java ee工作区\liberary\WebContent\WEB-INF\classes
 * Qualified Name:     com.action.Manager
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */