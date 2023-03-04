package secao5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Exercicio1038
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtde = sc.nextInt();
		double preco = 0;
		
		if (codigo == 1 ) {
			preco = 4.00 * qtde;
		} else if (codigo == 2) {
			preco = 4.50 * qtde;
		} else if (codigo == 3) {
			preco = 5.00 * qtde;
		} else if (codigo == 4) {
			preco = 2.00 * qtde;
		} else if (codigo == 5) {
			preco = 1.50 * qtde;
		}
		
		System.out.printf("Total: %.2f%n", preco);
				
		sc.close();
	}

}
