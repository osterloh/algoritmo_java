package algoritmo.aula3_EstruturaCondicional_IfElse;

import java.util.Scanner;

public class VerificarParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Digite um numero inteiro: ");
		n = teclado.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Voce digitou o numero: " + n + ". Este numero eh PAR");
		} else {
			System.out.println("Voce digitou o numero: " + n + ". Este numero eh IMPAR");
		}

	}

}
