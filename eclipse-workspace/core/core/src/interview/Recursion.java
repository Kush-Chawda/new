package interview;

public class Recursion {

	public static void main(String[] args) {

		m(1);
	}

	public static void m(int n)
	{
		if(n<=100)
		{
			System.out.println(n);
			n++;
			m(n);
		}
	}
}
