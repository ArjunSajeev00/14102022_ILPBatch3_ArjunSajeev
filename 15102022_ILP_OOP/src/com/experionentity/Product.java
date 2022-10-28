package com.experionentity;

import java.util.Scanner;

public class Product {
	String productCode;
    String productName;
    String productDescription;
    double productPrice;
    String productOpenDate;
    String productValidDate;
    String  productExpiryDate;
    boolean productActive;
	
    public void inputProductDetails()
    {
    	Scanner scanner =  new Scanner(System.in);
    	System.out.println("Enter the product code");
    	productCode=scanner.nextLine();
    	System.out.println("Enter the product Name");
    	productName=scanner.nextLine();
    	System.out.println("Enter the product Description");
    	productDescription=scanner.nextLine();
    	System.out.println("Enter the product Price");
    	productPrice=scanner.nextDouble();
    	scanner.nextLine();
    	System.out.println("Enter the Open Date");
    	productOpenDate=scanner.nextLine();
    	System.out.println("Enter the Valid Date");
    	productValidDate=scanner.nextLine();
    	System.out.println("Enter the Expiry Date");
    	productExpiryDate=scanner.nextLine();
    	System.out.println("Enter the Active Status");
    	productActive=scanner.nextBoolean();
    	
    }
    public void displayProductDetails()
    {
    	System.out.println("Product Name" + "     " + "Product Description" + "       " + "Product Price" + "     " + "Open Date" + "        " + "Valid Date" + "       " + " Expiry Date" +"       " + " Active Status");
    	System.out.println(productName + "     " + productDescription + "       " + productPrice + "     " + productOpenDate + "        " + productValidDate + "       " + productExpiryDate +"       " + productActive);
    }
    
    

}
