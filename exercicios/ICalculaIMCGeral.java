package algoritmo.exercicios;

import java.util.Scanner;

public class ICalculaIMCGeral {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double massa = 0, altura = 0;
		
		System.out.print("Informe o peso (Kg): ");
		massa = teclado.nextDouble();
		System.out.print("Informe a altura (m): ");
		altura = teclado.nextDouble();
		
		double imc = massa / (altura * altura);
		
		System.out.printf("IMC: " + "%.2f",imc);
		System.out.println("\n--------SITUACAO--------\n");
		
		if (imc < 17) {
			System.out.println("Muito abaixo do peso.");
			
		} else if ((imc >= 17) && (imc < 18.5)) {
			System.out.println("Abaixo do peso.");
			
		} else if ((imc >= 18) && (imc < 25)) {
			System.out.println("Peso ideal.");
			
		} else if ((imc >= 25) && (imc < 30)) {
			System.out.println("Sobrepeso.");
			
		} else if ((imc >= 30) && (imc < 35)) {
			System.out.println("Obesidade.");
			
		} else if ((imc >= 35) && (imc < 40)) {
			System.out.println("Obesidade severa.");
			
		} else {
			System.out.println("Obesidade morbida.");
		}

	}

}
