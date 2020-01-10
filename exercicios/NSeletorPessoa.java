package algoritmo.exercicios;

import java.util.Scanner;

public class NSeletorPessoa {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int idade = 0, somah = 0, somaf = 0, cabelo = 0;
		String resp = "", sexo = "";
		
		System.out.println("------ Sistema Seletor de Pessoas ------");
		System.out.println("=========================================");
		
		while (!resp.equals("n")) {
			while ((!sexo.equalsIgnoreCase("m")) && (!sexo.equalsIgnoreCase("f"))) {
				System.out.print("Qual o sexo? [m/f] ");
				sexo = in.nextLine();
				if ((!sexo.equalsIgnoreCase("m")) && (!sexo.equalsIgnoreCase("f"))) {
					System.out.println("Opcao invalida!!!");
				}
			}
			
			if (sexo.equals("m")) {
				sexo = "Masculino";
			} else {
				sexo = "Feminino";
			}
			
			System.out.print("Qual a idade? ");
			idade = in.nextInt();
			
			do {
				System.out.println("Qual a cor do cabelo? ");
				System.out.println("[1] Preto");
				System.out.println("[2] Castanho");
				System.out.println("[3] Loiro");
				System.out.println("[4] Ruivo");
				cabelo = in.nextInt();
				
				if ((sexo.equals("Masculino")) && (idade >= 18) && (cabelo == 2)) {
					somah = somah + 1;
					
				} else if ((sexo.equals("Feminino")) && (idade >= 25) && (idade <= 30) && (cabelo == 3)) {
					somaf = somaf + 1;
				}
			} while ((cabelo <= 0) || (cabelo >= 5));
			
			System.out.print("Deseja continuar? [s/n] ");
			in.nextLine();
			resp = in.nextLine();
			if ((!resp.equalsIgnoreCase("s")) && (!resp.equalsIgnoreCase("n"))) {
				System.out.println("Opcao invalida!!!");
			}
			
			System.out.println("=========================================");
		
		}
		
		System.out.println("----- Resultado final das contagens -----");
		System.out.println("=========================================");
		System.out.print("Homens maiores de 18 anos com cabelo Castanho: " + somah);
		System.out.print("\nMulheres entre 25 e 30 anos com cabelo Loiro: " + somaf);

	}

}
