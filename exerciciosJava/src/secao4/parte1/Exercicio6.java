package secao4.parte1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		//Exercício uri1012
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três valores de ponto flutuante: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		sc.close();
		
		triangulo = a * c / 2;
		circulo = 3.14159 * Math.pow(c, 2);
		trapezio = (a + b)/2 * c;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);		
	}

}
