package algoritmo.aula6_EstruraRepeticao_DoWhile;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0, result = 0, cont = 1;
		
		System.out.print("Digite um valor da tabuada: ");
		valor = teclado.nextInt();
		do {
			result = valor * cont;
			System.out.println(valor + " x " + cont + " = " + result);
			cont = cont + 1;
			
		} while (cont <= 10);

	}

}
