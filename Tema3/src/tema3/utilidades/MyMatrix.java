package tema3.utilidades;

public class MyMatrix {
	public static void printMatrix(int[][] input) {
		int rows = input[0].length;
		int cols = input.length;
		for (int r = 0; r < rows; r++) {
			System.out.print("(");
			for (int c = 0; c < cols; c++) {
				System.out.printf(" %4d", input[c][r]);
			}
			System.out.println(" )");
		}
	}
	public static int[][] generateMatrix(int rows, int cols, int min, int max) {
		int output[][] = new int[cols][rows];
		int erval = max - min + 1;
		for (int index =0; index < rows*cols; index++) {
			output[index/rows][index%rows]= (int) (Math.random() * erval) + min;
		}
		return output;
	}
	
	public static int[][] transponder(int[][] input) {
		int rows = input[0].length;
		int cols = input.length;
		int[][] output = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				output[r][c] = input[c][r];
			}
		}
		return output;
	}
	
	public static int[][] dotProduct(int[][] matrixA, int[][] matrixB) {
		int rA = matrixA[0].length;
		int cA = matrixA.length;
		int rB = matrixB[0].length;
		int cB = matrixB.length;
		int[][] output = new int[rA][cB];
		if (rB == cA) {
			for (int x = 0; x < rA; x++) {
				for (int y = 0; y < cB; y++) {
					for (int z = 0; z < cA; z++) {
						output[y][x]+= matrixA[x][z] * matrixB[z][y];
					}
				}
			}
		}
		return output;
	}

}
