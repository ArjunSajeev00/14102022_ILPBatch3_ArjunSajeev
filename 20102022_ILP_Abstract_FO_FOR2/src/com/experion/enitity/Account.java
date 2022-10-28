package com.experion.enitity;

import com.experion.service.AccountCardService;

public class Account  extends Product implements AccountCardService{
	
	private String accountNumber;
	
	private double accountBalance;

	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public void checkProductValidity() {
		System.out.println("Validity check of account class called");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Balance Checked");
		
	}

	@Override
	public void cashwithdraw() {
		System.out.println("Cash Withdrawn");
		
	}

	
	
}