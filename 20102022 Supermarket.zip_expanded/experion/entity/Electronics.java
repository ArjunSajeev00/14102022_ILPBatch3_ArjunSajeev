package com.experion.entity;

import com.experion.service.ElectronicService;

public class Electronics extends Product implements ElectronicService {

	private int serviceCharge;
	
	public Electronics(String productCode, String productName, double productPrice, int serviceCharge) {
		super(productCode, productName, productPrice);
		this.serviceCharge = serviceCharge;
	}

	@Override
	public void ProductRepair() {
		
		System.out.println("Repair product service provided.");
		
	}

	@Override
	public void warrantyReplacement() {
		
		System.out.println("warranty replaced.");
		
	}

	public int getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}


	

	
}
