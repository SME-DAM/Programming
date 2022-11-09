package examen;

import java.util.Scanner;

public class Ejercicio_4 {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduzca los valores emplear en el calculo:");
		int mayor=0, total=0, impares=0;
		float media=0;
		boolean stop = false;
		while(!stop) {
			int n = sc.nextInt();
			if (n > 0) {
				total++;
				if (n%2==0) {
					if (n > mayor) {
						mayor=n;
					}
				} else {
					impares++;
					media += n;
				}
			} else {
				stop = true;
			}
		}
		System.out.printf("Se han introducido %d numeros\n",total);
		System.out.printf("El par más grande es: %d\n",mayor);
		if (impares>0) {
			media/=impares;
			System.out.printf("La media de los impares es: %.3f\n", media);
		}
		
	}

}
