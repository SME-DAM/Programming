import java.util.Scanner;

public class MesesV2 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println("Introduce el número de mes.");
		int num = entrada.nextInt();
		String[] meses = {"Mes invalido, compra un calendario", "enero", "febrero", "marzo","abril","mayo","junio","julio",
				"agosto","septiembre","octubre","noviembre","diciembre"};
		if (num < 0 || num > 12) {
			num = 0;
		}
		System.out.println(meses[num]);
	}

}
