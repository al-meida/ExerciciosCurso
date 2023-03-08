package secao5.parte2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		//Exercicio uri1041
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x > 0 && y > 0 ) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0 ) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x == 0){
			System.out.println("Eixo X");
		} else {
			System.out.println("Eixo Y");
		}
		
		sc.close();
	}

}
