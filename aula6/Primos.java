package algoritmo.aula6;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int cont = 1, valor = 0, div = 0;
		
		System.out.print("Digite um valor: ");
		valor = in.nextInt();
		
		do {

			if ((valor % cont) == 0) {
				div = div + 1;
				
			}
			
			cont = cont + 1;
			
		} while (cont <= valor);
		
		if (div > 2) {
			System.out.println(valor + " nao eh primo!!!");
			
		} else {
			System.out.println(valor + " eh primo!!!");

		}

	}

}
