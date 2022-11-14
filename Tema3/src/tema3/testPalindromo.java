package tema3;
import java.util.Scanner;

import tema3.utilidades.ManejoCadenas;
public class testPalindromo {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Type a text: ");
		sc = new Scanner(System.in);
		String line = sc.nextLine();
		for (int i = 0; i < (line.length()); i++) {
			int code = line.codePointAt(i);
			code -= code>0x60?0x20:0;
			System.out.print(Character.toChars(code));
		}

	}

}
