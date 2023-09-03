package com.web.dto;

public class MemberDTO {
	private int id;
	private String userid;
	private String password;
	private String name;
	private String birthday;
	private String gender;
	private String email;
	private byte[] photo;
	
	public int getId() {
		return id;
	}
	public String getUserid() {
		return userid;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getBirthday() {
		return birthday;
	}
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public boolean isPhoto() {
		if(photo == null) return false;
		else if(photo.length < 1) return false;
		return true;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", userid=" + userid + ", password=" + password + ", name=" + name
				+ ", birthday=" + birthday + ", gender=" + gender + ", email=" + email + ", isPhoto()=" + isPhoto()
				+ "]";
	}
}
