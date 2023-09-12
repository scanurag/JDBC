package DynmicCrud1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 import com.mysql.cj.jdbc.Driver;
public class TEST {
public static void main(String[] args) {
	try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/anu?user=root&password=root";
	    String user="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url);
		System.out.println("connection");
		String sql="INSERT INTO person VALUES(?,?,?,?,?)";
		PreparedStatement state=connection.prepareStatement(sql);
		state.setInt(1, 205);
		state.setString(2, "Anurag");
		state.setInt(3, 23);
		state.setString(4, "scanuragkj@gmail.com");
		state.setInt(5, 734020);
		int res=state.executeUpdate();
		System.out.println(res);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
