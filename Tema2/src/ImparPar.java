import java.util.Scanner;

public class ImparPar {

		private static Scanner entrada;

		public static void main(String[] args) {
			
			entrada = new Scanner(System.in);
			
			System.out.println("Introduce un número");
			
			int numero = entrada.nextInt();
			
			if ((numero & 1) == 0) {
			//if ((numero % 2) == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
	}

}
