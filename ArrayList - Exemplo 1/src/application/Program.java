package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println("Tamanho da lista: "+list.size());
		for (String x : list) {
			System.out.println("Elementos cadastrados na lista: "+x);
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println("Removidos elementos começados com 'M':"+x);
		}
		System.out.println("---------------------");
		System.out.println("Posição do Bob na lista: " + list.indexOf("Bob"));
		System.out.println("Posição do Marco na lista: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println("Nomes da lista começados com A: "+x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("Primeiro nome da lista começado com A: "+name);
	}
}
