package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static List<Account> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		double amount = 0.0;
		BusinessAccount bus = null;
		System.out.println("=====MENU=====" + "\n[1] - Nova Conta" + "\n[2] - Depositar" + "\n[3] - Sacar"
				+ "\n[4] - Ver Saldo" + "\n[5] - Transferir");
		menu = scan.nextInt();
		if (menu == 1) {
			System.out.println("Digite o nome do titular");
			String name = scan.next();
			System.out.println("Digite o número da conta");
			int number = scan.nextInt();
			System.out.println("Conta Empresarial ou Pessoal?" + "[e]" + "[p]");
			String type = scan.next();
			System.out.println("Deseja fazer um depósito inicial?" + "[1] - sim" + "[2] - não");
			menu = scan.nextInt();
			if (type == "e" || type == "E") {
				if (menu == 1) {
					System.out.println("Digite o valor do primeiro depósito");
					amount = scan.nextDouble();
					list.add(new BusinessAccount(name, number, null));
					bus.setBalance(amount);

				}

			}

		}
		System.out.println("Conta:"+bus.getNumber());
		System.out.println("Nome: "+bus.getName());
		System.out.println("Saldo: "+bus.getBalance());
		
	}
}
