package exercicios_estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, quantidade1, cod2, quantidade2; 
		double valor1, valor2, valorTotal;
		
		cod1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		valor1 = sc.nextDouble();
		cod2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorTotal = (quantidade1 * valor1) + (quantidade2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
	}
}
