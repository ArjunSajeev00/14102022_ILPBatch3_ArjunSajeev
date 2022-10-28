package com.experion.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.enitity.Fabric;
import com.experion.entity.Customer;
import com.experion.entity.Electronics;
import com.experion.entity.Fabrics;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType) throws ParseException {
		Scanner scanner = new Scanner(System.in);

		Product product = null;
		public static  Fabrics createFabricProduct() 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Product Code : ");
			String productCode = scanner.nextLine();
			System.out.println("Enter fabric category : ");
			String fabricCategory = scanner.nextLine();
			System.out.println("Enter fabric type : ");
			String fabricType = scanner.nextLine();
			System.out.println("Enter fabric Name : ");
			String productName = scanner.nextLine();
			System.out.println("Enter Product Price : ");
			double productPrice = scanner.nextDouble();
			scanner.nextLine();
			Fabric fabric = new Fabric(productCode,productPrice,productName );
			fabric.setProductCode(fabric.getProductCode());
			return fabric;
			 
		}
		
		
		public static Electronics createElectronicsProduct() 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Product Code : ");
			String productCode = scanner.nextLine();
			System.out.println("Enter Electronics category : ");
			String electronicsCategory = scanner.nextLine();
			System.out.println("Enter gadget type : ");
			String gadgetType = scanner.nextLine();
			System.out.println("Enter gadget Name : ");
			String gadgetName = scanner.nextLine();
			System.out.println("Enter Product Price : ");
			double productPrice = scanner.nextDouble();
			scanner.nextLine();
			Electronics electronics = new Electronics(productCode, productPrice, electronicsCategory, gadgetName,gadgetType );
			electronics.setProductCode(electronics.getProductCode());
			return electronics;
			 
		}
		
	}

	private static Date covertStringtoDate(String date) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date covertedDate = formatter.parse(date);
		return covertedDate;
	}

	public static Product buyProduct(ArrayList<Product> productList) {
		Scanner scanner = new Scanner(System.in);
		Product selectedProduct = null;
		System.out.println("Product Code" + "      " + "Product Name" + "      " + "Product Price");
		for (Product product : productList)
			System.out.println(product.getProductCode() + "      " + product.getProductName() + "      "
					+ product.getProductPrice());
		System.out.println("Enter the product code you want to purchase - ");
		String productCode = scanner.nextLine();
		// Checking for the desired product in the product list
		for (Product product : productList) {

			if (product.getProductCode().compareTo(productCode) == 0) {
				selectedProduct = product;
				break;
			} 
		}
		if(selectedProduct == null) {
				System.out.println("Product is not available.");
		}
		return selectedProduct;

	}

	public static void getProductService(Date currentDate, ArrayList<Customer> customerList) {

		Fabrics fabrics;
		Electronics electronics;
		System.out.println("Enter Customer Code : ");
		Scanner scanner = new Scanner(System.in);
		String customerCode = scanner.nextLine();
		for (Customer customer : customerList) {
			if (customer.getCustomerCode().compareTo(customerCode) == 0) {
				Product product = customer.getProduct();
				System.out.println("The product you bought is " + product.getProductName());
				if (product instanceof Fabrics) {
					fabrics = (Fabrics) product;
					fabrics.productComplaint();
					fabrics.productExchange();
				} else if (product instanceof Electronics) {
					electronics = (Electronics) product;
					electronics.productComplaint();
					System.out.println("1. Repair	2. Replacement	3. Service");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						electronics.ProductRepair();
						break;
					case 2:
						if (electronics.getWarrantyDate().after(currentDate)
								|| electronics.getWarrantyDate().equals(currentDate)) {
							electronics.warrantyReplacement();
							break;
						} else
							System.out.println("Not valid for replacement");
						break;
					case 3:
						System.out.println("Your service charge is " + electronics.getServiceCharge());
						break;
					}
				}
			}
		}
	}
}
