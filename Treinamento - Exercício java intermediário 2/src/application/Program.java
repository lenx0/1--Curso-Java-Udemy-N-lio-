package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NumeroDecrescente;

public class Program {
	/*2. Crie uma classe java NumeroDecrescente que contenha um método que receba
um número inteiro e imprima, em ordem decrescente, o valor do número até
0.*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		NumeroDecrescente numero = new NumeroDecrescente();
		
		System.out.println("Digite um número inteiro");
		int n = scan.nextInt();
		
		numero.imprimeNumero(n);
		
	}

}
