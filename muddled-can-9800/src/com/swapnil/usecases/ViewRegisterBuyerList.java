package com.swapnil.usecases;

import java.util.List;

import com.swapnil.bean.Buyer;
import com.swapnil.dao.AdminDao;
import com.swapnil.dao.AdminDaoImpl;
import com.swapnil.exception.BuyerException;

public class ViewRegisterBuyerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDao admin=new AdminDaoImpl();
		
		try {
			List<Buyer>list=admin.viewBuyerList();
			
			list.forEach(s->System.out.println(s));
		} catch (BuyerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
