package com.experion.assgn;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 numbers:");
		int res[];
		res = new int[5];
		for(int i=0;i<4;i++) {
			res[i]=scanner.nextInt();
		}
		for(int i=0;i<4;i++) {
			if(res[i]>=res[i+1] && res[i]>=res[i+2] && res[i]>=res[i+3]) {
				System.out.println(res[i]);
			}
		}
	}

	

}
