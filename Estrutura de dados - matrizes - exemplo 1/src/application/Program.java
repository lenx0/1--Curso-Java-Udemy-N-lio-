package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho da matriz:");
		int n = scan.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < mat.length; i++) { // são usados 2 for pois um percorre a linha e o outro a coluna
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scan.nextInt();

			}

		}
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < mat.length; i++) { //mat.length é o tamanho da matriz, no caso 3 posições
			System.out.print(mat[i][i] + " ");

		}
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
			
		}
		System.out.println();
		System.out.print("Números negativos na matriz: "+count);
	
	}

}

//Resolução do professor.

/*public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();
	}
}*/
