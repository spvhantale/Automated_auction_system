package com.swapnil.dao;

import com.swapnil.bean.Buyer;
import com.swapnil.exception.BuyerException;

public interface BuyerDao {
	
	public String registerBuyer(Buyer buyer);
	
	public Buyer loginBuyer(String username,String password) throws BuyerException;
	
}
