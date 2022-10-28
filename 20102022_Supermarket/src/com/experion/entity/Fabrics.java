package com.experion.entity;

import java.util.Date;
import java.util.Scanner;

import com.experion.service.FabricService;
import com.experion.service.Service;

public class Fabrics extends Product implements FabricService {
	
	
	private String fabricType;
	
	



	public String getFabricType() {
		return fabricType;
	}



	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}



	public Fabrics(String productCode, String productName, double productPrice, String fabricType) {
		super(productCode, productName, productPrice);
		this.fabricType = fabricType;
	}



	@Override
	public void productComplaint() {
Scanner scanner = new Scanner(System.in);
	System.out.println("Choose any of the Complaint for the product to be returned ");
	System.out.println("1.Damaged Fabric  2.Colour not as expected   3.Wrong Size   4.Bought the product by mistake  5.Others ");
	int choice = scanner.nextInt();
 
	switch(choice)
	{
	case 1:
	case 2:
	case 3:
	case 4:
		productExchange();
		break;
	case 5:
		System.out.println("Please Specify the problem ");
		String String = scanner.nextLine();
		
	}
	
	}
		
	

	@Override
	public void productExchange() {
		
		System.out.println("Exchange Initiated, Product will be exchanged soon");
		
	}




	

		
	

}
