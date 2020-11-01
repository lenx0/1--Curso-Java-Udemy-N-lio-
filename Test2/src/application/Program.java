package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter department's name:");
		String departmentName = scan.next();
		System.out.print("Enter worker data:");
		System.out.print("Name:");
		String workerName = scan.next();
		System.out.print("Level:");
		String workerLevel = scan.next();
		System.out.print("Base salary:");
		Double baseSalary = scan.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));
		System.out.print("How many contracts to this worker?");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #"+i);
			System.out.println("Date (DD/MM/YYYY)");
			
			
			
			
		}
	}

}
