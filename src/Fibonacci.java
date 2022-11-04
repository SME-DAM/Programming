import java.util.Scanner;

public class Fibonacci {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Numero a calcular: ");
		int n = sc.nextInt();
		int aux = 0, out=1,last=0;
		for (int i = 0; i < n; i++) {
			System.out.printf("%d,",out);
			last = aux;
			aux = out;
			out = last + aux;
		}
	}

}
