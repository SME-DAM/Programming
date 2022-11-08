import java.util.Scanner;

// calcula el MCM de dos numeros.
public class MCMv2 {

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
			int mult = n1*n2;
			//iteramos posibles divisores
			int loop=0;
			for (int i = (n1<n2?n1:n2); i>1; i--) {
				//mientras de exacto en ambas entradas
				while ((tem1 % i == 0)&&(tem2 % i == 0))  {
					//dividimos y guardamos el resultado
					tem1/=i;
					tem2/=i;
					//y lo reflejamos en el producto
					mult/=i;
					loop++;
				}
				loop++;
			}
			System.out.printf("El mcm de %d y %d es: %d\n\n",n1,n2,mult);
			System.out.printf("Numero de iteraciones: %d\n\n",loop);
			
		}
	}
}
