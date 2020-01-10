package algoritmo.aula3;

import java.util.Calendar;
import java.util.Scanner;

public class VerificaMaioridade {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int ano = cal.get(Calendar.YEAR);
		int nasc = 0;
		
		System.out.print("Digite o ano de nascimento: ");
		nasc = teclado.nextInt();
		
		int idade = (ano - nasc);
		
		if (idade >= 18) {
			System.out.println("\nVoce nasceu no ano de " + nasc +
							   " e tem " + idade +
							   ", voce atingiu a maioridade!!!");
		}
		
	}

}
