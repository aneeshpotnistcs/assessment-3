package com.tcs.assessment3;

import java.util.Date;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {
	private String ownerName;
	private String city;
	private String state;
	private int houseNumber;
	private long phoneNumber;
	private String street;
	private String accountType;
	private float balanceAmount;
	private Date createdDate;
	private String status;

	private static Savings savings;
	private static Current current;
	private static Demat demat;
	

	private static final Logger logger = LoggerFactory.getLogger(Bank.class);

	public Bank(String ownerName, String city, String state, int houseNumber, long phoneNumber, String street,
			String accountType, float balanceAmount, Date createdDate, String status) {
		this.ownerName = ownerName;
		this.city = city;
		this.state = state;
		this.houseNumber = houseNumber;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.accountType = accountType;
		this.balanceAmount = balanceAmount;
		this.createdDate = createdDate;
		this.status = status;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public float getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		logger.debug("Select the type of account");
		String accountType = sc.nextLine();
		if (accountType.equalsIgnoreCase("savings")) {
			savings = new Savings("Aneesh", "thane", "mh", 4545, 345435, "street", "savings", 1000, new Date(),
					"active");
			Scanner sc1 = new Scanner(System.in);
			logger.debug("Do you want to withdraw or deposit?");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("withdraw"))
				withdrawSavings();
			else if(choice.equalsIgnoreCase("deposit")){
				depositSavings();
			}

		} else if (accountType.equalsIgnoreCase("current")) {
			current = new Current("Aneesh", "thane", "mh", 4545, 345435, "street", "current", 200, new Date(),
					"active");
			Scanner sc1 = new Scanner(System.in);
			logger.debug("Do you want to withdraw or deposit?");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("withdraw"))
				withdrawCurrent();
			else if(choice.equalsIgnoreCase("deposit")){
				depositCurrent();
			}

		} else if (accountType.equalsIgnoreCase("demat")) {
			demat = new Demat("Aneesh", "thane", "mh", 4545, 345435, "street", "demat", 700, new Date(), "active");
			Scanner sc1 = new Scanner(System.in);
			logger.debug("Do you want to withdraw or deposit?");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("withdraw"))
				withdrawDemat();
			else if(choice.equalsIgnoreCase("deposit")){
				depositDemat();
			}

		}

	}

	private static void depositSavings() {
		Scanner sc = new Scanner(System.in);
		logger.debug("Enter deposit amount");
		float depositAmount = sc.nextFloat();
		float oldBalance = savings.getBalanceAmount();
		float newBalance = oldBalance + depositAmount;
		savings.setBalanceAmount(newBalance);
		logger.debug("Balance={}", savings.getBalanceAmount());
	}

	private static void depositCurrent() {
		Scanner sc = new Scanner(System.in);
		logger.debug("Enter deposit amount");
		float depositAmount = sc.nextFloat();
		float oldBalance = current.getBalanceAmount();
		float newBalance = oldBalance + depositAmount;
		current.setBalanceAmount(newBalance);
		logger.debug("Balance={}", current.getBalanceAmount());
	}

	private static void depositDemat() {
		Scanner sc = new Scanner(System.in);
		logger.debug("Enter deposit amount");
		float depositAmount = sc.nextFloat();
		float oldBalance = demat.getBalanceAmount();
		float newBalance = oldBalance + depositAmount;
		demat.setBalanceAmount(newBalance);
		logger.debug("Balance={}", demat.getBalanceAmount());
		
	}

	private static void withdrawSavings() {
		Scanner sc = new Scanner(System.in);
		logger.debug("Enter withdraw amount");
		float withdrawAmount = sc.nextFloat();
		float oldBalance = savings.getBalanceAmount();
		if (withdrawAmount <= oldBalance) {
			float newBalance = oldBalance - withdrawAmount;
			savings.setBalanceAmount(newBalance);
			logger.debug("Balance={}", savings.getBalanceAmount());
		} else {
			logger.debug("Not enough balance");
		}
	}

	private static void withdrawCurrent() {
		Scanner sc = new Scanner(System.in);
		logger.debug("Enter withdraw amount");
		float withdrawAmount = sc.nextFloat();
		float oldBalance = current.getBalanceAmount();
		if (withdrawAmount <= oldBalance) {
			float newBalance = oldBalance - withdrawAmount;
			current.setBalanceAmount(newBalance);
			logger.debug("Balance={}", current.getBalanceAmount());
		} else {
			logger.debug("Not enough balance");
		}
	}

	private static void withdrawDemat() {
		Scanner sc = new Scanner(System.in);
		logger.debug("Enter withdraw amount");
		float withdrawAmount = sc.nextFloat();
		float oldBalance = demat.getBalanceAmount();
		if (withdrawAmount <= oldBalance) {
			float newBalance = oldBalance - withdrawAmount;
			demat.setBalanceAmount(newBalance);
			logger.debug("Balance={}", demat.getBalanceAmount());
		} else {
			logger.debug("Not enough balance");
		}
	}

}
