package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		
		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = scan.nextLine();
		System.out.print("Pickup (dd/MM/yyyy HH:ss): ");
		Date start = sdf.parse(scan.nextLine());
		System.out.print("Return (dd/MM/yyyy HH:ss): ");
		Date finish = sdf.parse(scan.nextLine());
		
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Enter price per hour: ");
		Double pricePerHour = scan.nextDouble();
		System.out.print("Enter price per day: ");
		Double pricePerDay = scan.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());//upcasting
		
		rentalService.processInvoice(cr);
		
		
		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		
		scan.close();
	}

}
