package com.scanu.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
public class TestDelete {
public static void main(String[] args) {
 try {
	Driver div=new Driver();
	String url="jdbc:mysql://localhost:3306/anu";
	String username="root";
	String Password="root";
	Connection connection=DriverManager.getConnection(url, username, Password);
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
