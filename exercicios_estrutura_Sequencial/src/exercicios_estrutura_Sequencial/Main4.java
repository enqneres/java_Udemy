package exercicios_estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, numHoras; 
		double salarioHora, salarioTotal;
		
		id = sc.nextInt();
		numHoras = sc.nextInt();
		salarioHora = sc.nextDouble();
		
		salarioTotal = salarioHora * numHoras;
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f%n", salarioTotal);
		
		sc.close();

	}
}
