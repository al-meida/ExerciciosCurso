package secao6.parte4;
//Exercicio uri1116
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("Divisao impossivel");
			} else {
				if (i < N) {
					double produto = (double) x/y;
					System.out.printf("%.1f%n", produto);
				}
			}

		}

		sc.close();
	}
}