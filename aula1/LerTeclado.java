package algoritmo.aula1;

import java.util.Scanner;

public class LerTeclado {

	public static void main(String[] args) {
		// 1a parte:
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("Digite o nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();
		
		System.out.println("O nome eh: "+nome+"\nA idade eh: "+idade);
		
		// 2a parte:
		System.out.println("\n***********************************************\n");
		int n1, n2, s;
		
		System.out.println("Digite um valor inteiro: ");
		n1 = teclado.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		n2 = teclado.nextInt();
		System.out.print("A soma entre " + n1 + " + " + n2 + ": ");
		s = n1+n2;
		System.out.println(s);

	}

}
