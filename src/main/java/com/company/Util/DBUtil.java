package com.company.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtil {
	private static final String url ="jdbc:mysql://localhost:3306/databasename";
	private static final String username = "Username";
	private static final String password = "Enter Database password";
	
	static {
		try {
			//Load the Mysql jdbc Driver
			Class.forName("com.mysql.cj.jdbc.Driver");	
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		
		System.out.println("Connection Created");
		return DriverManager.getConnection(url,username,password);
		
	}

}

