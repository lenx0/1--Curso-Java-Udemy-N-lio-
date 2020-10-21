package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas pessoas?");
		int n = scan.nextInt();
		Double[] vect = new Double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite a altura da pessoa " + i);
			vect[i] = scan.nextDouble();
			
		}
	
		double soma = 0.0;
		
		for(int i = 0; i < n; i++) {
			soma += vect[i];
		}
		double resultado = soma / n;
		System.out.printf("A média das alturas são: %.2f",resultado);
	}

}