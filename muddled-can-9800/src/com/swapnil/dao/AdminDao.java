package com.swapnil.dao;

import com.swapnil.bean.Admin;
import com.swapnil.exception.AdminException;

public interface AdminDao {
	
	public String registerAdmin(Admin admin);
	
	public Admin loginAdmin(String username ,String password) throws AdminException;
	
	
}
