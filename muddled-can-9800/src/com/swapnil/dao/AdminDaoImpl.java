package com.swapnil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.swapnil.bean.Admin;
import com.swapnil.exception.AdminException;
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

	@Override
	public Admin loginAdmin(String username, String password) throws AdminException {
		Admin admin=null;
		
	try(Connection conn=DUtil.provideConnection()) {
		PreparedStatement ps=conn.prepareStatement("select * from admin where amail=? AND apassword=?");
		
		ps.setString(1, username);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
	
		if(rs.next()) {
			
			int id=rs.getInt("aid");
			String aname=rs.getString("aname");
			String amail=rs.getString("amail");
			String amobile=rs.getString("amobile");
			String apassword=rs.getString("apassword");
			
			admin=new Admin(id, aname, amail, amobile, apassword);
			
			
			
		}else {
			throw new AdminException("Invalid username or password...");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw new AdminException(e.getMessage());
	}
		return admin;
	}

}
