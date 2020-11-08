package application;

import java.util.Scanner;

import entities.Bulbasaur;
import entities.Pokemon;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bulbasaur bulba = new Bulbasaur();
		
		
		
		System.out.println("Bulbasaur:");
		System.out.print("Vida: ");
		int vida = scan.nextInt();
		System.out.print("Atk: ");
		int atk = scan.nextInt();
		System.out.print("Def: ");
		int def = scan.nextInt();
		Pokemon poke = new Bulbasaur(vida, atk, def, bulba.getRes(), bulba.getFra());
		
		System.out.println("Bulbasaur dados:");
		System.out.println("Vida == "+poke.getVida());
		System.out.println("Ataque == "+poke.getAtk());
		System.out.println("Defesa == "+poke.getDefesa());
		System.out.println("Resistência == "+bulba.getRes());
		System.out.println("Fraqueza == "+bulba.getFra());
		
	}

}
