package com.swapnil.bean;

import java.sql.Date;

public class SellProductDTO {

	private int spno;
	private String spname;
	private String spcategory;
	private int spprice;
	private Date startingDate;
	private Date endDate;
	
	
	
	public SellProductDTO() {
		super();
	}



	public SellProductDTO(int spno, String spname, String spcategory, int spprice, Date startingDate, Date endDate) {
		super();
		this.spno = spno;
		this.spname = spname;
		this.spcategory = spcategory;
		this.spprice = spprice;
		this.startingDate = startingDate;
		this.endDate = endDate;
	}



	public int getSpno() {
		return spno;
	}



	public void setSpno(int spno) {
		this.spno = spno;
	}



	public String getSpname() {
		return spname;
	}



	public void setSpname(String spname) {
		this.spname = spname;
	}



	public String getSpcategory() {
		return spcategory;
	}



	public void setSpcategory(String spcategory) {
		this.spcategory = spcategory;
	}



	public int getSpprice() {
		return spprice;
	}



	public void setSpprice(int spprice) {
		this.spprice = spprice;
	}



	public Date getStartingDate() {
		return startingDate;
	}



	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	@Override
	public String toString() {
		return "SellProductDTO [spno=" + spno + ", spname=" + spname + ", spcategory=" + spcategory + ", spprice="
				+ spprice + ", startingDate=" + startingDate + ", endDate=" + endDate + "]";
	}
	
	
	
	
}
