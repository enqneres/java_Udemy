package exercicios_estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A, B, C; 
		double triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		triangulo = (A * C) / 2;
		circulo = pi * C * C;
		trapezio = (A + B) * C / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}
}
