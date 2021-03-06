package com.burak;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RunnerBurcYorumu {

	/**
	 * 
	 * @param args
	 * @throws MalformedURLException
	 * @throws IOException
	 * 
	 * 
	 * 
	 *                               BURC YORUM
	 * 
	 *                               1 sitenin icerigini almak
	 * 
	 *                               2 gelen icerigi satir satir okumaliyim
	 * 
	 * 
	 */

	public static void main(String[] args) throws MalformedURLException, IOException {

		String ay = "Haziran";
		Scanner scannerSite = new Scanner(new URL("https://www.elle.com.tr/astroloji/basak").openStream(),
				"ISO-8859-1");

		/*
		 * bir sayi giriniz
		 * 
		 * "fegggegege": nextLine(); scanner -> satir satir okur. okunulan degerin
		 * sonuna geldin mi? hasNext() -> return true/false
		 *
		 * 
		 */

		boolean flag = false;
		StringBuilder yorumListesiBuilder = new StringBuilder();

		while (scannerSite.hasNext()) {
			String satirString = scannerSite.nextLine();

			if (satirString.contains(ay.toLowerCase())) {
				flag = true;
			}

			if (satirString.contains("<p>") && flag) {
				System.out.println(satirString);
				flag = false;

			}

		}

	}

}
