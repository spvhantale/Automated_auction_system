package com.swapnil.usecases;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.swapnil.bean.BuyerProoduct;
import com.swapnil.dao.BuyerDao;
import com.swapnil.dao.BuyerDaoImpl;
import com.swapnil.exception.BuyerException;
import com.swapnil.exception.SellerException;

public class Insertbuyerproduct {
	public static int bid;
	public static void insertBuyerProduct() {
		// TODO Auto-generated method stub
		
		
		String bpcategory="paint";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the min price");
		int bpprice=sc.nextInt();
		
		System.out.println("Enter the sellproduct number");
		int spno=sc.nextInt();
		
		System.out.println("Enter the buydate in yyyy-MM-dd");
		String da=sc.next();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate sdate=LocalDate.parse(da);
		Date spdate = Date.valueOf(sdate);
		
		BuyerProoduct buyerproduct=new BuyerProoduct();
		
		buyerproduct.setBid(bid);
		buyerproduct.setSpno(spno);
		buyerproduct.setBuydate(spdate);
		buyerproduct.setMinprice(bpprice);
		buyerproduct.setBpcategory(bpcategory);
		
		BuyerDao bpd=new BuyerDaoImpl();
		try {
			String message=bpd.BuyProduct(buyerproduct);
			System.out.println(message);
		} catch (BuyerException | SellerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	

}
