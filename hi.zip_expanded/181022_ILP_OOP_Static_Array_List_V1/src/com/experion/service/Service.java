package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	
	public static Product createProduct()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Proudct Code - ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Open Date - ");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product Valdity Date - ");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date - ");
		String expiryDate = scanner.nextLine();
		System.out.println("Active (true or false) - ");
		boolean active = scanner.nextBoolean();
		Product product=new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
		product.setSerialNumber(product.getSerialNumber() + 1);
		product.setSerialNoOriginal(product.getSerialNumber());
		return product;

	
	}
	
	public static void displayProductDetails(ArrayList<Product> productList[]) {
		
		
		System.out.println("Sl No" +"       "+ "Product Name " + "		" + "Product Description" + "		" + "Product Price");
		for(Product product:productList)
		{
		System.out.println(product.getSerialNoOriginal()+"        "+product.getProductName() + "				" + product.getProductDescription() + "				" + product.getProductPrice());
		}
	}
		

}
