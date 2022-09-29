package com.swapnil.main;

import java.util.Scanner;

import com.swapnil.bean.Admin;
import com.swapnil.dao.AdminDao;
import com.swapnil.dao.AdminDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Admin name");
		
		String name=sc.next();
		System.out.println("Enter the Admin Email");
		String email=sc.next();
		
System.out.println("Enter the Mobile Number");
		
		String mobile=sc.next();
System.out.println("Enter the Admin Password");
		
		String password=sc.next();

		Admin ad=new Admin();
		
		ad.setAmail(email);
		ad.setAname(name);
		ad.setAmobile(mobile);
		ad.setApassword(password);
		
		AdminDao a=new AdminDaoImpl();
		
		String b=a.registerAdmin(ad);
		System.out.println(b);
	}

}
