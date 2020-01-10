package algoritmo.aula9_Vetor;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String nome[] = new String[4];
		double n1[] = new double[4], n2[] = new double[4], media[] = new double[4];
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("Aluno " + (i+1));
			System.out.print("Nome: ");
			nome[i] = in.next();
			System.out.print("Primeira nota: ");
			n1[i] = in.nextDouble();
			System.out.print("Segunda nota: ");
			n2[i] = in.nextDouble();
			
			media[i] = (n1[i] + n2[i]) / 2;
			
		}
		
		System.out.println("----------------------------");
		System.out.println("Listagem de Alunos");
		System.out.println("----------------------------");
		for (int i = 0; i <= 3; i++) {
			System.out.println(nome[i] + media[i]);
		}

	}

}
