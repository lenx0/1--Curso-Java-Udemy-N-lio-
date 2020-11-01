package application;

import java.util.Locale;
import java.util.Scanner;

import entities.TrocaNumero;

public class Program {
/*Crie uma classe java TrocaNumero que contenha um método que receba dois
números NumA e NumB, nessa ordem, e imprima em ordem inversa, isto é, se os
dados lidos forem NumA = 5 e NumB = 9, por exemplo, devem ser impressos na
ordem NumA = 9 e NumB = 5.*/	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		TrocaNumero troca = new TrocaNumero();
		
		System.out.println("Digite o número A: ");
		troca.numA = scan.nextInt();
		System.out.println("Digite o número B: ");
		troca.numB = scan.nextInt();
		
		
		troca.trocaPosNumero(troca.numA, troca.numB);
		
		//poderia resolver de outras formas também, ex: invertendo uma lista.
		
	
	
	}
	
	

}
