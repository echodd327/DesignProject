package com.xiu.test.factory2;

import java.sql.*;

public class JDBCSample {
	
	public static void main(java.lang.String[] args) {
		try {
			// 这里加载驱动
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to load Driver Class");
			return;
		}
		try {
			// 所有的驱动都必需使用try/catch块来接收异常
			// 必需指定 数据库URL, 用户名, 密码
			Connection con = DriverManager.getConnection("jdbc:odbc:companydb","", "");
			// 创建一个可执行的SQL描述
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT FIRST_NAME FROM EMPLOYEES");
			// 显示SQL结果
			while (rs.next()) {
				System.out.println(rs.getString("FIRST_NAME"));
			}
			// 释放数据库资源
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException se) {
			// 输出数据库连接错误信息
			System.out.println("SQL Exception: " + se.getMessage());
			se.printStackTrace(System.out);
		}
	}
}