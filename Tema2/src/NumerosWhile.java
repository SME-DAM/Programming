import java.util.Scanner;

public class NumerosWhile {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Input the top number: ");
		int limite = sc.nextInt();
		int contador = 1;
		boolean fin=false;
		System.out.printf("%d", contador);
		while (!fin) {
			contador += 1;
			System.out.printf(", %d", contador);
			if (contador >= limite) {
				System.out.println(".");
				fin = true;
			}
		}
	}
}
