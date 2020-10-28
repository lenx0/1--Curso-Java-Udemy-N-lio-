package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = scan.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = scan.nextLine();
		System.out.print("Level: ");
		String workerLevel = scan.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = scan.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Enter contract #"+i+" data:");
			System.out.println("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scan.next());
			System.out.println("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			System.out.println("Duration (hours): ");
			int hours = scan.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scan.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));//isso recorta a string 'MM' e adiciona na var month.
		int year = Integer.parseInt(monthAndYear.substring(3));//aqui recorta da posição 3 em diante, no caso YYYY.
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());//aqui temos que ir passando de objeto por objeto para obert o nome
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		scan.close();
	}

}
