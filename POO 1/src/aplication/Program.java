package aplication;

import java.util.Scanner;

import entities.Triangle;

public class Program {
	//programa sem orientação a objetos

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do triângulo X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		System.out.println("Entre com as medidas do triângulo Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.calculoDaArea();
		double areaY = y.calculoDaArea();
	
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A área do triângulo X é maior");
			
	}else {
		System.out.println("A área do triângulo Y é maior");
	}
		scan.close();
  }
}