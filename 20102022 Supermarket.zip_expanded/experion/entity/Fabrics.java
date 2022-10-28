package com.experion.entity;

import com.experion.service.FabricService;

public class Fabrics extends Product implements FabricService {

	public Fabrics(String productCode, String productName, double productPrice) {
		super(productCode, productName, productPrice);

	}

	@Override
	public void productExchange() {
		
		System.out.println("Fabric product exchanged");
		
	}

}
