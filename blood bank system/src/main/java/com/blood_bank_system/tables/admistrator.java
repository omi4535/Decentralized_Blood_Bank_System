package com.blood_bank_system.tables;

public class admistrator {
	String adm_id;
	String bank_id;
	String name;
	String email;
	String uname;
	String pass;
	public admistrator(String adm_id, String bank_id, String name, String email, String uname, String pass) {
		super();
		this.adm_id = adm_id;
		this.bank_id = bank_id;
		this.name = name;
		this.email = email;
		this.uname = uname;
		this.pass = pass;
	}
	public admistrator() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "admistrator [adm_id=" + adm_id + ", bank_id=" + bank_id + ", name=" + name + ", email=" + email
				+ ", uname=" + uname + ", pass=" + pass + "]";
	}
	public String getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(String adm_id) {
		this.adm_id = adm_id;
	}
	public String getBank_id() {
		return bank_id;
	}
	public void setBank_id(String string) {
		this.bank_id = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
