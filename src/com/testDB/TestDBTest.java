package com.testDB;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestDBTest {

	public static void main(String[] args) {
		String user = "root";
		String pass = "root";
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		// get connection to database
		try {
			System.out.println("connect to " + jdbcUrl);
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("connected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
