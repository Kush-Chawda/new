package interview;

public class Swaping {

	public static void main(String[] args) {

		int i = 101;

		int j = 1051;

		System.out.println("i=" + i + " j= " + j);
		
		i=i+j;
		
		j=i-j;

		i=i-j;
		
		System.out.println("after swapping"+" j= "+j+" i= "+i);
	}

}
