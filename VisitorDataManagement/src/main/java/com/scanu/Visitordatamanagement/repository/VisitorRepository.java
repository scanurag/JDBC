package com.scanu.Visitordatamanagement.repository;

import java.sql.Date;
import java.util.List;

import com.scanu.Visitordatamanagement.dto.Visitor;

public interface VisitorRepository {
	public String saveVisitor(Visitor visitor);

	   public String updateVisitor(Visitor visitor);

	   public Visitor getVisitorById(int id);

	   public Visitor getVisitorByPhone(String phone);

	   public Visitor getVisitorByEmail(String email);

	   public List<Visitor> getallVisitors();

	   public List<Visitor> getVisitorByVisitingData(Date date);

	   public Visitor deleteVisitorById(int id);
}
