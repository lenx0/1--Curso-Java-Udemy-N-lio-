package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Qual seu nome?");
		String usuario = scan.next();
		System.out.println("Bem vindo a pokedex treinador "+usuario+" !!!");
		
		boolean run = true;
		List<String> list = new ArrayList<>();
		while (run == true) {
			System.out.println("O que deseja fazer?"
					+ "[1] - CADASTRAR POKÉMON"
					+ "[2] - EDITAR POKÉMON"
					+ "[3] - APAGAR POKÉMON"
					+ "[4] - VER LISTA"
					+ "[5] - SAIR");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("");
			}
		
		
		
		
		
		
		
		
		}
		
	}
}