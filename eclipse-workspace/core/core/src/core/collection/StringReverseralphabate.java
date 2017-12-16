package core.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class StringReverseralphabate {
	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator1());

		t.add("lucky");
		t.add("lovelysingh");
		t.add("zuber");
		t.add("bhagwankabackcha");
		t.add(10);
		t.add(new StringBuffer("love"));

		System.out.println(t);
	}
}

class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		String s1 = o1.toString();
		String s2 = (String) o2;
		
		//System.out.println(s1.compareTo(s2));
	//	System.out.println(s1.equals(s2));
//		return -s1.compareTo(s2);
		return s2.compareTo(s1);

	}

}
