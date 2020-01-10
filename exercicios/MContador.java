package algoritmo.exercicios;

import java.util.Scanner;


public class MContador {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int opcao = 0, cont = 0;
		
		do {
			System.out.println("\n[1] De 1 a 10");
			System.out.println("[2] De 11 a 20");
			System.out.println("[3] Sair");
			System.out.print("Digite a opcao desejada: ");
			opcao = in.nextInt();
			
			switch (opcao) {
			case 1:
				cont = 1;
				do {
					System.out.print(cont + ".. ");
					cont = cont + 1;
					
				} while (cont <= 10);
				break;
				
			case 2:
				cont = 11;
				do {
					System.out.print(cont + ".. ");
					cont = cont + 1;
					
				} while (cont <= 20);
				break;
				
			case 3:
				System.out.println("Fim da aplicacao");
				break;
			}
			
		} while (opcao != 3);
		System.out.println("Encerrando...");

	}

}
