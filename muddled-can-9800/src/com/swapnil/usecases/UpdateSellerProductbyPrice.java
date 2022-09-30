package com.swapnil.usecases;

import java.util.Scanner;

import com.swapnil.dao.SellerDao;
import com.swapnil.dao.SellerDaoImpl;
import com.swapnil.exception.SellerProductException;

public class UpdateSellerProductbyPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product number");
		int spno=sc.nextInt();
		
		System.out.println("Enter the Product price");
		int price=sc.nextInt();
		
		SellerDao seller=new SellerDaoImpl();
		
		try {
			String message=seller.updatePrice(price, spno);
			System.out.println(message);
		} catch (SellerProductException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
