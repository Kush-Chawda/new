package geeksforgeeks;

public class Dog {

	String name;
	int age;

	public Dog(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("asa");
		return (getName() + "  " + getAge());
		
	}

	public static void main(String[] args) throws Exception{
		
		Class cls=Class.forName("geeksforgeeks.Dog");
		ClassLoader loader=cls.getClassLoader();
		
		Class cls2=Class.forName("cls",true,loader);
		
		cls2.newInstance();
		// could not find what i want.
		
		
		
		
		}
		
		
		

	}

