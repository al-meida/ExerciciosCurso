package secao6.parte4;
//Exercicio uri1067
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i = i + 2) {
			System.out.println(i);

		}

		sc.close();
	}

}
