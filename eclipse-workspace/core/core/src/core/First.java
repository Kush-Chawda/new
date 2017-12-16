package core;


public class First 
{
	
	public int binarySearch(int[] inputarr,int key)
	{
		int start=0;
		int end=inputarr.length;
		System.out.println(inputarr.length);

		while(start<end)
		{
			int mid=(start+end)/2;
			
			if(key==inputarr[mid])
			{
				return mid;
			}
			if(key<inputarr[mid])
			{
				end =mid-1;
			}
			
			
		}
		return -1;	
		
	}
	public static void main(String[] args) 
	{
		 First mbs = new First();
	        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
	        System.out.println("Key 14's position: ");
	        mbs.binarySearch(arr, 10);
	        int[] arr1 = {6,34,78,123,432,900};
	        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));		

		
		
		
	}
}

