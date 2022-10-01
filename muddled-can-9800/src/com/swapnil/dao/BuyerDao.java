package com.swapnil.dao;

import java.util.List;

import com.swapnil.bean.Buyer;
import com.swapnil.bean.BuyerProoduct;
import com.swapnil.bean.SellProductAndSellerDTO;
import com.swapnil.bean.SellProductDTO;
import com.swapnil.bean.SellerProduct;
import com.swapnil.exception.BuyerException;
import com.swapnil.exception.SellerException;
import com.swapnil.exception.SellerProductException;

public interface BuyerDao {
	
	public String registerBuyer(Buyer buyer);
	
	public Buyer loginBuyer(String username,String password) throws BuyerException;
	
	public String BuyProduct(BuyerProoduct bp) throws BuyerException ,SellerException;
	
	public List<SellProductDTO> showProductbyCategory(String spcategory) throws SellerProductException;
	
	public List<SellProductAndSellerDTO> showProductAndSellerbyCategory(String spcategory) throws SellerProductException,SellerException;

}
