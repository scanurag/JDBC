package com.scanu.Visitordatamanagement.repository;

import com.scanu.Visitordatamanagement.dto.Admin;

public interface AdminRepository {
public String saveAdmin(Admin admin);
public Admin adminLogin(String username,String password);
}
