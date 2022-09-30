package com.swapnil.usecases;

import java.util.Scanner;

import com.swapnil.bean.Seller;
import com.swapnil.dao.BuyerDao;
import com.swapnil.dao.BuyerDaoImpl;
import com.swapnil.dao.SellerDao;
import com.swapnil.dao.SellerDaoImpl;
import com.swapnil.exception.BuyerException;
import com.swapnil.exception.SellerException;

public class LoginSellercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the username");

		String username=sc.next();
		
		System.out.println("Enter the password");
		
		String password=sc.next();
		
		SellerDao se=new SellerDaoImpl();
		
		try {
			Seller seller=se.loginSeller(username, password);
			
			System.out.println("Login successfully "+seller.getSname());
		} catch (SellerException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		
		
		
	}

}
