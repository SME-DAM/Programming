import java.util.Scanner;

public class NumeroPrimoV0 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean primo = true;
		int total =0;
		for (int j =2;j<1000000;j++) {
			primo=true;
		//System.out.print("Introduzca un número: ");
		int numero = j;//sc.nextInt();
		for (int i = 2; i < numero; i++) {
			if(numero%i==0) {
				primo=false;
				break;
			}
		}
		if (primo)total++;
		
		//System.out.printf("El numero %d %ses primo!\n",numero,primo?"":"no ");
		}
		System.out.printf("He encontrado %d primos!",total);
	}
}
