package com.bank.service;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bank.enitity.Rate;
import com.bank.enitity.Service;

public class BankService {
	
	public static Service createService() {
		
		/* ***********Taking input from user to service************* */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the following details to create service");
		System.out.println("Service Code :");
		String serviceCode = scanner.nextLine();
		System.out.println("Service Name :");
		String serviceName = scanner.nextLine();
		System.out.println("Service Description :");
		String serviceDescription = scanner.nextLine();
		System.out.println("Open Date :");
		String openDate = scanner.nextLine();
		System.out.println("Validity Date :");
		String validityDate = scanner.nextLine();
		System.out.println("Expiry Date :");
		String expiryDate = scanner.nextLine();
		/* ***********8String to Date Conversion************* */
		Date openDateConverted =stringToDate(openDate);
		Date validityDateConverted =stringToDate(validityDate);
		Date expiryDateConverted =stringToDate(expiryDate);
		
		/* ***********Creation of service object************* */
		Service service = new Service (serviceCode,serviceName,serviceDescription,openDateConverted,validityDateConverted,expiryDateConverted);
		return service;
		
		
	}
	
	public static void createRateCard(Service service) {
		
		
		Scanner scanner = new Scanner(System.in);
		Rate rate = new Rate();
		System.out.println("********************Enter the Rate card for " +service.getServiceName()+ "************");
		System.out.println("Enter the no of tiers you want to add -");
		int noOfTiers = scanner.nextInt();
		int[] min = new int[noOfTiers];
		int[] max = new int[noOfTiers];
		double[] fees = new double[noOfTiers];
		
		for(int tier = 0;tier<noOfTiers;tier++)
		{
			System.out.println("Enter the Min    Max      adn Rate for the" + (tier+1) + "tier");
			min[tier]= scanner.nextInt();
			max[tier]= scanner.nextInt();
			fees[tier]= scanner.nextDouble();
			System.out.println("Successfully inserted the values in the" + (tier+1) + "tier");
			if(tier<noOfTiers)
			{
			System.out.println("Do you want to add more tiers -(y/n");
			char ch = scanner.next().charAt(0);
			if(ch=='y')
				continue;
			else
				break;
			
		}}
		
		service.setRate(rate);
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees);
		System.out.println("************************Successfully Created rate Card for service" +service.getServiceName()+ "*******************");
		
		
		
		
		
		
	}
	
	public static void displayDetails(Service service) {
		
		System.out.println("******************Service Details******************");
		System.out.println("ServiceCode" + "     "+"Service Name"+"     "+"Service Description"+"       "+"open Date"+"      "+"Validity date"+"             "+"ExpiryDate");
		System.out.println(service.getServiceCode() + "     "+service.getServiceName()+"     "+service.getServiceDesc()+"       "+service.getOpenDate()+"      "+service.getValidityDate()+"             "+service.getExpiryDate());
		
		System.out.println("******************Rate Card of the Service" +service.getServiceName() + "is given below");
		System.out.println("Min          Max            Rate");
		for(int index = 0;index<service.getRate().getMin().length;index++){
			if((service.getRate().getMax()[index] <=999999)&&(service.getRate().getMax()[index] !=0))
		
			System.out.println(service.getRate().getMin()[index]+ "           "+service.getRate().getMax()[index]+ "           "+service.getRate().getRate()[index]);
		}
		
	}

	
	public static Date stringToDate(String dateString)
	{
		Date convertedDate = null;
		try
		{
			
		 convertedDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return convertedDate;
	}
}
