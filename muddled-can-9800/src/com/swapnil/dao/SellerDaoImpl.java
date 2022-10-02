package com.swapnil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.swapnil.bean.Seller;
import com.swapnil.bean.SellerProduct;
import com.swapnil.exception.SellerException;
import com.swapnil.exception.SellerProductException;
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
			String spassword=rs.getString("spassword");
			String pass="********";
			
			seller=new Seller(sid, sname, smail, smobile, pass);
		}else {
			throw new SellerException("Invalid username or password");
		}
	 
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		throw new SellerException(e.getMessage());
	}
		return seller;
	}

	@Override
	public String addSelling(SellerProduct sp) throws SellerException {
		// TODO Auto-generated method stub
		
		String message="Not inserted";
		
		Connection conn=DUtil.provideConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("insert into sellproduct(spname,spcategory,spprice,spquantity,sellerid,availability,startingdate,enddate) value(?,?,?,?,?,?,?,?)");
			
			ps.setString(1, sp.getSpname());
			ps.setString(2, sp.getSpcategory());
			ps.setInt(3, sp.getSpprice());
			ps.setInt(4,sp.getSpquantity());
			ps.setInt(5,sp.getSllerid());
			ps.setBoolean(6, sp.isAvailability());
			ps.setDate(7, sp.getStartingdate());
			ps.setDate(8, sp.getEnddate());
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="inserted the sellproduct";
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		
		return message;
	}

	@Override
	public String updatePrice(int price, int spno,int sellerid) throws SellerProductException {
		// TODO Auto-generated method stub
		String message="Not Updated";
		
		Connection conn=DUtil.provideConnection();
		
	try {
		PreparedStatement	ps=conn.prepareStatement("update Sellproduct set spprice=? where spno=?");
			
		ps.setInt(1, price);
		ps.setInt(2,spno);
		
		int x=ps.executeUpdate();
		
		if(x>0) {
			message="Updated the price";
		}else {
			throw new SellerProductException("Invalid Product Number");
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		message=e.getMessage();
	}
		return message;
	}

	@Override
	public String updateQuantity(int quantity, int spno,int sellerid) throws SellerProductException {
		// TODO Auto-generated method stub
		
	String message="Not Updated";
		
		Connection conn=DUtil.provideConnection();
		
	try {
		PreparedStatement	ps=conn.prepareStatement("update Sellproduct set spquantity=? where spno=?");
			
		ps.setInt(1, quantity);
		ps.setInt(2,spno);
		
		int x=ps.executeUpdate();
		
		if(x>0) {
			message="Updated the quantity";
		}else {
			throw new SellerProductException("Invalid Product Number");
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		message=e.getMessage();
	}
		return message;
	}

	@Override
	public String deleteItem(int spno,int sellerid) throws SellerProductException {
		// TODO Auto-generated method stub
		
String message="Not Deleted";
		
		Connection conn=DUtil.provideConnection();
		
	try {
		PreparedStatement	ps=conn.prepareStatement("delete from sellproduct where  spno=? AND sellerid=?");
		
			
		ps.setInt(1, spno);
		ps.setInt(2,sellerid);
		
		int x=ps.executeUpdate();
		
		if(x>0) {
			message="Deleted the item";
		}else {
			throw new SellerProductException("Invalid Product Number");
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		message=e.getMessage();
	}
		return message;
		
		
	}

}
