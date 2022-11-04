import java.util.Scanner;

public class ConversorRomano {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Introduce un número entre 0 y 3999");
		int n = sc.nextInt();
		if (n>=4000) {
			System.out.printf("%d está fuera del rango",n);
		} else {
			switch (n/1000) {
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
			switch ((n%1000)/100) {
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
			switch ((n%100)/10) {
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
			switch (n%10) {
			case 1:
				System.out.print("I");
				break;
			case 2:
				System.out.print("II");
				break;
			case 3:
				System.out.print("III");
				break;
			case 4:
				System.out.print("IV");
				break;
			case 5:
				System.out.print("V");
				break;
			case 6:
				System.out.print("VI");
				break;
			case 7:
				System.out.print("VII");
				break;
			case 8:
				System.out.print("VIII");
				break;
			case 9:
				System.out.print("IX");
				break;
			}
		}
		System.out.print("\n");
	}

}
