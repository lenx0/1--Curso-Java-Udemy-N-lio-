package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Externo;
import model.entities.Funcionario;
import model.entities.Interno;

public class Program {
	static List<Funcionario> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int opc;
		char e;
		while (run) {
			System.out.println("\nMENU" + "\n[1] - Cadastrar" + "\n[2] - Listar");
			opc = scan.nextInt();
			if (opc == 1) {
				System.out.print("Nome do funcionário: ");
				String nome = scan.next();
				System.out.print("Salário: ");
				Double salario = scan.nextDouble();
				System.out.print("Funcionário externo ou interno?: (e/i)");
				e = scan.next().charAt(0);
				if (e == 'e' || e == 'E') {
					list.add(new Externo(nome, salario, 20.0));
				} else {
					list.add(new Interno(nome, salario, 40.0));

				}

			} else if (opc == 2){
				for(Funcionario fun : list) {
					System.out.println(fun);
				}

			}

		}

	}

}
