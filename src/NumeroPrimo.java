import java.util.Scanner;

public class NumeroPrimo {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean primo = true;
		System.out.print("Introduzca un número: ");
		int numero = sc.nextInt();
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if(numero%i==0) {
				System.out.printf("El numero %d es multiplo de %d.\n",numero,i);
				primo=false;
				break;
			}
		}
		System.out.printf("El numero %d %ses primo!\n",numero,primo?"":"no ");
	}
}
