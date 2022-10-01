package com.swapnil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.swapnil.bean.Admin;
import com.swapnil.bean.Buyer;
import com.swapnil.bean.Seller;
import com.swapnil.exception.AdminException;
import com.swapnil.exception.BuyerException;
import com.swapnil.exception.SellerException;
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
			
			String s="********";
			admin=new Admin(id, aname, amail, amobile, s);
			
			
			
		}else {
			throw new AdminException("Invalid username or password...");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw new AdminException(e.getMessage());
	}
		return admin;
	}

	@Override
	public List<Buyer> viewBuyerList() throws BuyerException{
		List<Buyer> list=new ArrayList<>();
		
		Connection conn=DUtil.provideConnection();
		
		try {
		PreparedStatement	ps=conn.prepareStatement("select * from buyer");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				int bid=rs.getInt("bid");
				String bname=rs.getString("bname");
				String bmail=rs.getString("bmail");
				String bmobile=rs.getString("bmobile");
				String bpassword=rs.getString("bpassword");
				
				Buyer b=new Buyer();
				
				b.setBid(bid);
				b.setBmail(bmail);
				b.setBmobile(bmobile);
				b.setBname(bname);
				b.setBpassword("*****");
				list.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BuyerException(e.getMessage());
		}
		if(list.size()==0) {
			throw new BuyerException("Not found ");
		}
		return list;
	}

	@Override
	public List<Seller> viewSellerList() throws SellerException {
	List<Seller> list=new ArrayList<>();
		
		Connection conn=DUtil.provideConnection();
		
		try {
		PreparedStatement	ps=conn.prepareStatement("select * from seller");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				int sid=rs.getInt("sid");
				String sname=rs.getString("sname");
				String smail=rs.getString("smail");
				String smobile=rs.getString("smobile");
				String spassword=rs.getString("spassword");
				
				Seller s=new Seller();
				
				s.setSid(sid);
				s.setSmail(smail);
				s.setSmobile(smobile);
				s.setSname(sname);
				s.setSpassword("*****");
				list.add(s);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SellerException(e.getMessage());
		}
		if(list.size()==0) {
			throw new SellerException("Not found ");
		}
		return list;
	}

}
