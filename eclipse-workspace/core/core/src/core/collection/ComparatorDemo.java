package core.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());

		t.add(10);
		t.add(6);
		t.add(8);
		t.add(36);
		t.add(18);
		t.add(25);
		t.add(21);

		System.out.println(t);
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Integer i = (Integer) o1;

		Integer i2 = (Integer) o2;

		
		return -1;
		
/*		if (i > i2) {
			return -1;
		} else if (i < i2) {
			return 1;
		} else {
			return 0;
		}
*/
	}
}
