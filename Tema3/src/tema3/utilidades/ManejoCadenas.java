package tema3.utilidades;

public class ManejoCadenas {
	
	public static String flipString(String s) {
		String value = "";
		int length = s.length();
		for (int i = 0; i < length; i++) {
			value += s.charAt(length-i-1);
		}
		return value;
	}
	
	public static String removeSpaces(String s) {
		String value = "";
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char c = s.charAt(length-i-1);
			if (c != ' ')
				value += c;
			}
		return value;
	}
	
	public static boolean compareString(String s, String t) {
		System.out.println(s + " : " + t);
		if (s.length() != t.length())
			return false;
		int length = s.length();
		System.out.println(length);
		for (int i = 0; i < (length - 1); i++) {
			if (s.charAt(i) != t.charAt(i)) return false;
		}
		return true;
	}
}
