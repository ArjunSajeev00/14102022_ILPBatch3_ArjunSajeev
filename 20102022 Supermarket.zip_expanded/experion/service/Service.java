package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Electronics;
import com.experion.entity.Fabrics;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType) {
		Scanner scanner = new Scanner(System.in);

		Product product = null;
		if (productType.compareTo("Fabrics") == 0) {
			System.out.println("Enter Product Code : ");
			String productCode = scanner.nextLine();
			System.out.println("Enter Product Name : ");
			String productName = scanner.nextLine();
			System.out.println("Enter Product Price : ");
			double productPrice = scanner.nextDouble();
			scanner.nextLine();

			product = new Fabrics(productCode, productName, productPrice);
		} else if (productType.compareTo("Electronics") == 0) {
			System.out.println("Enter Product Code : ");
			String productCode = scanner.nextLine();
			System.out.println("Enter Product Name : ");
			String productName = scanner.nextLine();
			System.out.println("Enter Product Price : ");
			double productPrice = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter the servcie charge : ");
			int serviceCharge = scanner.nextInt();

			product = new Electronics(productCode, productName, productPrice, serviceCharge);
		}

		return product;

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
		for (Product product : productList)

			if (product.getProductCode().compareTo(productCode) == 0) {
				selectedProduct = product;
			}
		return selectedProduct;

	}

	public static void getProductService(Customer customer) {

		Fabrics fabrics;
		Electronics electronics;
		Product product = customer.getProduct();
		System.out.println("The product you bought is " + product.getProductName());
		if (product instanceof Fabrics) {
			fabrics = (Fabrics) product;
			fabrics.productExchange();
		} else if (product instanceof Electronics) {
			electronics = (Electronics) product;
			System.out.println("Your service charge is " + electronics.getServiceCharge());
		}

	}
}
