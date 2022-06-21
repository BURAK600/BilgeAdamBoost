package week1;

public class Degiskenler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * float sayı1 = 12; float sayı2 = 13; int toplam = sayı1 + sayı2;
		 * 
		 * 
		 */

		// Primitive Data Type

		System.out.println(3 + 4);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);

		// casting işlemi

		int sayi1 = 1;
		short shortSayi;

		shortSayi = (short) sayi1;

		int sayi2 = 500099;
		byte shortSayi1;

		shortSayi1 = (byte) sayi2;
		System.out.println(shortSayi1);

		long longNumber = 34424244242424242l;

		float floatNumber = -1131333133.31313131f;

		double doubleNumber = 121324424242424.442442425422525525252524444;

		long iban = 60_5445_5654_4433_5445l;

		System.out.println(43232_2242424l);

		char c = 65;
		System.out.println(c);
		char c1 = 'v';

		// References Data Type

		String nameString = "jfdjfjdf";

		Boolean x = true;

		System.out.println(x);

		// time to long 12.10.2002 = 232833828582825525 milliseconds

		long yzaman = 1000 * 60 * 60 * 24 * 360 * 90000;
		long dzaman = 1000l * 60 * 60 * 24 * 360 * 90000;

		System.out.println("zaman ....:" + yzaman);
		System.out.println("zaman ....:" + dzaman);

	}

}
