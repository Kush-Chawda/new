package core.collection;

public class CopyingArray {
	public static void main(String[] args) {

		char[] one = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

		char[] two=new char[10];

		System.arraycopy(one, 2, two, 0, 5);
		
		System.out.println(two);
	}

}
