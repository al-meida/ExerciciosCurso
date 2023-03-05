package secao5;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		//Exercicio uri1051
		
		Scanner sc = new Scanner(System.in);
		
		double imposto = sc.nextDouble();
		
		if (imposto >= 0 && imposto < 2000.00) {
			System.out.println("Isento");
		} else if (imposto > 2000.01 && imposto < 3000.00) {
			imposto = (imposto - 2000.00) * 8 / 100;
			System.out.printf("R$ %.2f%n", imposto);
		} else if (imposto > 3000.01 && imposto < 4500.00) {
			imposto = imposto - 3000.00;
			imposto = imposto * 18 / 100 + 80;
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			imposto = imposto - 4500;
			imposto = imposto * 28 / 100 + 80 + 270;
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}