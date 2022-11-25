package tema3;

import tema3.utilidades.MyMatrix;

public class PruebaMatices {

	public static void main(String[] args) {
		int rows = 3;
		int cols = 4;
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
		int[][] meta = {{3,3},{3,3}};
		int[][] resultado = MyMatrix.dotProduct(testA, testB, meta);
		
		MyMatrix.printMatrix(resultado, 3, 3);
	}

}
