package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.println("Quantos funcionário deseja registrar?");
		int n = scan.nextInt();

		for (int i = 0; i <n; i++) {
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.println("Id:");
			int id = scan.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = scan.nextInt();
			}
			
			System.out.println("Nome:");
			String name = scan.next();
			System.out.println("Salay:");
			double salary = scan.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);

		}

		System.out.println("Digite a ID do funcionário que deseja dar um aumento:");
		int idsalary = scan.nextInt();
		Integer pos = position(list, idsalary);
		if (pos == null) {
			System.out.println("Este id não existe!");

		} else {
			System.out.println("Digite a % de aumento:");
			double percentage = scan.nextDouble();
			list.get(pos).increaseSalary(percentage);

		}

		System.out.println("Lista de empregados:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
	}

	public static Integer position(List<Employee> list, int id) {// função para encontrar o id na lista
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}