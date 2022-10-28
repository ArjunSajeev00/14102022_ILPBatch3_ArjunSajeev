package com.experion.entity;

import java.util.Date;
import java.util.Scanner;

import com.experion.service.ElectronicService;

public class Electronics extends Product implements ElectronicService {

	Scanner scanner = new Scanner(System.in);
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

	@Override
	public void productComplaint() {
		System.out.println("Choose any of the Complaint for the product to be returned ");
		System.out.println("1.Physical Damage  2.Not Working Properly   3.Others ");
		int choice = scanner.nextInt();
	 
		
	}

	
	
	

	
}
