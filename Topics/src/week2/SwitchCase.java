package week2;

public class SwitchCase {

	public static void main(String[] args) {

////	if --> Ternary
//		String uygunluk;
//
//		int yas = 10;
//
//		uygunluk = yas >= 18 ? "uygun" : "uygun degil";
//		System.out.println(uygunluk);

//		System.out.println("================ switch case ====================");
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("bir sayi giriniz: ");
//		int secim = scanner.nextInt();
//
//		switch (secim) {
//		case 1:
//			System.out.println("toplama");
//			break;
//		case 2:
//			System.out.println("cikarma");
//			break;
//		case 3:
//			System.out.println("bolme");
//			break;
//		case 4:
//			System.out.println("carpma");
//			break;
//		case 5:
//			System.out.println("mod");
//			break;
//
//		default:
//			System.out.println("cikis");
//			break;
//		}

		int ay = 1;
		switch (ay) {
		case 12, 1, 2:
			System.out.println("kis");
			break;
		case 3, 4, 5:
			System.out.println("ilkbahar");
			break;
		case 6, 7, 8:
			System.out.println("yaz");
			break;
		case 9, 10, 11:
			System.out.println("sonbahar");
			break;

		default:
			System.out.println("gecersiz giris");
			break;
		}

		String mevsimString = switch (ay) {
		case 12, 1, 2 -> {
			System.out.println("");
			yield "kis";
		}
		case 3, 4, 5 -> "ilkbahar";
		case 6, 7, 8 -> "yaz";
		case 9, 10, 11 -> "sonbahar";

		default -> "cikis";
		};
	}
}
