package tema3;

import java.util.Scanner;

import tema3.utilidades.MyMatrix;

public class CuadradoMagico {

	private static Scanner sc;

	//9 4 9 2 3 5 7 8 1 6
	

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Comprobador de cuadrado magico");
		System.out.println("Introduzca el numero de celdas del cuadrado");
		int size = sc.nextInt();
		int side = (int) Math.sqrt(size);
		if (side*side != size) {
			System.out.println("Eso no parece un cuadrado");
			return;
		}
		System.out.println("Introduzca los valores");
		int[][]matrix = new int[side][side];
		for (int index = 0; index < size; index++) {
			matrix[index%side][index/side]= sc.nextInt();
		}
		MyMatrix.printMatrix(matrix, side, side);
		
		for ()
		
	}

}
