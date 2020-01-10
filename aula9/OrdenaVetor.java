package algoritmo.aula9;

import java.util.Scanner;

public class OrdenaVetor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int vet[] = new int[4], aux = 0;
		
		for (int i = 0; i <= 3; i++) {
			System.out.print("Digite um valor: ");
			vet[i] = in.nextInt();
			
		}
		
		for (int i = 0; i <= 2; i++) {
			for (int j = i+1; j <= 3; j++) {
				if (vet[i] > vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;	
				}
			}
		}
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("(" + vet[i] + ")");
		}

	}

}
