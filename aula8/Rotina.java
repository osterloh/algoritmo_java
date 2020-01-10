package algoritmo.aula8;

import java.util.Scanner;

public class Rotina {
	
	public static void topo( double maior) {
		
		System.out.println("=======================");
		System.out.println("Maior peso eh: " + maior);
		System.out.println("=======================");
	}
	
	public static void main(String[] args) {
		
		double maior = 0;
		topo(maior);
		
		Scanner in = new Scanner(System.in);
		
		String nome = "", pesado = "";
		double peso = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o nome: ");
			nome = in.next();
			System.out.print("Digite o peso de " + nome + ": ");
			peso = in.nextDouble();
			
			if (peso > maior) {
				maior = peso;
				pesado = nome;
			}
			
			topo(maior);
		}
		
		topo(maior);
		System.out.println("A pessoa mais pesada foi: " + pesado + ", com " + maior + " Kg");

	}

}