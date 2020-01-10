package algoritmo.aula3_EstruturaCondicional_IfElse;

import java.util.Scanner;

public class SeSenao {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int valor = 0;
		
		System.out.println("Digite um valor: ");
		valor = tec.nextInt();
		
		if (valor == 10) {
			System.out.println("Parabens, voce acertou, digitou 10!!!");
		} else {
			System.out.println("Que pena voce errou, tente mais uma vez!!!");
		}

	}

}
