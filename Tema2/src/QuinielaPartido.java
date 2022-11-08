import java.util.Scanner;

public class QuinielaPartido {


	private static Scanner entrada;

	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		entrada = new Scanner (System.in);

		System.out.println("Introduce los goles del equipo local");
		while (!entrada.hasNextInt()) {
			System.out.println("Escribe UN NUMERO!");
			entrada.nextLine();
		} 
		num1 = entrada.nextInt();
		
		System.out.println("Introduce los goles del equipo visitante");
		while (!entrada.hasNextInt()) {
			System.out.println("Escribe UN NUMERO!");
			entrada.nextLine();
		} 
		num2 = entrada.nextInt();
		
		System.out.printf("Resultado partido: %d-%d\n",num1,num2);
		System.out.print("Resultado quiniela: ");
		if (num1 == num2) {
			System.out.println("x");
		} else {
			if (num1 < num2) {
				System.out.println("2");
			}
			else {
				System.out.println("1");
			}
		}
	}
}
