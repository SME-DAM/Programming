import java.util.Scanner;

// calcula el MCD de dos numeros.
public class MCD {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (true) {
			System.out.print("Primer numero: \n");
			int n1 = sc.nextInt();
			System.out.print("Segundo numero: \n");
			int n2 = sc.nextInt();
			//variables temporales
			int tem1 = n1, tem2=n2;
			//producto de la entrada
			int mult = 1;
			//iteramos posibles divisores
			for (int i =2; i < Math.max(n1, n2); i++) {
				//mientras de exacto en ambas entradas
				while ((tem1 % i == 0)&&(tem2 % i == 0))  {
					//dividimos y guardamos el resultado
					tem1/=i;
					tem2/=i;
					//y lo reflejamos en el producto
					mult*=i;
				}
			}
			System.out.printf("El mcm de %d y %d es: %d\n\n",n1,n2,mult);
		}
	}
}
