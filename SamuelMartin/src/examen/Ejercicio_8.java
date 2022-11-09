package examen;

import java.util.Scanner;

public class Ejercicio_8 {

	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduzca tope de la serie:");
		int n = sc.nextInt();
		long s = 0;
		for (int i = 1; i <= n; i+=4) {
			s += i*i;
		}
		System.out.print(s);
	}
}
