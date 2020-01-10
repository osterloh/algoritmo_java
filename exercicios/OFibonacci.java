package algoritmo.exercicios;

public class OFibonacci {

	public static void main(String[] args) {
		
		int a = 0, b = 1, num = 15;
		
		for (int i = 0; i < num; i++) {
			if (num == 1 || num == 2) {
				System.out.print(1 + ".. ");
			} else {
				b = b + a;
				a = b - a;
				System.out.print(a + ".. ");
			}
		}
	}
}