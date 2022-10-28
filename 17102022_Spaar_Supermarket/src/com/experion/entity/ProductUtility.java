package com.experion.entity;

import java.util.Scanner;

public class ProductUtility {

	public static void main(String[] args) {
		char mainChoice;
		int index = 0;
	
		  Scanner scanner = new Scanner(System.in);
		  Product productList[]= new Product[3];
		  do
		  {
			  System.out.println("1 Create Product 2 Display Product");
			  int choice = scanner.nextInt();
			  switch(choice)
			  {
			  case 1: productList(index)= Service.createProduct();
			  index++;
			  break;
			  case 2: Service.displayProductDetails(productList);
			  }
			  System.out.println("Do you Want to Contine(y/n)");
			  mainchoice = scanner.next().charAt(0);
		  }
while(mainChoice =='y');
}

