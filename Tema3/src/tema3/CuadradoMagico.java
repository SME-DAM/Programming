package tema3;

import java.util.Scanner;

import tema3.utilidades.MyMatrix;

public class CuadradoMagico {

	private static Scanner sc;

	//9 4 9 2 3 5 7 8 1 6
	//16 4 14 15 1 9 7 6 12 5 11 10 8 16 2 3 13
	
	public static boolean checkMagic(int[] input, int magic) {
		for (int i = 0; i < input.length; i++) {
			if (input[i]!= magic) return false;
		}
		return true;
	}

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
		int magic = 0;
		for (int index = 0; index < size; index++) {
			int v = sc.nextInt();
			matrix[index%side][index/side]= v;
			magic += v;
		}
		MyMatrix.printMatrix(matrix, side, side);
		magic /= side;
		int[]rows=new int[side];
		int[]cols=new int[side];
		int[]diag= {0,0};
		for (int i = 0; i < side; i++) {
			cols[i]=0;
			rows[i]=0;
		}
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				cols[i]+=matrix[i][j];
				rows[i]+=matrix[i][j];
				if (i == j) diag[0]+=matrix[i][j];
				if (i + j == side - 1) diag[1]+=matrix[i][j];
			}
		}
		if(!checkMagic(cols, magic) || !checkMagic(rows, magic) || (!checkMagic(diag, magic))) {
			System.out.println("No es un cuadrado magico");
		} else {
			System.out.println("Es un cuadrado magico");
		}
	}

}
