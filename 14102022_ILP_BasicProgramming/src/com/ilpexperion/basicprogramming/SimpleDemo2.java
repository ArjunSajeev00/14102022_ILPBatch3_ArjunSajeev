package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SimpleDemo2 {

	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 firstNumber=scanner.nextInt();
		 
			
	     secondNumber=firstNumber%10;
		
			
		 
		
		 if(secondNumber%2==0)
		 {
			 System.out.println(secondNumber + "is even");
		 }
		 else
		 {
			 System.out.println(secondNumber + "is odd");
		 }

	}

}
