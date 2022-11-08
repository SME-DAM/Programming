import java.util.Scanner;

public class ImparParV2 {

		private static Scanner entrada;

		public static void main(String[] args) {
			
			entrada = new Scanner(System.in);

			System.out.println("Introduce un número mayor que cero");
			
			int numero = 0;
			
			while (numero<=0) {
				numero = entrada.nextInt();
				System.out.println("Introduce un número mayor que cero");
			}
			//if ((numero & 1) == 0) {
			if ((numero % 2) == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
	}

}
