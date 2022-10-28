package com.experionbasicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args)
	{
		
		Scanner scanner= new Scanner(System.in);
		String productName[]=new String[5];
		System.out.println("Enter the first product name - ");
		productName[0]=scanner.nextLine();
		System.out.println("Enter the second product name - ");
		productName[1]=scanner.nextLine();
		System.out.println("Enter the third product name - ");
		productName[2]=scanner.nextLine();
		System.out.println("Enter the fourth product name - ");
		productName[3]=scanner.nextLine();
		System.out.println("Enter the fifth product name - ");
		productName[4]=scanner.nextLine();
		
		System.out.println(productName[0]);
		System.out.println(productName[1]);
		System.out.println(productName[2]);
		System.out.println(productName[3]);
		System.out.println(productName[4]);

	}

}
