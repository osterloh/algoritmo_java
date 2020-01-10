package algoritmo.aula6;

import java.util.Scanner;

public class RepetirAte {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0, soma = 0;
		String resp = "";
		
		do {
			System.out.print("Digite um valor: ");
			valor = teclado.nextInt();
			soma = soma + valor;
			System.out.print("Deseja continuar? [s/n] ");
			resp = teclado.next();
			
		} while (resp.equals("s"));
		
		System.out.println("A soma dos valores eh: " + soma);

	}

}
