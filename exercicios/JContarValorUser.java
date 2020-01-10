package algoritmo.exercicios;

import java.util.Scanner;

public class JContarValorUser {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0, contador = 0;
		
		System.out.print("Digite um número inteiro positivo: ");
		valor = teclado.nextInt();
		
		while (contador <= valor) {
			System.out.println(contador);
			contador = contador + 1;
		}
		System.out.println("Encerrado a contagem!!!");

	}

}
