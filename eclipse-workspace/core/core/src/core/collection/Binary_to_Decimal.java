package core.collection;

import java.util.Scanner;

public class Binary_to_Decimal {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter binary number");
		String binarynum = sc.next();

		/*
		 * int binarynum=sc.nextInt(); int decimal=0; int power=0;
		 * 
		 * 
		 * while(binarynum!=0) { decimal+=(binarynum%10)*Math.pow(2, power);
		 * 
		 * binarynum=binarynum/10;
		 * 
		 * power++; } System.out.println(decimal);
		 */

		int o = Integer.parseInt(binarynum, 2);
		System.out.println(o);

	}

}
