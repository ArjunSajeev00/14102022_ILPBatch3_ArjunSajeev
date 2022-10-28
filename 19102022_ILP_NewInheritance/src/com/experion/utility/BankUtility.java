package com.experion.utility;




import java.util.ArrayList;
import java.util.Scanner;

import com.experion.enitity.Product;
import com.experion.service.Service;

public class BankUtility {

	public static void main(String[] args) {
		
		char mainChoice;
		Scanner  scanner = new Scanner (System.in);
		ArrayList<Product>productList= new ArrayList<Product>();
				
	            do
	            {
			    System.out.println("1.Add Card Product 2.Add Account Product 3.Buy Product");
			    int choice=scanner.nextInt();
			    switch(choice)
			    {
			    case 1: productList.add(Service.createProduct("Card"));
			            break;
			            
			    case 2: productList.add(Service.createProduct("Account"));
	            break;
	            
			    case 3: Service.displayProductDetails(productList);
	            break;
	            default : System.out.println("Invalid Choice");
			    }
			    System.out.println("Do you want to Continue (y/n) - ");
			    mainChoice = scanner.next().charAt(0);
	}
	while(mainChoice == 'y');
	}

}
