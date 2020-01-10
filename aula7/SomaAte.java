package algoritmo.aula7;

import java.util.Scanner;

public class SomaAte {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int valor = 0, cont = 0, soma = 0;
		
		System.out.print("Repetir ate: ");
		valor = in.nextInt();
		
		for (int i = 1; i <= valor; i++) {
			System.out.print("Digite um valor: ");
			cont = in.nextInt();
			soma = soma + cont;
		}
		
		System.out.println("A soma dos valores eh: " + soma);

	}

}
