import java.util.Scanner;

public class Multiplicacion {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		System.out.println("Introduce un número entero");

		int num1 = 0, num2 = 0, resultado = 0;
		num1 = entrada.nextInt();
		System.out.println("Introduce un número entero");
		num2 = entrada.nextInt();

		for (int contador = 0; contador < num1; contador++) {
			resultado += num2;
		}
		System.out.printf("%d por %d da: %d",num1,num2,resultado);
	}

}
