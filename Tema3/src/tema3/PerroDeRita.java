package tema3;

import java.util.Scanner;

public class PerroDeRita {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String phrase = "El perrito de Rita me irrita. Dile a Rita que cambie el perrito por una perrita.".toLowerCase();
		System.out.println("Introduce la cadena a buscar");
		String substring = sc.nextLine();
		int position = 0, count = 0;
		position = phrase.indexOf(substring.toLowerCase());
		while (position >= 0) {
			count++;
			position = phrase.indexOf(substring.toLowerCase(),position+1);
		}
		System.out.printf("He encontrado %d veces la cadena %s\n", count, substring);
	}
}