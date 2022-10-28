package com.experion.assgn;

import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int firstNumber,secondNumber,thirdNumber;
		System.out.println("Enter the first number");
		firstNumber= scanner.nextInt();
		System.out.println("Enter the Second number");
		secondNumber= scanner.nextInt();
		System.out.println("Enter the Third number");
		thirdNumber= scanner.nextInt();
		
		if(firstNumber>=secondNumber&&firstNumber>thirdNumber) {
			if (secondNumber>=thirdNumber) 
				System.out.println(thirdNumber +"    "+secondNumber+"     "+firstNumber);
			
			 if(thirdNumber>=secondNumber) 
				System.out.println(secondNumber +"    "+thirdNumber+"     "+firstNumber);
	
			 
		}
		
			 if (secondNumber>=firstNumber&&secondNumber>=thirdNumber) {
				 
			 
				if(firstNumber>=thirdNumber) 
					System.out.println(thirdNumber +"    "+firstNumber+"     "+secondNumber);
			
			
				 if(thirdNumber>=firstNumber) 
					System.out.println(firstNumber +"    "+thirdNumber+"     "+secondNumber);
				 
				 
			 }
			 
				 
				 if (thirdNumber>=firstNumber&&thirdNumber>=secondNumber) {
					 
					 
						if(firstNumber>=secondNumber) 
							System.out.println(secondNumber +"    "+firstNumber+"     "+thirdNumber);
					
					
						 if(secondNumber>=firstNumber) 
							System.out.println(firstNumber +"    "+secondNumber+"     "+thirdNumber);
			
	}
}


	}


