package secao8.aula72.application;

import java.util.Scanner;
import secao8.aula72.entities.CurrecyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		
		System.out.print("Amoutn to be paid in reais = ");
		System.out.print(CurrecyConverter.converter(dollarPrice, dollarBought));
		
		
		
		
		sc.close();
	}

}
