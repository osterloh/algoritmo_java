package algoritmo.aula4;

import java.util.Scanner;

public class SalarioDependente {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dependete = 0;
		double salario = 0, salarioNovo = 0;
		String nome = "";

		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe o salario: R$");
		salario = teclado.nextDouble();
		System.out.print("Informe a quantia de dependentes: ");
		dependete = teclado.nextInt();
		
		switch (dependete) {
			case 0:
				salarioNovo = salario + (salario * 5 / 100);
				break;
				
			case 1: case 2: case 3:
				salarioNovo = salario + (salario * 10 / 100);
				break;
				
			case 4: case 5: case 6:
				salarioNovo = salario + (salario * 15 / 100);
				break;
	
			default:
				salarioNovo = salario + (salario * 18 / 100);
				break;
		}
		System.out.println(nome + " seu salario com reajuste de dependentes sera de: R$" + salarioNovo);

	}

}
