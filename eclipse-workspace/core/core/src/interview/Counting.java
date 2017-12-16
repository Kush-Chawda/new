package interview;

public class Counting 
{
	
	public static void main(String[] args) 
	{
		m2(1);
		
	}
	
		
	public static void m2(int j)
	{
		if(j<=100)
		{
			System.out.println(j);
			j++;
			m2(j);

		}
		
	}

}
