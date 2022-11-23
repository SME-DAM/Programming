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

}
