package algoritmo.aula7;

public class ContaDez {

	public static void main(String[] args) {
		
		System.out.println("De 0 ate 10");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("======================");
		System.out.println("De 4 ate 10");
		for (int i = 4; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("======================");
		System.out.println("De 0 ate 10 pulando de 2");
		for (int i = 0; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("======================");
		System.out.println("De 10 para 0");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

	}

}
