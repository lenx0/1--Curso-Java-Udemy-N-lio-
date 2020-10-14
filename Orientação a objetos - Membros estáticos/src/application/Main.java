package application;

import java.util.Scanner;

import entities.Terreno;
import util.Calculo;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Terreno terreno = new Terreno();
		
		System.out.println("Digite a largura:");
		terreno.largura = scan.nextDouble();
		
		System.out.println("Digite o comprimento:");
		terreno.comprimento = scan.nextDouble();
		
		System.out.println("Área do terreno: "+terreno.area());
		
		System.out.println("Valor do metro quadrado: R$"+terreno.VALOR_METRO);
		
		System.out.println("Valor final do terreno: R$"+terreno.valorFinal());

	}

}
