package com.experion.assgn;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class QuestionNinteen {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start date : ");
		System.out.println("Year");
		int year = scanner.nextInt();
		System.out.println("Day");
		int day = scanner.nextInt();
		System.out.println("Month");
		int month = scanner.nextInt();
		System.out.println("Enter end date : ");
		System.out.println("Year");
		int endYear = scanner.nextInt();
		System.out.println("Day");
		int endDay = scanner.nextInt();
		System.out.println("Month");
		int endMonth = scanner.nextInt();
		LocalDate start_date = LocalDate.of(year, month, day);

		// End date
		LocalDate end_date = LocalDate.of(endYear, endMonth, endDay);

		Period diff = Period.between(start_date, end_date);

		// Print the date difference
		// in years, months, and days
		System.out.print("Difference " + "between two dates is: ");

		// Print the result
		System.out.printf("%d years, %d months" + " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays());
	}


	

}
