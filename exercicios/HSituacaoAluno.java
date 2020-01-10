package algoritmo.exercicios;

import java.util.Scanner;

public class HSituacaoAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		String aluno = "";
		
		System.out.println("********BOLETIM ESCOLAR********");
		System.out.print("Informe o nome do aluno: ");
		aluno = teclado.nextLine();
		System.out.print("\nInforme a Nota 1 do aluno: ");
		n1 = teclado.nextDouble();
		System.out.print("\nInforme a Nota 2 do aluno: ");
		n2 = teclado.nextDouble();
		System.out.print("\nInforme a Nota 3 do aluno: ");
		n3 = teclado.nextDouble();
		System.out.print("\nInforme a Nota 4 do aluno: ");
		n4 = teclado.nextDouble();
		
		System.out.println("\n\n********SITUACAO DO ALUNO********");
		System.out.println("Querido aluno " + aluno + ", voce possui as seguintes notas:");
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n2);
		System.out.println("Nota 3: " + n3);
		System.out.println("Nota 4: " + n4);
		
		double media = (n1+n2+n3+n4)/4;
		
		System.out.println(aluno + " sua media foi: " + media);
		
		if (media >= 7) {
			System.out.println("Parabens foi aprovado!!!");
		} else {
			System.out.println("Que pena, voce reprou, tente no proximo ano!!!");

		}

	}

}
