package secao6.parte3;
//Exercicio uri 1134
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int produto = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (produto != 4) {
			if (produto == 1) {
				alcool++;
				produto = sc.nextInt();
			} else if (produto == 2) {
				gasolina++;
				produto = sc.nextInt();
			} else if (produto == 3) {
				diesel++;
				produto = sc.nextInt();
			} else {
				System.out.println("Digite um código válido");
				produto = sc.nextInt();
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();
	}
}