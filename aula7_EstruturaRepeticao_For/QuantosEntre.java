package algoritmo.aula7_EstruturaRepeticao_For;

import java.util.Scanner;

public class QuantosEntre {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int repete = 0, qtd = 0, valor = 0;
		
		System.out.print("Repetir quantas vezes? ");
		repete = in.nextInt();
		
		for (int i = 1; i <= repete; i++) {
			System.out.print("Digite um valor: ");
			valor = in.nextInt();
			
			if ((valor >= 0) && (valor <= 10)) {
				qtd = qtd + 1;
			}
		}
		
		System.out.println("Foram digitados " + qtd + " valores entre 0 e 10");

	}

}
