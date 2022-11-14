package tema3;

import tema3.utilidades.ConversorBase;
public class TestConverter {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random()*(Math.pow(2, 16)))+1;
			System.out.printf("Testing: %d\n",n);
			String sbin = ConversorBase.dec2nbase(n, 2);
			String soct = ConversorBase.dec2nbase(n, 8);
			String shex = ConversorBase.dec2nbase(n, 16);
			if (n != ConversorBase.nbase2dec(sbin, 2)) {
				System.out.printf("Error on binary, n:%d, s:%s, %d\n",n,sbin,ConversorBase.nbase2dec(sbin, 2));
			} else {
				//System.out.printf("Binary OK: n,%d, s:%s\n",ConversorBase.nbase2dec(sbin, 2),sbin);
			}
			if (n != ConversorBase.nbase2dec(shex, 16)) {
				System.out.printf("Error on hex, n:%d, s:%s\n",n,shex);
			} else {
				//System.out.printf("Hex OK: n,%d, s:%s\n",ConversorBase.nbase2dec(shex,16),shex);
			}
			if (n != ConversorBase.nbase2dec(soct, 8)) {
				System.out.printf("Error on octal, n:%d, s:%s\n",n,soct);
			} else {
				//System.out.printf("Octal OK: n,%d, s:%s\n",ConversorBase.nbase2dec(soct, 2),soct);
			}
		}
	}

}
