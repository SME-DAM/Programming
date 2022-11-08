import java.util.Scanner;

public class EscaleraDolar {

	private static Scanner sc;

	public static void main(String[] args) {		
		sc = new Scanner(System.in);
		System.out.println("Input the number of levels: ");
		int top = sc.nextInt();
		/*
		for (int fila = 1; fila <= top; fila++) {
			for (int columna = 0; columna < top - fila; columna++) {
				System.out.print(" ");
			}
			for (int columna = 0; columna < fila*2-1; columna++) {
				System.out.print("$");
			}
			System.out.print("\n");
		
		}*/
		/*
		for (int i = 1; i <= top; i++) {
			System.out.print(new String(new char[(top-i)]).replace("\0", " "));
			System.out.println(new String(new char[((i*2)-1)]).replace("\0", "$"));
		}
	
		String salida = "";
		for (int i = 0; i < top; i++) {
			salida += '$';
			System.out.println(salida);
			
		}*/
		for (int fila = 1; fila <= top; fila++) {
			for (int columna = 0; columna <= top - fila; columna++) {
				System.out.print(" ");
			}
			for (int columna = 0; columna < fila * 2 - 1; columna++) {
				
				System.out.print("$");
			}
			
			System.out.print("\n");
		}
		
	}

}
