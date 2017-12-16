package interview;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {

		String str = "badce";

		char[] s = str.toCharArray();

		Arrays.sort(s);

		String s2 = new String(s);

		System.out.println(s2);

	}

}
