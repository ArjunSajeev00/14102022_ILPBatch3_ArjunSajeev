package com.experion.assgn;

import java.util.Scanner;

public class QuestionSixteen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
        System.out.print("Enter a Sentence : ");
        String sentence = scanner.nextLine();
        System.out.print("Enter a character to count :");
        char ch = scanner.next().charAt(0);
        System.out.print("Enter a character to replace :");
        char replace = scanner.next().charAt(0);
        int counter = 0;
        char character;
        for (int i = 0; i < sentence.length(); i++)
        {
            if (sentence.charAt(i) == ch) {
                counter++;
            }
        }
        System.out.println("Total count of character = " + counter);
        System.out.println(sentence.replace(ch, replace));

	}

	

}
