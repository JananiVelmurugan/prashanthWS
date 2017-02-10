package com.janani.urbanapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public static Connection getConnection() throws Exception  {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/urban_db";
		String user = "root";
		String password = "password";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
