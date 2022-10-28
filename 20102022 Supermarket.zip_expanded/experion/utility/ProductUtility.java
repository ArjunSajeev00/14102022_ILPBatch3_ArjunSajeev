package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		char mainChoice;
		Product product = null;
		Product selectedProduct = null;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		Customer customer = null;
		do {
			System.out.println(
					"1. Create Fabric Product  2. Create Electronic Product	3.Buy Product 4. Product Services");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				productList.add(Service.createProduct("Fabrics"));
				break;
			case 2:

				productList.add(Service.createProduct("Electronics"));
				break;
			case 3:

				selectedProduct = Service.buyProduct(productList);
				customer = new Customer("CUS100","Sarath", selectedProduct);
				break;
			case 4:

				Service.getProductService(customer);
				break;

			}
			System.out.println("Do you want to continue (y/n):");
			mainChoice = scanner.next().charAt(0);

		} while (mainChoice == 'y');
	}

}
