package DynmicCrud1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class TestUpdate {
public static void main(String[] args) {
	try {
		Driver driver=new Driver();
		String url="jdbc:mysql://localhost:3306/anu?user=root&password=root";
	    String user="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url);
		System.out.println("connection");
		String sql="UPDATE person SET name=?,age=?,email=? where  idPerson=?";
		PreparedStatement state=connection.prepareStatement(sql);
		state.setString(1, "Acnur");
		state.setInt(2, 19);
		state.setString(3, "scau444gj@gmail.com");
		state.setInt(4, 205);
		int res=state.executeUpdate();
		System.out.println(res);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
