package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Conta conta = new Conta();
		boolean run = true;
		
		

		System.out.println("Digite a conta");
		int numero = scan.nextInt();
		System.out.println("Digite o nome do titular");
		String nome = scan.next();
		System.out.println("Deseja fazer um depósito inicial? S/N");
		char opt = scan.next().charAt(0);
		if (opt == 'S' || opt == 's') {
			System.out.println("Qual valor deseja depositar?");
			double depIni = scan.nextDouble();
			conta.depositoIni(depIni);
			conta.setNumero(numero);
			System.out.println("=============================================");
		} else {
			conta.setNumero(numero);
		}
		while (run == true) {
			System.out.println(
					"O que deseja fazer?\n" + "[1] - Saque\n" + "[2] - Depósito\n" + "[3] - Saldo\n" + "[4] - Sair\n");
			int menu = scan.nextInt();
			System.out.println("=============================================");
			if (menu == 1) {
				System.out.println("Qual o valor do saque?");
				double valorSaque = scan.nextDouble();
				System.out.println("=============================================");
				conta.saque(valorSaque);

			} else if (menu == 2) {
				System.out.println("Qual o valor do deposito?");
				double valorDeposito = scan.nextDouble();
				System.out.println("=============================================");
				conta.deposito(valorDeposito);

			} else if (menu == 3) {
				System.out.println("Saldo: " + conta.getSaldo());
			}

			else if (menu == 4) {
				System.out.println("Programa finalizado.");
				break;
			} else {
				System.out.println("Opção inválida, digite novamente");
				System.out.println("============================================="
						+ "=============================================\n"
						+ "=============================================\n"
						+ "=============================================\n");
			}
		}
	}
}
