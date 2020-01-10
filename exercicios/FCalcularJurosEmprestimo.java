package algoritmo.exercicios;

import java.util.Scanner;

public class FCalcularJurosEmprestimo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double emprestimo = 0.0;
		int parcelas = 0;
		
		System.out.printf("Informe o valor do emprestimo: R$");
		emprestimo = teclado.nextDouble();
		System.out.printf("\nParcelado em quantas vezes? ");
		parcelas = teclado.nextInt();
		
		System.out.println("\nSera pago " + parcelas + " de R$" + (emprestimo*0.20));

	}

}
