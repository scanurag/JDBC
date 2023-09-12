package DynmicCrud1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestMultiInsert {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/anu";
		String user="root";
		String password="root";
		Connection	connection=DriverManager.getConnection(url,user,password);
		String sql="INSERT INTO person VALUES(?,?,?,?,?)";
		PreparedStatement state=connection.prepareStatement(sql);
		state.setInt(1, 211110);
		state.setString(2, "Annbbbju");
		state.setInt(3, 2113);
		state.setString(4, "scanusbdjhragk@gmail.com");
		state.setInt(5, 73400020);
		state.addBatch();
		state.setInt(1, 19819280);
		state.setString(2, "scghjanu");
		state.setInt(3, 2277);
		state.setString(4, "scanvhjuk@gmail.com");
		state.setInt(5, 732000);
		state.addBatch();
		state.setInt(1, 33330);
		state.setString(2, "Akaaaaa");
		state.setInt(3, 90991);
		state.setString(4, "scaaasnurk@gmail.com");
		state.setInt(5, 824012220);
		state.addBatch();
		int[] batch=state.executeBatch();
		for(Integer a: batch) System.out.println(a);
		connection.close();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
