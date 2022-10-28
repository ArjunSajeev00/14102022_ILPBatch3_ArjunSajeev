package com.experion.assgn;

import java.util.Scanner;

public class QuestionFifteen {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in array :");
		int number = scanner.nextInt();
		int array[] = new int[number];
		System.out.println("Enter the elements");
		for (int index = 0; index < number; index++)
			array[index] = scanner.nextInt();
		int countOfSwap = 0;
		//sorting
		for (int index = 0; index < number - 1; index++) {
			countOfSwap = 0;
			for (int j = 0; j < number - 1 - index; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					countOfSwap++;
				}
			}
			if (countOfSwap == 0)
				break;
		}
		int[] temp = new int[number];
		int j = 0;
		// creating another array for only storing
		// the unique elements
		for (int i = 0; i < number - 1; i++) {
			if (array[i] != array[i + 1]) {
				temp[j++] = array[i];
			}
		}

		temp[j++] = array[number - 1];

		// Changing the original array
		for (int i = 0; i < j; i++) {
			array[i] = temp[i];
		}

		int original = j;
		// Printing The array elements
		System.out.println("Array after removing duplicate elements :");
		for (int i = 0; i < original; i++)
			System.out.print(array[i] + " ");


	}


}
