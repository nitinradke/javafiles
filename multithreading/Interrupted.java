class JoinDemo
{
	public static void main(String [] args) throws InterruptedException
	{

		mythread t=new mythread();
		t.start();
		t.interrupt();
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
		for(int i=0;i<1000;i++)
		{
			System.out.println("This is child Thread");
		}
		try
		{
			Thread.sleep(500);
		}
			
		catch(InterruptedException e)
			{
				System.out.println("The Interrupted");
			}
		System.out.println("Child Thread");
	}
}
