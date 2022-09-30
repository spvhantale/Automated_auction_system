package com.swapnil.dao;

import com.swapnil.bean.Buyer;
import com.swapnil.bean.BuyerProoduct;
import com.swapnil.exception.BuyerException;
import com.swapnil.exception.SellerException;

public interface BuyerDao {
	
	public String registerBuyer(Buyer buyer);
	
	public Buyer loginBuyer(String username,String password) throws BuyerException;
	
	public String BuyProduct(BuyerProoduct bp) throws BuyerException ,SellerException;
	
	
}
