package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pidgeot;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		Pidgeot pidgeot = new Pidgeot();
		System.out.println(pidgeot.airSlash());

	}

}
