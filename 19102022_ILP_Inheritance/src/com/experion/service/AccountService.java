package com.experion.service;



import com.experion.enitity.Account;


public class AccountService {

	public void depositCash(Account account , double amount)
	{
		System.out.println("Depositing Money over Counter");
	}
	public void depositCash(Account account , double amount,String upicode)
	{
	
		System.out.println("Depositing Money over online transfer");
	}
	public void depositCash(Account account ,String chequeNumber, double amount)
	{
		System.out.println("Depositing Money via cheque");
	}
}

