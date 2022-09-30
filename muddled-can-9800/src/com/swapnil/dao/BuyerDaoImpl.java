package com.swapnil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.swapnil.bean.Buyer;
import com.swapnil.bean.BuyerProoduct;
import com.swapnil.exception.BuyerException;
import com.swapnil.exception.SellerException;
import com.swapnil.utality.DUtil;

public class BuyerDaoImpl implements BuyerDao{

	@Override
	public String registerBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		
		String message="Not register";
		
		Connection conn=DUtil.provideConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("insert into buyer(bname,bmail,bmobile,bpassword) values(?,?,?,?)");
				
			ps.setString(1, buyer.getBname());
			ps.setString(2, buyer.getBmail());
			ps.setString(3, buyer.getBmobile());
			ps.setString(4, buyer.getBpassword());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="register successfully";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public Buyer loginBuyer(String username, String password) throws BuyerException {
		// TODO Auto-generated method stub
		
		Buyer buyer=null;
		
		Connection conn=DUtil.provideConnection();
		
	try {
		PreparedStatement ps=conn.prepareStatement("select * from buyer where bmail=? AND bpassword=?");
	
		ps.setString(1, username);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
	
		if(rs.next()) {
			int bid=rs.getInt("bid");
			String bname=rs.getString("bname");
			String bmail=rs.getString("bname");
			String bmobile=rs.getString("bname");
			String bpassword=rs.getString("bname");
			
			buyer=new Buyer(bid, bname, bmail, bmobile, bpassword);
			
		}else {
			throw new BuyerException("Inavlid username or password");
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	throw new BuyerException(e.getMessage());
	}
		
		
		return buyer;
	}

	@Override
	public String BuyProduct(BuyerProoduct bp) throws BuyerException, SellerException {
		// TODO Auto-generated method stub
		
		String message="Not inserted";
		
		Connection conn=DUtil.provideConnection();
		
	try {
		PreparedStatement	ps=conn.prepareStatement("insert into buyerproduct(bid,spno,minprice,buydate,bpcategory) values(?,?,?,?,?)");
	
		ps.setInt(1, bp.getBid());
		ps.setInt(2,bp.getSpno());
		ps.setInt(3, bp.getMinprice());
		ps.setDate(4, bp.getBuydate());
		ps.setString(5, bp.getBpcategory());
		
		int x=ps.executeUpdate();
		
		if(x>0) {
			message="Inserted";
		}else {
			
			throw new BuyerException("Not available");
		}
	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		message=e.getMessage();
	}
		
		return message;
	}

}
