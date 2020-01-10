package algoritmo.aula9_Vetor;

import java.util.Scanner;

public class VetorParPosicao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int vet[] = new int[6];
		int par = 0;
		
		for (int i = 0; i <= 5; i++) {
			System.out.print("Digite o " + (i+1) + "o valor: ");
			vet[i] = in.nextInt();
		}
		
		for (int i = 0; i <= 5; i++) {
			if ((vet[i] % 2) == 0) {
				par = par + 1;
				System.out.println("Valor Par na posicao: " + (i + 1));
			}
			
		}
		
		System.out.println("Foram digitados " + par + " valores pares.");

	}

}
