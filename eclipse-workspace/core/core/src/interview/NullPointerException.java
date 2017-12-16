package interview;

public class NullPointerException {
	public static void main(String[] args) {

		String s = new String("sa");
		String s1 =null;
try {
	System.out.println(s1.equals(s));
}
catch (Exception e) {
	System.out.println("exception");
	e.printStackTrace();
	// TODO: handle exception
}
		

	}

}
