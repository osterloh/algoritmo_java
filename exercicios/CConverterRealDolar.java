package algoritmo.exercicios;

import java.util.Scanner;

public class CConverterRealDolar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double dolar = 0.0;
		double reais = 0.0;
		String nome = "";
		
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Informe o valor atual do Dolar: ");
		dolar = teclado.nextDouble();
		System.out.println("Quantos Reais voce tem? ");
		reais = teclado.nextDouble();
		
		System.out.println(nome + "\nCom R$" + reais + ", voce conseguira ter US$" + (reais / dolar));

	}

}
