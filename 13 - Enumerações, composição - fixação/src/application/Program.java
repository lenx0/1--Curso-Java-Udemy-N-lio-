package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;


public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Order> order = new ArrayList<>();
		
		System.out.print("Enter client data:");
		System.out.print("Name:");
		String clientName = scan.next();
		System.out.print("Email:");
		String clientEmail = scan.next();
		System.out.print("Birth date (DD/MM/YYYY):");
		Date clientBirthDate = sdf.parse(scan.next());
		Client client = new Client(clientName, clientEmail, clientBirthDate);
		System.out.print("============================");
		System.out.print("Enter order data:");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(scan.next());
		
		System.out.print("How many itens to this order?");
		int n = scan.nextInt();
		
		for(int i = 0; i <n; i++) {
			System.out.print("Enter #"+i+" item data:");
			System.out.print("Product name:");
			String productName = scan.next();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		}
	
	
	
	}

}
