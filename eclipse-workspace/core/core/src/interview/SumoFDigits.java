package interview;

import java.util.Scanner;

public class SumoFDigits {
	static int Number = 12;
	static int sum = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number");

		Number = sc.nextInt();

		while (Number != 0) {

			sum = sum + (Number % 10);

			Number = Number / 10;

		}

		System.out.println("Sum of Digits =" + sum);

	}

}
