package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List <String> list = new ArrayList<>();
		System.out.println("Quantos pokémon deseja cadastrar?");
		int n = scan.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Digite o nome do pokémon #"+i);
			String poke = scan.next();
			list.add(poke);
		}
		System.out.println(list.contains("charmeleon"));
		System.out.println(list.indexOf("charizard"));
		
		
	}
}