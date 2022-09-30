package com.swapnil.usecases;

import java.util.Scanner;

import com.swapnil.bean.Seller;
import com.swapnil.dao.SellerDao;
import com.swapnil.dao.SellerDaoImpl;

public class RegisterSellercase {

	public static void main(String[] args) {
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
		
		SellerDao seller=new SellerDaoImpl();
		
		Seller s=new Seller();
		
		s.setSname(name);
		s.setSmail(email);
		s.setSmobile(mobile);
		s.setSpassword(password);
		
		String message=seller.registerSeller(s);
		
		System.out.println(message);
		
	}

}
