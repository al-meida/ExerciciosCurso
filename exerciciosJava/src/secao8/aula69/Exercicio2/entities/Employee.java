package secao8.aula69.Exercicio2.entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		 grossSalary += (grossSalary * percentage / 100) - tax;
	}
}