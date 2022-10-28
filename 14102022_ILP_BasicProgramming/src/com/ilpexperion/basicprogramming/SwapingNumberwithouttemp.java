package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapingNumberwithouttemp {
	public static void main(String[] args) {
	
	
	int firstNumber;
	int secondNumber;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first number");
	firstNumber=scanner.nextInt();
	System.out.println("Enter the second number");
	secondNumber=scanner.nextInt();
	
	
	firstNumber=firstNumber+secondNumber;
	secondNumber=firstNumber-secondNumber;
	firstNumber=firstNumber-secondNumber;
	
	
	
	System.out.println(firstNumber);
	
	System.out.println(secondNumber);

	

}
}
