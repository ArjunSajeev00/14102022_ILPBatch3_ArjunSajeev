package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.enitity.Product;
import com.experion.service.Service;

public class SupermarketUtitlity {

	public static void main(String[] args) {
		
		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> products=new ArrayList<Product>();
		
				

	System.out.println("1. Fabric 2. Electronics");
	int choice = scanner.nextInt();
	if (choice == 1)
	{
		
		System.out.println("1.Create Product 2.Display Product 3.Buy Product");
		int choices=scanner.nextInt();
		switch(choices) {
		case 1 : products.add(Service.createProduct());
			break;
		case 2 : Service.displayProductDetails(products);
			break;
		}}
		else
		{
			System.out.println("1.Create Product 2.Display Product 3.Buy Product");
			int choices=scanner.nextInt();
			switch(choices) {
			case 1 : products.add(Service.createProduct());
				break;
			case 2 : Service.displayProductDetails(products);
				break;
			
		}
		
		System.out.println("Do you want to continue (Y/N)");
		mainChoice=scanner.next().charAt(0);
	while(mainChoice=='y');
	
	}
	}
}
