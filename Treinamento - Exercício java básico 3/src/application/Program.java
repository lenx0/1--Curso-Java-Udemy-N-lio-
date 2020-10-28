package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*3. Informar um saldo e imprimir o saldo com reajuste de 1%.*/

	public static double reajuste(double saldo) {
		return saldo + saldo * 1/100;
	}
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um saldo:");
		double saldo = scan.nextDouble();
		
		System.out.println("Seu saldo de R$"+saldo+", recebeu um reajuste de 1% e foi para: R$"+reajuste(saldo));
		

	}

}
