package interview;

public class CheckString {
	
	public static void main(String[] args) {
		
		System.out.println("hira lala");
		String s=new String("asas");
		
		System.out.println(s);
		System.out.println("hashcode before chamging the value  "+s.hashCode());
		
		s=s+(null);
		System.out.println(s);
		System.out.println("hashcode before chamging the value  "+s.hashCode());
		
	}

}
