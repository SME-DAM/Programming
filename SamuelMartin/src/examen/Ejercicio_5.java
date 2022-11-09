package examen;

import java.util.Scanner;

public class Ejercicio_5 {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduzca hasta donde hay que calcular");
		int target = sc.nextInt();
		String salida = "";
		for (int numero = 2; numero <= target; numero++) {
			boolean found = false;
			for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
				if (numero%divisor==0) {
					found = true;
				}
			}
			if (!found) {
				salida += numero;
				salida += " ";
			}
		}System.out.printf("Primos hasta %d\n",target);
		System.out.print(salida);
	}
}
