package DynmicCrud1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class AlternetConnection {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/anu";
		Properties  properties=new Properties();
		properties.setProperty("user","root");
		properties.setProperty("password","root");
		Connection con=DriverManager.getConnection(url, properties);
		System.out.println("connected");
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
