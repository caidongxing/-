package com.core;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnDB {
	  public Connection conn = null;
	  public Statement stmt = null;
	  public ResultSet rs = null;
	  private static String propFileName = "/com/connDB.properties";	//指锟斤拷锟斤拷源锟侥硷拷锟斤拷锟斤拷锟轿伙拷锟�
	  private static Properties prop = new Properties();
	  private static String dbClassName ="com.mysql.jdbc.Driver";
	  private static String dbUrl =
	      "jdbc:mysql://localhost:3306/db_librarysys";
	  public ConnDB(){
		    try
		    {
		     Class.forName("com.mysql.jdbc.Driver");
		    }catch(Exception e)
		    {e.printStackTrace();}
		  }

	  public static Connection getConnection() {
	    Connection conn = null;
	    try {
	      Class.forName(dbClassName).newInstance();
	      conn = DriverManager.getConnection(dbUrl);
	    }
	    catch (Exception ee) {
	      ee.printStackTrace();
	    }
	    if (conn == null) {
	      System.err.println(
	          "锟斤拷锟斤拷: DbConnectionManager.getConnection() 锟斤拷锟斤拷锟斤拷菘锟斤拷锟斤拷锟绞э拷锟�.\r\n\r\n锟斤拷锟斤拷锟斤拷锟斤拷:" +
	          dbClassName + "\r\n锟斤拷锟斤拷位锟斤拷:" + dbUrl);
	    }
	    return conn;
	  }

	/*
	 * 锟斤拷锟杰ｏ拷执锟叫诧拷询锟斤拷锟�
	 */
	public ResultSet executeQuery(String sql) {
	    try
	    {
	      conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_librarysys?user=root&password=123456&useUnicode=true");
	     stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	     rs=stmt.executeQuery(sql);
	    }catch(SQLException e)
	    {
	      e.printStackTrace();
	      System.out.println("Query Exception");
	    }
	return rs;
	  }

	/*
	 * 锟斤拷锟斤拷:执锟叫革拷锟铰诧拷锟斤拷
	 */
	public int executeUpdate(String sql) {
		int result = 0;
		  try
		  {
		    conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_librarysys?user=root&password=123456&useUnicode=true");
		  stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		  result=stmt.executeUpdate(sql);
		  }catch(Exception e)
		  {
			  result = 0;
		    e.printStackTrace();
		    System.out.print("Updata Exception");
		  }
		  return result;
		  }

	/*
	 * 锟斤拷锟斤拷:锟截憋拷锟斤拷锟捷匡拷锟斤拷锟斤拷锟�
	 */
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
