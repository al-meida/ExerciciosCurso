package secao8.aula69.Exercicio3.application;

import java.util.Locale;
import java.util.Scanner;
import secao8.aula69.Exercicio3.entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student std = new Student();

		std.nome = sc.nextLine();
		double grade1 = sc.nextDouble();
		double grade2 = sc.nextDouble();
		double grade3 = sc.nextDouble();
		double total = grade1 + grade2 + grade3;
		std.calculo(grade1, grade2, grade3, total);

		std.notaFinal(total);

		sc.close();

	}

}