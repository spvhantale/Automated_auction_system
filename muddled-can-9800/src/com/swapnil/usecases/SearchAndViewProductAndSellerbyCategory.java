package com.swapnil.usecases;

import java.util.List;
import java.util.Scanner;

import com.swapnil.bean.SellProductAndSellerDTO;
import com.swapnil.dao.BuyerDao;
import com.swapnil.dao.BuyerDaoImpl;
import com.swapnil.exception.SellerException;
import com.swapnil.exception.SellerProductException;

public class SearchAndViewProductAndSellerbyCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the category");
		
		String cat=sc.next();

		BuyerDao buy=new BuyerDaoImpl();
		
		try {
			List<SellProductAndSellerDTO> list= buy.showProductAndSellerbyCategory(cat);
			list.forEach(s->System.out.println(s));
		} catch (SellerProductException | SellerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
