package com.swapnil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.swapnil.bean.Admin;
import com.swapnil.utality.DUtil;

public class AdminDaoImpl implements AdminDao{


	@Override
	public String registerAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String massage ="Not register";
		
		
		
		try(Connection conn=DUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("insert into admin(aname,amail,amobile,apassword) values(?,?,?,?)");
			
			ps.setString(1, admin.getAname());
			ps.setString(2, admin.getAmail());
			ps.setString(3, admin.getAmobile());
			ps.setString(4, admin.getApassword());
			
			int x=ps.executeUpdate();
			if(x>0) {
				massage="Register Successfully";
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			massage=e.getMessage();
		}
		
		
		return massage;
	}

}
