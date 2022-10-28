package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) throws ParseException {
		char mainChoice;
		Product product = null;
		Product selectedProduct = null;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer Customer = null;
		System.out.println("***********Welcome to the Store***********");
		System.out.println();
		
		
		
		System.out.println("Please choose any of the options given below");
		
		System.out.println();
		
			do {
				System.out.println("1.Select Fabric    2.Select Electronics");
				int choices = scanner.nextInt();
				if (choices == 1){
					
				System.out.println("1. Create Fabric Product  2.Buy  Fabric Product	3.Fabric Product Services");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					productList.add(Service.createProduct("Fabrics"));
					break;
				case 2:
					selectedProduct = Service.buyProduct(productList);
					scanner.nextLine();
					System.out.println("Enter Customer Code : ");
					String customerCode = scanner.nextLine();
					System.out.println("Enter Customer Name : ");
					String customerName = scanner.nextLine();
					customerList.add(Customer = new Customer(customerCode, customerName, selectedProduct));
					break;
					
				case 3:
					Date currentDate = new Date();
					Service.getProductService(currentDate, customerList);
					break;
	
				}
				}
				
				else if (choices == 2) {
				
						System.out.println("1. Create Electronic Product	2.Buy Product	3. Product Services");
						int choice = scanner.nextInt();
						switch (choice) {				
						case 1:
							productList.add(Service.createProduct("Electronics"));
							break;
							
						case 2:
							selectedProduct = Service.buyProduct(productList);
							scanner.nextLine();
							System.out.println("Enter Customer Code : ");
							String customerCode = scanner.nextLine();
							System.out.println("Enter Customer Name : ");
							String customerName = scanner.nextLine();
							customerList.add(Customer = new Customer(customerCode, customerName, selectedProduct));
							break;
							
						case 3:
							Date currentDate = new Date();
							Service.getProductService(currentDate, customerList);
							break;

						}
			
			
		}System.out.println("Do you want to continue (y/n):");
		mainChoice = scanner.next().charAt(0);

	} while (mainChoice == 'y');
		
		
			}
				
				
	}
			
				
				
		
	


