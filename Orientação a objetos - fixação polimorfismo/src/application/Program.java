package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char c = scan.next().charAt(0);
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Price: ");
			double price = scan.nextDouble();
			if (c == 'c') {
				list.add(new Product(name, price));
			}

			else if (c == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = scan.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}

			else if (c == 'u') {
				System.out.println("Manufacture date: ");
				Date manufactureDate = sdf.parse(scan.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}

			else {
				System.out.println("Error 404! Wrong command, try program again.");
			}

		}

	
		System.out.println("PRICE TAGS:");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
	}

}
