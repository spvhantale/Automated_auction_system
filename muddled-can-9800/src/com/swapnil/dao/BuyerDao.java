package com.swapnil.dao;

import com.swapnil.bean.Buyer;

public interface BuyerDao {

public String registerBuyer(String sname, String smail, String smobile, String spassword);
	
	public String registerBuyer(Buyer buyer);
}
