package algoritmo.exercicios;

import java.util.Scanner;

public class PAnalisadorValores {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int valor = 0, soma = 0, media = 0, par = 0, divi = 0, nulo = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite um numero: ");
			valor = in.nextInt();
			
			soma = soma + valor;
			media = soma / 5;
			
			if ((valor % 5) == 0) {
				divi = divi + 1;
			}
			
			if (valor == 0) {
				nulo = nulo + 1;
			}
			
			if ((valor % 2) == 0) {
				par = par + valor;
			}
			
		}
		
		System.out.println("A soma dos valores digitados eh: " + soma);
		System.out.println("A media dos valores digitados eh: " + media);
		System.out.println(divi + " sao divisiveis por 5");
		System.out.println(nulo + " sao nulos");
		System.out.println("A soma dos valores pares eh: " + par);

	}

}
