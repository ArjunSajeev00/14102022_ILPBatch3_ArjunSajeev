package com.experion.service;

import java.util.ArrayList;

import com.experion.enitity.Account;
import com.experion.enitity.BankServices;
import com.experion.enitity.Card;
import com.experion.enitity.Product;

public class Service {

	public static Product createProduct(String productType) {
		ArrayList<BankServices>bankServices = new ArrayList<BankServices>();
		bankServices.add(new BankServices ("SOB101","Online Banking"));
		bankServices.add(new BankServices ("SMB200","Mobile Banking"));
		bankServices.add(new BankServices ("SII434","Cash Banking"));
		Product product = null;
		if(productType.compareTo("Card") ==0)
			
		{
		product = new Card("PRDMC 100","Master Card","Card","Master");
		
		}
		
		else if (productType.compareTo("Account") == 0)
			
		{
		 product = new Account("PRDWSA100","Womens Savings Account","Account","Savings Account",bankServices);
			
		}
		return product;
		
	}


	
	public static void displayProductDetails(ArrayList<Product> productList) {
		
		Card card = null;
		Account account = null;
		
		System.out.println("Product Code" + "    " + "Product Name" + "    " + "Product Type");

		
		for (Product product : productList)
		{
			if(product instanceof Card)
			{
				
				card =(Card)product;
				System.out.println(card.getProductCode() + "      "+ card.getProductName() + "     " + card.getProductType() + "     " + card.getCardType());
			}
			else if(product instanceof Account)
			{
				
				account = (Account)product;
			    System.out.println(account.getProductCode() + "      "+ account.getProductName() + "     " + account.getProductType() + "     " + account.getAccountType()+ "    " + account.getBankServices());
			    System.out.println("The list of services are given below");}
			
			    for(BankServices bankServices  : account.getBankServices())			    	
			    	System.out.println(bankServices.getServiceName());
			
		}
		
	


		}
	
}