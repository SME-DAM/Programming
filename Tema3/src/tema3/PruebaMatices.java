package tema3;

import tema3.utilidades.MyMatrix;

public class PruebaMatices {

	public static void main(String[] args) {
		int rows = 3;
		int cols = 4;
		int[][] test = MyMatrix.generateMatrix(rows, cols, 100, 999);
		MyMatrix.printMatrix(test, rows, cols);
		test = MyMatrix.transponder(test, rows, cols);
		System.out.print("\n\n");
		MyMatrix.printMatrix(test, cols, rows);
	}

}
