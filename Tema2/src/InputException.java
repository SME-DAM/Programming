import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			try {
				for (int t = 1; t<=5;t++) {
					System.out.printf("Introduzca numero %d: ",t);
					sc.nextInt();
				}
				done = true;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("Eso no es un numero!");
			}
		}
		System.out.println("Gracias");
	}

}
