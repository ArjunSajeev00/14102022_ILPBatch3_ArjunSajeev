package com.experion.assgn;

import java.util.Scanner;

public class QuestionFour {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int number = scanner.nextInt();
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = firstNumber + secondNumber;
        double seriesSum = 0;
        seriesSum = Math.pow(firstNumber, 3) + Math.pow(secondNumber, 3);
        for (int count = 3; count <= number; count++) {
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = firstNumber + secondNumber;
            seriesSum = seriesSum + Math.pow(secondNumber, 3);
       }
        System.out.println("Series sum:" + seriesSum);
}

	

}
