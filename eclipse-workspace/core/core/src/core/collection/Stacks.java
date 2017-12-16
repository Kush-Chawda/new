package core.collection;

import java.util.Stack;

public class Stacks {
	
	public static void main(String[] args) {
	
		Stack s=new Stack();
		
		System.out.println(s.capacity());
		s.push("sasa");
		s.push('s');
		s.push(97);
		s.push('s');

		System.out.println(s.peek());
		
		System.out.println(s);
		System.out.println(s.search('s'));
		

	}
		
	

}
