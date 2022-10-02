package com.swapnil.dao;

import com.swapnil.bean.Seller;

public interface SellerDao {

	
	public String registerSeller(String sname, String smail, String smobile, String spassword);
	
	public String registerSeller(Seller seller);
}
