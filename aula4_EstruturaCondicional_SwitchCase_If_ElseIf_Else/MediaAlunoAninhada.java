package algoritmo.aula4_EstruturaCondicional_SwitchCase_If_ElseIf_Else;

import java.util.Scanner;

public class MediaAlunoAninhada {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		
		System.out.println("Informe as notas do aluno:");
		System.out.print("Nota 1: ");
		n1 = teclado.nextDouble();
		System.out.print("Nota 2: ");
		n2 = teclado.nextDouble();
		System.out.print("Nota 3: ");
		n3 = teclado.nextDouble();
		System.out.print("Nota 4: ");
		n4 = teclado.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		System.out.println(media);
		
		if (media >= 7) {
			System.out.println("Aluno APROVADO");
			
		} else if ((media >= 4) && (media < 7)) {
			System.out.println("Aluno em EXAME");
			
		} else {
			System.out.println("Aluno REPROVADO");

		}

	}

}
