package com.experion.utility;

import java.util.Scanner;

import com.experion.enitity.Account;
import com.experion.enitity.Card;
import com.experion.enitity.Loan;
import com.experion.enitity.Product;

public class BankUtility {

	public static void main(String[] args) {

		/*Account account = new Account("Women Savings Account ", "ACCI987666", 10000);
		AccountService accountService = new AccountService();
		accountService.depositCash(account, 20000);
		accountService.depositCash(account, 0, "arjun@oksbi");
		accountService.depositCash(account, "sfgdggsfgs66",2333);*/
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice = scanner.nextInt();
		if(choice ==1)
		{
			product = new Account ("Womens Savings Account","AAAA5454",10000);
		}
		else if(choice == 2)
		{
			product = new Card ("Master Card","CARD2325454",100000);
			
		}
		else if(choice == 3)
		{
			product = new Loan ("Home Loan","LOAN232434",1000000);
			
		}
		product.checkProductValidity();
		
		
		
	}
}
