package interview;

import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {

		/*
		 * int curr=1; int prev=0; System.out.println(prev+" "+curr); for(int
		 * i=0;i<10;i++) { System.out.println(curr+prev); curr=curr+prev;
		 * prev=curr-prev; }
		 */

		/*
		 * int curr = 1; int prev = 0;
		 * 
		 * System.out.println(prev + "  " + curr); for (int i = 0; i < 10; i++) {
		 * System.out.println(curr + prev);
		 * 
		 * curr = curr + prev; prev = curr - prev; }
		 */

		int a = 0, b = 1, c;
		System.out.println(a+"  "+b);
		for (int i = 0; i < 10; i++) {

			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}
