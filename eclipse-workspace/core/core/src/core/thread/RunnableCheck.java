package core.thread;

class Thread2 extends Thread
{
	public void run()
	{
	for(int i=0;i<10;i++)
	  {
	    System.out.println("child thread");
	  }
//System.out.println("executed by Thread Name="+Thread.currentThread().getName());
	}	
}



public class RunnableCheck 

{
  public static void main(String[] args)
  {
   //Thread2 t2=new Thread2();
    Thread2 t= new Thread2();
//t.setPriority(10);

    t.start();


 for(int i=0;i<10;i++)
    {
	Thread.yield();
	     System.out.println("main thread");
	
    }System.out.println(Thread.currentThread().getPriority());
       
//   








/*
System.out.println("priority of thread t is:"+ t.getPriority());
	Thread.currentThread().setPriority(10);
System.out.println(Thread.currentThread().getPriority());


   System.out.println("executed by Thread Name="+Thread.currentThread().getName());*/
  
   }
}
