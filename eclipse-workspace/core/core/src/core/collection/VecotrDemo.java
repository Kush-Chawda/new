package core.collection;

import java.util.ArrayList;
import java.util.Vector;

public class VecotrDemo {

	public static void main(String[] args) {
	
		Vector v=new Vector();
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add("e");
		v.add("asa");
		v.add("asa");
		v.add("asa");
		v.add("asa");
		v.add("asa");
		v.add("asa");
		v.add("asa");
		v.add("asa");
		v.add(2, 'l');
		v.add("asa");
		
		System.out.println(v);
		
		v.clear();
		
		System.out.println(v.size());
		System.out.println(v);
		v.ensureCapacity(11);
		System.out.println(v.capacity());
		
		
		v.ensureCapacity(10);
		
		System.out.println(v.capacity());
	}
}
