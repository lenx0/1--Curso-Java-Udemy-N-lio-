package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = scan.nextInt();
		System.out.print("Holder: ");
		String holder = scan.next();
		System.out.print("Initial balance: ");
		double balance = scan.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = scan.nextDouble();
		Account account = new Account(number, holder, balance, withdrawLimit);

		System.out.println("============================");
		while (run == true) {
			try {
				System.out.print("Enter amount for withdraw: ");
				double amount = scan.nextDouble();
				account.withdraw(amount);
				run = false;

				System.out.print("New balance: " + account.getBalance());
			} catch (DomainException e) {
				System.out.println(e.getMessage());
				run = true;
			}
		}

	}

}
