package algoritmo.exercicios;

import java.util.Scanner;

public class DConverterTemp {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double tempC = 0.0, tempF = 0.0;
		
		System.out.println("Informe a temperatura atual em graus Fahrenheit: ");
		tempF = teclado.nextDouble();
		
		System.out.printf("Em Celsius, essa temperatura ficaria em: " + "%.2f", ((tempF - 32) / 1.8));

	}

}
