package com.experion.service;

import java.util.Scanner;

import com.experionentity.Product;

public class Service {
	
	
	
	
	
	public static inputProductDetails()
    {
    	Scanner scanner =  new Scanner(System.in);
    	System.out.println("Enter the product code");
    	String productCode=scanner.nextLine();
    	System.out.println("Enter the product Name");
    	String productName=scanner.nextLine();
    	System.out.println("Enter the product Description");
    	String productDescription=scanner.nextLine();
    	System.out.println("Enter the product Price");
    	double productPrice=scanner.nextDouble();
    	scanner.nextLine();
    	System.out.println("Enter the Open Date");
    	String productOpenDate=scanner.nextLine();
    	System.out.println("Enter the Valid Date");
    	String productValidDate=scanner.nextLine();
    	System.out.println("Enter the Expiry Date");
    	String productExpiryDate=scanner.nextLine();
    	System.out.println("Enter the Active Status");
        boolean productActive=scanner.nextBoolean();
        product = new Product(productCode,productName,productDescription,productPrice,productOpenDate
        		,productValidDate,productExpiryDate,productActive);
        
        
        
    	
    }
	 public static void displayProductDetails(Product[] product)
	    {
	    	System.out.println("Product Name" + "     " + "Product Description" + "       " + "Product Price" + "     " + "Open Date" + "        " + "Valid Date" + "       " + " Expiry Date" +"       " + " Active Status");
	    	
	    	System.out.println(product.getProductName() + "     " + product.getProductDescription() + "       " + product.getProductPrice() + "     " + product.getProductOpenDate() + "        " + product.getProductValidDate() + "       " + product.getProductExpiryDate() +"       " + product.isProductActive());
	    }
	    
	    

	}


