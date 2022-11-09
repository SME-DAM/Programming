package examen;

import java.util.Scanner;

public class Ejercicio_7 {

	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduzca los valores de la serie:");
		String serie = sc.next();
		System.out.println("Histograma de la serie:");
		boolean stop = false;
		while (!stop) {
			int n = Integer.parseInt(serie);
			if (n > 0) {
				for (int j =0; j < n;j++) {
					System.out.print('#');
				}
				System.out.print('\n');
			} else {
				stop = true;
			}
			serie = sc.next();
		}
	}
}
