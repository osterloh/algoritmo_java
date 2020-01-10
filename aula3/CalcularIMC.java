package algoritmo.aula3;

import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double massa = 0.0;
		double altura = 0.0;
		
		System.out.println("Massa (kg): ");
		massa = teclado.nextDouble();
		System.out.println("Altura (m): ");
		altura = teclado.nextDouble();
		
		double elev = Math.pow(altura, 2);		// exponenciacao: altura elevado ah 2
		double imc = massa / (elev);
		
		System.out.printf("IMC: " + "%.2f",imc);
		
		if ((imc >= 18.5) && (imc < 25)) {
			System.out.println("\nVoce esta no peso ideal!!!");
		} else {
			System.out.println("\nVoce nao esta na faixa de peso ideal!!!");
		}

	}

}
