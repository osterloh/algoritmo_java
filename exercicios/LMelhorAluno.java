package algoritmo.exercicios;

import java.util.Scanner;

public class LMelhorAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int alunos = 0, cont = 1;
		String nome = "", melhor = "";
		double nota = 0, maior = 0;
		
		System.out.print("Quantos alunos tem na turma? ");
		alunos = teclado.nextInt();
		
		while (cont <= alunos) {
			System.out.println(cont + "o. Aluno");
			System.out.print("Qual o nome do aluno? ");
			nome = teclado.next();
			System.out.print("Qual a nota do aluno " + nome + "? ");
			nota = teclado.nextDouble();
			
			if (nota > maior) {
				maior = nota;
				melhor = nome;
			}
			
			cont = cont + 1;
		}
		
		System.out.println("O melhor aproveitamento foi de: " + melhor + ", com a nota de: " + maior);

	}

}
