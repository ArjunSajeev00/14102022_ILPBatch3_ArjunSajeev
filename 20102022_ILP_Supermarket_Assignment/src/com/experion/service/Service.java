package com.experion.service;


import java.util.ArrayList;
import java.util.Scanner;

import com.experion.enitity.Electronics;
import com.experion.enitity.Fabric;
import com.experion.enitity.Product;

public class Service {
	

	
	public static  Fabric createFabricProduct() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code : ");
		String productCode = scanner.nextLine();
		System.out.println("Enter fabric category : ");
		String fabricCategory = scanner.nextLine();
		System.out.println("Enter fabric type : ");
		String fabricType = scanner.nextLine();
		System.out.println("Enter fabric Name : ");
		String fabricName = scanner.nextLine();
		System.out.println("Enter Product Price : ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		Fabric fabric = new Fabric(productCode,productPrice,fabricCategory,fabricType,fabricName );
		fabric.setProductCode(fabric.getProductCode());
		return fabric;
		 
	}
	
	
	public static Electronics createElectronicsProduct() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code : ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Electronics category : ");
		String electronicsCategory = scanner.nextLine();
		System.out.println("Enter gadget type : ");
		String gadgetType = scanner.nextLine();
		System.out.println("Enter gadget Name : ");
		String gadgetName = scanner.nextLine();
		System.out.println("Enter Product Price : ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		Electronics electronics = new Electronics(productCode, productPrice, electronicsCategory, gadgetName,gadgetType );
		electronics.setProductCode(electronics.getProductCode());
		return electronics;
		 
	}
	
	public static void displayProductDetails(ArrayList<Product> products)
	{
		System.out.println(" Product Number   Product Code    	Product Type	Product Name		Product Price");
		for(Product product : products) {
		if(product!=null) {
		System.out.println(product.getProductCode()+"    "+product.getProductCode()+"    "+product.getProductType()+"    "+product.getProductName()+"    "+product.getProductprice());
	}}}
	
	public static void buyProduct(ArrayList<Product> products)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the product number :");
		String productChoice = scanner.nextLine();
		System.out.println(" Product Name    Product Code    	Product Type     Product Name		Product Price");
		System.out.println();
		for(Product product : products) {
			String productNo = product.getProductCode();
			if(productNo == productChoice) {
	
			System.out.println(product.getProductCode()+"  "+product.getProductType()+"  "+product.getProductName()+"  "+product.getProductprice());
	}
			else
				System.out.println("Invalid");
		}
	}
}
