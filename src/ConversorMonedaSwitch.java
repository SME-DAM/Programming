import java.util.Scanner;

public class ConversorMonedaSwitch {

	private static Scanner entrada;

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator");

		float euro=0, dolar=0, libra=0;
		final double EURO2DOLAR = 0.99, EURO2LIBRA = 0.88;
		entrada = new Scanner (System.in);
		System.out.println("Introduce nombre de la moneda origen: dolar, euro o libra");
		char mander = entrada.nextLine().charAt(0);
		switch (mander) {
		case 'e':
			System.out.println("Introduce cantidad de euros a convertir");
			euro = entrada.nextFloat();
			libra = (float) (euro * EURO2LIBRA);
			dolar = (float) (euro * EURO2DOLAR);
			System.out.printf("%.2f € equivalen a:\t %.2f $\n", euro, dolar);
			System.out.printf("%.2f € equivalen a:\t %.2f £\n", euro, libra);
			break;
		case 'd':
			System.out.println("Introduce cantidad de dolares a convertir");
			dolar = entrada.nextFloat();
			euro = (float) (dolar / EURO2DOLAR);
			libra = (float) (euro * EURO2LIBRA);
			System.out.printf("%.2f $ equivalen a:\t %.2f €\n", dolar, euro);
			System.out.printf("%.2f $ equivalen a:\t %.2f £\n", dolar, libra);
			break;
		case 'l':
			System.out.println("Introduce cantidad de libras a convertir");
			libra = entrada.nextFloat();
			euro = (float) (libra / EURO2LIBRA);
			dolar = (float) (euro / EURO2DOLAR);
			System.out.printf("%.2f £ equivalen a:\t %.2f €\n", libra, euro);
			System.out.printf("%.2f £ equivalen a:\t %.2f $\n", libra, dolar);
			break;
		default:
			System.out.println("No reconozco la moneda");
		}
	}
}
