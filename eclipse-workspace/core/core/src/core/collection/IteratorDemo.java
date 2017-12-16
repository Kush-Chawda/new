package core.collection;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		
		
		Iterator itr=al.iterator();
		
		while (itr.hasNext()) {
			Integer object = (Integer) itr.next();
			
			
		
			System.out.println(object);}
	
		
	}

}
