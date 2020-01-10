package algoritmo.aula9;

import java.util.Scanner;

public class VetorCont {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int list[] = new int[6];
		
		for (int i = 0; i <= 5; i++) {
			System.out.print("Digite o " + (i+1) + "o valor: ");
			list[i] = in.nextInt();
			
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("{" + list[i] + "}");
		}

	}

}
