package algoritmo.aula8_FuncaoRotina;

public class SomaProcedimento {

	public static void soma(int a, int b) {
		System.out.println("Recebi o valor: " + a);
		System.out.println("Recebi o valor: " + b);
		System.out.println("A soma entre os dois eh: " + (a + b));
	}
	
	public static void main(String[] args) {
		int x = 0, y = 0;
		
		x = 5;
		y = 3;
		soma(x, y);

	}

}
