package algoritmo.aula2;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double a = 2, b = 3, c = 5;
		
		boolean o1 = ((a==b)||(c>a));
		boolean o2 = ((a!=b)&&(c<a));
		boolean o3 = ((a+b)==(c));
		boolean o4 = ((a==3)&&(c>=5));

		System.out.printf("| A: %s | B: %s | C: %s | \n", a, b, c);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);

	}

}
