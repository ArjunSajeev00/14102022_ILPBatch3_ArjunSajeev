package com.experionbasicprogramming;

import java.util.Scanner;

public class VowelValuation {

	public static void main(String[] args) {

		 char firstCharacter;
		
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the character");
		 firstCharacter=scanner.next().charAt(0);
		 
		 
		 switch(firstCharacter)
		 {
		 case 'a':
			 System.out.println("The Character is vowel");
			 		break;
			 case 'e':
					 System.out.println("The Character is vowel");
					 		break;
					 case 'i':
						 System.out.println("The Character is vowel");
						 		break;
						 case 'o':
							 System.out.println("The Character is vowel");
							 		break;
							 case 'u':
								 System.out.println("The Character is vowel");
								 		break;
							 default:
								 System.out.println("The Character is not a vowel");
								 
		 }
		 
		 
			
	   
	}

}
