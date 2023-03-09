package secao6.parte4;

//Exercicio uri1072
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i;
		int in = 0;
		int out = 0;

		for (i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}

		}

		System.out.println("in: " + in);
		System.out.println("out: " + out);

		sc.close();
	}

}