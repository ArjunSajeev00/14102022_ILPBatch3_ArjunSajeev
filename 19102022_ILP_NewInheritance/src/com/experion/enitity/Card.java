package com.experion.enitity;

public class Card extends Product {

	private String cardType;

	public Card(String productCode, String productName, String productType, String cardType) {
		super(productCode, productName, productType);
		this.cardType = cardType;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	
}
