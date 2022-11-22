package tema3;

import java.util.Scanner;

import tema3.utilidades.MyMatrix;

public class DiagonalUno {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduce lado:");
		int side = sc.nextInt();
		int matrix[][]= MyMatrix.generateMatrix(side, side, 11, 99);
		for(int i = 0; i < side; i++) {
			matrix[i][i]=1;
			matrix[i][side-1-i]=1;
		}
		MyMatrix.printMatrix(matrix, side, side);
		

	}

}
