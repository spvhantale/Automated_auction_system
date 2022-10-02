package com.swapnil.dao;

import com.swapnil.bean.Seller;
import com.swapnil.bean.SellerProduct;
import com.swapnil.exception.SellerException;
import com.swapnil.exception.SellerProductException;

public interface SellerDao {
	
	public String registerSeller(Seller seller);
	
	public Seller loginSeller (String username,String password) throws SellerException;
	
	public String addSelling(SellerProduct sp) throws SellerException;
	
	public String updatePrice(int price,int spno,int sellerid) throws SellerProductException;
	
	public String updateQuantity(int quantity,int spno,int sellerid) throws SellerProductException;
	
	public String deleteItem(int spno,int sellerid) throws SellerProductException;
	
	
	
}
