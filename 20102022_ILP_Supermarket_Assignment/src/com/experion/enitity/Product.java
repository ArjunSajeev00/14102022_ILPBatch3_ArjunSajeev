package com.experion.enitity;

public class Product {
	
	private String productCode;
	private double productprice;
	public Product(String productCode, double productprice) {
		super();
		this.productCode = productCode;
		this.productprice = productprice;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	
	
	
	
}