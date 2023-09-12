package com.scanu.Visitordatamanagement.repository;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.scanu.Visitordatamanagement.dto.Visitor;
import com.scanu.Visitordatamanagement.util.AppConstants;
import com.scanu.Visitordatamanagement.util.ConnectionUtil;
public class VisitorReopsitoryImp implements VisitorRepository{

	@Override
	public String saveVisitor(Visitor visitor) {
		Connection connection=ConnectionUtil.getConnection();
		String sql="INSERT INTO visitor (name,email,visited_date,phone)VALUES(?,?,?,?)";
		try {

			PreparedStatement sc=connection.prepareStatement(sql);

			sc.setString(1, visitor.getName());

			sc.setString(2, visitor.getEmail());

			sc.setDate(3, visitor.getVisitedDate());

			sc.setString(4, visitor.getPhone());

			sc.executeUpdate();

			connection.close();
			
			return AppConstants.SUCCESS_MESSAGE;

	} catch (Exception e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

	}
		
		return AppConstants.ERROR_MESSAGE;
	}

	@Override
	public String updateVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getVisitorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getVisitorByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getVisitorByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> getallVisitors() {
		Connection connection=ConnectionUtil.getConnection();

		List<Visitor> list=null;

		String sql="SELECT * FROM visitor";

		try {

			PreparedStatement ps=connection.prepareStatement(sql);

			ResultSet rs=ps.executeQuery();

			if(rs.isBeforeFirst())

			{

				list=new ArrayList<>();

				while(rs.next())

				{

					Visitor visitor=new Visitor();

					visitor.setId(rs.getInt("id"));

					visitor.setName(rs.getString("name"));

					visitor.setEmail(rs.getString("email"));

					visitor.setVisitedDate(rs.getDate("visited_date"));

					visitor.setPhone(rs.getString("phone"));

					list.add(visitor);
				}
			}
			
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Visitor> getVisitorByVisitingData(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor deleteVisitorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
