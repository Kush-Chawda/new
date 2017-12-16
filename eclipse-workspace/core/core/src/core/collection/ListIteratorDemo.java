package core.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		{

			l.add("sandeep");

			l.add("manish");
			l.add("naveen");

			l.add("dada");

			System.out.println(l);

			ListIterator litr = l.listIterator();
			while (litr.hasNext()) {
				String object = (String) litr.next();
				System.out.println(object);

				if (object.equals("sandeep"))

				{
					System.out.println("coming inside 52 ");
					litr.remove();
					System.out.println(l);

				} else if (object.equals("dada")) {
					litr.add("Krishnakant");
				}
				System.out.println(l);

			}
			/*
			
			
			*/
		}
	}

}
