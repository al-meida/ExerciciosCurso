package secao6.parte4;
//Exercicio 1157
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int divisor = 0;

		for (int i = N; i <= N && i != 0; i--) {
				if (N % i == 0) {
					divisor = N / i;
					System.out.println(divisor);
				}
			
			sc.close();
		}
	}
}