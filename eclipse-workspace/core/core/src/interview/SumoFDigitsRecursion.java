package interview;

import java.util.Scanner;

public class SumoFDigitsRecursion {

	int sum;

	public int CalRecSum(int n) {

		if (n == 0) {
			System.out.println("here");
			return sum;
		} else {

			sum += n % 10;
			CalRecSum(n / 10);

		}

		return sum;
	}

	public static void main(String[] args) {

		int number;
		Scanner in = new Scanner(System.in);

		System.out.println("Please Enter a number");

		number = in.nextInt();

		SumoFDigitsRecursion ob = new SumoFDigitsRecursion();
		System.out.println("Sum of Digits =" + ob.CalRecSum(number));

	}

}