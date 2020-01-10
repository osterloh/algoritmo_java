package algoritmo.aula5_EstruturaRepeticao_While;

public class ContarDez {

	public static void main(String[] args) {
		
		int valor = 0;
		
		while (valor <= 10) {
			System.out.println(valor);
			valor = valor + 1;
		}
		
		// 2a Parte
		System.out.println("Sistema encerrado!!!\n");
		
		
		// Teste:
		
		int num = 10;
		while (num >= 0) {
			System.out.println(num);
			num = num - 1;
			
		}
		System.out.println("Contado!!!");

	}

}
