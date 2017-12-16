package core.collection;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();

		// t.add(new StringBuffer("a"));
		// string buffer doesn't implement comparable(I)

		t.add(5);
		t.add(5);
		t.add(6);
		
		

		System.out.println(t);
	}

}
