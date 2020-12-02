package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Account;
import model.entities.IndividualAccount;

public class Program {
	public static List<Account> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.print("Conta:");
		int number = scan.nextInt();
		System.out.print("Nome:");
		String name = scan.next();
		System.out.print("Deposito:");
		double iniDeposit = scan.nextDouble();
		
		list.add(new IndividualAccount(number, name, iniDeposit, null));
		IndividualAccount acc = new IndividualAccount();
		acc.iniDeposit(iniDeposit);
		
		
		for(Account acc1 : list) {
			System.out.print("N�mero da conta: "+acc1.getNumber());
			System.out.print("\nDeposito inicial: "+acc1.iniDeposit(iniDeposit));
			System.out.print("\nSaldo: "+acc1.getBalance());
			
		}
		System.out.println();
		
		
		
		
	
	}

}
