package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testjdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/dineshdb1?useSSL=false";
		String user = "root";
		String pass = "Dinesh@123";
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			Connection mycon = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("connection successful");
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		

	}

}
