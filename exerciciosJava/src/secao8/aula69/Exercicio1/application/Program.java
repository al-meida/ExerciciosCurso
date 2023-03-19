package secao8.aula69.Exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.aula69.Exercicio1.entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height.");
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		sc.close();
	}

}
