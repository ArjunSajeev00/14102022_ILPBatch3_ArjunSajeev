package com.experion.assgn;

import java.util.Scanner;

public class QuestionSix {

	public static void main(String[] args) {
		
		
		double number;
		double sum = 0;
		double factorial = 1;
		System.out.println("Enter a number :");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for(int index = 1; index <= number; index++) {
			factorial = factorial * index;
			sum = sum + (index/factorial);
		}
		System.out.println("Sum of series is " + sum);
	}


	

}