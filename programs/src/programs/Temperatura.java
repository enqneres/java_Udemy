package programs;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double C, K, Re, Ra, F;
		
		System.out.println("Digite a temperatura em Celsius: ");
		C = sc.nextDouble();
		
		
		F = C * 1.8 + 32;
		K = C + 273.15;
		Re = C * 0.8; 
		Ra = C * 1.8 + 32 + 459.67;
		
		System.out.println("A temperatura convertida em Kelvin é: " + K);
		System.out.println("A temperatura convertida em Reaumur é: " + Re);
		System.out.println("A temperatura convertida em Rankine é: " + Ra);
		System.out.println("A temperatura convertida em Fahrenheit é: " + F);
		
		
		sc.close();

	}

}

