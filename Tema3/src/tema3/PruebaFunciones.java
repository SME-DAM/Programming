package tema3;

import tema3.matematicas.*;

import java.util.Scanner;

public class PruebaFunciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		// Prueba esPrimo()
		System.out.println("*** FUNCION esPrimo ***");
		System.out.println("Introduzca un n�mero entero positivo: ");
		n = entrada.nextInt();
		boolean primo = Varias.esPrimo(n);
		if (primo) {
		//if (tema3.matematicas.Varias.esPrimo(n)) {
			System.out.println("El " + n + " es primo.");
		} else {
			System.out.println("El " + n + " no es primo.");
		}
		
		
		
		// Prueba digitos()
		System.out.println("*** FUNCION digitos de un n� ***");
		System.out.println("Introduzca un n�mero entero positivo: ");
		n = entrada.nextInt();
		System.out.println("El n� " + n + " tiene " + Varias.digitos(n) + " d�gitos.");
		
		
		
		
		// Prueba volumenCilindro()
		System.out.println("*** FUNCION volumen de un cilindro ***");
		double r, h;
		System.out.print("Introduzca el radio en metros: ");
		r = entrada.nextDouble();
		System.out.print("Introduzca la altura en metros: ");
		h = entrada.nextDouble();
		System.out.println("El volumen del cilindro es " + Geometria.volumenCilindro(r, h) + " m3");
		
		
		// Prueba ecucion de 2� grado
		System.out.println("*** FUNCION volumen de un cilindro ***");
		entrada.close();
	}

}
