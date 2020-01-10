package algoritmo.aula7;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int valor = 0, num = 0;
		
		System.out.print("Digite um valor: ");
		valor = in.nextInt();
		
		for (int i = 0; i <= valor; i+=2) {
			System.out.print(i + ".. ");
		}
		
		System.out.print("\nDigite outro valor: ");
		num = in.nextInt();
		if ((num % 2) == 1) {
			num = num - 1;
		}
		
		for (int i = num; i >= 0; i-=2) {
			System.out.print(i + ".. ");
		}

	}

}
