package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)*/


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor atual do salário mínimo");
		double sM = scan.nextDouble();
		
		System.out.println("Digite o salário atual do usuário");
		double sU = scan.nextDouble();
	
		double somaS = sU / sM;
		
		System.out.println("O usuário ganha: "+String.format("%.1f", somaS)+" salários mínimos");
		
		
	}

}
