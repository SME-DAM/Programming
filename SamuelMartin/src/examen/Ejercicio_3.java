package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_3 {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int option = 0;
		while (true) {
			try {
				System.out.println("introduzca que desea calcular(1-3):\n\t1.- Triangulo"
						+ "\n\t2.- Cuadrado\n\t3.- Rectangulo");
				option = sc.nextInt();
			
			switch (option) {
			case 1:
					float width=0, height=0;
					System.out.println("introduzca la base");
					width = sc.nextInt();
					System.out.println("introduzca la altura");
					height = sc.nextInt();
					float area=(width*height)/2;
					if (area > 0) {
						System.out.printf("El área es %.2f\n", area);
					} else {
						System.out.println("Revisa los valores");
					}
				break;
			case 2:
					int side=0;
					System.out.print("introduzca el lado\n");
					side = sc.nextInt();
					float area1=(side*side);
					if (area1 > 0) {
						System.out.printf("El área es %.2f\n", area1);
					} else {
						System.out.println("Revisa los valores");
					}
				break;
			case 3:
					float width1=0, height1=0;
					System.out.println("introduzca la base");
					width1 = sc.nextInt();
					System.out.println("introduzca la altura");
					height1 = sc.nextInt();
					float area2=(width1*height1);
					if (area2 > 0) {
						System.out.printf("El área es %.2f\n", area2);
					} else {
						System.out.println("Revisa los valores");
					}
				break;
				} 
			}
			catch (InputMismatchException ex) {
				System.out.println("Operación no valida, revise los datos.");
				sc.next();
			}
		}
	}

}
