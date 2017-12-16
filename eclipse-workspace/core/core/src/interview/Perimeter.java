package interview;

import java.io.InputStream;
import java.util.Scanner;

public class Perimeter {
	public static void main(String[] args) {
		
	int result;
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter first value");
	int first=sc.nextInt();
	
	System.out.println("enter second value");
	int second=sc.nextInt();
	
	System.out.println("enter third value");
	int third=sc.nextInt();
	
	result=first+second+third;
	
	System.out.println(result);
	
	
	
	}
}
