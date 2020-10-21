package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import entities.Rent;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos quartos deseja alugar?");
		Rent vect[] = new Rent[10];
		int n = scan.nextInt();
		for(int i = 1; i<n; i++) {
			
			System.out.println("Quarto #"+i+":");
			System.out.println("Nome: ");
			String name = scan.next();
			System.out.println("Email: ");
			String email = scan.next();
			System.out.println("Quarto: ");
			int room = scan.nextInt();
			vect[room] = new Rent(name, email);
		}
		for(int i = 1; i <n; i++) {
			if(vect[i] != null) {
				System.out.println("Quartos ocupados:"+i+": "+vect[i]);
			}
		}
		
		scan.close();
		
	}
}
