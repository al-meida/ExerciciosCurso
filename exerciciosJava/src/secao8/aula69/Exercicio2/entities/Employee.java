package secao8.aula69.Exercicio2.entities;

import secao8.aula68.application.Program;

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