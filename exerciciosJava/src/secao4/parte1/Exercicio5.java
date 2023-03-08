package secao4.parte1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Exercício uri1010
		Scanner sc = new Scanner(System.in);
		
		int cPeca1, cPeca2, nPeca1, nPeca2;
		double vPeca1, vPeca2, valor;
		
		System.out.println("Digite o código da Peça 1:");
		cPeca1 = sc.nextInt();
		System.out.println("Digite a quantidade de Peça 1:");
		nPeca1 = sc.nextInt();
		System.out.println("Digite o valor unitário de cada Peça 1:");
		vPeca1 = sc.nextDouble();
		
		System.out.println("Digite o código da Peça 2:");
		cPeca2 = sc.nextInt();
		System.out.println("Digite a quantidade de Peça 2:");
		nPeca2 = sc.nextInt();
		System.out.println("Digite o valor unitário de cada Peça 2:");
		vPeca2 = sc.nextDouble();
		
		valor = (nPeca1 * vPeca1) + (nPeca2 * vPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		sc.close();
	}

}
