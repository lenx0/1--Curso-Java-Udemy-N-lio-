package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Product product;
		product = new Product();
		
		System.out.println("Enter name product: ");
		product.name = scan.next();
		System.out.println("Enter price: ");
		product.price = scan.nextDouble();
		System.out.println("Enter quantity: ");
		product.quantity = scan.nextInt();
		
		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		

	}

}
