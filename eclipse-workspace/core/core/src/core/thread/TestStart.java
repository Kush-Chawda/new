package core.thread;
class Thread3 extends Thread
{
	public void start()

	{
		super.start();
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}


public class TestStart
{
	public static void main(String[] args)
	{
		Thread3 t3=new Thread3();
		t3.start();		
		System.out.println("main method");

	}
}
