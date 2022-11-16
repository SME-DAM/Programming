package tema3;

import java.util.Scanner;

public class PerroDeRita {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean run = true;
		//String phrase = "El perrito de Rita me irrita. Dile a Rita que cambie el perrito por una perrita.".toLowerCase();
		String phrase = "El perrito de Rita me irrita. Voy a cambiar el perrito por una perrita.".toLowerCase();
		while (run) {
			System.out.println("Introduce la cadena a buscar");
			String substring = sc.nextLine();
			if (substring.equals("STOP")) {
				run = false;
			} else {
				int position = 0, count = 0;
				position = phrase.indexOf(substring.toLowerCase());
				while (position >= 0) {
					count++;
					position = phrase.indexOf(substring.toLowerCase(),position+1);
				}
				System.out.printf("He encontrado %d veces la cadena %s\n", count, substring);
			}
		}
	}
}