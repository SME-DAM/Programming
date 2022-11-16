package tema3;

import java.util.Scanner;

public class CuentasCorreo {

	private static Scanner sc;

	public static void main(String[] args) {
		String dominio= "@e-itaca.es";
		String email = "";
		sc = new Scanner(System.in);
		System.out.println("Introduce el nombre");
		String nombre = sc.nextLine().toLowerCase().strip();
		email += nombre.charAt(0);
		if (nombre.contains(" ")) {
			boolean next = true;
			int posicion = 0;
			while (next) {
				posicion = nombre.indexOf(" ",posicion);
				if (posicion < 0) {
					next = false;
				} else {
					while (nombre.charAt(posicion) == ' ' && posicion < nombre.length()-1) {
						posicion++;
					}
					if (nombre.charAt(posicion) != ' ') {
						email += nombre.charAt(posicion);
						posicion++;
					}
				}
			}
		}
		System.out.println("Introduce los apellidos");
		String apellidos = sc.nextLine().toLowerCase();
		apellidos = apellidos.replace(" ", "");
		email+= apellidos;
		email += dominio;
		System.out.println(email);
	}

}
