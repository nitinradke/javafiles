class YeildDemo1
{
	public static void main(String [] args)
	{

		Mythread t=new Mythread();
		t.start();
		t.setPriority(4);
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}

class Mythread extends Thread
{
	public void run()
	{
		Thread.yield();
		for(int k=0;k<10;k++)
		{
		System.out.println("Child Thread");
		}
	}
}
