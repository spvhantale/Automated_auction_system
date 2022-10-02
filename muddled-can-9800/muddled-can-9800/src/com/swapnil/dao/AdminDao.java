package com.swapnil.dao;

import java.util.List;

import com.swapnil.bean.Admin;
import com.swapnil.bean.Buyer;
import com.swapnil.bean.Seller;
import com.swapnil.exception.AdminException;
import com.swapnil.exception.BuyerException;
import com.swapnil.exception.SellerException;

public interface AdminDao {
	
	public String registerAdmin(Admin admin);
	
	public Admin loginAdmin(String username ,String password) throws AdminException;
	
	public List<Seller> viewSellerList() throws SellerException;
	public List<Buyer> viewBuyerList() throws BuyerException;
	
}
