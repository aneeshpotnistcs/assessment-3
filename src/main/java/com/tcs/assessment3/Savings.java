package com.tcs.assessment3;

import java.util.Date;

public class Savings extends Bank {
	private String ownerName;
	private String city;
	private String state;
	private int houseNumber;
	private long phoneNumber;
	private String street;
	private String accountType;
	private float balanceAmount = 100L;
	private Date createdDate;
	private String status;

	public Savings(String ownerName, String city, String state, int houseNumber, long phoneNumber, String street,
			String accountType, float balanceAmount, Date createdDate, String status) {
		super(ownerName, city, state, houseNumber, phoneNumber, street, accountType, balanceAmount, createdDate,
				status);

	}

	@Override
	public String getOwnerName() {
		return ownerName;
	}

	@Override
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String getState() {
		return state;
	}

	@Override
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int getHouseNumber() {
		return houseNumber;
	}

	@Override
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	@Override
	public long getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String getAccountType() {
		return accountType;
	}

	@Override
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public float getBalanceAmount() {
		return balanceAmount;
	}

	@Override
	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

}
