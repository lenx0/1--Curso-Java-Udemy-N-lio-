package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MaiorNumero;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		MaiorNumero maior = new MaiorNumero();
		
		System.out.println("Digite o primeiro número");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		int n2 = scan.nextInt();
		
		maior.mostraOMaiorNumero(n1, n2);
		
		

	}

}
