package com.swapnil.usecases;

import java.util.List;
import java.util.Scanner;

import com.swapnil.bean.SellProductDTO;
import com.swapnil.dao.BuyerDao;
import com.swapnil.dao.BuyerDaoImpl;
import com.swapnil.exception.SellerProductException;

public class SearchAndViewSellProduct {

	public static void searchAndViewProduct() {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the category");
		String cat=sc.next();
		
		BuyerDao buyer=new BuyerDaoImpl();
		try {
			List<SellProductDTO> list=buyer.showProductbyCategory(cat);
			list.forEach(s->System.out.println(s));
			
		} catch (SellerProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
