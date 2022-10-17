import java.util.Scanner;

public class AdivinaLetra {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		char letra = 0x74;
		System.out.println("Adivina la letra que he pensado.");
		System.out.println("Introduce un caracter (Ojo, distigue may�sculas)");
		char ch = entrada.next().charAt(0);
		
		if (ch == letra) {
			System.out.println("Has acertado!");
		} else {
			System.out.println("Mas suerte la proxima");	
		}
		System.out.println("FIN!");
	}

}
