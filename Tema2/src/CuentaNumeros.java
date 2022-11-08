import java.util.Scanner;

public class CuentaNumeros {
	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero entre 1 y 10:");
		
		int numero = entrada.nextInt();
		
		String cuenta = "uno";
		if (numero > 10 || numero < 1) {
			cuenta = "Entrada no valida!";
		} else {
			if (numero > 1) {
				cuenta += ", dos";
			}
			if (numero > 2) {
				cuenta += ", tres";
			}
			if (numero > 3) {
				cuenta += ", cuatro";
			}
			if (numero > 4) {
				cuenta += ", cinco";
			}
			if (numero > 5) {
				cuenta += ", seis";
			}
			if (numero > 6) {
				cuenta += ", siete";
			}
			if (numero > 7) {
				cuenta += ", ocho";
			}
			if (numero > 8) {
				cuenta += ", nueve";
			}
			if (numero > 9) {
				cuenta += ", diez";
			}
			cuenta += ".";
		}
		System.out.println(cuenta);
	}

}
