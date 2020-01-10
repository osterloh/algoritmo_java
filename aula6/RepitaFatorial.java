package algoritmo.aula6;

import java.util.Scanner;

public class RepitaFatorial {

	public static void main(String[] args) {
		
		// BUGADASSOOOOOOOOOOOOOOOOOOOOOOOO
		
		Scanner teclado = new Scanner(System.in);
		
		String resp;
		
		do {
			System.out.print("Digite um numero int positivo: ");
			int valor = teclado.nextInt();
			
			int cont = valor, fat = 1;
			
			while (cont >= 1) {
				fat = fat * cont;
				cont = cont - 1;
				
			}
			
			System.out.println("Fatorial de " + valor + " eh: " + fat);
			System.out.print("Deseja continuar? [s/n] ");
			//teclado.nextLine();
			resp = teclado.next();
		
		} while (resp.equals("s"));

	}

}
