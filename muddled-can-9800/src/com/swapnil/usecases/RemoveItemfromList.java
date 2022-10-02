package com.swapnil.usecases;

import java.util.Scanner;

import com.swapnil.dao.SellerDao;
import com.swapnil.dao.SellerDaoImpl;
import com.swapnil.exception.SellerProductException;

public class RemoveItemfromList {
	public static int sellerid;
	public static void removeItem() {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Sell product number");
		int spno=sc.nextInt();
		
		SellerDao seller=new SellerDaoImpl();
		
		try {
			String message=seller.deleteItem(spno, sellerid);
			System.out.println(message);
		} catch (SellerProductException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
