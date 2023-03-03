package secao4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int a, b, SOMA;
		
		System.out.print("Digite o primeiro número: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		b = sc.nextInt();
		
		SOMA = a + b;
		
		System.out.println("SOMA = " + SOMA);
		
		
		sc.close();
	}

}
