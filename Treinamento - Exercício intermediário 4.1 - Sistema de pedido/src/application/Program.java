package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Nome:");
		Client client = new Client();
		String name = scan.next();
		client.setName(name);
		System.out.println("Email:");
		String email = scan.next();
		client.setEmail(email);
		System.out.println("Data de aniversário:");
		Date birthDate = sdf.parse(scan.next());
		client.setBirthDate(birthDate);
		
		
		
		System.out.println("nome produto:");
		String productName = scan.next();
		
		System.out.println("preço:");
		double productPrice = scan.nextDouble();
		Product product = new Product(productName, productPrice);
		
		System.out.println("quantidade produto:");
		int quantity = scan.nextInt();
		OrderItem orderItem = new OrderItem(quantity, productPrice, product);
		
		System.out.println("Status do pedido?");
		OrderStatus status = OrderStatus.valueOf(scan.next());
		Order order = new Order(new Date(), status, client);
		
		System.out.println(order);
		

	}

}
