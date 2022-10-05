package com.weMovies.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
	private String mid;
	private String pwd;
	private String name;
	private String email;
	private String birth;
	private String mauth;
	private String reg_date;
	
	public MemberDTO() {
	}
	
	public MemberDTO(String mid, String pwd, String name, String email, String birth, String mauth, String reg_date) {
		this.mid = mid;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.birth = birth;
		this.mauth = mauth;
		this.reg_date = reg_date;
	}
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getMauth() {
		return mauth;
	}
	public void setMauth(String mauth) {
		this.mauth = mauth;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "MemberDTO [user_id=" + mid + ", passwd=" + pwd + ", name=" + name + ", email=" + email + ", birth=" + birth + ", mauth=" + mauth + ", reg_date=" + reg_date +"]";
	}
	
}
