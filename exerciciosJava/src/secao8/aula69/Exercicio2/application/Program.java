package secao8.aula69.Exercicio2.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.aula69.Exercicio2.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Salário Bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();

		System.out.printf("\n%s, $ %.2f%n", employee.name, employee.NetSalary());

		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);

		System.out.printf("\n%s, $ %.2f%n", employee.name, employee.grossSalary);

		sc.close();
	}

}
