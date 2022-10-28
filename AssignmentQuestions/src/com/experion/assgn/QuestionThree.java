package com.experion.assgn;

import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
	     int number,sum=0,i=1;
	     System.out.println("Enter the range of number:");
	     number=scanner.nextInt();
	     while(i<=number)
	     {
	         sum+=i;
	         i+=2;
	     }
	     System.out.println("The sum of the series = "+sum);
	     scanner.close();
	 }


	

}
