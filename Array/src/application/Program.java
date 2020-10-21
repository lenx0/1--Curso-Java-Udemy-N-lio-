package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de pessoas que deseja medir a altura");
		int n = sc.nextInt();
		double[] vect = new double[n];//isso cria um vetor na memoria, o n será a quantidade de posições que será criado.
		for (int i = 0; i < n; i++) {
			System.out.println("Digite a altura da pessoa "+i+": ");
			vect[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for (int i = 0; i < n; i++) {//esse loop faz com que seja somado os 3 valores dentro do vetor.
			soma += vect[i];
		}
		double media = soma / n;
		System.out.printf("MÉDIA DAS ALTURA: %.2f%n", media);
		sc.close();
	}
}
