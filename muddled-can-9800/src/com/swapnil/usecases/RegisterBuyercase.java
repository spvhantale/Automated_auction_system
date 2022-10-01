package com.swapnil.usecases;

import java.util.Scanner;

import com.swapnil.bean.Buyer;
import com.swapnil.dao.BuyerDao;
import com.swapnil.dao.BuyerDaoImpl;

public class RegisterBuyercase {

	public static void registerBuyer() {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=sc.next();
		
		System.out.println("Enter the email");
		String email=sc.next();
		
		System.out.println("Enter the mobile");
		String mobile=sc.next();
		
		System.out.println("Enter the password");
		String password=sc.next();
		
		BuyerDao buyer=new BuyerDaoImpl();
		
		Buyer b=new Buyer();
		b.setBname(name);
		b.setBmail(email);
		b.setBmobile(mobile);
		b.setBpassword(password);
		
		String message=buyer.registerBuyer(b);
		
	System.out.println(message);	
	}

}
