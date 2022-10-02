package com.swapnil.bean;

public class Admin {

	private int aid;
	private String aname;
	private String amail;
	private String amobile;
	private String apassword;
	
	
	public Admin() {
		super();
	}


	public Admin(int aid, String aname, String amail, String amobile, String apassword) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.amail = amail;
		this.amobile = amobile;
		this.apassword = apassword;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getAname() {
		return aname;
	}


	public void setAname(String aname) {
		this.aname = aname;
	}


	public String getAmail() {
		return amail;
	}


	public void setAmail(String amail) {
		this.amail = amail;
	}


	public String getAmobile() {
		return amobile;
	}


	public void setAmobile(String amobile) {
		this.amobile = amobile;
	}


	public String getApassword() {
		return apassword;
	}


	public void setApassword(String apassword) {
		this.apassword = apassword;
	}


	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + ", amail=" + amail + ", amobile=" + amobile + ", apassword="
				+ apassword + "]";
	}
	
	
	
	
	
}
