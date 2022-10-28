package com.experion.assgn;

import java.util.Scanner;

public class QuestionEight {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int number = scanner.nextInt();

		double sum = 0;
		for (int count = 1; count <= number; count++) {

			sum = sum + (count / (Math.pow(count * count, count) + factorial(count)));
		}
		System.out.println("Sum of series is:" + sum);
		

	}
	   public static double factorial(int count) {
	        double factVariable = 1;
	        for (int index = 1; index <= count; index++) {
	            factVariable = factVariable * index;
	        }
	        return factVariable;
	    }

	

}
