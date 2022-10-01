package com.swapnil.usecases;

import java.util.List;

import com.swapnil.bean.Buyer;
import com.swapnil.bean.Seller;
import com.swapnil.dao.AdminDao;
import com.swapnil.dao.AdminDaoImpl;
import com.swapnil.exception.BuyerException;
import com.swapnil.exception.SellerException;

public class ViewRegisterSellerList {

	public static void viewSellerList() {
		// TODO Auto-generated method stub
		
		
		AdminDao admin=new AdminDaoImpl();
		
		try {
			List<Seller>list=admin.viewSellerList();
			
			list.forEach(s->System.out.println(s));
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	}


