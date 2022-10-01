package com.swapnil.usecases;


import java.util.Scanner;

import com.swapnil.bean.Buyer;
import com.swapnil.dao.BuyerDao;
import com.swapnil.dao.BuyerDaoImpl;
import com.swapnil.exception.BuyerException;


public class LoginBuyercase {
	public static Buyer buyer=null; 
	public static void loginBuyer() {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the username");
	String username=sc.next();
	
	System.out.println("Enter the password");
	String password=sc.next();
		
	
	BuyerDao bu=new BuyerDaoImpl();
	
	try {
		buyer=bu.loginBuyer(username, password);
		System.out.println("login Successfully "+buyer.getBname());
		
	} catch (BuyerException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
		
	
		
	}

}
