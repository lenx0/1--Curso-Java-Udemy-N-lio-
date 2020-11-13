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

		double amount;

		List<Account> list = new ArrayList<>();

		System.out.println("Bem vindo ao simulador de conta banc�ria\n"
				+ "===========================================\n" + "===========================================\n");
		while (run == true) {
			System.out.println("Escolha uma op��o");
			Account.menu();
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("Prencha os dados da conta");
				System.out.println("A conta � Individual ou Business? (i/b)");
				char c = scan.next().charAt(0);
				System.out.print("N�mero da conta: ");
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
					while (run == true) {
						System.out.print("Digite o valor para deposito inicial: ");
						double iniDeposit = scan.nextDouble();
						if (iniDeposit > depositLimit) {
							System.out.println("Deposito n�o autorizado, fora do limite!");
							run = true;
						} else {
							if (c == 'i') {
								System.out.println("Primeiro deposito realizado!");
								ind.setIniDeposit(iniDeposit);
								run = false;
							} else {
								System.out.println("Primeiro deposito realizado!");
								bus.setIniDeposit(iniDeposit);

								run = false;

							}

						}
					}
					run = true;
					if (c == 'i') {
						list.add(new Individual(number, name, ind.getBalance(), iniDeposit, withdrawLimit, depositLimit,
								ind.getTaxToOpen()));
						System.out.println("Nova conta criada\n" + "==============================================");
						System.out.println(ind.toString());

						run = true;

					} else if (c == 'b') {
						list.add(new Business(number, name, bus.getBalance(), iniDeposit, withdrawLimit, depositLimit,
								bus.getTaxToOpen()));
						System.out.println("Nova conta criada\n" + "==============================================");
						System.out.println(bus.toString());
					}
				}

			} else if (menu == 2) {
				System.out.print("Digite o n�mero da conta para realizar o saque: ");
				int number = scan.nextInt();
				for (Account acc : list) {
<<<<<<< HEAD
					if (ind.getNumber() == number || bus.getNumber() == number) {
							System.out.println("Dados da conta escolhida");
							System.out.println(list.toString());
							System.out.print("Digite o valor para saque: ");
							amount = scan.nextDouble();

							if (amount <= acc.getWithdrawLimit()) {
								acc.withdraw(amount);
								System.out.println("Saque de R$ " + String.format("%.2f", amount) + " realizado");
								System.out.println("Update das contas");
								System.out.println("==============================================");


							} else {
								System.out.println("==============================================");
								System.out.println("Falha ao sacar, limite excedido.\n\n");
							}

						}else {
							run = true;
						}

=======
					if (acc.getNumber() == number) {
						

						boolean depositing = true;
						
						while(depositing) {
							System.out.println("Seu limite de saque di�rio � de R$ " + acc.getWithdrawLimit());
							System.out.print("Digite o valor para saque: ");
							amount = scan.nextDouble();
							
							if(amount <= acc.getWithdrawLimit()) {
								acc.withdraw(amount);
								System.out.println("Saque de R$ " + String.format("%.2f", amount) + " realizado");
								System.out.println("Update das contas");
								System.out.println("==============================================\n");
								depositing = false;
							}else {
								System.out.println("==============================================\n");
								System.out.println("Falha ao sacar, limite excedido.\n\n");
							}
						}
>>>>>>> 24422dd78c2f883cb8ef04354a2ec9abe15d5892
					}
					System.out.println("");
				}
			}
		}
}

