package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class Program {
	/*2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
	números 4, 5 e 6. A soma das duas médias. A média das médias.*/
	
	//Exercício resolvido sem classe pois fica mais rápido. Mas poderia resolver com classe normalmente.

	public static double mediaUm() {
		double somaMediaUm;
		return somaMediaUm = (8+9+7) / 3;
	}
	
	public static double mediaDois() {
		double somaMediaDois;
		return (4+5+6) / 3;
	}
	
	public static double mediaTotal() {
		double medTotal;
		return medTotal = (mediaUm() + mediaDois()) / 2;
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Média de 8, 9, 7 = "+mediaUm());
		System.out.println("Média de 4, 5, 6 = "+mediaDois());
		System.out.println("Média das médias acima = "+mediaTotal());
		

	}

}
