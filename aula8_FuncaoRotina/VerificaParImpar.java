package algoritmo.aula8_FuncaoRotina;

import java.util.Scanner;

public class VerificaParImpar {
	
	public static void ParImpar(int num) {
		if ((num % 2) == 0) {
			System.out.println("O valor: " + num + " eh par.");
			
		} else {
			System.out.println("O valor: " + num + " eh impar.");

		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Digite um valor: ");
		valor = in.nextInt();
		
		ParImpar(valor);

	}

}
