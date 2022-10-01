package com.swapnil.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.swapnil.bean.Buyer;
import com.swapnil.bean.BuyerProoduct;
import com.swapnil.bean.SellProductAndSellerDTO;
import com.swapnil.bean.SellProductDTO;
import com.swapnil.bean.SellerProduct;

import com.swapnil.exception.BuyerException;
import com.swapnil.exception.SellerException;
import com.swapnil.exception.SellerProductException;
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
			String bmail=rs.getString("bmail");
			String bmobile=rs.getString("bmobile");
			String bpassword=rs.getString("bpassword");
			String bpass="*****";
			buyer=new Buyer(bid, bname, bmail, bmobile, bpass);
			
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

	@Override
	public List<SellProductDTO> showProductbyCategory(String spcategory) throws SellerProductException {
		List<SellProductDTO> list=new ArrayList();
		
		Connection conn=DUtil.provideConnection();
		
		try {
		PreparedStatement ps=conn.prepareStatement("select spno,spname,spcategory, spprice,startingdate,enddate from sellproduct where spcategory=?");
		ps.setString(1, spcategory);
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()) {
		
		int spno=rs.getInt("spno");
		String spname=rs.getString("spname");
		String spcategory1=rs.getString("spcategory");
		int spprice=rs.getInt("spprice");
		Date startingDate=rs.getDate("startingdate");
		Date endDate=rs.getDate("enddate");
		
		SellProductDTO sell=new SellProductDTO(spno, spname, spcategory1, spprice, startingDate, endDate);
		list.add(sell);
	}
	if(list.size()==0) {
		throw new SellerProductException("List is empty");
	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SellerProductException("Invalid sellproduct");
		}
		
		return list;
	}

	@Override
	public List<SellProductAndSellerDTO> showProductAndSellerbyCategory(String spcategory)
			throws SellerProductException, SellerException {
		List<SellProductAndSellerDTO> list=new ArrayList<>();
		
		try (Connection conn=DUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select s.sid,s.sname,sp.spno,sp.spname,sp.spcategory,sp.spprice,sp.spquantity,sp.availability,sp.startingdate,sp.enddate from seller s INNER JOIN sellproduct sp ON s.sid=sp.sellerid AND sp.spcategory=?");
			
		ps.setString(1, spcategory);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			int sid=rs.getInt("sid");
			String sname=rs.getString("sname");
			int spno=rs.getInt("spno");
			String spname=rs.getString("spname");
			String spcategory1=rs.getString("spcategory");
			int spprice=rs.getInt("spprice");
			int spquantity=rs.getInt("spquantity");
			boolean availability=rs.getBoolean("availability");
			Date startingdate=rs.getDate("startingdate");
			Date enddate=rs.getDate("enddate");
			
			SellProductAndSellerDTO sep=new SellProductAndSellerDTO(sid, sname, spno, spname, spcategory1, spprice, spquantity, availability, startingdate, enddate);
			list.add(sep);
		}
			
		if(list.size()==0) {
			throw new  SellerProductException("not available");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SellerProductException(e.getMessage());
		}
		
		return list;
	}

}
