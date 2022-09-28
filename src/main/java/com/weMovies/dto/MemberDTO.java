package com.weMovies.dto;

import java.sql.Date;

public class MemberDTO {

	private String userid;
	private String userpw;
	private String name;
	private String email;
	private Date join_date;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
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

	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", userpw=" + userpw + ", name=" + name + ", email=" + email
				+ ", join_date=" + join_date + "]";
	}
}