package com.swapnil.bean;

import java.sql.Date;

public class SellProductAndSellerDTO {

	private int sid;
	private String sname;
	private int spno;
	private String spname;
	private String spcategory;
	private int spprice;
	private int spquantity;
	private boolean availability;
	private Date startingdate;
	private Date enddate;
	
	
	
	
	
	public SellProductAndSellerDTO() {
		super();
	}





	public SellProductAndSellerDTO(int sid, String sname, int spno, String spname, String spcategory, int spprice,
			int spquantity, boolean availability, Date startingdate, Date enddate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.spno = spno;
		this.spname = spname;
		this.spcategory = spcategory;
		this.spprice = spprice;
		this.spquantity = spquantity;
		this.availability = availability;
		this.startingdate = startingdate;
		this.enddate = enddate;
	}





	public int getSid() {
		return sid;
	}





	public void setSid(int sid) {
		this.sid = sid;
	}





	public String getSname() {
		return sname;
	}





	public void setSname(String sname) {
		this.sname = sname;
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





	public int getSpquantity() {
		return spquantity;
	}





	public void setSpquantity(int spquantity) {
		this.spquantity = spquantity;
	}





	public boolean isAvailability() {
		return availability;
	}





	public void setAvailability(boolean availability) {
		this.availability = availability;
	}





	public Date getStartingdate() {
		return startingdate;
	}





	public void setStartingdate(Date startingdate) {
		this.startingdate = startingdate;
	}





	public Date getEnddate() {
		return enddate;
	}





	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}





	@Override
	public String toString() {
		return "SellProductAndSellerDTO [sid=" + sid + ", sname=" + sname + ", spno=" + spno + ", spname=" + spname
				+ ", spcategory=" + spcategory + ", spprice=" + spprice + ", spquantity=" + spquantity
				+ ", availability=" + availability + ", startingdate=" + startingdate + ", enddate=" + enddate + "]";
	}
	
	
	
}
