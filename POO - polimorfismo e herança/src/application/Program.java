package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees:");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)?");
			char c = scan.next().charAt(0);
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Hours: ");
			Integer hours = scan.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = scan.nextDouble();
			if (c == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = scan.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
				// list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				// >> outra forma de instanciar.

			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);

			}

		}

		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
	}

}