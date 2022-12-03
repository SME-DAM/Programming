package tema3;

import java.util.Scanner;

import tema3.utilidades.MyMatrix;

public class PruebaMatices {

	public static void main(String[] args) {
		/*
		
		
		sc = new Scanner(System.in);
		System.out.println("Introduce filas:");
		int rows = sc.nextInt();
		System.out.println("Introduce columnas:");
		int cols = sc.nextInt();
		int table[][] = MyMatrix.generateMatrix(rows, cols, 0, 99);

		MyMatrix.printMatrix(table, rows, cols);
		System.out.print(table.length);
		*/
		int[][] testA = {
				{1,4,7},
				{2,5,8},
				{3,6,9}
		};
		int[][] testB = {
				{1,-1,2},
				{2,-1,2},
				{3,-3,0}
		};
		int[][] resultado = MyMatrix.dotProduct(testA, testB);
		
		MyMatrix.printMatrix(resultado);

		System.out.print("\n\n");
		int rows = 4, cols = 3;
		int[][] test = MyMatrix.generateMatrix(rows, cols, 0, 9);
		MyMatrix.printMatrix(test);
		System.out.print("\n");
		MyMatrix.printMatrix(MyMatrix.transponder(test));
	}

}
