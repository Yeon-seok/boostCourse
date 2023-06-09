package com.ys.businesscard.dto;

public class CardDto {
	String name;
	String phoneNumber;
	String company;
	String time;

	public CardDto(String name, String phoneNumber, String company, String time) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.company = company;
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "CardDto [name=" + name + ", phoneNumber=" + phoneNumber + ", company=" + company + ", time=" + time
				+ "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
}
