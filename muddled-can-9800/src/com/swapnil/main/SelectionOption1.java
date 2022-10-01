package com.swapnil.main;

import java.util.Scanner;

import com.swapnil.bean.Admin;
import com.swapnil.bean.Buyer;
import com.swapnil.bean.Seller;
import com.swapnil.usecases.InsertSellproduct;
import com.swapnil.usecases.LoginAdmincase;
import com.swapnil.usecases.LoginBuyercase;
import com.swapnil.usecases.LoginSellercase;
import com.swapnil.usecases.RegisterAdmincase;
import com.swapnil.usecases.RegisterBuyercase;
import com.swapnil.usecases.RegisterSellercase;
import com.swapnil.usecases.RemoveItemfromList;
import com.swapnil.usecases.UpdateSellerProductbyPrice;
import com.swapnil.usecases.UpdateSellerProductbyQuantity;
import com.swapnil.usecases.ViewRegisterBuyerList;
import com.swapnil.usecases.ViewRegisterSellerList;

public class SelectionOption1 {
	Admin admin;
	Seller seller;
	Buyer buyer;
	public static Scanner sc=new Scanner(System.in);
	
	public static void selectionchoice() {
		System.out.println("Select the User"+"\n"+"1.Admin"+"\n"+"2.Seller"+"\n"+"3.Buyer"+"\n"+"4.Exit");
	
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			SelectionOption1 a=new SelectionOption1();
			a.selectionChoiceadmin();
			break;
		case 2:
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceseller();
			break;
		case 3:
			SelectionOption1 b=new SelectionOption1();
			b.selectionChoiceBuyer();
			break;
		case 4:
			System.out.println("Thank you");
			sc.close();
			break;
		}
	}
	public void selectionChoiceadmin() {
		
		System.out.println("Select the option"+"\n"+"1.Admin Login"+"\n"+"2.Register Admin");
	
		int n=sc.nextInt();
		
		switch(n) {
			
		case 1:
			LoginAdmincase.login();
			admin=LoginAdmincase.admin;
			if(admin!=null) {
				selectionChoiceAfterAdmin();
			}else {
				selectionChoiceadmin();
			}
			break;
			
		case 2:
			RegisterAdmincase.registerAdmin();
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceadmin();
			break;
			
		
			
		}	
	}
	public void selectionChoiceseller() {
		
		System.out.println("Select the option"+"\n"+"1.Seller Login"+"\n"+"2.Register Seller");
		
		int n=sc.nextInt();
		
		switch(n) {
			
		case 1:
			LoginSellercase.loginSeller();
			seller=LoginSellercase.seller;
			if(seller!=null) {
				selectionChoiceAfterSeller();
			}else {
				selectionChoiceseller();
			}
			break;
			
		case 2:
			RegisterSellercase.registerSeller();;
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceseller();
			break;
		
	}
	
	}
	
public void selectionChoiceBuyer() {
		
		System.out.println("Select the option"+"\n"+"1.Buyer Login"+"\n"+"2.Register Buyer");
		
		int n=sc.nextInt();
		
		switch(n) {
			
		case 1:
			LoginBuyercase.loginBuyer();
			buyer=LoginBuyercase.buyer;
			if(buyer!=null) {
				System.out.println(buyer);
			}else {
				selectionChoiceBuyer();
			}
			break;
			
		case 2:
			RegisterBuyercase.registerBuyer();
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceBuyer();
			break;
		
	}
	}

	public void selectionChoiceAfterAdmin() {
		
		
		System.out.println("Select the option"+"\n"+"1.List of Buyer"+"\n"+"2.List of Seller"+"\n"+"3.Exit");
		int x=sc.nextInt();
		switch(x) {
		
		case 1:
			ViewRegisterBuyerList.listBuyer();
			selectionChoiceAfterAdmin();
			break;
		case 2: 
			ViewRegisterSellerList.viewSellerList();
			selectionChoiceAfterAdmin();
			break;
		case 3:
			selectionchoice();
			break;
		}
	}
	
	public void selectionChoiceAfterSeller() {
		
		System.out.println("Select the option"+"\n"+"1.Add item to sell"+"\n"+"2.Update Item price "+"\n"+"3.Update Item qunatity"+"\n"+"4.Delete items from list"+"\n"+"5.exit");
		
		int y=sc.nextInt();
		switch(y) {
		case 1:
			InsertSellproduct.sellerid=seller.getSid();
			InsertSellproduct.InsertItemtoSell();
			System.out.println("********");
			selectionChoiceAfterSeller();
			break;
		case 2:
			UpdateSellerProductbyPrice.sellerid=seller.getSid();
			UpdateSellerProductbyPrice.updateSellerprice();
			selectionChoiceAfterSeller();
			break;
		case 3:
			UpdateSellerProductbyPrice.sellerid=seller.getSid();
			UpdateSellerProductbyQuantity.updateSellerqunatity();
			selectionChoiceAfterSeller();
			break;
		case 4:
			RemoveItemfromList.sellerid=seller.getSid();
			RemoveItemfromList.removeItem();
			selectionChoiceAfterSeller();
			break;
		case 5:
			selectionchoice();
			break;
		
		}
		
	}

}
