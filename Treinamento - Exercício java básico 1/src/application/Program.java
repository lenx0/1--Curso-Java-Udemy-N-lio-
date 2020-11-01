package application;

import java.util.Locale;
import java.util.Scanner;

/*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/


import util.Calc;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Calc calc = new Calc();
		System.out.print("Digite sua idade em (anos)");
		int iAno = scan.nextInt();
		System.out.println("Digite sua idade em (meses)");
		int iMes = scan.nextInt();
		System.out.println("Digite a idade em (dias)");
		int iDia = scan.nextInt();
		
		System.out.println("você possui: "+calc.result(iAno, iMes, iDia)+" dias de idade");
		

	}

	
}
