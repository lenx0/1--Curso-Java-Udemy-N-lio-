package application;

import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle;
		rectangle = new Rectangle();
		
		
		System.out.println("Digite a altura: ");
		rectangle.width = scan.nextDouble();
		System.out.println("Digite a largura: ");
		rectangle.height = scan.nextDouble();
		
		
		
		System.out.println(rectangle.width);
		System.out.println(rectangle.height);
		
		System.out.println("A área do triângulo digitado é: "+rectangle.area());
		System.out.println("O perimetro do triângulo digitado é: "+rectangle.perimeter());
		System.out.println("A Diagonal do triângulo digitada é: "+rectangle.diagonal());
		

	}

}
