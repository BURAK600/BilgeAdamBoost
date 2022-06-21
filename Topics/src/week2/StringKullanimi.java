package week2;

public class StringKullanimi {

	public static void main(String[] args) {

		String ifade = "bu gün hava Çok ama çok yağışlı olacak mış";

		System.out.println(ifade.length());

		System.out.println("10. karakter: " + ifade.charAt(5));
//		Dizi gibi değerine ulaşılamaz   ---------------    System.out.println(ifade[4]);
		System.out.println(ifade.indexOf("ü"));

		System.out.println("===============================================================");

		System.out.println("ifadenin ilk yarısını al: " + ifade.substring(23, 29));
	}

}
