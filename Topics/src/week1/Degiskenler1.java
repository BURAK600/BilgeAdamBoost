package week1;

public class Degiskenler1 {

	public static void main(String[] args) {

		int s1 = 6, s2 = 8, s3 = -2, toplam;
		System.out.println(s1++);
		System.out.println(s1);

		// 6 + 9 + 9 + -3 - 6 + -2 + -2
		// toplam = s1++ + ++s2 + s2++ + --s3 - --s1 + ++s3 + s3++;
		// System.out.println(toplam);

		boolean durum;
		durum = 5 != 5;
		System.out.println(durum);

		for (int i = 0; i < 10; i++) {
			System.out.println("burak");
		}
		System.err.println("program sonlandi");
		for (int i = 0; i < 10; i++)

			System.out.println("burak");

		System.out.println("ozer");

	}

}
