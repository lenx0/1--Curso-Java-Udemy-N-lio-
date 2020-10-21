package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;
import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos quartos deseja alugar?");
		int n = scan.nextInt();
		Rent[] vect = new Rent[9];
		for(int i = 0; i<n; i++) {
			System.out.println("Aluguel número: #"+i);
			System.out.println("Digite o nome: ");
			String name = scan.next();
			System.out.println("Digite o email: ");
			String email = scan.next();
			System.out.println("Qual quarto deseja?");
			int room = scan.nextInt();
			vect[i] = new Rent(name, email, room);
		}
	
		for(int i = 0; i<n; i++) {
			if(vect[i] != null) {
				System.out.println("Quartos alugados:");
				System.out.println(vect[i]);
			}
		}
		
	
	}

}
