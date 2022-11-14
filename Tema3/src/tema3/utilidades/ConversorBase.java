package tema3.utilidades;

import java.util.InputMismatchException;

public class ConversorBase {
	
	//decodifica un string con base b a un entero
	public static int nbase2dec(String s, int b) throws InputMismatchException {
		int n = 0;
		s = ManejoCadenas.flipString(s);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			byte t = 0;
			if (c > 64) {
				t = (byte) (c - 55);
			} else {
				t = (byte) (c - 48);
			}
			if (t > b)
				throw new InputMismatchException("Input number and base mismatch");
			n += t * Math.pow(b, i);
		}
		return n;
	}
	
	//codifica decimal a string en la base que se indique
	public static String dec2nbase(int n,int base) {
		String value = "";
		while (n > 0) {
			int t =  n%base;
			if (t > 9) {
				value += (char) (55 + t);
			} else {
				value += t;
			}
			n/=base;
		}
		return(ManejoCadenas.flipString(value));
	}
}
