package algoritmo.aula6_EstruraRepeticao_DoWhile;

import java.util.Scanner;

public class NumNegativos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0, cont = 1, neg = 0;
		
		do {
			System.out.print("Digite um numero: ");
			valor = teclado.nextInt();
			
			if (valor < 0) {
				neg = neg + 1;
			}
			
			cont = cont + 1;
			
		} while (cont <= 5);
		
		System.out.println("Total de negativos: " + neg);

	}

}
