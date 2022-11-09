package examen;

import java.util.Scanner;

public class Ejercicio_6 {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduzca hasta donde hay que calcular");
		int target = sc.nextInt();
		int salida = 0;
		for (int numero = 1; numero <= target; numero+=2) {
			boolean found = false;
			for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
				if (numero%divisor==0) {
					found = true;
				}
			}
			if (found || numero==1) {
				salida += numero;
			}
		}System.out.printf("Suma de impares no primos hasta %d\n",target);
		System.out.print(salida);
	}
}
