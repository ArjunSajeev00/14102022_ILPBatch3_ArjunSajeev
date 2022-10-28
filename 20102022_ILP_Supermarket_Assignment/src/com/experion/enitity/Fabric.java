package com.experion.enitity;

public class Fabric extends Product {

	private String fabricCategory;
	private String fabricType;
    private String fabricName;
	public Fabric(String productCode, double productprice, String fabricCategory, String fabricType,
			String fabricName) {
		super(productCode, productprice);
		this.fabricCategory = fabricCategory;
		this.fabricType = fabricType;
		this.fabricName = fabricName;
	}
	
    
}