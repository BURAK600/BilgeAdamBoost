package week2;

import java.util.Locale;

public class StringOrnek {

	public static void main(java.lang.String[] args) {

		String x = "Hello word \"How\" How re old you .";

		String y = "what is your name ? ";

		String z = x.toUpperCase(Locale.ENGLISH);

		System.out.println("The length of the x string is: " + x.length());

		System.out.println("Lower case of the x string is: " + x.toLowerCase(Locale.ENGLISH));

		System.out.println("Upper case of the x string is: " + x.toUpperCase(Locale.ENGLISH));

		System.out.println("Trim of the x string is: " + x.trim());

		System.out.println("Index of 'HOW' is: " + x.indexOf("How"));

		System.out.println("Index of 'HOW' is: " + x.indexOf(" "));

		System.out.println("charAt  : " + x.charAt(6));

		System.out.println("concat : " + x.concat(y));

		System.out.println("==================================== Onemli ===================================");

		System.out.println("Equals : " + x.equals(z));

		System.out.println("================================================================================");

		System.out.println("EqualsIgnoreCase : " + x.equalsIgnoreCase(z));

		String[] str = x.split("How");
		System.out.println("str[0]:" + str[0]);

		System.out.println("compareTo: " + "d".compareTo("a"));

		System.out.println("starsWith: " + x.startsWith("H"));

		System.out.println("endsWith: " + x.endsWith("."));
		System.out.println("endsWith: " + x.endsWith(" "));

		String spString = "x,y,z,t,m,n,sa,fd,gh,ff";

		System.out.println("split hafıza:  " + spString.split(","));
		System.out.println("split[3]: " + spString.split(",")[3]);

		System.out.println("=================================================");

		String a = "ahmet";
		String b = "ahmet";
		String c = "mehmet";
		String d = "ali";
		a = "mehmet";

		String e = a.trim().toLowerCase();

		System.out.println("a:  " + a.hashCode());
//		System.out.println("a:  " + getAddress(a));
		System.out.println("b:  " + b.hashCode());
		System.out.println("b:  " + b.hashCode());
		System.out.println("c:  " + c.hashCode());
		System.out.println("c:  " + c.hashCode());
		System.out.println("d:  " + d.hashCode());
		System.out.println("d:  " + d.hashCode());
		System.out.println("e:  " + e.hashCode());
		System.out.println("e:  " + e.hashCode());

		Object obj = new Object();

//		System.out.println("Memory address " + VM.current().addressOf(obj));

	}

}
