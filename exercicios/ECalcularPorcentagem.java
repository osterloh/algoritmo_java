package algoritmo.exercicios;

import java.util.Scanner;

public class ECalcularPorcentagem {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double preco = 0.0;
		
		System.out.printf("Qual o preco do produto? US$");
		preco = teclado.nextDouble();
		
		double imposto = ((preco * 60) / 100);
		System.out.printf("\nO imposto sera de : US$" + imposto);

	}

}
