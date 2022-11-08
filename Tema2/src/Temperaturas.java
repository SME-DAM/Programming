import java.util.Scanner;

public class Temperaturas {

	private static Scanner entrada;

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator");

		float tempC, tempK, tempF;
		final float factor = 1.8f, add = 32, kelvin = 273.15f;
		entrada = new Scanner (System.in);

		System.out.println("Introduce la temperatura en Celsius, usa una \",\" como separador decimal");
		
		while (!entrada.hasNextFloat()) {
			System.out.println("Introduce la temperatura en Celsius, usa una \",\" como separador decimal");
			entrada.nextLine();
		} 
		
		tempC = entrada.nextFloat();
		tempF = tempC * factor + add;
		tempK = tempC + kelvin;

		System.out.printf("%.2f ºC equivalen a:\t %.2f ºF\n", tempC, tempF);
		System.out.printf("%.2f ºC equivalen a:\t %.2f K\n", tempC, tempK);
	}

}
