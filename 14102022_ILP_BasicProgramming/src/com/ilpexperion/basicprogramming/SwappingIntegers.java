package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwappingIntegers {

	public static void main(String[] args) {
		int firstInteger;
		int secondInteger;
		int temporaryInteger;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Integer -");
		firstInteger=scanner.nextInt();
		System.out.println("Enter the Second Integer -");
		secondInteger=scanner.nextInt();
		
		temporaryInteger=firstInteger;
		firstInteger=secondInteger;
		secondInteger=temporaryInteger;
		
		// TODO Auto-generated method stub
		
		System.out.println("First Integer");
		System.out.println(firstInteger);
		System.out.println("Second Intrger");
		System.out.println(secondInteger);

	}

}
