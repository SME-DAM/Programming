package tema3.utilidades;

public class MyMatrix {
	public static void printMatrix(int[][] input,int rows, int cols) {
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
	
	public static int[][] transponder(int[][] input, int rows, int cols) {
		int[][] output = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				output[r][c] = input[c][r];
			}
		}
		return output;
	}
	
	public static int[][] dotProduct(int[][] matrixA, int[][] matrixB, int[][] meta) {
		int rows = 0;
		int cols = 1;
		int m_A = 0;
		int m_B = 1;
		int[][] output = new int[meta[m_A][rows]][meta[m_B][cols]];
		for (int x = 0; x < meta[m_A][rows]; x++) {
			for (int y = 0; y < meta[m_B][cols]; y++) {
				for (int z = 0; z < meta[m_A][cols]; z++) {
					output[y][x]+= matrixA[x][z] * matrixB[z][y];
				}
			}
		}
		return output;
	}

}
