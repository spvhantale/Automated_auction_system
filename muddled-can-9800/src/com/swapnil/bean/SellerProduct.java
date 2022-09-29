package com.swapnil.bean;

public class SellerProduct {

	private int spno;
	private String spname;
	private String spcategory;
	private String spquantity;
	private int sllerid;
	private boolean availability;
	private String startingdate;
	private String enddate;
	
	public SellerProduct() {
		super();
	}

	public SellerProduct(int spno, String spname, String spcategory, String spquantity, int sllerid,
			boolean availability, String startingdate, String enddate) {
		super();
		this.spno = spno;
		this.spname = spname;
		this.spcategory = spcategory;
		this.spquantity = spquantity;
		this.sllerid = sllerid;
		this.availability = availability;
		this.startingdate = startingdate;
		this.enddate = enddate;
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

	public String getSpquantity() {
		return spquantity;
	}

	public void setSpquantity(String spquantity) {
		this.spquantity = spquantity;
	}

	public int getSllerid() {
		return sllerid;
	}

	public void setSllerid(int sllerid) {
		this.sllerid = sllerid;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public String getStartingdate() {
		return startingdate;
	}

	public void setStartingdate(String startingdate) {
		this.startingdate = startingdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	@Override
	public String toString() {
		return "SellerProduct [spno=" + spno + ", spname=" + spname + ", spcategory=" + spcategory + ", spquantity="
				+ spquantity + ", sllerid=" + sllerid + ", availability=" + availability + ", startingdate="
				+ startingdate + ", enddate=" + enddate + "]";
	}
	
	
	



	
}

