package DynmicCrud1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.ResultSetMetaData;

public class ReadTableProperty {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/anu";
		FileInputStream fis=new FileInputStream("mydbinfo.properties");
		Properties  properties=new Properties();
		properties.load(fis);
		Connection con=DriverManager.getConnection(url, properties);
		System.out.println("connected");
		String sql="SELECT * FROM person";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		boolean next=rs.isBeforeFirst();
		ResultSetMetaData metaData=rs.getMetaData();
		int count= metaData.getColumnCount();
		System.out.println(next);
		while(rs.next()) {
			for(int i=1;i<=count;i++) {
				System.out.println(metaData.getCatalogName(i)+"data for table is"+rs.getObject(i));
			}
		}
		rs.close();
		ps.close();
	
		
	} catch (ClassNotFoundException | IOException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
