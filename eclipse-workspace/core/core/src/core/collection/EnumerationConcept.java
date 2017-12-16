package core.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationConcept {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		for(int i=0;i<11;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v);
		
		Enumeration Enumeration = v.elements();
		
		while (Enumeration.hasMoreElements()) {
			Integer type = (Integer) Enumeration.nextElement();
			
			if(type%2==0)
			{
				System.out.println(type);
			}
		}
	}

}
