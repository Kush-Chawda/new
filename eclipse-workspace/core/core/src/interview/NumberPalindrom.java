package interview;

import java.util.Scanner;

public class NumberPalindrom {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int bnum = sc.nextInt();
		int num=bnum;
		int reverse = 0;

		while (num != 0) {

			int reminder = num % 10;

			reverse=(reverse*10)+reminder;
			num = num / 10;
		}
		if (bnum == reverse) 
			System.out.println("palindrom");
		else 
			System.out.println("not palindrom");

		

	}
}
