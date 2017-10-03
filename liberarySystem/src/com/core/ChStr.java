/*    */ package com.core;
/*    */ 
/*    */ 
/*    */ public class ChStr
/*    */ {
/*    */   public static final String nullToString(String v, String toV)
/*    */   {
/*  8 */     if ((v == null) || ("".equals(v))) {
/*  9 */       v = toV;
/*    */     }
/* 11 */     return v;
/*    */   }
/*    */   
/*    */   public static final String filterStr(String str) {
/* 15 */     str = str.replaceAll(";", "");
/* 16 */     str = str.replaceAll("&", "&amp;");
/* 17 */     str = str.replaceAll("<", "&lt;");
/* 18 */     str = str.replaceAll(">", "&gt;");
/* 19 */     str = str.replaceAll("'", "");
/* 20 */     str = str.replaceAll("--", " ");
/* 21 */     str = str.replaceAll("/", "");
/* 22 */     str = str.replaceAll("%", "");
/* 23 */     return str;
/*    */   }
/*    */ }

/* Location:           E:\重要的东西\java ee工作区\liberarySystem\WebContent\WEB-INF\classes
 * Qualified Name:     com.core.ChStr
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */