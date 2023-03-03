package secao4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id;
		double nHoras, vHora, salario;
		
		System.out.print("Digite o ID do funcionário: ");
		id = sc.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		nHoras = sc.nextDouble();
		System.out.print("Digite o salário: ");
		vHora = sc.nextDouble();
		sc.close();
		
		salario = nHoras * vHora;
		System.out.println("NÚMERO = " + id);
		System.out.println("SALÁRIO = " + salario);
		
		
	}

}
