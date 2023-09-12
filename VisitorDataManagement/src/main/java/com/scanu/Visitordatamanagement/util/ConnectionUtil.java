package com.scanu.Visitordatamanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {//it used to provide space for s
public static Connection getConnection() {

		try {
			Class.forName(AppConstants.DRIVER_NAME);
			return DriverManager.getConnection(AppConstants.URL,AppConstants.USER_NAME,AppConstants.PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

return null;	  
}
}
