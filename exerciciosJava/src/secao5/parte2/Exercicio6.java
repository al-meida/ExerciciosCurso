package secao5.parte2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Exercicio uri1037

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();

		if (x > 0 && x < 25.01) {
			System.out.println("Intervalo (0,25)");
		} else if (x > 25 && x < 50.01) {
			System.out.println("Intervalo (25,50)");

		} else if (x > 50 && x < 75.01) {
			System.out.println("Intervalo (50, 75)");
		} else if (x > 75 && x < 100.01) {
			System.out.println("Intervalo (75, 100)");
		} else {
			System.out.println("Fora do intervalo");
		}

		sc.close();
	}

}
