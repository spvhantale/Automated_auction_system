package com.swapnil.dao;

import com.swapnil.bean.Admin;

public interface AdminDao {

	public String registerAdmin(String aname, String amail, String amobile, String apassword);
	
	public String registerAdmin(Admin admin);
	
	
}
