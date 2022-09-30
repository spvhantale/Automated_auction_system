package com.swapnil.main;

import java.util.Scanner;

import com.swapnil.usecases.LoginAdmincase;
import com.swapnil.usecases.RegisterAdmincase;

public class SelectionOption1 {

	public static Scanner sc=new Scanner(System.in);
	
	public static void selectionchoice() {
		System.out.println("Select the User"+"\n"+"1.Admin"+"\n"+"2.Seller"+"\n"+"3.Buyer"+"\n"+"4.Exit");
	
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceadmin();
			break;
			
		}
	}
	public void selectionChoiceadmin() {
		
		System.out.println("Select the option"+"\n"+"1.Admin Login"+"\n"+"2.Register Admin");
	
		int n=sc.nextInt();
		
		switch(n) {
			
		case 1:
			LoginAdmincase.login();
			
			break;
			
		case 2:
			
			RegisterAdmincase rac=new RegisterAdmincase();
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceadmin();
			
			break;
		}	
	}
}
