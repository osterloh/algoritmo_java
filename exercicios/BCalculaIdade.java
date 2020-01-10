package algoritmo.exercicios;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class BCalculaIdade {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int ano = cal.get(Calendar.YEAR);
		int nasc = 0;
		String nome = "";
		
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Informe o ano de nascimento: ");
		nasc = teclado.nextInt();
		
		System.out.println(nome + "\nVoce nasceu no ano de: " + nasc);
		System.out.println("E voce tem: " + (ano - nasc) + " anos!!!");

	}

}
