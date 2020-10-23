package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho da linha");
		int L = scan.nextInt();
		System.out.println("Digite o tamanho da coluna:");
		int C = scan.nextInt();
		int[][] mat = new int[L][C];
		System.out.println("Digite agora os valores da matriz");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		System.out.println("Digite o número que deseja encontrar na matriz");
		int N = scan.nextInt();
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == N) {
					System.out.println("Posição: " + i + "," + j);
					if (j > 0) {
						System.out.println("LEFT: " + mat[i][j - 1]);
					}
					if (j > 0) {
						System.out.println("RIGHT: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("DOWN: " + mat[i + 1][j]);
					}
				}
			}
	}
}