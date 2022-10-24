import java.util.Scanner;

public class Priramide {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean ready = false;
		int height=0;
		while (!ready) {
			try {
				System.out.println("Introduce un número entero mayor que cero");
				height=sc.nextInt();
				if (height>0) ready=true;
			} catch (NullPointerException e) {
				System.out.println("No es un número valido");
			}
		}
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= (height -i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("$ ");
			}
			System.out.print("\n");
		}
		for (int i = height; i >= height; i--) {
			for (int j = 1; j >= (height -i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j >= i; j++) {
				System.out.print("$ ");
			}
			System.out.print("\n");
		}
	}

}
