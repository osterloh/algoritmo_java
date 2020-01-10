package algoritmo.aula5;

import java.util.Scanner;

public class SomaValorMaior {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0, num = 1, soma = 0, maior = 0;

		while (num <= 5) {
			System.out.print("Digite o " + num + "o. valor: ");
			valor = teclado.nextInt();
			
			if (valor > maior) {
				maior = valor;
			}
			
			soma = soma + valor;
			num = num + 1;
			
		}
		System.out.println(soma);
		System.out.println("O maior valor informado foi: " + maior);

	}

}
