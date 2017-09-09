class JoinDemo
{
	public static void main(String [] args) throws InterruptedException
	{

		mythread t=new mythread();
		t.start();
		//t.join();
		t.join(2000);
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
class mythread extends Thread 
{
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			try
			{
			Thread.sleep(500);}
			catch(InterruptedException e)
			{}
			System.out.println("Child Thread");
		}
	}
}
