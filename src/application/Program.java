package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Product name: ");
		String productName = input.nextLine();
		System.out.print("Price: $");
		double price = input.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = input.nextInt();
		
		Product product = new Product(productName, price, quantity);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.print("\nNumber of products to be added in stock: ");
		quantity = input.nextInt();
		product.addQuantity(quantity);
		System.out.println("Product data: " + product);
		
		System.out.print("\nNumber of products to be removed from stock: ");
		quantity = input.nextInt();
		product.removeQuantity(quantity);
		System.out.println("Product data: " + product);
		
		input.close();
	}

}
