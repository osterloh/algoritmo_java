package algoritmo.exercicios;

import java.util.Scanner;

public class QTorneioFutebol {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String time[] = new String[10];
		
		System.out.println("---------------------------");
		System.out.println("-- Campeonato de Futebol --");
		System.out.println("---------------------------");
		
		for (int i = 0; i <= 9; i++) {
			System.out.print("Nome do " + (i+1) + "o time: ");
			time[i] = in.next();
		}
		
		System.out.println("------------------------");
		System.out.println("-- Tabela de Partidas --");
		System.out.println("------------------------");
		
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if (i != j) {
					System.out.printf("%-12s %10s %s\n", time[i], " [ ] x [ ] ", time[j]);
				}
			}
		}

	}

}
