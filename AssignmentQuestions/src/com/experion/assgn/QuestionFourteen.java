package com.experion.assgn;

import java.util.Scanner;

public class QuestionFourteen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int number = scanner.nextInt();
		int array[] = new int[number];

		System.out.println("Enter the array elements numbers");
		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.nextInt();
		}
		int sum = 0;
		for (int index = 0; index < array.length; index++) {

			for (int innerIndex = index + 1; innerIndex < array.length; innerIndex++) {
				if (array[index] + array[innerIndex] == 8) {
					sum++;
					System.out.println(
							"The array elements that add upto 8 are " + array[index] + " and " + array[innerIndex]);
					break;
				}
			}
		}

		if (sum == 0)
			System.out.print("No array elements add upto 8");

	}


	

}
