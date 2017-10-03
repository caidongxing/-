/*     */ package com.action;
/*     */ 
/*     */ import com.actionForm.BookForm;
/*     */ import com.dao.BookDAO;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import javax.servlet.RequestDispatcher;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ 
/*     */ public class Book extends javax.servlet.http.HttpServlet
/*     */ {
/*  14 */   private BookDAO bookDAO = null;
/*     */   
/*     */   public Book() {
/*  17 */     bookDAO = new BookDAO();
/*     */   }
/*     */   
/*     */   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/*  22 */     String action = request.getParameter("action");
/*  23 */     System.out.println("\nbook*********************action=" + action);
/*  24 */     if ((action == null) || ("".equals(action))) {
/*  25 */       request.setAttribute("error", "您的操作有误！");
/*  26 */       request.getRequestDispatcher("error.jsp")
/*  27 */         .forward(request, response);
/*  28 */     } else if ("bookAdd".equals(action)) {
/*  29 */       bookAdd(request, response);
/*  30 */     } else if ("bookQuery".equals(action)) {
/*  31 */       bookQuery(request, response);
/*  32 */     } else if ("bookModifyQuery".equals(action)) {
/*  33 */       bookModifyQuery(request, response);
/*  34 */     } else if ("bookModify".equals(action)) {
/*  35 */       bookModify(request, response);
/*  36 */     } else if ("bookDel".equals(action)) {
/*  37 */       bookDel(request, response);
/*  38 */     } else if ("bookDetail".equals(action)) {
/*  39 */       bookDetail(request, response);
/*  40 */     } else if ("bookifQuery".equals(action)) {
/*  41 */       bookifQuery(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void bookAdd(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  48 */     BookForm bookForm = new BookForm();
/*  49 */     bookForm.setBarcode(request.getParameter("barcode"));
/*  50 */     bookForm.setBookName(request.getParameter("bookName"));
/*  51 */     bookForm.setTypeId(Integer.parseInt(request.getParameter("typeId")));
/*  52 */     bookForm.setAuthor(request.getParameter("author"));
/*  53 */     bookForm.setTranslator(request.getParameter("translator"));
/*  54 */     bookForm.setIsbn(request.getParameter("isbn"));
/*  55 */     bookForm.setPrice(Float.valueOf(request.getParameter("price")));
/*  56 */     bookForm.setPage(request.getParameter("page") == "" ? 0 : Integer.parseInt(request.getParameter("page")));
/*  57 */     bookForm.setBookcaseid(Integer.parseInt(request
/*  58 */       .getParameter("bookcaseid")));
/*     */     
/*  60 */     java.util.Date date1 = new java.util.Date();
/*  61 */     java.sql.Date date = new java.sql.Date(date1.getTime());
/*  62 */     bookForm.setInTime(date.toString());
/*  63 */     bookForm.setOperator(request.getParameter("operator"));
/*  64 */     int a = bookDAO.insert(bookForm);
/*  65 */     if (a == 1) {
/*  66 */       request.getRequestDispatcher("book_ok.jsp?para=1").forward(request, response);
/*  67 */     } else if (a == 2) {
/*  68 */       request.setAttribute("error", "该图书信息已经添加！");
/*  69 */       request.getRequestDispatcher("error.jsp")
/*  70 */         .forward(request, response);
/*     */     } else {
/*  72 */       request.setAttribute("error", "图书信息添加失败！");
/*  73 */       request.getRequestDispatcher("error.jsp")
/*  74 */         .forward(request, response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void bookQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  81 */     String str = null;
/*  82 */     request.setAttribute("book", bookDAO.query(str));
/*  83 */     request.getRequestDispatcher("book.jsp").forward(request, response);
/*     */   }
/*     */   
/*     */   private void bookifQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  89 */     String str = null;
/*  90 */     if (request.getParameter("f") != null) {
/*  91 */       str = 
/*  92 */         request.getParameter("f") + " like '%" + request.getParameter("key") + "%";
/*     */     }
/*  94 */     request.setAttribute("ifbook", bookDAO.query(str));
/*  95 */     System.out.print("条件查询图书信息时的str:" + str);
/*  96 */     request.getRequestDispatcher("bookQuery.jsp").forward(request, response);
/*     */   }
/*     */   
/*     */   private void bookModifyQuery(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 102 */     BookForm bookForm = new BookForm();
/* 103 */     System.out.println("查询修改图书信息：" + request.getParameter("ID"));
/* 104 */     bookForm.setId(Integer.valueOf(request.getParameter("ID")));
/* 105 */     request.setAttribute("bookQueryif", bookDAO.queryM(bookForm));
/* 106 */     request.getRequestDispatcher("book_Modify.jsp").forward(request, 
/* 107 */       response);
/*     */   }
/*     */   
/*     */   private void bookDetail(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 113 */     BookForm bookForm = new BookForm();
/* 114 */     bookForm.setId(Integer.valueOf(request.getParameter("ID")));
/* 115 */     request.setAttribute("bookDetail", bookDAO.queryM(bookForm));
/* 116 */     request.getRequestDispatcher("book_detail.jsp").forward(request, 
/* 117 */       response);
/*     */   }
/*     */   
/*     */   private void bookModify(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 123 */     BookForm bookForm = new BookForm();
/* 124 */     bookForm.setId(Integer.valueOf(Integer.parseInt(request.getParameter("id"))));
/* 125 */     bookForm.setBarcode(request.getParameter("barcode"));
/* 126 */     bookForm.setBookName(request.getParameter("bookName"));
/* 127 */     bookForm.setTypeId(Integer.parseInt(request.getParameter("typeId")));
/* 128 */     bookForm.setAuthor(request.getParameter("author"));
/* 129 */     bookForm.setTranslator(request.getParameter("translator"));
/* 130 */     bookForm.setIsbn(request.getParameter("isbn"));
/* 131 */     bookForm.setPrice(Float.valueOf(request.getParameter("price")));
/* 132 */     bookForm.setPage(request.getParameter("page") == "" ? 0 : Integer.parseInt(request.getParameter("page")));
/* 133 */     bookForm.setBookcaseid(Integer.parseInt(request
/* 134 */       .getParameter("bookcaseid")));
/* 135 */     bookForm.setOperator(request.getParameter("operator"));
/* 136 */     int ret = bookDAO.update(bookForm);
/* 137 */     if (ret == 0) {
/* 138 */       request.setAttribute("error", "修改图书信息失败！");
/* 139 */       request.getRequestDispatcher("error.jsp")
/* 140 */         .forward(request, response);
/*     */     } else {
/* 142 */       request.getRequestDispatcher("book_ok.jsp?para=2").forward(request, 
/* 143 */         response);
/*     */     }
/*     */   }
/*     */   
/*     */   private void bookDel(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 150 */     BookForm bookForm = new BookForm();
/* 151 */     bookForm.setId(Integer.valueOf(request.getParameter("ID")));
/* 152 */     int ret = bookDAO.delete(bookForm);
/* 153 */     if (ret == 0) {
/* 154 */       request.setAttribute("error", "删除图书信息失败！");
/* 155 */       request.getRequestDispatcher("error.jsp")
/* 156 */         .forward(request, response);
/*     */     } else {
/* 158 */       request.getRequestDispatcher("book_ok.jsp?para=3").forward(request, 
/* 159 */         response);
/*     */     }
/*     */   }
/*     */   
/*     */   public void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/* 166 */     doGet(request, response);
/*     */   }
/*     */ }

/* Location:           E:\重要的东西\java ee工作区\liberary\WebContent\WEB-INF\classes
 * Qualified Name:     com.action.Book
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */