package com.aylnygt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl="jdbc:mysql://localhost:3306/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC ";
		String username="root";
		String password="";
		
		try {
			
			System.out.println("Connection to database:" +jdbcUrl);
			
			Connection myConn=DriverManager.getConnection(jdbcUrl,username,password);
			
			System.out.println("Connection successful");
			
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
