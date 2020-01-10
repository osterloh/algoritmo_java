package algoritmo.aula1;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double m1, m2, media;
		
		System.out.println("Digite o primeiro valor: ");
		m1 = teclado.nextInt();
		System.out.println("Digite o sugundo valor: ");
		m2 = teclado.nextInt();
		media = (m1+m2)/2;
		System.out.println("A media entre " + m1 + " e " + m2 + " eh: " + media);

	}

}
