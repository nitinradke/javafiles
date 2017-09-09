class JoinDemo1
{
	public static void main(String [] args) throws InterruptedException
	{
		mythread.mt=Thread.currentThread();
		mythread t=new mythread();
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main  Thread");
			Thread.sleep(100);
		}
	}
}


class mythread extends Thread
{
	static 	Thread mt;
	public void run()
	{
		try
		{	
		mt.join();
		}
		catch(InterruptedException e)
		{}
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
