package algoritmo.aula3;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0;
		
		System.out.println("Digite um número inteiro: ");
		valor = teclado.nextInt();
		
		if (valor == 10) {
			System.out.println("Voce digitou o valor correto, parabens!!!");
			
		}

	}

}
