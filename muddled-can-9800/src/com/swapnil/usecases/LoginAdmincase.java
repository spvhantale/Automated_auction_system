package com.swapnil.usecases;

import java.util.Scanner;

import com.swapnil.bean.Admin;
import com.swapnil.dao.AdminDao;
import com.swapnil.dao.AdminDaoImpl;
import com.swapnil.exception.AdminException;

public class LoginAdmincase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the username");

		String username=sc.next();
		
		System.out.println("Enter the password");
		
		String password=sc.next();
		
		AdminDao ad=new AdminDaoImpl();
		
		try {
			Admin admin=ad.loginAdmin(username, password);
			
			System.out.println("Successfully login "+admin.getAname());
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
}
