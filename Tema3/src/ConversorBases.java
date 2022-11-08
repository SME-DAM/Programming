public class ConversorBases {

	static String flipString(String s) {
		String value = "";
		int length = s.length();
		for (int i = 0; i < length; i++) {
			value += s.charAt(length-i-1);
		}
		return value;
	}
	static int exp(int b, int e) {
		int t=1;
		for (int i = 0; i < e ;i++) {
			t*=b;
		}
		return t;
	}
	static int bin2dec(String s) {
		int n = 0;
		s = flipString(s);
		for (int i = 0; i < s.length(); i++) {
			n += s.charAt(i)=='0'?0:exp(2,i);
		}
		return n;
	}
	static String dec2bin(int n) {
		String value = "";
		int t = n;
		while (t > 0) {
			value += t%2==0?"0":"1";
			t /= 2;
		}
		return(flipString(value));
	}
	public static void main(String[] args) {
		System.out.print(bin2dec(dec2bin(1093)));
	}

}
