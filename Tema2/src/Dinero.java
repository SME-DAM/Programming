import java.util.Scanner;

public class Dinero {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		int b500,b200,b100,b50,b20,b10,b5,m2,m1;
		b500=cantidad/500;
		m1 = cantidad%500;
		b200=m1/200;
		m1 %=200;
		b100=m1/100;
		m1 %=100;
		b50=m1/50;
		m1 %=50;
		b20=m1/20;
		m1%=20;
		b10=m1/10;
		m1%=10;
		b5=m1/5;
		m1%=5;
		m2=m1/2;
		m1%=2;
		System.out.printf("Billetes de 500: %d\nBilletes de 200: %d\nBilletes de 100: %d\n",b500,b200,b100);
		System.out.printf("Billetes de 50: %d\nBilletes de 20: %d\nBilletes de 10: %d\n",b50,b20,b10);
		System.out.printf("Billetes de 5: %d\nMonedas de 2: %d\nMonedas de 1: %d\n",b5,m2,m1);
	}

}
