package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bulbasaur;
import entities.Squirtle;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Bulbasaur bulbasaur = new Bulbasaur();
		Squirtle squirtle = new Squirtle();
		System.out.println("Escolha seu pokémon:"
				+ "\n[1] - Bulbasaur"
				+ "\n[2] - Squirtle");
		int escolha = scan.nextInt();
		
	}

}
