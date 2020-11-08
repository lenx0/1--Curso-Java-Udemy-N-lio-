package application;

/*Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00*/

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PrivatePerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers:");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (p/l)?");
			char c = scan.next().charAt(0);

			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Anual income: ");
			double income = scan.nextDouble();
			if (c == 'p') {
				System.out.print("Health expenditures: ");
				double healthCost = scan.nextDouble();
				list.add(new PrivatePerson(name, income, healthCost));

			} else if (c == 'l') {
				System.out.print("Number of employes: ");
				int employeNumber = scan.nextInt();
				list.add(new LegalPerson(name, income, employeNumber));

			}
		}

		/*
		 * Usamos a classe abstrata e um método abstrato em implementação, pois assim
		 * conseguimos colocar todos os objetos em uma lista só assim usando o
		 * polimorfismo e deixando o código otimizado. Se a implementação dos métodos
		 * fosse feita em casa classe sem usar a classe genérica, não conseguiriamos
		 * colocar objetos diferentes na mesma lista.
		 */

		System.out.println();
		System.out.println("TAXES PAID:");
		System.out.println();
		double sum = 0.0;
		for (TaxPayer taxa : list) {
			double tax = taxa.tax();
			sum += tax;
			System.out.println(taxa.getName() + ": $ " + String.format("%.2f", taxa.tax()));

		}

		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

	}

}
