import java.util.Scanner;

public class CalculadoraV2 {

	private static Scanner entrada;

	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		entrada = new Scanner (System.in);

		System.out.println("Operando 1");
		
		//esperamos que entre un entero
		while (!entrada.hasNextInt()) {
			System.out.println("Solo numeros!");
			entrada.nextLine();
		} 
		num1 = entrada.nextInt();
		
		System.out.println("Operando 2");
		
		//esperamos que entre un entero
		while (!entrada.hasNextInt()) {
			System.out.println("Solo numeros!");
			entrada.nextLine();
		} 
		num2 = entrada.nextInt();

		System.out.println("Operacion a realizar:");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplica");

		int op = entrada.nextInt();
		
		if (op > 3 || op < 1) {
			System.out.println("Operacion no valida");
		} else {
			if (op == 1) {
				System.out.printf("%d + %d da: %d\n",num1, num2, num1 + num2);
			} else if (op == 2) {
				System.out.printf("%d - %d da: %d\n",num1, num2, num1 - num2);
			} else {
				System.out.printf("%d * %d da: %d\n",num1, num2, num1 * num2);
			}
		}
	}


}
