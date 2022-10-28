package com.experionentity;

import java.util.Scanner;

public class Product {
	private String productCode;
	private String productName;
	private String productDescription;
	private double productPrice;
	private String productOpenDate;
	private String productValidDate;
	private String  productExpiryDate;
	private boolean productActive;
	
	


	
    public Product(String productCode, String productName, String productDescription, double productPrice,
			String productOpenDate, String productValidDate, String productExpiryDate, boolean productActive) {
		this.productCode = productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productOpenDate = productOpenDate;
		this.productValidDate = productValidDate;
		this.productExpiryDate = productExpiryDate;
		this.productActive = productActive;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductOpenDate() {
		return productOpenDate;
	}
	public void setProductOpenDate(String productOpenDate) {
		this.productOpenDate = productOpenDate;
	}
	public String getProductValidDate() {
		return productValidDate;
	}
	public void setProductValidDate(String productValidDate) {
		this.productValidDate = productValidDate;
	}
	public String getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(String productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}
	public boolean isProductActive() {
		return productActive;
	}
	public void setProductActive(boolean productActive) {
		this.productActive = productActive;
	}
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
