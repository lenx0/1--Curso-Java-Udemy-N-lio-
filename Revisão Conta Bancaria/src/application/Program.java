package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Account;
import model.entities.BusinessAccount;
import model.entities.SavingsAccount;

public class Program {
	static List<Account> list = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static Double amount = 0.0;

	public static void main(String[] args) {

		boolean run = true;
		int opc;
		cadastro();
		while (run == true) {
			System.out.println("Escolha uma opção:" + "\n[0] - Nova conta" + "\n[1] - Saque" + "\n[2] - Deposito"
					+ "\n[3] - Listar contas" + "\n[4] - Sair");
			opc = scan.nextInt();
			if (opc == 0) {
				cadastro();
			} else if (opc == 1) {
				System.out.println("Digite o valor para sacar: ");
				amount = scan.nextDouble();
				for (Account acc : list) {

					if (acc.getBalance() >= amount) {
						acc.withdraw(amount);
						System.out.println("=====================================");
						System.out.println("Saque de R$ " + amount + " realizado com sucesso!");
						System.out.println("=====================================");
						atualiza();
					} else {
						System.out.println("=====================================");
						System.out.println("Saldo insufciente!");
						System.out.println("=====================================");
						atualiza();
					}
				}
			} else if (opc == 2) {
				System.out.println("Digite o valor para depositar: ");
				amount = scan.nextDouble();
				for (Account acc : list) {
					acc.deposit(amount);
					System.out.println("Depósito de R$ " + amount + " realizado com sucesso!");
					atualiza();

				}

			} else if (opc == 3) {
				for (Account acc : list) {

					for (int i = 1; i < list.size(); i++)

						System.out.println(acc.getHolder());
					System.out.println(acc.getNumber());
					System.out.println(acc.getBalance());
					System.out.println("=====================================");
				}

			}

			else if (opc == 4) {
				System.out.println("Programa finalizado!");
				run = false;
				break;

			} else {
				System.out.println("Opção inválida, digite novamente");
			}

		}
		atualiza();

	}

	private static void atualiza() {
		for (Account acc : list) {
			System.out.println("=====================================");
			System.out.println("Dados da conta cadastrada:");
			System.out.println("Nome do titular: " + acc.getHolder());
			System.out.println("Número da conta: " + acc.getNumber());
			System.out.println("Saldo: " + acc.getBalance());
			System.out.println("=====================================");
		}

	}

	private static void cadastro() {
		System.out.println("Digite o número da conta");
		Integer number = scan.nextInt();

		System.out.println("Digite o nome do titular");
		String name = scan.next();

		System.out.println("Deseja fazer um deposito inicial? (s/n)");
		char c = scan.next().charAt(0);
		if (c == 's' || c == 'S') {
			System.out.println("Digite o valor do deposito inicial");
			amount = scan.nextDouble();

		}

		System.out.println("Qual o tipo da conta?" + "" + "\n[p] - Conta Poupança" + "" + "\n[e] - Conta Empresarial");
		char d = scan.next().charAt(0);
		if (d == 'p' || d == 'P') {
			list.add(new SavingsAccount(number, name, amount, 2.0));
		} else {
			list.add(new BusinessAccount(number, name, amount, 1000.00));
		}
		System.out.println("=====================================");
		atualiza();

	}

}