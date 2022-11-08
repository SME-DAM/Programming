import java.util.Scanner;

public class Calculadora {

	private static Scanner entrada;

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator");

		int num1 = 0, num2 = 0;
		entrada = new Scanner (System.in);

		System.out.println("Type the first number");
		
		//esperamos que entre un entero
		while (!entrada.hasNextInt()) {
			System.out.println("Type a NATURAL NUMBER!");
			entrada.nextLine();
		} 
		num1 = entrada.nextInt();
		
		System.out.println("Type the second number");
		
		//esperamos que entre un entero
		while (!entrada.hasNextInt()) {
			System.out.println("Type a NATURAL NUMBER!");
			entrada.nextLine();
		} 
		num2 = entrada.nextInt();
		
		//multiplica
		System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));
		//divide si divisor diferente de 0, si no di que no es posible
		if (num2 !=0) {
			System.out.printf("%d / %d = %f\n",num1,num2, (float)num1 / (float)num2);
		} else {
			System.out.println("Can't divide by 0");
		}
		//suma
		System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
		//resta
		System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
	}


}
