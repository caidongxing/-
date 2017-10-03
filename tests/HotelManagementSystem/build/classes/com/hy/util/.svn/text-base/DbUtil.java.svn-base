package com.hy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {
	
	private Connection conn;
	//1.操作执行语句的对象
    private PreparedStatement ps;
    //2.存放查询操作结果语句的对象
    private ResultSet rs;
    /**
     * 获取连接
     * @return
     */
    public Connection getConn() {
        
        try {
            //1.加载mysql连接到数据库jar包，数据库驱动
        	
        	//net.sf.log4jdbc.DriverSpy
        	//com.mysql.jdbc.Driver
            Class.forName("net.sf.log4jdbc.DriverSpy");
            //2.数据库所在位置以及要访问数据库的名字
            //log4jdbc// jdbc:log4jdbc:mysql://127.0.0.1:3306/gxsoft
            //jdbc:mysql://127.0.0.1:3306/gxsoft
            String url = "jdbc:log4jdbc:mysql://127.0.0.1:3306/booksmanagementsystem?useUnicode=true&characterEncoding=utf8";
            //3.数据库的用户名，密码
            String username = "root";
            String password = "123";
            //4.使用驱动管理器连接到数据库
            conn = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }
    //关闭资源的方法
    public void clearUp(Connection conn){
        System.out.println("关闭conn资源");
        try {
            if(rs != null){
                rs.close();
            }
            if(ps != null){
                ps.close();
            }
            if(conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void setConn(Connection conn) {
        this.conn = conn;
    }
    public static void main(String[] args) {
    	DbUtil db = new DbUtil();
    	Connection conn = db.getConn();
    	System.out.println(conn);
    	db.clearUp(conn);
	}
    
}
