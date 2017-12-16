package core.thread;
//class DemoRun extends Thread
//{/
//	public void run()
//	{
//	System.out.println("run without arg.");
//	}
//	public void run(int i)
//	{
//	System.out.println("run with arg.");	}
//}//

public class ThreadDemo extends Thread
{
	public static void main(String[] args)
	{
	Thread t=new Thread();
	t.start();
	//t.run(10);

	}
}
