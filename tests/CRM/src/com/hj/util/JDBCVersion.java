package com.hj.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.DatabaseMetaData;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class JDBCVersion {

	/**鎵撳嵃mysql椹卞姩鐨勭増鏈�
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		MysqlDataSource ods = new MysqlDataSource();
		  ods.setURL("jdbc:mysql://localhost:3308/webcrm");
		  ods.setUser("root");
		  ods.setPassword("123456");
		  Connection conn = (Connection) ods.getConnection();
		  // Create Oracle DatabaseMetaData object
		  DatabaseMetaData meta = (DatabaseMetaData) conn.getMetaData();
		  // gets driver info:
		  System.out.println("JDBC driver version is " + meta.getDriverVersion());

	}

}
