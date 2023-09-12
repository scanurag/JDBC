package com.scanu.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/anu";
		String user="root";
		String password="root";
		Connection	connection=DriverManager.getConnection(url,user,password);
		Statement statement= connection.createStatement();
		String sql="insert into person value"+
		"(1071,'scnurag20',615,'121anurag13@gami.com',2993173)";
		boolean res=statement.execute(sql);
		System.out.println(res);
		connection.close();
		//System.out.println("Connected");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
