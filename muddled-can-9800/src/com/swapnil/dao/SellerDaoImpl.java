package com.swapnil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.swapnil.bean.Seller;
import com.swapnil.utality.DUtil;

public class SellerDaoImpl implements SellerDao{

	@Override
	public String registerSeller(Seller seller) {
		// TODO Auto-generated method stub
		
		String message="Not register";
		
		try(Connection conn=DUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("insert into seller(bname,bmail,bmobile,bpassword) values(?,?,?,?)");
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

}
