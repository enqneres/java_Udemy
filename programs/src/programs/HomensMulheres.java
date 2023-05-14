package programs;

import java.util.Scanner;

public class HomensMulheres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nome;
		int homem = 0, mulher = 0, sexo = 0, qtMulheres = 0, qtHomens = 0;
		
		
		for (int i=0; i<=4; i++) {
			System.out.println("Digite seu nome: ");
			nome = sc.next();
			
			System.out.println("Digite seu sexo: (1 - Mulher 2 - Homem): ");
			sexo = sc.nextInt();
			
			if (sexo == 1) {
				qtMulheres++;
			} else if(sexo == 2) {
				qtHomens++;			
			} else if (sexo != 0) {
				System.out.println("Opção inválida!");
			}
					
		}
		
		System.out.println("A quantidade de mulheres é " + qtMulheres);
		System.out.println("A quantidade de homens é " + qtHomens);
		
		
		sc.close();

	}

}
