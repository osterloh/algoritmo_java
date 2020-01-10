package algoritmo.aula8_FuncaoRotina;

public class ParametroValor {
	
	public static void soma(int a, int b) {
		a = a + 1;
		b = b + 2;
		
		System.out.println("Valor de A eh: " + a);
		System.out.println("Valor de B eh: " + b);
		System.out.println("A soma de A e B eh: " + (a + b));
		
	}

	public static void main(String[] args) {
		
		int x = 4, y = 10;
		
		soma(x, y);
		
		System.out.println("Valor de X eh: " + x);
		System.out.println("Valor de Y eh: " + y);
		
	}

}
