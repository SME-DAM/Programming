import java.util.Scanner;

public class MayorMenor {


	private static Scanner entrada;
	
	public static int max(int a, int b) {
		return((a>b)?a:b);
	}
	
	public static int min(int a, int b) {
		return((a>b)?b:a);
	}

	public static void main(String[] args) {

		int num1 = 0, num2 = 0, num3 = 0;
		entrada = new Scanner (System.in);

		System.out.println("Numero 1");
		
		//esperamos que entre un entero
		while (!entrada.hasNextInt()) {
			System.out.println("Solo numeros!");
			entrada.nextLine();
		} 
		num1 = entrada.nextInt();
		
		System.out.println("Numero 2");
		
		//esperamos que entre un entero
		while (!entrada.hasNextInt()) {
			System.out.println("Solo numeros!");
			entrada.nextLine();
		} 
		num2 = entrada.nextInt();
		
		System.out.println("Numero 3");
		
		//esperamos que entre un entero
		while (!entrada.hasNextInt()) {
			System.out.println("Solo numeros!");
			entrada.nextLine();
		} 
		num3 = entrada.nextInt();
		
		int menor=0, mayor=0;
		/*
		mayor = Math.max(Math.max(num1, num2),num3);
		menor = Math.min(Math.min(num1, num2),num3);
		*/
		if (num1 <= num2 ) {
			if (num2 <= num3) {
				mayor=num3;
			} else {
				mayor=num2;
			}
		} else if (num1 <= num3) {
			mayor=num3;
		} else {
			mayor=num1;
		}
		
		if (num1 >= num2) {
			if (num2 >= num3) {
				menor=num3;
			} else {
				menor=num2;
			}
		} else if (num1 >= num3) {
			menor=num3;
		} else {
			menor=num1;
		}
		/*
		mayor = max(num1,max(num2,num3));
		menor = min(num1,min(num2,num3));
		*/
		System.out.printf("Maximo: %d\nMinimo: %d\n",(num3>=(num1>=num2?num1:num2)?num3:(num1>=num2?num1:num2)),
				(num3>=(num1>=num2?num2:num1)?(num1>=num2?num2:num1):num3));
		System.out.printf("Maximo: %d\nMinimo: %d\n",mayor,menor);
	}
}
