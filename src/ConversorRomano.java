import java.util.Scanner;

public class ConversorRomano {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>=4000) {
			System.out.printf("%d está fuera del rango",n);
		} else {
			int unidad = n%10;
			int decena = (n%100)/10;
			int centena = (n%1000)/100;
			int millar = n/1000;

			switch (millar) {
			case 1:
				System.out.printf("M");
				break;
			case 2:
				System.out.print("MM");
				break;
			case 3:
				System.out.print("MMM");
				break;
			}
			switch (centena) {
			case 1:
				System.out.print("C");
				break;
			case 2:
				System.out.print("CC");
				break;
			case 3:
				System.out.print("CCC");
				break;
			case 4:
				System.out.print("CD");
				break;
			case 5:
				System.out.print("D");
				break;
			case 6:
				System.out.print("DC");
				break;
			case 7:
				System.out.print("DCC");
				break;
			case 8:
				System.out.print("DCCC");
				break;
			case 9:
				System.out.print("CM");
				break;
			}
			switch (decena) {
			case 1:
				System.out.print("X");
				break;
			case 2:
				System.out.print("XX");
				break;
			case 3:
				System.out.print("XXX");
				break;
			case 4:
				System.out.print("XL");
				break;
			case 5:
				System.out.print("L");
				break;
			case 6:
				System.out.print("LX");
				break;
			case 7:
				System.out.print("LXX");
				break;
			case 8:
				System.out.print("LXXX");
				break;
			case 9:
				System.out.print("XC");
				break;
			}
			switch (unidad) {
			case 1:
				System.out.print('\u2160');
				break;
			case 2:
				System.out.print('\u2161');
				break;
			case 3:
				System.out.print('\u2162');
				break;
			case 4:
				System.out.print('\u2163');
				break;
			case 5:
				System.out.print('\u2164');
				break;
			case 6:
				System.out.print('\u2165');
				break;
			case 7:
				System.out.print('\u2166');
				break;
			case 8:
				System.out.print('\u2167');
				break;
			case 9:
				System.out.print('\u2168');
				break;
			}
			System.out.printf("\n%d.%d.%d.%d",millar,centena,decena,unidad);
			
		}
	}

}
