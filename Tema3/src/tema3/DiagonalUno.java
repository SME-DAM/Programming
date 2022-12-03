package tema3;

import java.util.Scanner;

import tema3.utilidades.MyMatrix;

public class DiagonalUno {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduce lado:");
		int side = sc.nextInt();
		int erval = 999 - 2 + 1;
		int[][] matrix= new int[side][side];
		for (int r = 0; r < side; r++) {
			for (int c = 0; c < side; c++) {
				if(c == r || c == (side-(r+1))) {
					matrix[c][r]= 1;
				} else { 					
					matrix[c][r]= (int) (Math.random() * erval) + 2;
				}
			}	
		}
		MyMatrix.printMatrix(matrix);
		

	}

}
