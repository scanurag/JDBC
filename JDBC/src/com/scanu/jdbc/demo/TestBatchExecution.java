package com.scanu.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBatchExecution {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/anu";
			String user="root";
			String password="root";
			Connection	connection=DriverManager.getConnection(url,user,password);
			Statement statement= connection.createStatement();
			String sql="insert into person value"+
			"(987'scnurag20',67885,'121anuragsaikumar13@gami.com',088777776)";
			String  update="UPDATE person SET name='ABCd' WHERE name='scnurag20'";
			statement.addBatch(sql);
			statement.addBatch(update);
			int[] batch=statement.executeBatch();
			for(Integer a: batch) System.out.println(a);
			connection.close();
			//System.out.println("Connected");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
