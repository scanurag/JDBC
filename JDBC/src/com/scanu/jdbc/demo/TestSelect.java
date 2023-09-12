package com.scanu.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestSelect {
	public static void main(String[] args) {
		 try {
			Driver div=new Driver();
			String url="jdbc:mysql://localhost:3306/anu";
			String username="root";
			String Password="root";
			Connection connection=DriverManager.getConnection(url, username, Password);
			Statement statement=connection.createStatement();
			String sql="SELECT * FROM person";
			boolean res= statement.execute(sql);
			ResultSet rs=statement.getResultSet();

			while(rs.next())

			{

				System.out.println(rs.getInt(1));

				System.out.println(rs.getString(2));

				System.out.println(rs.getObject(3));

				System.out.println(rs.getObject(4));

				System.out.println(rs.getObject(5));

                System.out.println("*************************");

			}

			System.out.println(rs);

		} catch ( SQLException e) {
			e.printStackTrace();
		}
}
}