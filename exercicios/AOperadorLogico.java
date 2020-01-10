package algoritmo.exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class AOperadorLogico {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double l1 = 0, l2 = 0, l3 = 0;
		
		System.out.print("Digite o primeiro valor: ");
		l1 = teclado.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		l2 = teclado.nextDouble();
		
		System.out.print("Digite o terceiro valor: ");
		l3 = teclado.nextDouble();
		
		boolean eq = ((l1 == l2) && (l2 == l3));
		boolean es = ((l1 != l2) && (l2 != l3) && (l1 != l3));
		boolean tri = ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2));
		
		System.out.println("O triangulo eh EQUILATERO? " + eq);
		System.out.println("O triangulo eh ESCALENO? " + es);
		System.out.println("Pode formar um TRIANGULO? " + tri);

	}

}
