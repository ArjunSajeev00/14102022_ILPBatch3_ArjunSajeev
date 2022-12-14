package com.experion.assgn;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class QuestionTwenty {

	public static void main(String[] args) throws ParseException {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code : ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name : ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Price : ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Validity Date : ");
		String validityDate = scanner.nextLine();
		Date dateValidity = covertStringtoDate(validityDate);
		System.out.println("Enter Product Expiry Date : ");
		String expiryDate = scanner.nextLine();
		Date dateExpiry = covertStringtoDate(expiryDate);
		System.out.println("Enter Product Purchase Date : ");
		String purchaseDate = scanner.nextLine();
		Date datePurchase = covertStringtoDate(purchaseDate);
		
		
		if ((datePurchase.before(dateValidity))
				|| (datePurchase.equals(dateValidity)))
			System.out.println("You can purchase the product.");
		else
			System.out.println("You cannot purchase the product.");

	}

	private static Date covertStringtoDate(String date) throws ParseException { // To convert date in string format to
		// date format
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date covertedDate = formatter.parse(date);
		return covertedDate;
	}

	

}
