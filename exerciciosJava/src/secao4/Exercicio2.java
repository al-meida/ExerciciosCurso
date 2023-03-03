package secao4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Exercício uri1002
		
		Scanner sc = new Scanner(System.in);

		double raio, area;
		double π = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		sc.close();
		
		area = π * Math.pow(raio,  2);
		
		System.out.printf("%.4f%n", area);
				
	}

}
