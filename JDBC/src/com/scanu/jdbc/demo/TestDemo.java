package com.scanu.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.JdbcConnection;

public class TestDemo {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/anu";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url, username, password);
		Statement statement=connection.createStatement();
		String sql="insert into emp value"+
		"(1103,'kajo',83)";
		boolean cj=statement.execute(sql);
		System.out.println(cj);
		connection.close();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
