package interview;

public class StringPalindrom {
	public static void main(String[] args) {

		String s = "5005";
		String s2 = "";
		for (int ss = s.length() - 1; ss >= 0; ss--) {
			s2 += s.charAt(ss);

		} // System.out.print(s2);
		if (s.equalsIgnoreCase(s2)) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}

	}

}
