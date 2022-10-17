import java.util.Scanner;

public class Mayor {


	private static Scanner entrada;

	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		entrada = new Scanner (System.in);

		System.out.println("Escribe el número A");
		while (!entrada.hasNextInt()) {
			System.out.println("Escribe UN NUMERO!");
			entrada.nextLine();
		} 
		num1 = entrada.nextInt();
		System.out.println("Escribe el número B");
		while (!entrada.hasNextInt()) {
			System.out.println("Escribe UN NUMERO!");
			entrada.nextLine();
		} 
		num2 = entrada.nextInt();
		System.out.printf("Número A: %d\tNúmero B: %d\n",num1,num2);

		if (num1 == num2) {
			System.out.println("A y B son iguales");
		} else {
			if (num1 < num2) {
				System.out.println("El número B es mayor");
			}
			else {
				System.out.println("El número A es mayor");
			}
		}
	}

}
