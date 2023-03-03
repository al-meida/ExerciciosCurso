package secao4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int a, b, c, d;
		int diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 valores. Pressione Enter a cada valor");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		sc.close();
		
		diferenca = (a * b - c * d);
		
		System.out.println("DIFERENÇA = " + diferenca);
		
	}

}
