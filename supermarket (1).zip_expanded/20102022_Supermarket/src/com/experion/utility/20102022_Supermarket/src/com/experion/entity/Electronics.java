package com.experion.entity;

import java.util.Date;

import com.experion.service.ElectronicService;

public class Electronics extends Product implements ElectronicService {

	private int serviceCharge;
	private Date warrantyDate;


	public Electronics(String productCode, String productName, double productPrice, int serviceCharge,
			Date warrantyDate) {
		super(productCode, productName, productPrice);
		this.serviceCharge = serviceCharge;
		this.warrantyDate = warrantyDate;
	}

	@Override
	public void ProductRepair() {
		
		System.out.println("Repair product service provided.");
		
	}

	@Override
	public void warrantyReplacement() {
		
		System.out.println("Your product approved for replacement.");
		
	}

	public int getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Date getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(Date warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

	

	
}
