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

		System.out.println("Enter client data:");
		System.out.print("Name:");
		String name = scan.next();
		System.out.print("Email:");
		String email = scan.next();
		System.out.print("Birth date: (DD/MM/YYYY):");
		Date birthDate = sdf.parse(scan.next());
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(scan.next());

		Order order = new Order(new Date(), status, client);

		System.out.println("How many items ti this order?");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name:");
			String productName = scan.next();
			System.out.print("Product price:");
			double productPrice = scan.nextDouble();
			System.out.print("Quantity:");
			int quantity = scan.nextInt();

			// instanciamos um novo produto
			Product product = new Product(productName, productPrice);

			// instanciamos os produtos dentro do OrderItem
			OrderItem it = new OrderItem(quantity, productPrice, product);

			// adicionamos OrderItem dentro do Order que é o pedido final
			order.addItem(it);

			System.out.println(order);

		}

	}

}
