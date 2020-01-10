package algoritmo.aula2_OperadoresLogicosRelacionais;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		// Operador logico
		int n1 = 10;
		String n2 = "10";
		double n3 = 10;
		
		String r1 = (n1 == n3 ? "Sim" : "Nao");
		String r2 = (n1 != n3 ? "Sim" : "Nao");
		
		System.out.println("N1 eh igual ah n3? " + r1);
		System.out.println("N1 eh diferente de n3? " + r2);
		
		int n22 = Integer.parseInt(n2);
		String r3 = (n1 == n22 ? "Sim" : "Nao");
		String r4 = (n1 != n22 ? "Sim" : "Nao");
		
		System.out.println("N1 eh igual ah n22? " + r3);
		System.out.println("N1 eh diferente de n22? " + r4);
		
		System.out.println("**********************************");
		// Operadores Relacionais
		int a = 2, b = 3, c = 5;
		System.out.printf("| A: %s | B: %s | C: %s | \n", a, b, c);
		System.out.println("A > B : " + (a > b));
		System.out.println("A < B : " + (a < b));
		System.out.println("A >= B : " + (a >= b));
		System.out.println("A <= B : " + (a <= b));
		System.out.println("c >= (a + b) : " + (c >= (a + b)));
		System.out.println("c != (a + b) : " + (c != (a + b)));

	}

}
