package com.swapnil.bean;

public class Buyer {

	
	private int bid;
	private String bname;
	private String bmail;
	private String bmobile;
	private String bpassword;
	
	public Buyer() {
		super();
	}

	public Buyer(int bid, String bname, String bmail, String bmobile, String bpassword) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bmail = bmail;
		this.bmobile = bmobile;
		this.bpassword = bpassword;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBmail() {
		return bmail;
	}

	public void setBmail(String bmail) {
		this.bmail = bmail;
	}

	public String getBmobile() {
		return bmobile;
	}

	public void setBmobile(String bmobile) {
		this.bmobile = bmobile;
	}

	public String getBpassword() {
		return bpassword;
	}

	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}

	@Override
	public String toString() {
		return "Buyer [bid=" + bid + ", bname=" + bname + ", bmail=" + bmail + ", bmobile=" + bmobile + ", bpassword="
				+ bpassword + "]";
	}
	
	
	
}
