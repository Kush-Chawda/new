package core.thread;



class MyThread4 extends Thread
{
	Display d;
	String name;
	
	public MyThread4(Display d,String name) {
	this.d=d;
	this.name=name;
	}
	
	public void run()
	{
		d.wish(name);
	}

}



public class SynchronizedBlock {

	public static void main(String[] args) {
		SynchronizedBlock sync=new SynchronizedBlock();
		
		Display d=new Display();
		
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		//can't change thread non-daemon to daemon after starting of thread
		
		MyThread4 mt=new MyThread4(d,"kush");
		MyThread4 mt1=new MyThread4(d,"love");
		mt.setDaemon(true);
		
		
		mt.start();

		//mt1.start();
		
	}
}


class Display

{
	public void wish(String name)
	{
		
		 synchronized (this) 
		{
			 for (int i = 0; i <=10; i++)
			{
				 System.out.println("good morning");
				/*try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("Thread got interrupted");
				}*/
				System.out.println(name);
			}
			
		}
	}
}
