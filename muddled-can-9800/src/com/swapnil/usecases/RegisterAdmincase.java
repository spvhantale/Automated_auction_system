package com.swapnil.usecases;

import java.util.Scanner;

import com.swapnil.bean.Admin;
import com.swapnil.dao.AdminDao;
import com.swapnil.dao.AdminDaoImpl;

public class RegisterAdmincase {

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
		
		
		AdminDao admin=new AdminDaoImpl();
		
		Admin a=new Admin();
		
		a.setAname(name);
		a.setAmail(email);
		a.setAmobile(mobile);
		a.setApassword(password);
		
		String message=admin.registerAdmin(a);

		System.out.println(message);
	}

}
