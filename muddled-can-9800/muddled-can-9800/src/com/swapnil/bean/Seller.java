package com.swapnil.bean;

public class Seller {

	private int sid;
	private String sname;
	private String smail;
	private String smobile;
	private String spassword;
	
	
	public Seller() {
		super();
	}


	public Seller(int sid, String sname, String smail, String smobile, String spassword) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smail = smail;
		this.smobile = smobile;
		this.spassword = spassword;
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


	public String getSmail() {
		return smail;
	}


	public void setSmail(String smail) {
		this.smail = smail;
	}


	public String getSmobile() {
		return smobile;
	}


	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}


	public String getSpassword() {
		return spassword;
	}


	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}


	@Override
	public String toString() {
		return "Seller [sid=" + sid + ", sname=" + sname + ", smail=" + smail + ", smobile=" + smobile + ", spassword="
				+ spassword + "]";
	}
	
	
	
}
