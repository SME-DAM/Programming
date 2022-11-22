package tema3;
import tema3.utilidades.MyMatrix;
import java.util.Scanner;

import tema3.utilidades.MyArrays;
import tema3.utilidades.Sorters;

public class PruebaArrays {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Introduce filas:");
		int rows = sc.nextInt();
		System.out.println("Introduce columnas:");
		int cols = sc.nextInt();
		int table[][] = MyMatrix.generateMatrix(rows, cols, 0, 99);

		MyMatrix.printMatrix(table, rows, cols);

	}

}
