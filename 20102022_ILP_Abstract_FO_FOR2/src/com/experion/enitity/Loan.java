package com.experion.enitity;

import com.experion.service.LoanService;

public class Loan extends Product implements LoanService{
	private String loanNumber;
	private double loanAmount;
	public Loan(String productName, String loanNumber, double loanAmount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double isLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public void checkProductValidity() {
		System.out.println("Validity check of loan class");
		
	}
	@Override
	public void checkDueDate() {
		System.out.println("Checking Due Date");
		
	}
	@Override
	public void approveDate() {
		System.out.println("Checking Approve Date");
		
	}
	
	
}
	