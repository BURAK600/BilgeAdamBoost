package week3;

public class MethodKullanimiVarargs {

	public static void main(String[] args) {

		toplamVarArgs(100, 12, 123, 234, 54, 32, 12, 34);

		String dizi = "cscscscsc";
		System.out.println("deger: " + dizi.substring(5, 5));

	}

	private static void toplamVarArgs(int... sayilar) {

		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];

		}
		System.out.println("Toplam: " + toplam);

	}

}
