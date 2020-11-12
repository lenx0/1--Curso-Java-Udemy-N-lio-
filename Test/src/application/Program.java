package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Account;
import model.entities.Business;
import model.entities.Individual;

public class Program extends Account {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		Individual ind = new Individual();
		Business bus = new Business();

		List<Account> list = new ArrayList<>();

		System.out.println("Bem vindo ao simulador de conta bancária\n"
				+ "===========================================\n" + "===========================================\n");
		while (run == true) {
			System.out.println("Escolha uma opção");
			Account.menu();
			int menu = scan.nextInt();
			
			if (menu == 1) {
			
				System.out.println("Prencha os dados da conta");
				System.out.println("A conta é Individual ou Business? (i/b)");
				char c = scan.next().charAt(0);
				System.out.print("Número da conta: ");
				Integer number = scan.nextInt();
				System.out.print("Nome do titular: ");
				String name = scan.next();
				System.out.print("Escolha um limite para saque diario: ");
				double withdrawLimit = scan.nextDouble();
				System.out.println("Escolha um limite para deposito diario: ");
				double depositLimit = scan.nextDouble();
				System.out.println("Deseja fazer um deposito inicial? (y/n)");
				char c2 = scan.next().charAt(0);
				if (c2 == 'y') {
					System.out.print("Digite o valor para deposito inicial: ");
					double iniDeposit = scan.nextDouble();
					ind.setIniDeposit(iniDeposit);

					if (c == 'i') {
						list.add(new Individual(number, name, ind.getBalance(), iniDeposit, withdrawLimit, depositLimit,
								ind.getTaxToOpen()));

						run = true;

					} else if (c == 'b') {
						list.add(new Business(number, name, bus.getBalance(), iniDeposit, withdrawLimit, depositLimit,
								bus.getTaxToOpen()));
					}

				}

				System.out.println("Nova conta criada\n" + "==============================================");
				System.out.println(list);
			}else{
				System.out.println("FIM");
			}

		}

	}
}
