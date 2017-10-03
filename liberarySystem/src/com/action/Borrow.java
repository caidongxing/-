/*     */ package com.action;
/*     */ 
/*     */ import com.actionForm.ReaderForm;
/*     */ import com.dao.BorrowDAO;
/*     */ import com.dao.ReaderDAO;
/*     */ import java.io.IOException;
/*     */ import javax.servlet.RequestDispatcher;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ 
/*     */ public class Borrow extends javax.servlet.http.HttpServlet
/*     */ {
/*  14 */   private BorrowDAO borrowDAO = null;
/*  15 */   private ReaderDAO readerDAO = null;
/*  16 */   private com.dao.BookDAO bookDAO = null;
/*  17 */   private ReaderForm readerForm = new ReaderForm();
/*     */   
/*  19 */   public Borrow() { borrowDAO = new BorrowDAO();
/*  20 */     readerDAO = new ReaderDAO();
/*  21 */     bookDAO = new com.dao.BookDAO();
/*     */   }
/*     */   
/*     */   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/*  26 */     String action = request.getParameter("action");
/*  27 */     if ((action == null) || ("".equals(action))) {
/*  28 */       request.setAttribute("error", "您的操作有误！");
/*  29 */       request.getRequestDispatcher("error.jsp").forward(request, response);
/*  30 */     } else if ("bookBorrowSort".equals(action)) {
/*  31 */       bookBorrowSort(request, response);
/*  32 */     } else if ("bookborrow".equals(action)) {
/*  33 */       bookborrow(request, response);
/*  34 */     } else if ("bookrenew".equals(action)) {
/*  35 */       bookrenew(request, response);
/*  36 */     } else if ("bookback".equals(action)) {
/*  37 */       bookback(request, response);
/*  38 */     } else if ("Bremind".equals(action)) {
/*  39 */       bremind(request, response);
/*  40 */     } else if ("borrowQuery".equals(action)) {
/*  41 */       borrowQuery(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void bookBorrowSort(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/*  47 */     request.setAttribute("bookBorrowSort", borrowDAO.bookBorrowSort());
/*  48 */     request.getRequestDispatcher("bookBorrowSort.jsp").forward(request, response);
/*     */   }
/*     */   
/*     */   private void borrowQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/*  53 */     String str = null;
/*  54 */     String[] flag = request.getParameterValues("flag");
/*  55 */     if (flag != null) {
/*  56 */       String aa = flag[0];
/*  57 */       if (("a".equals(aa)) && 
/*  58 */         (request.getParameter("f") != null)) {
/*  59 */         str = 
/*  60 */           request.getParameter("f") + " like '%" + request.getParameter("key") + "%'";
/*     */       }
/*     */       
/*  63 */       if ("b".equals(aa)) {
/*  64 */         String sdate = request.getParameter("sdate");
/*  65 */         String edate = request.getParameter("edate");
/*  66 */         if ((sdate != null) && (edate != null)) {
/*  67 */           str = 
/*  68 */             "borrowTime between '" + sdate + "' and '" + edate + "'";
/*     */         }
/*  70 */         System.out.println("日期" + str);
/*     */       }
/*     */       
/*  73 */       if (flag.length == 2) {
/*  74 */         if (request.getParameter("f") != null) {
/*  75 */           str = 
/*  76 */             request.getParameter("f") + " like '%" + request.getParameter("key") + "%'";
/*     */         }
/*  78 */         System.out.println("日期和条件");
/*  79 */         String sdate = request.getParameter("sdate");
/*  80 */         String edate = request.getParameter("edate");
/*  81 */         String str1 = null;
/*  82 */         if ((sdate != null) && (edate != null)) {
/*  83 */           str1 = 
/*  84 */             "borrowTime between '" + sdate + "' and '" + edate + "'";
/*     */         }
/*  86 */         str = str + " and borr." + str1;
/*  87 */         System.out.println("条件和日期：" + str);
/*     */       }
/*     */     }
/*  90 */     request.setAttribute("borrowQuery", borrowDAO.borrowQuery(str));
/*  91 */     System.out.print("条件查询图书借阅信息时的str:" + str);
/*  92 */     request.getRequestDispatcher("borrowQuery.jsp").forward(request, response);
/*     */   }
/*     */   
/*     */   private void bremind(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/*  97 */     request.setAttribute("Bremind", borrowDAO.bremind());
/*  98 */     request.getRequestDispatcher("bremind.jsp").forward(request, response);
/*     */   }
/*     */   
/*     */ 
/*     */   private void bookborrow(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 105 */     readerForm.setBarcode(request.getParameter("barcode"));
/* 106 */     ReaderForm reader = readerDAO.queryM(readerForm);
/* 107 */     request.setAttribute("readerinfo", reader);
/*     */     
/* 109 */     request.setAttribute("borrowinfo", borrowDAO.borrowinfo(request.getParameter("barcode")));
/*     */     
/* 111 */     String f = request.getParameter("f");
/* 112 */     String key = request.getParameter("inputkey");
/* 113 */     if ((key != null) && (!key.equals(""))) {
/* 114 */       String operator = request.getParameter("operator");
/* 115 */       com.actionForm.BookForm bookForm = bookDAO.queryB(f, key);
/* 116 */       if (bookForm != null) {
/* 117 */         int ret = borrowDAO.insertBorrow(reader, bookDAO.queryB(f, key), 
/* 118 */           operator);
/* 119 */         if (ret == 1) {
/* 120 */           request.setAttribute("bar", request.getParameter("barcode"));
/* 121 */           request.getRequestDispatcher("bookBorrow_ok.jsp").forward(request, response);
/*     */         }
/*     */         else {
/* 124 */           request.setAttribute("error", "添加借阅信息失败!");
/* 125 */           request.getRequestDispatcher("error.jsp").forward(request, response);
/*     */         }
/*     */       } else {
/* 128 */         request.setAttribute("error", "没有该图书!");
/* 129 */         request.getRequestDispatcher("error.jsp").forward(request, response);
/*     */       }
/*     */     } else {
/* 132 */       request.getRequestDispatcher("bookBorrow.jsp").forward(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void bookrenew(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 139 */     readerForm.setBarcode(request.getParameter("barcode"));
/* 140 */     ReaderForm reader = readerDAO.queryM(readerForm);
/* 141 */     request.setAttribute("readerinfo", reader);
/*     */     
/* 143 */     request.setAttribute("borrowinfo", borrowDAO.borrowinfo(request.getParameter("barcode")));
/* 144 */     if (request.getParameter("id") != null) {
/* 145 */       int id = Integer.parseInt(request.getParameter("id"));
/* 146 */       if (id > 0) {
/* 147 */         int ret = borrowDAO.renew(id);
/* 148 */         if (ret == 0) {
/* 149 */           request.setAttribute("error", "图书继借失败!");
/* 150 */           request.getRequestDispatcher("error.jsp").forward(request, response);
/*     */         } else {
/* 152 */           request.setAttribute("bar", request.getParameter("barcode"));
/* 153 */           request.getRequestDispatcher("bookRenew_ok.jsp").forward(request, response);
/*     */         }
/*     */       }
/*     */     } else {
/* 157 */       request.getRequestDispatcher("bookRenew.jsp").forward(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void bookback(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 164 */     readerForm.setBarcode(request.getParameter("barcode"));
/* 165 */     ReaderForm reader = readerDAO.queryM(readerForm);
/* 166 */     request.setAttribute("readerinfo", reader);
/*     */     
/* 168 */     request.setAttribute("borrowinfo", borrowDAO.borrowinfo(request.getParameter("barcode")));
/* 169 */     if (request.getParameter("id") != null) {
/* 170 */       int id = Integer.parseInt(request.getParameter("id"));
/* 171 */       String operator = request.getParameter("operator");
/* 172 */       if (id > 0) {
/* 173 */         int ret = borrowDAO.back(id, operator);
/* 174 */         if (ret == 0) {
/* 175 */           request.setAttribute("error", "图书归还失败!");
/* 176 */           request.getRequestDispatcher("error.jsp").forward(request, response);
/*     */         } else {
/* 178 */           request.setAttribute("bar", request.getParameter("barcode"));
/* 179 */           request.getRequestDispatcher("bookBack_ok.jsp").forward(request, response);
/*     */         }
/*     */       }
/*     */     } else {
/* 183 */       request.getRequestDispatcher("bookBack.jsp").forward(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/* 189 */     doGet(request, response);
/*     */   }
/*     */ }

/* Location:           E:\重要的东西\java ee工作区\liberary\WebContent\WEB-INF\classes
 * Qualified Name:     com.action.Borrow
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */