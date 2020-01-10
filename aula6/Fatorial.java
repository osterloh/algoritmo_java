package algoritmo.aula6;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0, fat = 1, cont = 0;
		
		System.out.print("Digite um numero int positivo: ");
		valor = teclado.nextInt();
		
		cont = valor;
		
		do {
			fat = fat * cont;
			cont = cont - 1;
			
		} while (cont >= 1);
		
		System.out.println("Fatorial de " + valor + " eh: " + fat);

	}

}
