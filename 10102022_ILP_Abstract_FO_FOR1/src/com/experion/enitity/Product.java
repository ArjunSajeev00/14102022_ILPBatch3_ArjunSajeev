package com.experion.enitity;

public abstract class Product {

	private String productName;

	public Product(String productName) {
		
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public abstract void checkProductValidity();
}
