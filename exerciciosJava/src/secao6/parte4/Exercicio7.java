package secao6.parte4;
//Exercicio uri1143
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int quadrado = 0;
		int cubo = 0;
		
		for(int i = 1; i <= N; i++ ) {
			quadrado = i * i; 
			cubo = i * i * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		
		
		sc.close();
	}

}
