import java.util.Scanner;

public class ConversorMoneda {

	private static Scanner entrada;

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator");

		double euro; 
		float dolar, libra;
		final double DOLAR = 0.99, LIBRA = 0.88;
		entrada = new Scanner (System.in);

		System.out.println("Introduce cantidad de euros a convertir");
		euro = entrada.nextDouble();
		libra = (float) (euro * LIBRA);
		dolar = (float) (euro * DOLAR);

		System.out.printf("%.2f € equivalen a:\t %.2f $\n", euro, dolar);
		System.out.printf("%.2f € equivalen a:\t %.2f £\n", euro, libra);

	}

}
