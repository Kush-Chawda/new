package core.collection;

import java.util.Scanner;

public class BinaryToDecimalpurelogic {
	static int binarynumber, decimalnumber, i = 1, rem;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter binary number");

		binarynumber = sc.nextInt();

		while (binarynumber > 0) {
			rem = binarynumber % 10;

			decimalnumber = decimalnumber + rem * i;

			i = i * 2;

			binarynumber = binarynumber / 10;
		}
		System.out.println(decimalnumber);

	}
}
