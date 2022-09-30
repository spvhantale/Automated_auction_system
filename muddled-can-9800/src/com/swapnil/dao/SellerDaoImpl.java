package com.swapnil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.swapnil.bean.Seller;
import com.swapnil.exception.SellerException;
import com.swapnil.utality.DUtil;

public class SellerDaoImpl implements SellerDao{

	@Override
	public String registerSeller(Seller seller) {
		// TODO Auto-generated method stub
		
		String message="Not register";
		
		try(Connection conn=DUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("insert into seller(sname,smail,smobile,spassword) values(?,?,?,?)");
			ps.setString(1, seller.getSname());
			ps.setString(2, seller.getSmail());
			ps.setString(3, seller.getSmobile());
			ps.setString(4, seller.getSpassword());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="register Succesfully";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public Seller loginSeller(String username, String password) throws SellerException {
		// TODO Auto-generated method stub
		Seller seller=null;
		
		
	 try(Connection conn=DUtil.provideConnection()) {
		PreparedStatement ps=conn.prepareStatement("select * from seller where smail=? AND spassword=?");
			
		ps.setString(1,username);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			
			int sid=rs.getInt("sid");
			String sname=rs.getString("sname");
			String smail=rs.getString("smail");
			String smobile=rs.getString("smobile");
			String spassword=rs.getString("smobile");
			
			seller=new Seller(sid, sname, smail, smobile, spassword);
		}else {
			throw new SellerException("Invalid username or password");
		}
	 
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		throw new SellerException(e.getMessage());
	}
		return seller;
	}

}
