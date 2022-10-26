import java.util.Scanner;

public class MCM {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (true) {
			System.out.print("Primer numero: \n");
			int n1 = sc.nextInt();
			System.out.print("Segundo numero: \n");
			int n2 = sc.nextInt();
			int tem1 = n1, tem2=n2;
			int mult = n1*n2;	
			for (int i =2; i < Math.max(n1, n2); i++) {
				while ((tem1 % i == 0)&&(tem2 % i == 0))  {
					tem1/=i;
					tem2/=i;
					mult/=i;
				}
			}
			System.out.printf("El mcm de %d y %d es: %d\n\n",n1,n2,mult);
		}
	}
}
