package algoritmo.aula4;

import java.util.Scanner;

public class Doacao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao = 0;
		double valor = 0;
		
		System.out.println("--------------------------");
		System.out.println("     AJUDE O PROFESSOR    ");
		System.out.println("--------------------------");
		System.out.println("[1] Para doar R$10,00");
		System.out.println("[2] Para doar R$20,00");
		System.out.println("[3] Para doar R$50,00");
		System.out.println("[4] Para doar outro valor");
		System.out.println("[5] Para cancelar");
		System.out.print("Digite a opcao desejada: ");
		opcao = teclado.nextInt();
		
		switch (opcao) {
			case 1:
				valor = 10;
				break;
			
			case 2:
				valor = 20;
				break;
					
			case 3:
				valor = 50;
				break;
			
			case 4:
				System.out.println("Qual o valor da doacao? R$");
				valor = teclado.nextDouble();
				break;
			
			case 5:
				System.out.println("Obrigado pela atencao");
				break;
				
		}
		System.out.println("--------------------------");
		System.out.println("Sua doacao foi de: R$" + valor);

	}

}
