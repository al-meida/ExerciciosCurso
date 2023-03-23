package secao8.aula69.Exercicio3.entities;

public class Student {

	public String nome;
	public double grade1;
	public double grade2;
	public double grade3;
	public double total;

	public void calculo(double grade1, double grade2, double grade3, double total) {
		if (grade1 > 30) {
			System.out.println("A nota 1 não pode ser maior que 30");
		} else if (grade2 > 35) {
			System.out.println("A nota 2 não pode ser maior que 35");
		} else if (grade3 > 35) {
			System.out.println("A nota 3 não pode ser maior que 35");
		} else {
			total = grade1 + grade2 + grade3;
		}
	}

	public void notaFinal(double total) {
		System.out.printf("FINAL GRADE: %.2f%n", total);
		if (total >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING: " + (60 - total)+ " POINTS");
		}
	}
}