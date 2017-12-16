package core.thread;
class MyThread extends Thread
{
	public static void main(String[] args)
	
	{
		Thread t=new Thread();

		Thread t1=new Thread(t);
		t1.start();
		System.out.println("creating new thread");
//			t.start();
		System.out.println("starting child thread");
		for(int i=0;i<100;i++)
		{
		System.out.println("main thread");
			}
	}
}
