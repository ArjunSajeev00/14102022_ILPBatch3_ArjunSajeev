package com.experion.enitity;

public class Electronics extends Product {
	
	private String electronicsCategory;
	private String gadgetName;
	private String gadgetType;
	public Electronics(String productCode, double productprice, String electronicsCategory, String gadgetName,
			String gadgetType) {
		super(productCode, productprice);
		this.electronicsCategory = electronicsCategory;
		this.gadgetName = gadgetName;
		this.gadgetType = gadgetType;
	}
	public String getElectronicsCategory() {
		return electronicsCategory;
	}
	public void setElectronicsCategory(String electronicsCategory) {
		this.electronicsCategory = electronicsCategory;
	}
	public String getGadgetName() {
		return gadgetName;
	}
	public void setGadgetName(String gadgetName) {
		this.gadgetName = gadgetName;
	}
	public String getGadgetType() {
		return gadgetType;
	}
	public void setGadgetType(String gadgetType) {
		this.gadgetType = gadgetType;
	}
	
	
	
	

}
