package core.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		ArrayList li=new ArrayList(15);
		System.out.println(li.size());
		li.add("piki");
		li.add( "dfd");
		li.add( "asdsa");
		li.add( "asdsa");
		li.add( "asdsa");
		li.add( "asdsa");
		
		System.out.println(li);
		li.remove(2);
		System.out.println(li.size());
		
		
		ArrayList al=new ArrayList(li);
		System.out.println(al.size());
		
		
		
		
		
	}
	}
