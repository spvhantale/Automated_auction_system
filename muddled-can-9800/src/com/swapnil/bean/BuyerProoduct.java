package com.swapnil.bean;

import java.sql.Date;

public class BuyerProoduct {

	private int bpno;
	private int bid;
	private int spno;
	private int minprice;
	private Date buydate;
	private String bpcategory;
	
	
	
	public int getBpno() {
		return bpno;
	}



	public void setBpno(int bpno) {
		this.bpno = bpno;
	}



	public int getBid() {
		return bid;
	}



	public void setBid(int bid) {
		this.bid = bid;
	}



	public int getSpno() {
		return spno;
	}



	public void setSpno(int spno) {
		this.spno = spno;
	}



	public int getMinprice() {
		return minprice;
	}



	public void setMinprice(int minprice) {
		this.minprice = minprice;
	}



	public Date getBuydate() {
		return buydate;
	}



	public void setBuydate(Date buydate) {
		this.buydate = buydate;
	}



	public String getBpcategory() {
		return bpcategory;
	}



	public void setBpcategory(String bpcategory) {
		this.bpcategory = bpcategory;
	}



	public BuyerProoduct() {
		super();
	}



	public BuyerProoduct(int bpno, int bid, int spno, int minprice, Date buydate, String bpcategory) {
		super();
		this.bpno = bpno;
		this.bid = bid;
		this.spno = spno;
		this.minprice = minprice;
		this.buydate = buydate;
		this.bpcategory = bpcategory;
	}



	@Override
	public String toString() {
		return "BuyerProoduct [bpno=" + bpno + ", bid=" + bid + ", spno=" + spno + ", minprice=" + minprice
				+ ", buydate=" + buydate + ", bpcategory=" + bpcategory + "]";
	}
	
	

	
}
