package com.hotel.entity;

public class User {
	private int user_id;
	private String user_lname;
	private String user_lpwd;


	private String user_time;

	
	private int user_role;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_lname() {
		return user_lname;
	}
	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}
	public String getUser_lpwd() {
		return user_lpwd;
	}
	public void setUser_lpwd(String user_lpwd) {
		this.user_lpwd = user_lpwd;
	}
	
	
	
	public String getUser_time() {
		return user_time;
	}
	public void setUser_time(String user_time) {
		this.user_time = user_time;
	}
	
	public int getUser_role() {
		return user_role;
	}
	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}

}
