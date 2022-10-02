package com.swapnil.usecases;

import java.util.Scanner;

import com.swapnil.dao.SellerDao;
import com.swapnil.dao.SellerDaoImpl;
import com.swapnil.exception.SellerProductException;

public class UpdateSellerProductbyQuantity {
	public static int sellerid;
	public static void updateSellerqunatity() {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product number");
		int spno=sc.nextInt();
		
		System.out.println("Enter the Product quantity");
		int quantity=sc.nextInt();
		
		SellerDao seller=new SellerDaoImpl();
		
		try {
			String message=seller.updateQuantity(quantity, spno,sellerid);
			System.out.println(message);
		} catch (SellerProductException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
