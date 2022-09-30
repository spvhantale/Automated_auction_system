package com.swapnil.dao;

import com.swapnil.bean.Seller;
import com.swapnil.exception.SellerException;

public interface SellerDao {
	
	public String registerSeller(Seller seller);
	
	public Seller loginSeller (String username,String password) throws SellerException;
	
	
}
