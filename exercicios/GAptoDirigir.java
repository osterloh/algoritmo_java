package algoritmo.exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class GAptoDirigir {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int ano = cal.get(Calendar.YEAR);
		int nasc = 0;
		
		System.out.println("########################");
		System.out.println("DEPARTAMENTO DE TRANSITO");
		System.out.println("########################");
		
		System.out.println("\nInforme o ano de nescimento: ");
		nasc = teclado.nextInt();
		System.out.println("\n");
		
		int idade = ano - nasc;
		
		System.out.println("-----------STATUS-------------");
		System.out.println("Estamos no ano " + ano);
		System.out.print("Voce nasceu em " + nasc);
		System.out.println(" e tem " + idade + " anos.");
		
		if (idade >= 18) {
			System.out.println("Voce ja pode tirar a carteira e dirigir!!!");
		} else {
			System.out.println("Que pena, voce ainda eh de menor, nao pode dirigir.");

		}
		

	}

}
